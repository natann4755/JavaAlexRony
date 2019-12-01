package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    Button Hi,Bye;
    @FXML
    TextField input;
    @FXML
    CheckBox chek;
    @FXML
    Label label;

    public void doi(ActionEvent actionEvent) {
        System.out.println(Thread.currentThread().getName());
       new Thread(new Runnable () {
           @Override
           public void run() {
               Button b = (Button) actionEvent.getSource();

               System.out.println(b.getId() + " " + input.getText());
               try {
                   Thread.sleep(5000);
                   System.out.println(Thread.currentThread().getName());
                   Platform.runLater(new Runnable() {

                       public void run() {
                           System.out.println(Thread.currentThread().getName());
                           label.setText("I wack up");
                       }
                   });
               } catch (InterruptedException e) {
                   e.printStackTrace();
                   System.out.println("s");
               }
           }
       }).start();
            }



    public void disable() {
        Hi.setDisable(false);
        Bye.setDisable(false);
    }

    public void riset(ActionEvent actionEvent) {
        //CheckBox c = (CheckBox) actionEvent.getSource();

        if (chek.isSelected()) {
            input.clear();
            input.setDisable(true);
        }
        else {
            input.setDisable(false);
        }
    }

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
