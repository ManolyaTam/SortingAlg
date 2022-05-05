package sortingalg;

public class InsertionSort extends SortingClass {
    private int size;
    
    @Override
    public void sort(int[] inputArr) {
        this.size = inputArr.length;
        int n = this.size;  
        long time1 = System.nanoTime();// taking time in nanoSeconds before sorting
        for (int j = 1; j < n; j++) {  
            int key = inputArr[j];  
            int i = j - 1;  
            while ( (i > -1) && ( inputArr [i] > key ) ) {  
                inputArr [i + 1] = inputArr [i];  
                i--;  
            }
            inputArr[i + 1] = key; 
        }
        long time2 = System.nanoTime();// taking time in nanoSeconds after sorting
        System.out.println("Time: " + (time2 - time1) + " ns");
//        for (int k = 0 ; k < n ; k++)
//        {
//            System.out.print(inputArr[k]+"  ");
//        }
//        System.out.println("\n");
    }
    
    
}
