
package mainpkg;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author User
 */
public class GetBillPDFSceneController implements Initializable {

    @FXML
    private TextField nameTextField;
    @FXML
    private ComboBox<String> billMonthComboBox;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void billMonthComboBoxItemOnClick(ActionEvent event) {
    }

    @FXML
    private void getBillButtonOnclick(ActionEvent event) {
    }
    
}
