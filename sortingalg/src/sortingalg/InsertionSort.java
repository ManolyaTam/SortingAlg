/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sortingalg;

import java.awt.BorderLayout;

/**
 *
 * @author mariam hasanat
 */
public class InsertionSort extends SortingClass {
    int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public InsertionSort(int size) {
        this.size = size;
    }
    
    @Override
    public void sorting(int[] inputArr) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    
        int n = this.size;  
        for (int j = 1; j < n; j++) {  
            int key = inputArr[j];  
            int i = j-1;  
            while ( (i > -1) && ( inputArr [i] > key ) ) {  
                inputArr [i+1] = inputArr [i];  
                i--;  
            }  
            inputArr[i+1] = key;  
    }
        for (int k = 0 ; k < n ; k++)
        {
            System.out.print(inputArr[k]+"  ");
        }
        System.out.println("\n");
    }
    
    
}
