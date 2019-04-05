package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class GekochteProductenController implements Initializable {
    Winkelier w = new Winkelier();

    @FXML
    private Button BackToMainMenuButton;

    @FXML
    private TextArea gekochteItems;

    public void BackToMainMenu(ActionEvent event) throws IOException {
        Parent winkelParent = FXMLLoader.load(getClass().getResource("Winkel.fxml"));
        Scene winkelScene = new Scene(winkelParent);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(winkelScene);
        window.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle){
        w.listLoop(gekochteItems);
    }


}
