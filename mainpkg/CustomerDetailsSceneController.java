
package mainpkg;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author User
 */
public class CustomerDetailsSceneController implements Initializable {

    @FXML
    private Label nameLabel;
    @FXML
    private Label packagelabel;
    @FXML
    private Label monthlabel;
    @FXML
    private Label datelabel;
    @FXML
    private Label addresslabel;
    @FXML
    private Label statuslabel;
    @FXML
    private Label numberlabel;

    /**
     * Initializes the controller class.
     */
    public void initData(PaymentBill selectedPaymentBill) {
        nameLabel.setText(selectedPaymentBill.getUserName());
        packagelabel.setText(selectedPaymentBill.getPackageNameDetails());
        monthlabel.setText(selectedPaymentBill.getPaymentMonth());
        datelabel.setText(selectedPaymentBill.getPaymentDate().toString());
    }
   
    @Override
    
    
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void backbuttonOnClick(ActionEvent event) {
        nameLabel.setText(null);
        packagelabel.setText(null);
        monthlabel.setText(null);
        datelabel.setText(null);
        
        
    }
    
}
