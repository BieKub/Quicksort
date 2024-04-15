public class Test {
    public static void main(String[] args) throws Exception {

        int[] a = {7, 2, 1, 8, 6, 3, 5, 4}; 
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


        Object[] o = {new Object(7, "Tim"), new Object(2, "Tim"), new Object(1, "Tim"), new Object(8, "Tim"), new Object(6, "Tim"), new Object(3, "Tim"), new Object(5, "Tim"), new Object(4, "Tim")};
        
    }
}