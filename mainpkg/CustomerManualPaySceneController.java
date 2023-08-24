
package mainpkg;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;


public class CustomerManualPaySceneController implements Initializable {

    @FXML private TextField nameTextField;
    @FXML private DatePicker paymentMonthDatePicker;
   
    @FXML
    private Label amountLabel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        
    }    

    @FXML
    private void onlinePaymentDetailsButton(ActionEvent event) {
    }
    
}
