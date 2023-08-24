/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author User
 */
public class ViewPackageSceneController implements Initializable {

    @FXML
    private TableView<Package> PackageDetailsTabelView;
    @FXML
    private TableColumn<Package, String> packageColumn;
    @FXML
    private TableColumn<Package, String> packageSpeedColumn;
    @FXML
    private TableColumn<Package, String> packagePriceColumn;
    @FXML
    private TableColumn<Package, String> packageIpVersionColumn;
    @FXML
    private TextField nameTextField;
    @FXML
    private ComboBox<String> packageComboBox;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        packageComboBox.getItems().addAll("Select your package",
                        "Classic",
                        "Silver",
                        "Premium",
                        "Gamer",
                        "Pronto",
                        "Primo",
                        "Presso");
        
        packageColumn.setCellValueFactory(new PropertyValueFactory<>("PackageName"));
        packageIpVersionColumn.setCellValueFactory(new PropertyValueFactory<>("ipVersion"));
        packageSpeedColumn.setCellValueFactory(new PropertyValueFactory<>("speed"));
        packagePriceColumn.setCellValueFactory(new PropertyValueFactory<>("price"));
     
        // TODO
        
      
    }
    @FXML
    private void addPackageButtonOnclick(ActionEvent event) throws IOException, FileNotFoundException, ClassNotFoundException {
        //
        String user = nameTextField.getText();
        if  (packageComboBox.getValue().equals("Classic")){
            Alert a = new Alert(Alert.AlertType.INFORMATION);
                    a.setContentText("Dear "+ user+"\nYour request to get new package Classic has been sent to our team.");
                    a.showAndWait();
            
        }
        else if  (packageComboBox.getValue().equals("Silver")){
            Alert a = new Alert(Alert.AlertType.INFORMATION);
                    a.setContentText("Dear "+ user+"\nYour request to get new package Silver has been sent to our team.");
                    a.showAndWait();
            
        }
        else if  (packageComboBox.getValue().equals("Premium")){
            Alert a = new Alert(Alert.AlertType.INFORMATION);
                    a.setContentText("Dear "+ user+"\nYour request to get new package Premium has been sent to our team.");
                    a.showAndWait();
            
        }
        else if  (packageComboBox.getValue().equals("Gamer")){
            Alert a = new Alert(Alert.AlertType.INFORMATION);
                    a.setContentText("Dear "+ user+"\nYour request to get new package Gamer has been sent to our team.");
                    a.showAndWait();
            
        }
        else if  (packageComboBox.getValue().equals("Pronto")){
            Alert a = new Alert(Alert.AlertType.INFORMATION);
                    a.setContentText("Dear "+ user+"\nYour request to get new package Pronto has been sent to our team.");
                    a.showAndWait();
            
        }
        else if  (packageComboBox.getValue().equals("Primo")){
            Alert a = new Alert(Alert.AlertType.INFORMATION);
                    a.setContentText("Dear "+ user+"\nYour request to get new package Primo has been sent to our team.");
                    a.showAndWait();
            
        }
        else if  (packageComboBox.getValue().equals("Presso")){
            Alert a = new Alert(Alert.AlertType.INFORMATION);
                    a.setContentText("Dear "+ user+"\nYour request to get new package Presso has been sent to our team.");
                    a.showAndWait();
            
        }
        
    }

    @FXML
    private void viewPackageButtonOnclick(ActionEvent event) throws IOException, FileNotFoundException, ClassNotFoundException {
        ObservableList<Package>generatedlist = Customer.viewPackage();
        
        PackageDetailsTabelView.getItems().clear();     
        
        if (generatedlist != null){
                //PackageDetailsTabelView.getItems().clear();
        
               PackageDetailsTabelView.setItems(generatedlist);
        }
        else{
            
        }
    }
    
}
