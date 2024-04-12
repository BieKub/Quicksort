public class Quicksort { 
    public static int com=0; 
    public static int swp =0;
    
    public static void swap(int[] arr, int i, int j)
    {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp; 
            swp++;
    }

    public static void printArray(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    } 

     public static int partition(int[] arr, int low, int high)
     { 
        // int low and high define the permiters of witch to be sorted 

         // Choosing the pivot/ the initial value being compaired
         int pivot = arr[high];
 
         // Index of smaller element and indicates
         // the right position of pivot found so far
         int i = (low - 1);
            
         for (int j = low; j <= high - 1; j++) {
            com++;
             // If current element is smaller than the pivot 

             if (arr[j] < pivot) {
 
                 // Increment index of smaller element
                 i++;
                 swap(arr, i, j);
             }
         }
         swap(arr, i + 1, high);
         return (i + 1);
     }  

      public static void quickSort(int[] arr, int low, int high)
     { 
       
            //ansures the entered indexies are in right order
         if (low < high) {
 
             // pi is partitioning index, arr[p]
             // is now at right place
             int pi = partition(arr, low, high);
 
             // Separately sort elements before
             // partition and after partition
             quickSort(arr, low, pi - 1);
             quickSort(arr, pi + 1, high);
         }
     }  

     public static void main(String[] args) 
     { 
        
        int[] a = new int[]{}; 
        int N = a.length;
        System.currentTimeMillis();
        long startTime = System.nanoTime();
        quickSort(a, 0, N-1);
        long endTime = System.nanoTime();

        long timeElapsed = (endTime - startTime);
        
        
        printArray(a); 
        System.out.println("Comparisson count"+com); 
        System.out.println("Successfull swap"+swp);
        


     }
 

     public static void Test(String[] args) throws Exception{
    {
        
   

  

   

     } 
} 
}
