
package mainpkg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author User
 */
public class CustomerOnlinePaySceneController implements Initializable {

    @FXML
    private TextField idTextField;
    @FXML
    private TextField nameTextField;
    @FXML
    private DatePicker paymentMonthDatePicker;
    @FXML
    private ComboBox<String> packageComboBox;
    @FXML
    private TextField amountTextField;
    @FXML
    private Button showPayHistoryButton;
    @FXML
    private ComboBox<String> paymentMonthComboBox;
    @FXML
    private TableView<PaymentBill> customerpayRecordTableView;
    @FXML
    private TableColumn<PaymentBill,String > IdTableColumn;
    @FXML
    private TableColumn<PaymentBill, String> nameTableColumn;
    @FXML
    private TableColumn<PaymentBill, String> paymentMonthtableColumn;
    @FXML
    private TableColumn<PaymentBill, String> packageDetailsTableColumn;
    @FXML
    private TableColumn<PaymentBill, String> statusTableColumn;
    
    //private DatePicker paymentDatePicker;
    @FXML
    private TableColumn<PaymentBill, String > paymentTableColumn;
    @FXML
    private TableColumn<PaymentBill, String> amountTableColumn;
    @FXML
    private TextField customerIdTextField;
    @FXML
    private ComboBox<String> areaComboBox;
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        packageComboBox.getItems().addAll(
                "Select your package",
                        "Classic (10Mbps) 700Tk",
                        "Silver (12Mbps) 900Tk",
                        "Premium (15Mbps) 1110Tk",
                        "Gamer (20Mbps) 1300Tk",
                        "Pronto(25Mbps) 1500 Tk",
                        "Primo (30Mbps) 2000 Tk",
                        "Presso (40Mbps) 2500 Tk"
                        
                        
        );
        paymentMonthComboBox.getItems().addAll(
                
                        "January",
                        "February",
                        "March",
                        "April",
                        "May",
                        "June",
                        "July",
                        "August",
                        "September",
                        "October",
                        "November",
                        "December"
                        
        );
        areaComboBox.getItems().addAll(
                
                        "Khilgaon",
                        "Bashabo",
                        "Mugda",
                        "Banashree",
                    
                        "Rampura"
                     
                        
        );
        //set up the columns in the table
        
        
        IdTableColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        nameTableColumn.setCellValueFactory(new PropertyValueFactory<>("UserName"));
        paymentMonthtableColumn.setCellValueFactory(new PropertyValueFactory<>("paymentMonth"));
        packageDetailsTableColumn.setCellValueFactory(new PropertyValueFactory<>("PackageNameDetails"));
        amountTableColumn.setCellValueFactory(new PropertyValueFactory<>("amount"));
        paymentTableColumn.setCellValueFactory(new PropertyValueFactory<>("PaymentDate"));
        statusTableColumn.setCellValueFactory(new PropertyValueFactory<>("status"));
       
        
        //customerpayRecordTableView.getColumns().addAll( nameTableColumn, IdTableColumn, packageDetailsTableColumn, paymentMonthtableColumn, statusTableColumn
    
        
        
    
        
    
    }    

    @FXML
    private void manualPaymentButtonOnClick(ActionEvent event) {
        
        
        if (isInputValid()) {
        Boolean payStatus = Customer.payOnline(
            nameTextField.getText(),
            Integer.parseInt(idTextField.getText()),
            packageComboBox.getValue(),
            paymentMonthDatePicker.getValue(),
            Integer.parseInt(amountTextField.getText()),
            paymentMonthComboBox.getValue(),
            PaymentBill.status,
            
            areaComboBox.getValue()
            
                
        );
            if(payStatus)
             {
                 Alert a = new Alert(Alert.AlertType.INFORMATION);
                 a.setContentText("Dear Customer your request for manual payment has been recorded.");
                 a.showAndWait();
             }
             else
             {
                 Alert a = new Alert(Alert.AlertType.ERROR);
                 a.setContentText("Oops! Something went wrong. \nTry later...");
                 a.showAndWait();
             }  
        } 
        else {
        Alert a = new Alert(Alert.AlertType.ERROR);
        a.setContentText("Please fill in all the required fields.");
        a.showAndWait();
    }
}
                
    
    
    private boolean isInputValid() {
    String name = nameTextField.getText();
    String idText = idTextField.getText();
    String packageValue = packageComboBox.getValue();
    LocalDate paymentMonthDate = paymentMonthDatePicker.getValue();
    String amountText = amountTextField.getText();
    String paymentMonthValue = paymentMonthComboBox.getValue();
    String areaname = areaComboBox.getValue();

    return name != null && !name.isEmpty() &&
           idText != null && !idText.isEmpty() &&
           packageValue != null &&
           paymentMonthDate != null &&
           amountText != null && !amountText.isEmpty() &&
           paymentMonthValue != null && areaname != null;
}

    @FXML
    private void showPayHistoryButtonOnClick(ActionEvent event) throws FileNotFoundException, IOException, ClassNotFoundException {
        customerpayRecordTableView.getItems().clear();
        String enteredCustomerUser = customerIdTextField.getText();
        
        
        if (enteredCustomerUser.isEmpty()) {
        Alert a = new Alert(Alert.AlertType.ERROR);
        a.setContentText("Please fill in the username to get your payment history.");
        a.showAndWait();
        return; 
    }
        ObjectInputStream ois = null;
        PaymentBill tempbill;
        boolean foundRecords = false;
        try{
            ois = new ObjectInputStream(new FileInputStream("CustomerPaymentBill.bin")
                    );
           
            while(true){
                  
                tempbill = (PaymentBill)ois.readObject();
                if  (tempbill.getUserName().equals(enteredCustomerUser)){
                    System.out.println(tempbill.toString());
                    customerpayRecordTableView.getItems().add(tempbill);  
                    foundRecords = true;
            }    
                
            }
        }
        catch (IOException ex) {
            System.out.println(ex);
           
        } finally {
            try {
                if(ois != null) ois.close();
            } catch (IOException ex) {
                System.out.println(ex);
            }
        }
        if (!foundRecords) {
        Alert a = new Alert(Alert.AlertType.ERROR);
        a.setContentText("No payment history available for the entered username.");
        a.showAndWait();
    }
            
    }


    private int Integer(String text) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    
        
}
        
           
            
                    
        
          
           
           
          
                
                        
                   
                        //showFileContentTextArea.appendText(tempPackage.toString()+"\n");
     
           
           
                
        /*PaymentBill newpay = new PaymentBill(
               
                nameTextField.getText(),
                Integer.parseInt( idTextField.getText()),
                packageComboBox.getValue(),
                paymentMonthDatePicker.getValue(),
                Integer.parseInt(  amountTextField.getText()),
                paymentMonthComboBox.getValue()
        );
        customerpayRecordTableView.getItems().add(0,newpay );
                    @FXML
    private void clearDataButtonOnClick(ActionEvent event) {
    };*/
                
        
                
                
                
        

    


    
    
                
        
                
                
                
        

    


    
    
                
        
                
                
                
        

    


    
    
                
        
                
                
                
        

    


    
    
                
        
                
                
                
        

    


    
    
                
        
                
                
                
        

    


    
    
                
        
                
                
                
        

    


    
    
                
        
                
                
                
        

    


    
    

