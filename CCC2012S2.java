import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> aromatic = new ArrayList<String>();
        
        String word = br.readLine();
        int[] arabic = new int[(word.length())/2];
        int[] roman = new int[(word.length())/2];
        for (int i = 0 ; i <= word.length()-1 ; i++)
        {
           if (i%2 == 0)
           {
                arabic[i/2] = Integer.parseInt(word.substring(i, i+1));
           }
           if (i%2 != 0)
           {
                if (word.charAt(i) == 'M')
            {
                roman[i/2] = 1000;
            }
            else if (word.charAt(i) == 'D')
            {
                roman[i/2] = 500;
            }
            else if (word.charAt(i) == 'C')
            {
                roman[i/2] = 100;
            }
            else if (word.charAt(i) == 'L')
            {
                roman[i/2] = 50;
            }
            else if (word.charAt(i) == 'X')
            {
                roman[i/2] = 10;
            }
            else if (word.charAt(i) == 'V')
            {
                roman[i/2] = 5;
            }
            else if (word.charAt(i) == 'I')
            {
                roman[i/2] = 1;
            }
           }
        }
                
        
        
        int sum = 0;
        for (int i = 0 ; i < (word.length())/2 ; i++)
        {
            if (i != (word.length())/2-1 && roman[i] < roman[i+1])
            {
                sum -= arabic[i]*roman[i];
            }
            else
            {
                sum += arabic[i]*roman[i];
            }
        }
        System.out.println(sum);
        
        
        
    }
}
