import java.util.ArrayList;
import java.io.FileReader;
import java.io.BufferedReader;

public class App {
    public static void main(String[] args) throws Exception {

        String path = "C:\\Users\\kubni\\OneDrive\\Desktop\\Coding\\Test\\Data21.txt";

        FileReader fileReader = new FileReader(path);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        ArrayList<Integer> arr = new ArrayList<Integer>();

        String line;
        while ((line = bufferedReader.readLine()) != null)
        {
            arr.add(Integer.parseInt(line));
        }

        bufferedReader.close();



        for (int i = 0; i < arr.size(); i++)
        {
            int sum = 0;
            boolean check = false;

            if (arr.get(i) / 1000 >= 5)
            {
                sum += arr.get(i) / 1000;
                sum += (arr.get(i) / 100) % 10;
                sum += (arr.get(i) / 10) % 10;
                sum += arr.get(i) % 10;
                if (sum < 18)
                {
                    check = true;
                }
            }

            if (check)
            {
                System.out.println("So cute!");  
            }
            else 
            {
                System.out.println("Sorry");
            }
        }

        
        
        
        


    }
}
