package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class InputController implements Initializable {


    @FXML
    private TextField priceInput;



    @FXML
    private TextField idInput;

    @FXML
    private TextField nameInput;

    @FXML
    void addITemClicked(ActionEvent event) {

    }

    @FXML
    void returnMenuClicked(ActionEvent event) throws IOException

    {
        Parent InputMenuParent = FXMLLoader.load(getClass().getResource("mainGUI.fxml"));

        Scene InputMenuScene = new Scene(InputMenuParent);

        //This line gets stage info

        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();

        window.setScene(InputMenuScene);

    }





    @Override
    public void initialize(URL url, ResourceBundle rb) {



    }}