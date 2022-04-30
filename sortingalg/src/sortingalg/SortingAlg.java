
package sortingalg;

import java.util.Scanner;

public class SortingAlg {

    public static void main(String[] args) {
    //    System.out.println("testing");
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the size of Array");
        
        int size = input.nextInt();
        
        int sortedArr[] = new int[size]; 
        
        System.out.println("Enter the elements in the array: ");    
        
        for(int i=0; i<size; i++)    
        {    
            //reading array elements from the user     
            sortedArr[i] = input.nextInt();    
        }    
        // close scanner class object  
        input.close();  
        
        /*****************************************/
        // creat an object of counting sort and passing the array to the class to sort it ...
        CountingSort cs = new CountingSort(size);
        cs.sorting(sortedArr);
        /*****************************************/
        InsertionSort ins = new InsertionSort(size);
        ins.sorting(sortedArr);
        /*****************************************/
        
    }
    
}
