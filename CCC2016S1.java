import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String ana1 = br.readLine();
        String ana2 = br.readLine();
        
        char[] char1 = ana1.toCharArray();
        char[] char2 = ana2.toCharArray();
        Arrays.sort(char1);
        Arrays.sort(char2);
        
        if (contains(char2, '*'))
        {
            int sub = 0;
            for (int i = 0 ; i < ana1.length() ; i++)
            {
                for (int j = 0 ; j < ana2.length() ; j++)
                {
                    if (char1[j] == char2[i])
                    {
                        char1[j] = ' ';
                        sub++;
                        
                        break;
                    }
                    
                }
                
                if (char2[i] == '*')
                {
                    sub++;
                    
                }
            }
            if (sub == ana1.length())
            {
                System.out.println("A");
            }
            else {
                System.out.println("N");
            }
            
        }
            
        else {  
        
            if (Arrays.equals(char1,char2))
            {
                System.out.println("A");
            }    
            else
            {
                System.out.println("N");
            }
        }
        
    }
    
    public static boolean contains(char[] array, char x)
    {
        boolean result = false;
        for (int i = 0 ; i < array.length ; i++)
        {
            if (x == array[i]) {
                result = true;
                break;
            }
        }
        return result;
    }

}
    


