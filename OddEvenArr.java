package array;

import java.util.ArrayList;

public class Array {

    public static void main(String[] args) {
        
        System.out.println("EVEN\t\t\tODD");
        
    //made for storing the elements of od and even
        ArrayList ev = new ArrayList();
        ArrayList od = new ArrayList(); 
        
        int i;
        int[] arr = {3,9,15,20,65,23,18,4,2,14,21};  
        
    //determining the odd and even using the formula    
        for(i = 0; i<arr.length; i++){
            if(arr[i] %2 == 0){
                ev.add(arr[i]);
            }
            else{
                od.add(arr[i]);
            }   
        }  
           
        for(i = 0; i<arr.length; i++){
            if(i>= ev.size() && i<od.size()){
                System.out.println("\t\t\t"+od.get(i));
            }
            else if(i>=od.size() && i < ev.size()){
                System.out.println(ev.get(i));
            }
            else if (i<od.size() && i<ev.size()){
                System.out.println(ev.get(i) +"\t\t\t"+ od.get(i));
            }
        }
    }
    
}
