package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root1 = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root1, 300, 275));
        primaryStage.show();
        Stage s =new Stage();
       Parent root2 = FXMLLoader.load(getClass().getResource("sample2.fxml"));
        primaryStage.setTitle("Hello World");
       s.setScene(new Scene(root2, 300, 275));
        primaryStage.show();
        s.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
