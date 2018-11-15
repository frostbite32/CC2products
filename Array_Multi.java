package array_multi;

import java.util.*;

public class Array_Multi {
      
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number of rows: ");
        int rows = sc.nextInt();

        System.out.println("Enter a number of columns: ");
        int columns = sc.nextInt();

        String[][] tab = new String[rows][columns];
        
       for(int a = 0; a <rows; a++){
           for(int b = 0; b <columns; b++){
              System.out.print("Enter value for row [" +a+ "] column ["+b+"] : ");
              tab[a][b] = sc.next();
           }
       }
        System.out.println("\nThe Table \n");
        for(int a = 0; a <rows; a++){    
            for(int b = 0; b<columns; b++){
                System.out.printf(tab[a][b]+ "\t");
            }
            System.out.println("");
        }
       
    }
    
}
