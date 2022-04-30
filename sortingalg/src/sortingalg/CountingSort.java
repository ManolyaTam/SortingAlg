/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sortingalg;

import java.util.Vector;

import java.util.Scanner;
import java.util.Vector;
/**
 *
 * @author mariam hasanat
 */
public class CountingSort extends SortingClass{
    int sizeOfArray;

    public int getSizeOfArray() {
        return sizeOfArray;
    }

    public void setSizeOfArray(int sizeOfArray) {
        this.sizeOfArray = sizeOfArray;
    }

    public CountingSort(int sizeOfArray) {
        this.sizeOfArray = sizeOfArray;
    }
    

    @Override
    public void sorting(int inputArr[]) {
        
        // calculate size of the array  
        this.sizeOfArray = getSizeOfArray();  
  
        // create another array having same length of inputArr that will store elements in sorted way  
        int sortedArr[] = new int[this.sizeOfArray];  
  
        // Create countArr that will store count of occurrence of each number and initialize it with 0  
        int countArr[] = new int[256];  
        for (int i = 0; i < 256; ++i) {  
            countArr[i] = 0;  
        }  
  
        // use for loop to store the count of each number in the countArr  
        for (int i = 0; i < this.sizeOfArray; ++i)  
            ++countArr[inputArr[i]];  
  
        // modify the value of countArr[i] so that countArr[i] now contains actual position of the current number in the sortedArr  
        for (int i = 1; i <= 255; ++i)  
            countArr[i] += countArr[i - 1];  
  
        // iterate the inputArr in reverse order to perform counting sort.  
        for (int i = sizeOfArray - 1; i >= 0; i--) {  
            sortedArr[countArr[inputArr[i]] - 1] = inputArr[i];  
            --countArr[inputArr[i]];  
        }  
        // Copy the sortedArr to inputArr, so that inputArr now contains sorted elements  
        for (int i = 0; i < sizeOfArray; ++i)  
            inputArr[i] = sortedArr[i];  
          
        // print sorted array elements  
        System.out.print("Sorted numbers in the array is:\n");  
        for (int i = 0; i < inputArr.length; ++i)  
            System.out.print(inputArr[i]+"  ");  
 
        System.out.println("\n");
    }
     
       
    
}
