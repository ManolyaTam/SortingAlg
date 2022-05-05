package sortingalg;

public class CountingSort extends SortingClass{
    int size;
    int min;
    int max;

    public CountingSort(int min, int max) {
        this.min = min;
        this.max = max;
    }

    
    @Override
    public void sort(int []userArray) {
        
        this.size = userArray.length;          
        
        // create another array having same length of userArray that will store elements in sorted way  
        int sortedArr[] = new int[size];  
        
        long time1 = System.nanoTime();// taking time in nanoSeconds before sorting
        
        // Create countArr that will store count of occurrence of each number and initialize it with min
        int countArr[] = new int[(max - min)];  
        for (int i = 0; i < (max - min) ; i++) {  
            countArr[i] = 0;  
        }

        // use for loop to store the count of each number in the countArr  
        for (int i = 0; i < size; i++)  
            countArr[userArray[i]]++;  

        // modify the value of countArr[i] so that countArr[i] now contains actual position of the current number in the sortedArr  
        for (int i = 1; i < (max - min); i++)  
            countArr[i] += countArr[i - 1];  

        // iterate the userArray in reverse order to perform counting sort.  
        for (int i = size - 1; i >= 0; i--) {  
            sortedArr[countArr[userArray[i]] - 1] = userArray[i];
            countArr[userArray[i]]--;  
        }  

        for (int i = 0; i < size; ++i)
            userArray[i] = sortedArr[i];
        
        long time2 = System.nanoTime();// taking time in nanoSeconds after sorting
        
        // print sorted array elements  
//        for (int i = 0; i < sortedArr.length; ++i)  
//            System.out.print(sortedArr[i]+"  ");  
//        System.out.println();
//        
        System.out.println("Time: " + (time2 - time1) + " ns");
        }
    }       
