
package mainpkg;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author User
 */
public class LoginSceneController implements Initializable {

    @FXML
    private TextField nameTextField;
    @FXML
    private TextField idTextField;
    @FXML
    private ComboBox<String> userTypeComboBox;
       

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
         userTypeComboBox.getItems().addAll("Customer","FieldWorker");
    }    

    @FXML
    private void loginButtonOnClick(ActionEvent event) throws IOException {
        String username = nameTextField.getText();
        Integer id = Integer.parseInt(idTextField.getText());
        if (userTypeComboBox.getValue().equals("Customer")){
                        FXMLLoader loader = new FXMLLoader(getClass().getResource("DashBoardCustomerScene.fxml"));
                        
                        Parent parent = loader.load();
                        DashBoardCustomerSceneController dashboardController = loader.getController();
                        dashboardController.displayName(username, id);
                       // Create a new Stage for the dashboard
                        Stage dashboardStage = new Stage();
                        dashboardStage.setScene(new Scene(parent));
                        dashboardStage.show();

        }
        else  if (userTypeComboBox.getValue().equals("FieldWorker")){
                        
                        FXMLLoader loader = new FXMLLoader(getClass().getResource("DashBoradFieldWorker.fxml"));
                        
                        Parent parent = loader.load();
                        DashBoradFieldWorkerController dashboardController = loader.getController();
                        dashboardController.displayName(username, id);
                        Stage dashboardStage = new Stage();
                        dashboardStage.setScene(new Scene(parent));
                        dashboardStage.show();
                        
                        /*Scene scene = new Scene(parent);
                        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
                        window.setScene(scene);
                        window.show();*/ }
        
        
    }
    
}
