package sortingalg;
public class QuickSort extends SortingClass{
    // Attributes :
    private int sizeOfArray ;
    private int low;
    private int high;
    
    public void setBoundries(int low, int high){
        this.low = low;
        this.high = high;
    }

    
    @Override
    public void sort(int []userArray){
        
        sizeOfArray = userArray.length;
        long time1 = System.nanoTime();// taking time in nanoSeconds before sorting
        Qsort(userArray, low, high);
        long time2 = System.nanoTime();// taking time in nanoSeconds after sorting
        System.out.println("Time: " + (time2 - time1) + " ns");
    }
 
    private static void Qsort(int[] userArray , int low , int high){
        if (low < high){

            int partitioningIndex = partition(userArray, low, high);
    
            Qsort(userArray, low, partitioningIndex - 1);
            Qsort(userArray, partitioningIndex + 1, high);
        }
    }

    // Partition : 
    private static int partition(int[] userArray, int low, int high){
     
        int pivot = userArray[high];    
        int i = (low - 1);
    
        for(int j = low; j <= high - 1; j++){
  
            if (userArray[j] < pivot){  
                i++;
                swap(userArray, i, j);
            }
        }
        swap(userArray, i + 1, high);
        return (i + 1);
    }

    // Method to swap elements :
    static void swap(int[] userArray, int i, int j){
        int temp = userArray[i];
        userArray[i] = userArray[j];
        userArray[j] = temp;
    }

    // printing out the sorted Array :
    public void PrintSortedArray(int[] userArray , int sizeOfArray){
        System.out.println("Sorted Elements using Quick Sort : ");
        for(int i=0 ; i<sizeOfArray ; i++){
            System.out.println(userArray[i] + " ");
        }
    }

}