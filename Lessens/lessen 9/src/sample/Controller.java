package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.awt.*;

public class Controller {
    public void print(ActionEvent actionEvent) {
        System.out.println("222");
    }

    @FXML
    private TextField User11;

    public void printer(ActionEvent actionEvent) {
        System.out.println(User11.getText());
    }
}