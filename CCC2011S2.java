import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int numQ = Integer.parseInt(br.readLine());
        ArrayList<String> questions = new ArrayList<String>();
        ArrayList<String> answers = new ArrayList<String>();
        for (int i = 0 ; i < numQ ; i++)
        {
            questions.add(br.readLine());
        }
        int count = 0;
        for (int i = 0 ; i < numQ ; i++)
        {
            
            answers.add(br.readLine());
            if (questions.get(i).equals(answers.get(i)))
            {
                count++;
            }
        }
        System.out.println(count);
        
        
    }
}
