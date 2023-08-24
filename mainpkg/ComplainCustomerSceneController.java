
package mainpkg;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author User
 */
public class ComplainCustomerSceneController implements Initializable {

    @FXML
    private TextField nameTextField;
    @FXML
    private ComboBox<String> complainTypeComboBox;
    @FXML
    private Label complaiResponseLabel;
    @FXML
    private TextArea AdditionalComplainTextArea;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        complainTypeComboBox.getItems().addAll(
                
                         "Network slow",
                      
                        "Router is not working",
                        "Netflix is not working in Wifi Network",
                         "Wifi Disconnected",
                        "Wire damaged/stolen");
                       
    }    

    @FXML
    private void complainTypeComboBoxItemOnClick(ActionEvent event) {
        
    }

    @FXML
    private void submitComplainButtonOnclick(ActionEvent event) throws IOException {
        Boolean complainStatus = Customer.givecomplain
            (nameTextField.getText(), complainTypeComboBox.getValue(),AdditionalComplainTextArea.getText()
                    
        );
        if(complainStatus){
                     Alert a = new Alert(Alert.AlertType.INFORMATION);
                     a.setContentText("Dear Customer! Sorry for this inconvenience.Your Complain has been recorded successfully \nThank you!.");
                     a.showAndWait();
                 }
                else{
                     Alert a = new Alert(Alert.AlertType.ERROR);
                     a.setContentText("Oops! Something went wrong. \nTry later...");
                     a.showAndWait();
                }  
        ObjectInputStream ois = null;
        ComplainClass tempcom = null;
        
        try{
        
            ois = new ObjectInputStream(
            new FileInputStream("CustomerComplains.bin")
            );
            while(true){
                tempcom = (ComplainClass)ois.readObject();
                    if (complainTypeComboBox.getValue().equals("Network slow")
                            &&tempcom.getUsername().equals(nameTextField.getText())){
                        complaiResponseLabel.setText("Dear  " +tempcom.getUsername() +"\nFor Network slow issue, Please Restart your router..\n "
                                +"Our Team will contact with you soon!" +"Our hotline number: 999008880");}
                    
                    else if (complainTypeComboBox.getValue().equals("Router is not working")
                            &&tempcom.getUsername().equals(nameTextField.getText())){
                        complaiResponseLabel.setText("Dear  " +tempcom.getUsername() +"\nFor equipment issues,Our Team will contact with you soon! ..\n "
                                +"Our hotline number: 999008880");}
                    
                    else if (complainTypeComboBox.getValue().equals("Wire damaged/stolen")
                            &&tempcom.getUsername().equals(nameTextField.getText())){
                        complaiResponseLabel.setText("Dear  " +tempcom.getUsername() +"\nFor equipment issues,Our Team will contact with you soon! ..\n "
                                +"\nOur hotline number: 999008880");}
                    else if (complainTypeComboBox.getValue().equals("Wifi Disconnected")
                            &&tempcom.getUsername().equals(nameTextField.getText())){
                        complaiResponseLabel.setText("Dear  " +tempcom.getUsername() +"\nFor disconnectivity issues,Please make sure you have cleared all your payments "
                                + "\nOur Team will contact with you soon! ..\n "
                                +"Our hotline number: 999008880");}
                    else if (complainTypeComboBox.getValue().equals("Netflix is not working in Wifi Network")
                            &&tempcom.getUsername().equals(nameTextField.getText())){
                        complaiResponseLabel.setText("Dear  " +tempcom.getUsername() +"\nFor Netflix disconnectivity issues,Please Restart your Device. \nOur team will contact with you soon!"
                                
                                +"\nOur hotline number: 999008880");}
                    
                      
    }
        }
        catch(Exception e){
            if (ois != null)
                try {
                    ois.close();
              } catch(IOException ex){
        }
        
    }
}
    
}

