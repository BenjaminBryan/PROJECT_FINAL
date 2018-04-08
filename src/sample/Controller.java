package sample;



import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

    /*

    Author - Ben Bryan


     */


    public class Controller implements Initializable {

        @FXML
        private Text dateShow;




        //

        @FXML
        private TextField showITem;


        @FXML
        private TableColumn<?, ?> Preview;

        //Inventory visible here
        @FXML
        private TableView<?> inventory;

        @FXML
        private TableColumn<?, String> idColoumn;

        @FXML
        private TableColumn<?, String> priceColoumn;

        @FXML
        private TableColumn<?, String> nameColoumn;

        @FXML
        void intitialize(){


        }





        //remove selected item from list event
        @FXML
        void removeItem(ActionEvent event) {



        }


        //event handling
        @FXML
        void removeallitems(ActionEvent event) {

            System.out.println(" clear  items clicked");

        }

        @FXML
        void confirmOrder(ActionEvent event) {

        }

        @FXML
        void addItem(ActionEvent event) {

        }

        //This code switches between windows
        @FXML
        void switchMenuClicked(ActionEvent event) throws IOException

        {
           Parent InputMenuParent = FXMLLoader.load(getClass().getResource("Inventory input.fxml"));

           Scene InputMenuScene = new Scene(InputMenuParent);

           //This line gets stage info

            Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();

            window.setScene(InputMenuScene);

        }



            //Initialization override


        @Override
        public void initialize(URL url, ResourceBundle rb) {


        }
        }

