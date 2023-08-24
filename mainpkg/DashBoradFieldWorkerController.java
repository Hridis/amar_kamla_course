
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
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author User
 */
public class DashBoradFieldWorkerController implements Initializable {

    @FXML
    private Pane inner_Pane1;
    @FXML
    private BorderPane fieldWorkerBorderpane;
    private String username;
    private Integer id;
    @FXML
    private Label loginLabel;
    @FXML
    private StackPane FieldWorkerPane;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    public void displayName(String username,Integer  id){
        this.username = username;
        this.id = id;
        loginLabel.setText("Hello "+username+"\nID:  "+ id);
        
    }
    @FXML
    private void customerListButtonOnClick(ActionEvent event) {
        try {
            Parent parent = FXMLLoader.load(getClass().getResource("CustomerList.fxml"));
            
            fieldWorkerBorderpane.setCenter(parent);
        } catch (IOException ex) {
            System.out.println(ex);
            Logger.getLogger(CustomerListController.class.getName()).log(Level.SEVERE, null, ex.getCause());
        }
    }
    

    @FXML
    private void updatePayStatusButtonOnClick(ActionEvent event) {
             try {
            Parent parent = FXMLLoader.load(getClass().getResource("FieldWorkerPaymentUpdateScene.fxml"));
            
            fieldWorkerBorderpane.setCenter(parent);
        } catch (IOException ex) {
            Logger.getLogger(FieldWorkerPaymentUpdateSceneController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void getbillPDFButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void AssginedTasksButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void SendReportsButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void marketingTasksButtonOnClick(ActionEvent event) {
    }


    @FXML
    private void getequiepmentsButtonOnClick(ActionEvent event) {
         try {
            Parent parent = FXMLLoader.load(getClass().getResource("FieldWorkerGetEquipmentScene.fxml"));
            
            fieldWorkerBorderpane.setCenter(parent);
        } catch (IOException ex) {
            Logger.getLogger(ChartsceneController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void logOutButtonOnClick(ActionEvent event) {
        Alert a = new Alert(Alert.AlertType.CONFIRMATION);
        a.setTitle("LogOut?");
        a.setHeaderText("You are about to logout!");
        
        if (a.showAndWait().get() == ButtonType.OK){
            Stage stage = (Stage)FieldWorkerPane.getScene().getWindow();
            stage.close();
            
          
        }
        
    }
    
}
