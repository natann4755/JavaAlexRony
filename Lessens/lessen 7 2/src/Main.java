import sql.Departments;
import sql.sqlite;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        sqlite s =new sqlite();
        if (s.jj()==false){
            System.out.println("the file not created");
        }
        else {
            System.out.println("The file was successfully created");
        }
        try {
            s.putValue(111111,"aaaaaaaa",2222222,3333333);
        } catch (SQLException e) {
            e.printStackTrace();
        }
     //   ArrayList<Departments> D =new ArrayList<>();
        ArrayList<Departments>DD=s.creatObgect();

       // s.creatObgect(D);

        for (Departments d:DD) {
            System.out.print(d.getDepartmentsId()+" ");
            System.out.print(d.getDepartmentsName()+" ");
            System.out.print(d.getManagerId()+" ");
            System.out.println(d.getLocationId());



        }
        s.close();

    }



}
