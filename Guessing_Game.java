package repettitive;

import java.util.*;

public class Repettitive {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        /*
        int a =0;
        
        while(a < 10){
            a += 1;
            System.out.println("Value of a: "+a);
        }
        System.out.println("Value of a: "+a+ " is now more than or equal to 10 10");
        
        do{
            System.out.println("the value of a: " +a);
            a+=1;
        }while(a<15);
            System.out.println("greater than or equal to "+a);
        
        for(a = a;a < 20; a++){
            System.out.println("value of a: " +a);
        }
        System.out.println("Equal to 20");
    */
         System.out.println("Enter your number: ");
         int ynum = sc.nextInt();
                
         int gnum = -1;
         System.out.println("GUESS A NUMBER BETWEEN 0 - 1000");
         while(gnum != ynum){
             System.out.println("====================");
             System.out.println("Guess a number: ");
             gnum = sc.nextInt();
             if(gnum <= 1000 && gnum >= 0){
                 
                 if (ynum % 2 == 0) {
                     System.out.println("====================");
                     System.out.println("Clue:");
                     System.out.println("The number is even");
                     

                 } else {
                     System.out.println("====================");
                     System.out.println("Clue: ");
                     System.out.println("The number is odd");
                 }
                 if(gnum < ynum){
                         System.out.println("Higher Please");
                     }
                 else{
                     System.out.println("Lower Please");
                 } 
             }
             else{
                 System.out.println("Input invalid ");
             }
            
         }
         System.out.println("========================");
         System.out.println("Congratulation!!!!\n"
                 + "You have guessed the number "+ynum);
        
        
    }
    
}
