
package mainpkg;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;

/**
 * FXML Controller class
 *
 * @author User
 */
public class DummySceneController implements Initializable {

    @FXML
    private ComboBox<String> showFileComboBox;
    @FXML
    private TextArea showFileContentTextArea;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        showFileComboBox.getItems().addAll(
                "Select Items",
                "Package.bin",
                "CustomerPaymentBill.bin",
                "CustomerFeedback.bin",
                "CustomerComplains.bin",
                "FieldWorker EquipmentList.bin"
        );
        showFileContentTextArea.clear();
        // TODO
    }   

    
    @FXML
    private void showFileComboBoxOnClick(ActionEvent event) {
        
    }

    @FXML
    private void loadFileContentButtonOnclick(ActionEvent event) {
     
 
        showFileContentTextArea.setText("");
        //File fileName  = null;
        FileInputStream fis = null;      
        ObjectInputStream ois = null;
        
        
        try {
           
            String fileName = showFileComboBox.getValue();
            fis = new FileInputStream(fileName);
            ois = new ObjectInputStream(fis);
          
            Package tempPackage;
            PaymentBill tempbill;
            FeedbackOfCustomerClass  tempfeedback;
            ComplainClass tempcom;
            EquipmentClass tempEquipment;
            try{
                showFileContentTextArea.setText("");
                while(true)
                {
                    if (fileName.equals("Package.bin")){
      
                        tempPackage = (Package)ois.readObject();
                        System.out.println(tempPackage.toString());
                   
                        showFileContentTextArea.appendText(tempPackage.toString()+"\n");
                    }
                    else if (fileName.equals("CustomerPaymentBill.bin")){
      
                        tempbill = (PaymentBill)ois.readObject();
                        System.out.println(tempbill.toString());
                   
                        showFileContentTextArea.appendText(tempbill.toString()+ "\n");
                    }
                    else if (fileName.equals("CustomerFeedback.bin")){
      
                        tempfeedback = (FeedbackOfCustomerClass)ois.readObject();
                        System.out.println(tempfeedback.toString());
                   
                        showFileContentTextArea.appendText( tempfeedback.toString()+ "\n");
                    }
                    else if (fileName.equals("CustomerComplains.bin")){
      
                        tempcom = (ComplainClass)ois.readObject();
                        System.out.println(tempcom.toString());
                   
                        showFileContentTextArea.appendText( tempcom.toString()+ "\n");
                        
                    }
                    else if (fileName.equals("FieldWorker EquipmentList.bin"))
                    {    
                        ArrayList<EquipmentClass> selectedEquipmentList = (ArrayList<EquipmentClass>) ois.readObject();
                        
                        for (EquipmentClass equipment : selectedEquipmentList) {
                            System.out.println(equipment.toString());
                            showFileContentTextArea.appendText(equipment.toString() + "\n");
                        }    
                    }
                }
            }//end of nested try
            catch(Exception e){
               e.printStackTrace();
               
            }//nested catch     
            showFileContentTextArea.appendText("All objects are loaded successfully...\n");            
        } catch (IOException ex) {
            System.out.println(ex);
        } finally {
            try {
                if(ois != null) ois.close();
            } catch (IOException ex) {
                //System.out.println(ex);
                ex.printStackTrace();
            }
        }
    }
        
}   
        
        
        
        
        
        
        
        
        
        

        
    /*FileInputStream fis = null;
        ObjectInputStream ois = null;
        //System.out.print('h'); 
        
        try{
            String fileName = showFileComboBox.getValue();
            fis = new FileInputStream(fileName);
            ois = new ObjectInputStream(fis);
            Package tempPackaage;
            
            while(true){
                if (fileName.equals("Package.bin")){
                    tempPackaage = (Package)ois.readObject();
                    showFileContentTextArea.appendText(tempPackaage.toString()+ "\n");
                    System.out.println(tempPackaage.toString());
           
               
            }
            //else if (fileName.equals("A.bin")){
                //Package obj = null;}      
            }
        }
        catch(Exception e){
            try {
                if(ois!=null)
                    ois.close();
            } catch (IOException ex) {
                Logger.getLogger(DummySceneController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }   
    }*/

    

