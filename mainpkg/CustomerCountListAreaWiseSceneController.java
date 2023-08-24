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
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author User
 */
public class CustomerCountListAreaWiseSceneController implements Initializable {

    @FXML
    private TableView<CustomerCountAreaWiseClass> customerCountListTableView;
    @FXML
    private TableColumn<CustomerCountAreaWiseClass, String> areaNameTableColumn;
    @FXML
    private TableColumn<CustomerCountAreaWiseClass, String> customerCountTableColumn;
   
    @FXML
    private ComboBox<String> monthComboBox;

   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        monthComboBox.getItems().addAll(
                
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
          areaNameTableColumn.setCellValueFactory(new PropertyValueFactory<>("areaname"));
          customerCountTableColumn.setCellValueFactory(new PropertyValueFactory<>("customerCount"));
        // TODO
    }    

    @FXML
    private void areaComboBoxItemOnClick(ActionEvent event) throws IOException, ClassNotFoundException {
        ObservableList<CustomerCountAreaWiseClass>generatedList = 
                FieldWorker.viewAreawiseCustomerCount(monthComboBox.getValue());
        
        if (generatedList != null){
             customerCountListTableView.getItems().clear();
        

             customerCountListTableView.setItems(generatedList);
        }
        else{
            
        }
            
        }
            
 }
        
                        

