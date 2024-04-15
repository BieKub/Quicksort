public class Test {
    public static void main(String[] args) throws Exception {

        int[] a = {2, 1, 3}; 
        int N = a.length;

        System.currentTimeMillis();
        long startTime = System.nanoTime();

        Quicksort.quickSort(a, 0, N-1);

        long endTime = System.nanoTime();
        long timeElapsed = (endTime - startTime);
        
        Quicksort.printArray(a); 
        System.out.println("Comparisson count: " + Quicksort.getCom()); 
        System.out.println("Successfull swap: " + Quicksort.getSwp());
        System.out.println("Time Elapsed:" + timeElapsed);
        


    }
}