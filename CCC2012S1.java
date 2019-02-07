import java.io.*;
import java.util.StringTokenizer;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int jersey = Integer.parseInt(st.nextToken());
        if (jersey < 4)
        {
            System.out.println(0);
        }
        else
        {
            System.out.println((jersey-3)*(jersey-2)*(jersey-1)/6);
        }
        
    }
}
    
