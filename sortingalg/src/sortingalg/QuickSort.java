package sortingalg;
public class QuickSort {
    // Attributes :
    private int sizeOfArray ;
    private int userArray [];

    // constructor :
    public QuickSort(int sizeOfArray , int[] userArray){
        this.sizeOfArray = sizeOfArray;
        this.userArray = userArray;
    }

    // Getters and setters :
    public int getSizeOfArray(){
        return sizeOfArray;
    }

    void SetSizeOfArray (int sizeOfArray){
        this.sizeOfArray = sizeOfArray;
    }

    public int[] getArray(){
        return userArray;
    }

    void SetArray (int[] userArray){
        this.userArray = userArray;
    }

    //Sorting Method :
    public void Sorting (int[] userArray , int low , int high ){
        if (low < high){

            int partitioningIndex = partition(userArray, low, high);
    
            Sorting(userArray, low, partitioningIndex - 1);
            Sorting(userArray, partitioningIndex + 1, high);
        }

    }

    // Partition : 
    static int partition(int[] userArray, int low, int high){
     
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