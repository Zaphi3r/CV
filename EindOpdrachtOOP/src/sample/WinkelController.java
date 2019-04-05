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
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.text.DecimalFormat;
import java.util.ResourceBundle;


public class WinkelController implements Initializable{
    Winkelier w = new Winkelier();

    Auto a1 = new Auto("Fiat Punto", 20000, 2017, "11-HF-JZ");
    Auto a2 = new Auto("Seat Leon", 15000, 2014, "42-ZL-XD");

    Speelgoed s1 = new Speelgoed("Star Wars Lego set", 10.99, 2019, 6);
    Speelgoed s2 = new Speelgoed("Hotwheels auto set", 20.99, 2018, 4);

    ComputerOnderdelen c1 = new ComputerOnderdelen("i9-9820X 3,3 GHz (4,1 GHz Turbo Boost) socket 2066 processor", 899,2019,"Intel");
    ComputerOnderdelen c2 = new ComputerOnderdelen("TUF X299 MARK 1, socket 2066 moederbord", 279,2018,"Asus");
    ComputerOnderdelen c3 = new ComputerOnderdelen("TUF X299 MARK 1, socket 2066 moederbord", 279,2017,"Asus");
    Kleding k1 = new Kleding("T-shirt", "Zwart", 12.95);
    Kleding k2 = new Kleding("Sjaal", "Rood", 10.99);
    @FXML
    private Button mainMenuButton;

    @FXML
    private Button gekochteItems;

    @FXML
    private Button kopenButton;

    @FXML
    private Button kopenButton1;

    @FXML
    private Button kopenButton2;

    @FXML
    private Button kopenButton3;

    @FXML
    private Button kopenButton4;

    @FXML
    private Button kopenButton5;

    @FXML
    private Button kopenButton6;

    @FXML
    private Button kopenButton7;

    @FXML
    private Button kopenButton8;

    @FXML
    private TextArea tekstAuto1;

    @FXML
    private TextArea tekstAuto2;

    @FXML
    private TextArea tekstSpeelgoed1;

    @FXML
    private TextArea tekstSpeelgoed2;

    @FXML
    private TextArea tekstComputer1;

    @FXML
    private TextArea tekstComputer2;

    @FXML
    private TextArea tekstKleding1;

    @FXML
    private TextArea tekstKleding2;

    @FXML
    private TextArea tekstComputer3;


    @FXML
    private Label saldo;

    @FXML
    public void kopenAuto1() {


        if(!kopenButton.isDisable()){

            w.schafAan(a1);
                if(w.getChecker() == true) {
                    kopenButton.setDisable(true);
                    System.out.println(kopenButton.isDisable());
                    tekstAuto1.setText("VERKOCHT");
                    saldo.setText("€" + Math.round(w.getBudget()));
                    w.objects.add(a1);
                    w.setChecker(false);
                }

        }
    }

    @FXML
    public void kopenAuto2() {


        if(!kopenButton1.isDisable()){

                w.schafAan(a2);
            if(w.getChecker()) {
                kopenButton1.setDisable(true);
                System.out.println(kopenButton1.isDisable());
                tekstAuto2.setText("VERKOCHT");
                saldo.setText("€" + Math.round(w.getBudget()));
                w.objects.add(a2);
                w.setChecker(false);
            }
        }


    }

    @FXML
    public void kopenSpeelgoed1() {


        if(!kopenButton2.isDisable()){

                w.schafAan(s1);

            if(w.getChecker()) {
                kopenButton2.setDisable(true);
                System.out.println(kopenButton2.isDisable());
                tekstSpeelgoed1.setText("VERKOCHT");
                saldo.setText("€" + Math.round(w.getBudget()));
                w.objects.add(s1);
                w.setChecker(false);
            }
        }


    }

    @FXML
    public void kopenSpeelgoed2() {


        if(!kopenButton3.isDisable()){

                w.schafAan(s2);

            if(w.getChecker()) {
                kopenButton3.setDisable(true);
                System.out.println(kopenButton3.isDisable());
                tekstSpeelgoed2.setText("VERKOCHT");
                saldo.setText("€" + Math.round(w.getBudget()));
                w.objects.add(s2);
                w.setChecker(false);
            }
        }


    }

    @FXML
    public void kopenComputer1() {


        if(!kopenButton4.isDisable()){

                w.schafAan(c1);

            if(w.getChecker()) {
                kopenButton4.setDisable(true);
                System.out.println(kopenButton4.isDisable());
                tekstComputer1.setText("VERKOCHT");
                saldo.setText("€" + Math.round(w.getBudget()));
                w.objects.add(c1);
                w.setChecker(false);
            }
        }


    }
    @FXML
    public void kopenComputer2() {


        if(!kopenButton5.isDisable()){

                w.schafAan(c2);

            if(w.getChecker()) {
                kopenButton5.setDisable(true);
                System.out.println(kopenButton5.isDisable());
                tekstComputer2.setText("VERKOCHT");
                saldo.setText("€" + Math.round(w.getBudget()));
                w.objects.add(c2);
                w.setChecker(false);
            }
        }


    }

    @FXML
    public void kopenKleding1() {


        if(!kopenButton6.isDisable()){

                w.schafAan(k1);

            if(w.getChecker()) {
                kopenButton6.setDisable(true);
                System.out.println(kopenButton6.isDisable());
                tekstKleding1.setText("VERKOCHT");
                saldo.setText("€" + Math.round(w.getBudget()));
                w.objects.add(k1);
                w.setChecker(false);
            }
        }


    }

    @FXML
    public void kopenKleding2() {


        if(!kopenButton7.isDisable()){

                w.schafAan(k2);

                if(w.getChecker()) {
                kopenButton7.setDisable(true);
                System.out.println(kopenButton7.isDisable());
                tekstKleding2.setText("VERKOCHT");
                saldo.setText("€" + Math.round(w.getBudget()));
                w.objects.add(k2);
                w.setChecker(false);
            }
        }


    }

    @FXML
    public void kopenComputer3() {


        if(!kopenButton8.isDisable()){

                w.schafAan(c3);

            if(w.getChecker()) {
                kopenButton8.setDisable(true);
                System.out.println(kopenButton8.isDisable());
                tekstComputer3.setText("VERKOCHT");
                saldo.setText("€" + Math.round(w.getBudget()));
                w.objects.add(c3);
                w.setChecker(false);
            }
        }


    }
    @FXML
    public void showGekochteItems(ActionEvent event) throws IOException{
        Parent gekochteProductenParent = FXMLLoader.load(getClass().getResource("gekochteProducten.fxml"));
        Scene gekochteProductenScene = new Scene(gekochteProductenParent);

        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setScene(gekochteProductenScene);
        window.show();
    }


    @FXML
    public void backToMenu(ActionEvent event) throws IOException {
        Parent sampleParent = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Scene sampleScene = new Scene(sampleParent);

        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setScene(sampleScene);
        window.show();
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {



        saldo.setText("€ " + Math.round(w.getBudget()));
        tekstAuto1.setText(a1.getType() + "\nBouwjaar: " + a1.getBouwjaar() + "\n" +a1.getKenteken() + "\nPrijs: €" + Math.round(a1.huidigeWaarde()));
        tekstAuto2.setText(a2.getType() + "\nBouwjaar: " + a2.getBouwjaar() + "\n" +a2.getKenteken() + "\nPrijs: €" + Math.round(a2.huidigeWaarde()));
        tekstSpeelgoed1.setText(s1.getType() + "\nMinimum leeftijd: " + s1.getBouwjaar() + "\n" +s1.getMinimumLeeftijd() + "\nPrijs: €" + Math.round(s1.huidigeWaarde()));
        tekstSpeelgoed2.setText(s2.getType() + "\nMinimum leeftijd: " + s2.getBouwjaar() + "\n" +s2.getMinimumLeeftijd() + "\nPrijs: €" + Math.round(s2.huidigeWaarde()));
        tekstComputer1.setText(c1.getType() + "\nBouwjaar: " + c1.getBouwjaar() + "\nMerk: " +c2.getMerk() + "\nPrijs: €" + Math.round(c2.huidigeWaarde()));
        tekstComputer2.setText(c2.getType() + "\nBouwjaar: " + c2.getBouwjaar() + "\nMerk: " +c2.getMerk() + "\nPrijs: €" + Math.round(c2.huidigeWaarde()));
        tekstKleding1.setText(k1.getSoort() + "\nKleur: " + k1.getKleur() + "\nPrijs: €" + Math.round(k1.huidigeWaarde()));
        tekstKleding2.setText(k2.getSoort() + "\nKleur: " + k2.getKleur() + "\nPrijs: €" + Math.round(k2.huidigeWaarde()));
        tekstComputer3.setText(c3.getType() + "\nBouwjaar: " + c3.getBouwjaar() + "\nMerk: " +c3.getMerk() + "\nPrijs: €" + Math.round(c3.huidigeWaarde()));

    }
}

