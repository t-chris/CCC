import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numberofnumbers = Integer.parseInt(br.readLine());
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        
        for (int i = 0 ; i < numberofnumbers ; i++)
        {
            int num = Integer.parseInt(br.readLine());
            if (num > 0)
            {
                numbers.add(num);
            }
            else if (num == 0)
            {
                numbers.remove(numbers.size()-1);
            }
        }
        int sum = 0;
        for (int i = 0 ; i < numbers.size() ; i++)
        {
            sum += numbers.get(i);
        }
        System.out.println(sum);
    }
}
     

    


