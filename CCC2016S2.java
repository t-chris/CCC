import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int question = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int number = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] dmoj = new int[number];
        int[] peg = new int[number];
        
        for (int i = 0 ; i < number ; i++)
        {
            dmoj[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        
        for (int i = 0 ; i < number ; i++)
        {
            peg[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(dmoj);
        Arrays.sort(peg);
        
        if (question == 1)//What is the min total speed?
        {
            int total = 0;
            for (int i = 0 ; i < number ; i++)
            {
                total += Math.max(dmoj[i],peg[i]);
            }
            System.out.println(total);
        }    
        
        else //What is the maximum total speed?
        {
            int total = 0;
            for (int i = 0 ; i < number ; i++)
            {
                total += Math.max(dmoj[i], peg[(number-1)-i]);
            }
            System.out.println(total);
        }
        
    }
    
}
