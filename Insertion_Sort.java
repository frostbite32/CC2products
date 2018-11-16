package insertion_sort;

public class Insertion_Sort {

    public static void main(String[] args) {
        int[] numbers = {13,2,5,11,36,9};
        
        

            //Printing out the original order of the array
            System.out.println("Original Array: ");
            for(int i = 0; i<numbers.length; i++){
            System.out.print(numbers[i]+"\t");
           
            } 
    
        System.out.println("");
  
            //Executing the sorting method
             sort(numbers);
            //Printing out the sorted order of the array 
             System.out.println("Sorted Array: ");
             printArray(numbers);
        
    } 
    public static int[] sort(int[] A){
        
        for(int i = 1; i< A.length; i++){
            int key = A[i];
            int j = i-1;
            
            while(j>=0 && A[j]>key){
                A[j+1] = A[j];
                j--;
            }
            
            A[j+1] = key;
            
        }
        return A;
        
    }
   
    public static void printArray(int[] A){
        for(int i = 0; i <A.length; i++){    
            System.out.print(A[i]+"\t");
        }
    }
    
}
