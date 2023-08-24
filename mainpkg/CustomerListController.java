
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
import javafx.scene.layout.BorderPane;


public class CustomerListController implements Initializable {

    @FXML
    private BorderPane customerListBorderPane;

   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void customerDistributionListMenuItemOnClick(ActionEvent event) {
        try {
            Parent parent = FXMLLoader.load(getClass().getResource("PaymentHistoryScene.fxml"));
            
            customerListBorderPane.setCenter(parent);
        } catch (IOException ex) {
            Logger.getLogger(ChartsceneController.class.getName()).log(Level.SEVERE, null, ex.getCause());
        }
    }

    @FXML
    private void customerInformationListMenuItemOnClick(ActionEvent event) {
    }

    @FXML
    private void customerCountListMenuItemOnClick(ActionEvent event) {
        try {
            Parent parent = FXMLLoader.load(getClass().getResource("CustomerCountListAreaWiseScene.fxml"));
            
            customerListBorderPane.setCenter(parent);
        } catch (IOException ex) {
            Logger.getLogger(ChartsceneController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
