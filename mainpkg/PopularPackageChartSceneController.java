
package mainpkg;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;

/**
 * FXML Controller class
 *
 * @author User
 */
public class PopularPackageChartSceneController implements Initializable {

    @FXML
    private PieChart packagePieChart;

    /**
     * Initializes the controller class.
     * @param url
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ObservableList<PieChart.Data> generatedPieDataSet 
                = Customer.viewPopularPackageChart();
        // TODO
        if (generatedPieDataSet != null)
            packagePieChart.setData(generatedPieDataSet);
        else{
        
    } 
    }
    
}
