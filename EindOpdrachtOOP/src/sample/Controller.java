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
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class Controller implements Initializable {
    Winkelier w = new Winkelier();


    @FXML
    private Button bankierenButton;

    @FXML
    private Button winkelButton;

    @FXML
    private Button afsluitenButton;

    @FXML
    private Label saldo;

    @FXML
    public void openBankieren(ActionEvent event) throws IOException {
        Parent bankierParent = FXMLLoader.load(getClass().getResource("Bankieren.fxml"));
        Scene bankierScene = new Scene(bankierParent);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(bankierScene);
        window.show();
    }

    @FXML
    public void openWinkel(ActionEvent event) throws IOException {
        Parent winkelParent = FXMLLoader.load(getClass().getResource("Winkel.fxml"));
        Scene winkelScene = new Scene(winkelParent);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(winkelScene);
        window.show();
}

    @FXML
    private void afsluiten(){
        System.exit(0);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
            saldo.setText("€" + w.getBudget());

    }

}
