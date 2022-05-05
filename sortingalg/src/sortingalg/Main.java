package sortingalg;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        final int sets = 5;
        int []arraySizes = new int[sets];
        
        for(int i = 0; i < sets; i++){
            System.out.print("set #" + (i + 1) + " size: ");            
            arraySizes[i] = input.nextInt();
        }
        
        
        ArrayList<int[]> arrays = new ArrayList<>();
        
        //creating and filling sets
        for(int i = 0; i < sets; i++){
            arrays.add(new int[arraySizes[i]]);
            fillArray(arrays.get(i));
        }

        //close scanner class object  
        input.close();  

// COUNTING SORT:
        System.out.println("************************************\nUSING COUNTING SORT");
        CountingSort c = new CountingSort(0, 100);
        for(int i = 0; i < sets; i++){
            System.out.print("set #" + (i + 1) + " -> ");
            c.sort(arrays.get(i));
        }

//QUICK SORT
        System.out.println("************************************\nUSING QUICK SORT");
        QuickSort q = new QuickSort();
        for(int i = 0; i < sets; i++){
            System.out.print("set #" + (i + 1) + " -> ");            
            q.setBoundries(0, arrays.get(i).length - 1);
            q.sort(arrays.get(i));
        }
        
//INSERTION SORT
        System.out.println("************************************\nUSING INSERTION SORT");
        InsertionSort insertionS = new InsertionSort();
        for(int i = 0; i < sets; i++){
            System.out.print("set #" + (i + 1) + " -> ");
            insertionS.sort(arrays.get(i));
        } 
    }
    
//MERGE SORT : TODO
    
    
    private static void  fillArray(int []s){
        for(int i = 0, n = s.length; i < n; i++){
            s[i] = (int)(Math.random() * 100);
        }
    }
    
    private static void printArr(int []s){
        for(int i : s){
            System.out.print(i + " ");
        }
        System.out.println("");
    }
    
  

}
