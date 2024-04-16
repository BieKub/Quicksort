
import java.util.ArrayList;
/**
 * Implementation of the Objectsort class for sorting objects using Quicksort algorithm.
 */
public class Objectsort { 
    
    private static int com = 0; // Counter for comparisons
    private static int swp = 0; // Counter for swaps
    
    /**
     * Getter method for the number of comparisons made during sorting.
     * @return The number of comparisons made.
     */
    public static int getCom() {
        return com;
    }

    /**
     * Getter method for the number of swaps made during sorting.
     * @return The number of swaps made.
     */
    public static int getSwp() {
        return swp;
    }

    /**
     * Swaps two elements in an array of objects.
     * @param arr The array in which elements are swapped.
     * @param i The index of the first element to be swapped.
     * @param j The index of the second element to be swapped.
     */
    public static void swap(ArrayList<Object>  arr, int i, int j) {
        Object temp = arr.get(i);
        arr.set(i, arr.get(j)); 
        arr.set(j,temp); 
        swp++;
    }

    /**
     * Prints the elements of an array of objects.
     * @param arr The array to be printed.
     */
    public static void printArray(Object[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i].toString() + " ");
        }
        System.out.println();
    } 

    /**
     * Partitioning step of the Quicksort algorithm for an array of objects.
     * @param arr The array of objects to be partitioned.
     * @param low The starting index of the partition.
     * @param high The ending index of the partition.
     * @return The index of the pivot element.
     */
    public static int partition(ArrayList<Object> arr, int low, int high) { 
        
        String pivot = (arr.get(high)).getString();

        int pivot_intVer = (arr.get(high)).getAge();

        int i = (low - 1);
            
        for (int j = low; j <= high - 1; j++) {
            com++;
           // System.err.println("counted");
            
            //If needing to compare integers (Ages)
            /* 
            if ((arr.get(j)).getAge() > pivot_intVer) {
                i++;
                swap(arr, i, j);
            }*/


            //If needing to compare Strings (Names)
            
            if ( (arr.get(j).getString()).compareTo(pivot) < 0) {
                i++;
                swap(arr, i, j);
            }
            
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }  

    /**
     * Recursive method to perform Quicksort on an array of objects.
     * @param arr The array of objects to be sorted.
     * @param low The starting index of the array.
     * @param high The ending index of the array.
     */
    public static void quickSort( ArrayList<Object> arr, int low, int high) { 
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }  
}