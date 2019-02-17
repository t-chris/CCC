import java.io.*;
import java.util.StringTokenizer;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) throws IOException {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     StringTokenizer st;
     int jNum = Integer.parseInt(br.readLine());
     int aNum = Integer.parseInt(br.readLine());
     ArrayList<String> jerseys = new ArrayList<String>();
     int satisfy = 0;
     for (int i = 0 ; i < jNum ; i++)
     {
        jerseys.add(br.readLine());
     }
     for (int i = 0 ; i < aNum ; i++)
     {
         st = new StringTokenizer(br.readLine());
         String jersey = st.nextToken();
         int number = Integer.parseInt(st.nextToken());
         if ( jerseys.get(number-1).compareTo(jersey) <= 0 )
         { //Notice the lexicograpihcal order of L, M, and S.
             satisfy++;
             jerseys.set(number - 1, "Z");
         }
         else
         {
             
         }
     }
     System.out.println(satisfy);
     
    
     
    }

}
    



