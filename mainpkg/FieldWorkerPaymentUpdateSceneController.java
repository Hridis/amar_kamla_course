
package mainpkg;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author User
 */
public class FieldWorkerPaymentUpdateSceneController implements Initializable {

    @FXML
    private TableView<PaymentBill> customerListManualTableView;
    @FXML
    private TableColumn<PaymentBill, String> userNameColumnView;
    @FXML
    private TableColumn<PaymentBill, String> packagenameColumnView;
    @FXML
    private TableColumn<PaymentBill, String> billMonthColumnView;
    @FXML
    private TableColumn<PaymentBill, String> paymentDateColumnView;
    @FXML
    private TableColumn<PaymentBill, String> paymentStatusColumnView;
    @FXML
    private TableColumn<PaymentBill, String> areaColumnView;
    @FXML
    private TextField userNameTextField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        customerListManualTableView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
           
        
        userNameColumnView.setCellValueFactory(new PropertyValueFactory<>("UserName"));
        billMonthColumnView.setCellValueFactory(new PropertyValueFactory<>("paymentMonth"));
        packagenameColumnView.setCellValueFactory(new PropertyValueFactory<>("PackageNameDetails"));
        //amountTableColumn.setCellValueFactory(new PropertyValueFactory<>("amount"));
        paymentDateColumnView.setCellValueFactory(new PropertyValueFactory<>("PaymentDate"));
        paymentStatusColumnView.setCellValueFactory(new PropertyValueFactory<>("individualStatus"));
        areaColumnView.setCellValueFactory(new PropertyValueFactory<>("areaName"));
       
        // TODO
    }    

    @FXML
    private void paidButtonOnClick(ActionEvent event) {
        ObservableList<PaymentBill> selectedItems =  customerListManualTableView.getSelectionModel().getSelectedItems();

        if (selectedItems.isEmpty()) {
            // No rows selected, show an error message if needed
            return;
        }

        for (PaymentBill selectedItem : selectedItems) {
             System.out.println("Before update: " + selectedItem.getIndividualStatus()); // Print initial status
                selectedItem.updateStatusToPaid();
                System.out.println("After update: " + selectedItem.getIndividualStatus()); // Print updated status
                System.out.println(selectedItem);
                        
// Assuming PaymentBill class has the updateStatusToPaid() method
           
            
        }

         customerListManualTableView.refresh(); // Refresh the TableView to update the display

       

        // Show a success message to the user
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("Payment status updated successfully.");
        alert.showAndWait();
}

    

    @FXML
    private void loadtableButtonOnClick(ActionEvent event) throws IOException, FileNotFoundException, ClassNotFoundException {
        customerListManualTableView.getItems().clear();
        ObservableList<PaymentBill>generatedlist = 
                FieldWorker.updateCustomerpaymentRecord(userNameTextField.getText());
              
        
        if (generatedlist != null){
              customerListManualTableView.getItems().clear();
        
           customerListManualTableView.setItems(generatedlist);
        }
        else{
            
        }
            
        }
    }

   

