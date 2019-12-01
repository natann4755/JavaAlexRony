package com.company;

import java.sql.*;

public class Main {

    public static void main(String[] args) {


        try {
            Connection v = DriverManager.getConnection("jdbc:sqlite:\\C:\\Users\\stu.RAVTECH\\Desktop\\javasq.db");
            Statement s = v.createStatement();

          //  String sql = "CREATE TABLE COMPANY"+"(name TEXT," + "phone INTEGER,"+ "email TEXT)";
                s.execute("CREATE TABLE IF NOT EXISTS COMPANY2"+"(name TEXT," + "phone INTEGER,"+ "email TEXT)");
                s.executeUpdate("INSERT INTO COMPANY VALUES ('gooyygle',055513655,'google@gmail.com')");
                s.executeUpdate("INSERT INTO COMPANY (name,phone,email)"+
                        "VALUES ('moshe',111,'eeeee'),"+
                        "('moshe2',2222,'errrrrrr'),"+
                        "('moshe3',3333,'ee33333eee');");
            s.executeUpdate("INSERT INTO COMPANY VALUES ('facebooc',035709399,'f@gmail.com')");
            s.executeUpdate("UPDATE COMPANY SET email = 'f@facebooc.com' WHERE name = 'facebooc'");
           // s.executeUpdate("DELETE FROM COMPANY WHERE name = 'facebooc'");
            ResultSet rs = s.executeQuery("SELECT * FROM COMPANY;");
            while (rs.next()){
                String name = rs.getString("name");
                int phone = rs.getInt("phone");
                System.out.print(name);
                System.out.print(phone);
                System.out.println();
            }
            s.execute("CREATE TABLE IF NOT EXISTS CLIENT (name TEXT, Lastname TEXT, money INTEGER)");
            s.executeUpdate("INSERT INTO CLIENT VALUES ('avi','lev',879)");
            s.executeUpdate("INSERT INTO CLIENT VALUES ('bibi','net',5)");
            s.executeUpdate("INSERT INTO CLIENT VALUES ('naflaty','ben',3004)");
            s.executeUpdate("INSERT INTO CLIENT VALUES ('beny','gan',1400)");
           // nnn(s,"rrr","hhhh",700);
//            s.executeUpdate("INSERT INTO CLIENT (name,Last_name,money)"+
//                    "VALUES ('avi','lev',879),"+
//                    "('bibi','net',5),"+
//                    "('naflaty','ben',3004),"+
//                    "('beny','gan',1400)");
            ResultSet rss = s.executeQuery("SELECT * FROM CLIENT;");
            while (rss.next()){
                String name = rss.getString("name");
                String Lastname = rss.getString("Lastname");
                int money= rss.getInt("money");
                System.out.print("name "+name);
                System.out.print(" Lastname "+Lastname);
                System.out.print(" money "+money);
                System.out.println();

            }


            //s.executeUpdate("DROP TABLE IF EXISTS COMPANY");

                s.close();
                v.close();
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("errore "+e.getMessage());
        }
        // write your code here
    }
    public static void nnn(Statement s, String name, String lastname,int money)throws SQLException{
        s.executeUpdate("INSERT INTO CLIENT(name,lastname,money)"+"VALUES("+name+","+lastname+","+money+")");
    }
}
