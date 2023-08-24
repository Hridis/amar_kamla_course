
package mainpkg;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author User
 */
public class CustomerPayBillsSceneController implements Initializable {

    @FXML
    private BorderPane customerPayBillsBorderpane;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML

    private void manualPayMenuItemOnClick(ActionEvent event) {
        try {
          
            Parent parent = FXMLLoader.load(getClass().getResource("CustomerOnlinePayScene.fxml"));
            
            customerPayBillsBorderpane.setCenter(parent);
        } catch (IOException ex) {
            Logger.getLogger(CustomerPayBillsSceneController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void onlinePayMenuItemOnClick(ActionEvent event) {
        try {
            Parent parent = FXMLLoader.load(getClass().getResource("CustomerManualPayScene.fxml"));
            
            customerPayBillsBorderpane.setCenter(parent);
        } catch (IOException ex) {
            Logger.getLogger(CustomerPayBillsSceneController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void getbillpdfMenuItemOnClick(ActionEvent event) {
       
                try {
            Parent parent = FXMLLoader.load(getClass().getResource("getBillPDFScene.fxml"));
            
            customerPayBillsBorderpane.setCenter(parent);
        } catch (IOException ex) {
            Logger.getLogger(CustomerPayBillsSceneController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
    

    @FXML
    private void paymentHistoryMenuItemOnClick(ActionEvent event) {
    }
    
}
