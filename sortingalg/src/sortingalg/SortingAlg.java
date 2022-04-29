package sortingalg;

import java.util.Scanner;
import java.util.InputMismatchException;

public class SortingAlg {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        Scanner FInput = new Scanner(file);
        System.out.println("Enter the size of the 5 sets");
        
        int[] sizes = new int[5];
        
        try {
            for(int i = 1; i < 6; i++){
                System.out.print("set #"+ i + " size = ");
                sizes[i - 1] = input.nextInt();    
            }
        }
        catch(InputMismatchException | ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    
    }
}
