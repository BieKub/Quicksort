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

    public static void printArray(Object[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i].toString() + " ");
        }
        System.out.println();
    } 

    public static int partition(Object[] arr, int low, int high)
    { 
        int pivot = arr[high].getAge();
 
        int i = (low - 1);
            
        for (int j = low; j <= high - 1; j++) {
            com++;

            if (arr[j].getAge() < pivot) {
 
                i++;
                swap(arr, i, j);
            }
        }
         swap(arr, i + 1, high);
         return (i + 1);
    }  

    public static void quickSort(Object[] arr, int low, int high)
    { 
        if (low < high) {

            int pi = partition(arr, low, high);
 
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }  

}