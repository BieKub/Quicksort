import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Test {
    public static void main(String[] args) throws Exception {
        ArrayList<String> name_List = new ArrayList<String>(); 


        BufferedReader reader;


        try {
            reader = new BufferedReader(new FileReader("Refercnces/Names.txt"));
            String line = reader.readLine();


            while (line != null) {
                name_List.add(line);
                line = reader.readLine();
            }

            reader.close();;

        }
            catch (IOException e ) {
                e.printStackTrace();
            }
       
       // System.err.println(listPeople);
/* 
        //int[] a = {7, 2, 1, 8, 6, 3, 5, 4}; 
        int[] a = new int[1000];

        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 1001);
        }
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
        */

        
       
        //Use for generation of object list
        ArrayList<Object> listPeople = Object.generatePerson(name_List,10000000);
       
        System.currentTimeMillis();
        long startTime = System.nanoTime();


        //System.err.println(listPeople.get(0));


        Objectsort.quickSort(listPeople, 0, listPeople.size()-1 );

        long endTime = System.nanoTime();
        long timeElapsed = (endTime - startTime);
        
        //System.err.println(listPeople);
        /* 
        System.out.println("Comparisson count: " + Quicksort.getCom()); 
        System.out.println("Successfull swap: " + Quicksort.getSwp());
        */

        System.out.println("Comparisson count: " + Objectsort.getCom()); 
        System.out.println("Successfull swap: " + Objectsort.getSwp());

        System.out.println("Time Elapsed:" + timeElapsed);
    
    }

}