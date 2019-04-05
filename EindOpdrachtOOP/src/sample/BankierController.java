package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.w3c.dom.Text;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class BankierController implements Initializable {
    private double budget;

    Winkelier w = new Winkelier();

    @FXML
    private Button opnemenButton;

    @FXML
    private Button stortenButton;

    @FXML
    private TextField invoerOpnemen;

    @FXML
    private TextField invoerStorten;

    @FXML
    private Label saldo;

    @FXML
    private Label ExceptionLabel;

    @FXML
    private Button mainMenuButton;


    @FXML
    private void geldOpnemen(ActionEvent event) {


            try {
                budget =  Double.parseDouble(invoerOpnemen.getText());
                w.addToBudget(budget);
                saldo.setText("€" + Math.round(w.getBudget()));
            } catch (Exception e) {
                ExceptionLabel.setText("U mag alleen positieve getallen gebruiken!");

            }


    }

    @FXML
    private void geldStorten(ActionEvent event) {


            try {
                budget =  Double.parseDouble(invoerStorten.getText());
                w.reduceBudget(budget);
                saldo.setText("€" + Math.round(w.getBudget()));
            } catch (Exception e) {
                ExceptionLabel.setText("U mag alleen positieve getallen gebruiken!");

            }




    }

    @FXML
    private void backToMenu(ActionEvent event) throws IOException {
        Parent sampleParent = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Scene sampleScene = new Scene(sampleParent);

        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setScene(sampleScene);
        window.show();
    }



    public void initialize(URL url, ResourceBundle resourceBundle){
        saldo.setText("€" + w.getBudget());
    }

}
