import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int tcounter = 0;
        int scounter = 0;
        for (int i = 0 ; i < num ; i++)
        {
            
            String s = br.readLine();
            for (int j = 0 ; j < s.length() ; j++)
            {
            if ((s.charAt(j) == 't') || (s.charAt(j) == 'T')) {
                tcounter++;
            }
            if ((s.charAt(j) == 's' ) || (s.charAt(j) == 'S')) {
                scounter++;
            }
            }
        }
        
        if (tcounter > scounter )
        {
            System.out.println("English");
        }
        else if (tcounter <= scounter)
        {
            System.out.println("French");
        }
        
        
        
        
    }
}
     

    


