import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;


/**
 *
 * @author christan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int days = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine()); //Refreshing tokenizer for every line.
        int[] swiftRuns = new int[days];
        int[] semRuns = new int[days];
        
        for (int i = 0 ; i < days ; i++)
        {
            swiftRuns[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine()); 
        for (int i = 0 ; i < days ; i++)
        {
            semRuns[i] = Integer.parseInt(st.nextToken());
        }
        int ans = 0;
            int x = 0;
            int y = 0;
        for (int i = 0 ; i < days ; i++)
        {
            x += swiftRuns[i];
            y += semRuns[i];
            

            if (x == y )
            {
                ans = i + 1; //Changing index to "days".
            }
        }
        
        System.out.println(ans);

        
        

                
        
        
    }
    
}
