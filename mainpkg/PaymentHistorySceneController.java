/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author User
 */
public class PaymentHistorySceneController implements Initializable {

    @FXML
    private TableView<PaymentBill> customerpayRecordTableView;
    @FXML
    private TableColumn<PaymentBill, String> IdTableColumn;
    @FXML
    private TableColumn<PaymentBill, String> nameTableColumn;
    @FXML
    private TableColumn<PaymentBill, String> paymentMonthtableColumn;
    @FXML
    private TableColumn<PaymentBill, String> packageDetailsTableColumn;
    @FXML
    private TableColumn<PaymentBill, String> paymentTableColumn;
    @FXML
    private TableColumn<PaymentBill, String> statusTableColumn;
    @FXML
    private ComboBox<String> areaComboBox;
    @FXML
    private TableColumn<PaymentBill, String> areaNameTableColumn;
    
   

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
           areaComboBox.getItems().addAll(
                
                        "Khilgaon",
                        "Bashabo",
                        "Mugda",
                        "Banashree",
                    
                        "Rampura"
                     
                        
        );
           
        
        //allow the table to select multiple rows at once
        customerpayRecordTableView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
           
        IdTableColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        nameTableColumn.setCellValueFactory(new PropertyValueFactory<>("UserName"));
        paymentMonthtableColumn.setCellValueFactory(new PropertyValueFactory<>("paymentMonth"));
        packageDetailsTableColumn.setCellValueFactory(new PropertyValueFactory<>("PackageNameDetails"));
        //amountTableColumn.setCellValueFactory(new PropertyValueFactory<>("amount"));
        paymentTableColumn.setCellValueFactory(new PropertyValueFactory<>("PaymentDate"));
   
        areaNameTableColumn.setCellValueFactory(new PropertyValueFactory<>("areaName"));
        statusTableColumn.setCellValueFactory(new PropertyValueFactory<>("individualStatus"));
       

    }    

    @FXML
    private void areaComboBoxItemsOnClick(ActionEvent event) throws ClassNotFoundException, IOException {
        customerpayRecordTableView.getItems().clear();
        ObservableList<PaymentBill>generatedlist = 
                FieldWorker.viewAreawiseCustomerpaymentRecord(areaComboBox.getValue());
              
        
        if (generatedlist != null){
              customerpayRecordTableView.getItems().clear();
        
             customerpayRecordTableView.setItems(generatedlist);
        }
        else{
            
        }
            
        }
        
        

    @FXML
    private void showDetailsButtonOnClick(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("CustomerDetailsScene.fxml"));
        Parent personViewParent = loader.load();

        //Parent personViewParent = FXMLLoader.load(getClass().getResource("FXMLScene2.fxml"));
        Scene personViewScene = new Scene(personViewParent);
        
        //access the controller
        CustomerDetailsSceneController controller = loader.getController();
        //controller = new PersonViewSceneController();
        controller.initData(customerpayRecordTableView.getSelectionModel().getSelectedItem());
                
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(personViewScene);
        window.show();
    }

    @FXML
    private void paymentDoneButtonOnclick(ActionEvent event) {
    }
}
   
    
    

