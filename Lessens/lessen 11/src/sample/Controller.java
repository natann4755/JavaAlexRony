package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;

import java.io.IOException;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.ArrayList;

public class Controller {

    ArrayList<task> tasks = new ArrayList<>();
    @FXML
    ListView list1;
    @FXML
    Label labl1,labl2;


    public void initialize(){

        task t1 = new task("Flight Booking","I need to book a flight to Congo",LocalDate.of(2019,4,5));
        task t2 = new task("bay a house","I need to bay a butiful house in Keisarya",LocalDate.of(2020,3,4));
        task t3 = new task("To be very rich","I need to be a very rich men",LocalDate.of(2019,6,6));

        tasks.add(t1);
        tasks.add(t2);
        tasks.add(t3);


            list1.getItems().addAll(tasks);

            save.getSav().setListt(tasks);

    }

    public void clic() {
        labl1.setText(tasks.get( list1.getSelectionModel().getSelectedIndex()).getLongTask());
        labl2.setText(tasks.get(list1.getSelectionModel().getSelectedIndex()).getDate().toString());

    }
    public void save() throws IOException {
        save.getSav().saveList();
        System.out.println("hhh");

    }
}
