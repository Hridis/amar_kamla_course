
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
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
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
public class DashBoardCustomerSceneController implements Initializable {

    @FXML
    private BorderPane customerBorderpane;
    @FXML
    private Pane inner_Pane;
    @FXML
    private Label loginuserNameLabel;
    private String username;
    private Integer id;
    private Stage stage;
    @FXML
    private StackPane PaneCustomerDashboard;

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
        loginuserNameLabel.setText("Hello "+username+"\nID:  "+ id);
        
    }


    @FXML
    
    private void payBillsOnButtonClick(ActionEvent event) {
        try {
            Parent parent;
            /*Scene newScene = new Scene(parent);
            Stage newStage = new Stage();
            newStage.setScene(newScene);
            newStage.show();*/
            parent = FXMLLoader.load(getClass().getResource("CustomerPayBillsScene.fxml"));
          
            customerBorderpane.setCenter(parent);
        } catch (IOException ex) {
            Logger.getLogger(CustomerPayBillsSceneController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void PackageViewOnButtonClick(ActionEvent event) {
        try {
            Parent parent = FXMLLoader.load(getClass().getResource("ViewPackageScene.fxml"));
            
            customerBorderpane.setCenter(parent);
        } catch (IOException ex) {
            Logger.getLogger(ChartsceneController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    

    @FXML
    private void customerFeedbackOnButtonClick(ActionEvent event) {
        try {
            Parent parent = FXMLLoader.load(getClass().getResource("chartscene.fxml"));
            customerBorderpane.setCenter(parent);
            
        } catch (IOException ex) {
            Logger.getLogger(ChartsceneController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    

    @FXML
    private void offersViewOnButtonClick(ActionEvent event) {
         try {
            Parent parent = FXMLLoader.load(getClass().getResource("AddPackageScene.fxml"));
            
            customerBorderpane.setCenter(parent);
        } catch (IOException ex) {
            Logger.getLogger(ChartsceneController.class.getName()).log(Level.SEVERE, null, ex);
        }
         
    }
    



    @FXML
    private void complainIssueButtonClick(ActionEvent event) {
        try {
            Parent parent = FXMLLoader.load(getClass().getResource("complainCustomerScene.fxml"));
            customerBorderpane.setCenter(parent);
            
            
          
        } catch (IOException ex) {
            Logger.getLogger(ChartsceneController.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }

    @FXML
    private void paymentHistoryOnButtonClick(ActionEvent event) {
            try {
            Parent parent = FXMLLoader.load(getClass().getResource("DummyScene.fxml"));
            
            customerBorderpane.setCenter(parent);
        } catch (IOException ex) {
            Logger.getLogger(ChartsceneController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    

    @FXML
    private void popularPackageViewOnButtonClick(ActionEvent event) {
        try {
            Parent parent = FXMLLoader.load(getClass().getResource("PopularPackageChartScene.fxml"));
            
            customerBorderpane.setCenter(parent);
        } catch (IOException ex) {
            Logger.getLogger(ChartsceneController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void logoutbuttonOnclick(ActionEvent event) {
        Alert a = new Alert(AlertType.CONFIRMATION);
        a.setTitle("LogOut?");
        a.setHeaderText("You are about to logout!");
        
        if (a.showAndWait().get() == ButtonType.OK){
            Stage stage = (Stage)PaneCustomerDashboard.getScene().getWindow();
            stage.close();
            
          
        }
        
        
    }
    
}
