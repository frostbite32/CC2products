package user;

import java.util.*;

public class User {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your username: ");
        String name= sc.nextLine();
        System.out.print("Enter your password: ");
        String password= sc.nextLine();
        System.out.print("Confirm password: ");
        String veri= sc.nextLine();
        
        if (veri.equals (password)){
            System.out.println("Correct Password");
           
        } else {
            System.out.println("Invalid Password");
        }
        
        
    }
    
}
