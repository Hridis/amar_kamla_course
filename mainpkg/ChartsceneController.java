
package mainpkg;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class ChartsceneController implements Initializable {

    @FXML
    private TextField feedbackValue;
    @FXML
    private Button loadPieChartButton;
    private Label statusLabel;
    @FXML
    private Button submitFeedbackButton;
    
 
    
    @FXML private PieChart pieChart;
    private Object piechart;
    @FXML
    private ComboBox<String> feedbackTypeComboBox;
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        feedbackTypeComboBox.getItems().addAll(
                "Select here",
                "Good",
                  "Best",
                 "Average",
                  "Satisfactory",
                  "Bad",
                 "Need more Improvement");
        
    }   
    @FXML
    private void loadChartButtonOnClick(ActionEvent event) {
        
        ObservableList<PieChart.Data> generatedPieDataSet 
                = Customer.viewfeedback();
        // TODO
        if (generatedPieDataSet != null)
            pieChart.setData(generatedPieDataSet);
        else{
        
    } 
        
    
    }    
  /*
        ObservableList <PieChart.Data> list = FXCollection.observableArrayList(
        new PieChart.Data("Good",40),
        new PieChart.Data("Great",20),
        new PieChart.Data("Poor",20),
        new PieChart.Data("Average",25),
        new PieChart.Data("SatisFactory",20)
        );
        list.addAll(new PieChart.Data("Good",40),
            new PieChart.Data("Great",20),
            new PieChart.Data("SatisFactory",20)
            
            ); 
            pieChart.setData(list);*/
        
    
     

    @FXML
    private void submitFeedbackButtonOnClick(ActionEvent event) {
        if (isInputValid()) {
        Boolean feedbackStatus = Customer.giveFeedback(
                
                feedbackTypeComboBox.getValue(), 
                Integer.parseInt(feedbackValue.getText()
                )
        );
                if(feedbackStatus){
                     Alert a = new Alert(Alert.AlertType.INFORMATION);
                     a.setContentText("Dear Customer.Your valuable feedback is recorded. \nThank you!.");
                     a.showAndWait();
                 }
                else{
                     Alert a = new Alert(Alert.AlertType.ERROR);
                     a.setContentText("Oops! Something went wrong. \nTry later...");
                     a.showAndWait();
                }  
        }
        else{
        Alert a = new Alert(Alert.AlertType.ERROR);
        a.setContentText("Please fill in all the required fields.");
        a.showAndWait();
    }
           
        
    }
    

    private boolean isInputValid() {
    
    String feedbackvalue = feedbackValue.getText();
    String feedbacktype = feedbackTypeComboBox.getValue();
    
    return feedbackvalue != null && !feedbackvalue.isEmpty()&& feedbacktype != null && !feedbacktype.isEmpty();
    }

    private void labelMouseEnterOnClick(MouseEvent event) {
        statusLabel.setText("You are hovering on the label");
    }
        
    
    
}
