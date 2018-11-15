package fibunacci;

import java.io.*;
import java.util.*;
public class Fibunacci {
    
    public static int num = 0;
    public static int d1 = 0;
    public static int d2 = 1;
    public static int sum;
    
    
    public static void main(String[] args) {
        
       
        display();
        
        // end of the main method    
    }
    public static int user(){
        Scanner sc = new Scanner(System.in);
  
        System.out.println("Please enter the desired ammount number: ");
        num = sc.nextInt();
        
        return num;
        
    }
    public static int display(){
        
        int y = algo(user());
        
        for(int i = 0; i<= y ; i++){
            System.out.print("f["+i+"]\t");    
        }
        
        System.out.println("");
        //for(int j = num; j >=0; j--){ inverse
        for(int j = 0; j <=y ; j++){
            for(int k=0;k<=j;k++){
                System.out.print(algo(k)+ "\t");
            }
                System.out.println(" ");
        }
        return y;

    }
    public static int algo(int n){
        if(n <=1){
            return n;
        }else 
            return algo(n-1)+algo(n-2);             
        
    }
    
    
}
