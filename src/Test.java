public class Test {
    public static void main(String[] args) throws Exception {

    System.currentTimeMillis();

    long startTime = System.nanoTime();

    long endTime = System.nanoTime();

    long timeElapsed = (endTime - startTime);
    
    System.out.println("Processing Time: " + timeElapsed + "ns");



    }
}
