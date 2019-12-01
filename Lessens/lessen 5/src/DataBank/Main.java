package DataBank;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static boolean sexssed = true;

    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
        while (sexssed) {
            loginRegistration(users);
        }
    }


    public static void loginRegistration (ArrayList user){
        String chois = msg("plis rwit a for Registration or b for login");
        if (chois.equals("a")){
            Registration(user);
        }
        else if (chois.equals("b")){
            Login(user);
        }
        else  {
            System.out.println("rwit a or b");
        }

    }

     public static void Login (ArrayList users){
        String name = msg("plis rwit user name");
        int pasword = Integer.parseInt(msg("plis rwit user pasword"));
        users.add(new User(name,pasword));
        System.out.println("login sexseed");
    }

    public static void Registration (ArrayList<User> users){
        String name = msg("plis rwit user name");
        int pasword = Integer.parseInt(msg("plis rwit user pasword"));
        for (int i = 0; i <users.size() ; i++) {
            if (users.get(i).getUserName().equals(name)&&users.get(i).getPasword()==pasword){
                System.out.println("Registration sexseeds");
                return;
            }
        }
                System.out.println("Registration not sexseeds, try egan");
            }




    public static String msg (String masg){
        Scanner s = new Scanner(System.in);
        System.out.println(masg);
        return s.nextLine();
    }
}