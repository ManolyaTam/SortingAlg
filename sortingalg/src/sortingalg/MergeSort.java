package sortingalg;
public class MergeSort extends SortingClass{
    // Attributes :
    private int sizeOfArray , low , high ;
    private int userArray [];

    public void setBoundries(int low, int high){
        this.low = low;
        this.high = high;
    }

    @Override
    public void sort(int[] userArray) {
        sizeOfArray = userArray.length;
        long time1 = System.nanoTime();// taking time in nanoSeconds before sorting
        Msort(userArray, low, high);
        long time2 = System.nanoTime();// taking time in nanoSeconds after sorting
        System.out.println("Time: " + (time2 - time1) + " ns");
    }

    // Sorting Method :
    private static void Msort(int[] userArray , int low , int high){
        if (low < high) {
            // Find the middle point
            int mid =low+ (high-low)/2;

            // Sort first and second halves of the array 
            Msort(userArray, low, mid);
            Msort(userArray, mid+1, high);
  
            // Merge the sorted halves of the array
            merging(userArray, low, mid, high);
        }
    }

    // Method to merge the single element arrays :
    public static void merging(int userArray[], int low, int mid, int high){
        int n1 = mid - low + 1;
        int n2 = high - mid;
  
        int L[] = new int[n1];
        int R[] = new int[n2];
  
        for (int i = 0; i < n1; ++i)
            L[i] = userArray[low + i];
        for (int j = 0; j < n2; ++j)
            R[j] = userArray[mid + 1 + j];
    
        int i = 0, j = 0;
  
        int k = low;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                userArray[k] = L[i];
                i++;
            }
            else {
                userArray[k] = R[j];
                j++;
            }
            k++;
        }
        // Copy remaining elements of L[] if any 
        while (i < n1) {
            userArray[k] = L[i];
            i++;
            k++;
        }
        // Copy remaining elements of R[] if any 
        while (j < n2) {
            userArray[k] = R[j];
            j++;
            k++;
        }
    }

    // Printing Sorted Array Elements :
    void printSortedArray(int userArray[] , int sizeOfArray){
        System.out.println("Sorted Elements using Merge Sort : ");
        for (int i = 0; i < sizeOfArray ; i++)
            System.out.print(userArray[i] + " ");
    }
}

