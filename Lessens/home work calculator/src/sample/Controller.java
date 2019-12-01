package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.awt.*;

public class Controller {
    double nam1;
    double nam2;
    String actions;


   @FXML
   public Button a1,a2,a3,a4,a5,a6,a7,a8,a9,chiluk,kefel,minus,sum,plus;
   @FXML
   public TextField Colcol;





    public void rite(ActionEvent actionEvent) {
        Button b =(Button) actionEvent.getSource();
        if (!Colcol.getText().equals("+")&&!Colcol.getText().equals("-")&&!Colcol.getText().equals("*")&&!Colcol.getText().equals("/")) {
            Colcol.setText(Colcol.getText() + b.getText());
        }
        else {
            Colcol.setText(b.getText());
        }
    }

    public void Actions (ActionEvent actionEvent) {

         nam1 = Double.parseDouble(Colcol.getText());
        Button b =(Button) actionEvent.getSource();
        Colcol.setText(b.getText());
        actions=b.getText();
    }

    public void outcome (ActionEvent actionEvent) {
        nam2 = Double.parseDouble(Colcol.getText());
        double totle = 0;
        switch (actions){
            case "+":
                totle= nam1+nam2;
                break;
            case "-":
                totle= nam1-nam2;
                break;
            case "/":
                totle= nam1/nam2;
                break;
            case "*":
                totle= nam1*nam2;
                break;
        }
        Colcol.setText(totle+" ");
        nam1=0;
        nam2=0;

    }

    public void ricet(ActionEvent actionEvent) {
        Colcol.setText("");

    }
}
