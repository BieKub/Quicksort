public class Objectsort { 
    
    private static int com = 0; 
    private static int swp = 0;
    
    public static int getCom()
    {
            return com;
    }

    public static int getSwp()
    {
            return swp;
    }

    public static void swap(Object[] arr, int i, int j)
    {
            Object temp = arr[i];
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
        
        


     }
 

     public static void Test(String[] args) throws Exception{
    {
        
   

  

   

     } 
} 
}