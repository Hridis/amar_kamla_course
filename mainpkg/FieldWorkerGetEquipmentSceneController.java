
package mainpkg;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;


public class FieldWorkerGetEquipmentSceneController implements Initializable {

    @FXML
    private ComboBox<Integer> cableTesterComboBox;
    @FXML
    private ComboBox<Integer> crimperToolComboBox;
    @FXML
    private ComboBox<Integer> powerLineadapterComboBox;
    @FXML
    private ComboBox<Integer> toneProbeKitComboBox;
    @FXML
    private ComboBox<Integer> ethernetComboBox;
    @FXML
    private ComboBox<Integer> fiberCableComboBox;
    @FXML
    private Button cableTesterADDButton;
    @FXML
    private Button probeKitAddButton;
    @FXML
    private Button etherNetAddButton;
    @FXML
    private Button fiberOpticAddButton;
    @FXML
    private Button crimperToolAddButton;
    @FXML
    private Button adapterAddButton;
    @FXML
    private Button cableTesterDeleteButton;
    @FXML
    private Button crimperToolCancelButton;
    @FXML
    private Button adapterCancelButton;
    @FXML
    private Button probeKitCancelButton;
    @FXML
    private Button etherNetCancelButton;
    @FXML
    private Button fiberOpticCancelButton;
    private  FieldWorker tempfieldWorker = new FieldWorker();
   


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        cableTesterComboBox.getItems().addAll(
                1,
                2,
                3,
                4,
               5);
        crimperToolComboBox.getItems().addAll(
                 1,
                2,
                3,
                4,
               5);
              
        powerLineadapterComboBox.getItems().addAll(
              1,
                2,
                3,
                4,
               5);
        toneProbeKitComboBox.getItems().addAll(
          1,
                2,
                3,
                4,
               5);
        ethernetComboBox.getItems().addAll(
              1,
                2,
                3,
                4,
               5);
        fiberCableComboBox.getItems().addAll(
             1,
                2,
                3,
                4,
               5);
        // TODO
    }    

 
  

    @FXML
    private void cableTesterADDButtonOnClick(ActionEvent event) {
         
         
          String selectedEquipment = "Cable Tester";
          Integer selectedEquipmentNum = cableTesterComboBox.getValue();
          boolean addStatus = (tempfieldWorker.addEquipment(selectedEquipment, selectedEquipmentNum));
       
          if (addStatus)
              {
                 Alert a = new Alert(Alert.AlertType.INFORMATION);
                 a.setContentText("Dear Customer your selected item has been add.");
                 a.showAndWait();
             }
             else
             {
                 Alert a = new Alert(Alert.AlertType.ERROR);
                 a.setContentText("Oops! Something went wrong. \nTry later...");
                 a.showAndWait();
             }  
          //cableTesterComboBox.setValue(null);
    }

    @FXML
    private void probeKitAddButtonOnClick(ActionEvent event) {
           FieldWorker tempfieldWorker = new FieldWorker();
          String selectedEquipment = "Tone and ProbeKit";
          Integer selectedEquipmentNum = toneProbeKitComboBox.getValue();
          boolean addStatus = (tempfieldWorker.addEquipment(selectedEquipment, selectedEquipmentNum));
       
          if (addStatus)
              {
                 Alert a = new Alert(Alert.AlertType.INFORMATION);
                 a.setContentText("Dear Customer your selected item has been add.");
                 a.showAndWait();
             }
             else
             {
                 Alert a = new Alert(Alert.AlertType.ERROR);
                 a.setContentText("Oops! Something went wrong. \nTry later...");
                 a.showAndWait();
             }  
    }

    @FXML
    private void etherNetAddButtonOnClick(ActionEvent event) {
        
    }

    @FXML
    private void fiberOpticAddButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void crimperToolAddButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void adapterAddButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void cableTesterDeleteButtonOnClick(ActionEvent event) {
         cableTesterComboBox.setValue(null);
    }

    @FXML
    private void crimperToolCancelButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void adapterCancelButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void probeKitCancelButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void etherNetCancelButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void fiberOpticCancelButtonOnClick(ActionEvent event) {
    }
    @FXML
    private void getSelectedEquipmentButtonOnClick(ActionEvent event) {
      
       
        File f = null;
        FileOutputStream fos = null;      
        ObjectOutputStream oos = null;
        try {
            f = new File("FieldWorker EquipmentList.bin");
            if(f.exists()){
                fos = new FileOutputStream(f,true);
                oos = new AppendableObjectOutputStream(fos);                
            }
            else{
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);               
            }
            
            ArrayList<EquipmentClass> selecteditems = tempfieldWorker.getSelectedEquipment();
                //for (EquipmentClass equipment : selecteditems) {
                //oos.writeObject(equipment);}
    
            oos.writeObject(selecteditems );
            
            oos.close();
           
           
        } catch (IOException ex) {
            if(oos!=null) try {
                oos.close();
            } catch (IOException ex1) {
                Logger.getLogger(FieldWorker.class.getName()).log(Level.SEVERE, null, ex1);
            }
          
        }
    } 
    }
    

