
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
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class AddPackageSceneController implements Initializable {

    @FXML
    private TextField speedTextField;
    @FXML
    private TextField nameTextField;
    @FXML
    private ComboBox<String> ipVersionComboBox;
    @FXML
    private TextField priceTextField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ipVersionComboBox.getItems().addAll(
                        "IPV6 Public IP Only",
                        "IPV4 Public IP Only",
                        "Both IPV4 & IPV6 Public IP"
          );
        // TODO
    }    

    @FXML
    private void addNewPackageButtonOnClick(ActionEvent event) {
        Boolean addStatus = invisibleWorker.addNewPackage(
                nameTextField.getText(), 
                ipVersionComboBox.getValue(),
                speedTextField.getText(),
           
                
                Integer.parseInt(priceTextField.getText())
                
                );
    if (addStatus)
        {
            Alert a = new Alert(Alert.AlertType.INFORMATION);
            a.setContentText("New Internet Package is added successfully.");
            a.showAndWait();
        }
    else
         {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Oops! Something went wrong. \nTry later...");
            a.showAndWait();
        }  
    }

    @FXML
    private void filebuttonOnClick(ActionEvent event) {
        try {
            Parent parent = FXMLLoader.load(getClass().getResource("DummyScene.fxml"));
            Scene newScene = new Scene(parent);
            Stage newStage = new Stage();
            newStage.setScene(newScene);
            newStage.show();
            
            
        } catch (IOException ex) {
            Logger.getLogger(ChartsceneController.class.getName()).log(Level.SEVERE, null, ex);
        }

        
    }
    
}
