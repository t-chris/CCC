import java.io.*;
import java.util.StringTokenizer;
public class Main {

    public static void main(String[] args) throws IOException {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     int num = Integer.parseInt(br.readLine());

     for (int i = 0 ; i < num ; i++)
     {
         StringTokenizer st = new StringTokenizer(br.readLine());
         int yr = Integer.parseInt(st.nextToken());
         int mon = Integer.parseInt(st.nextToken());
         int day = Integer.parseInt(st.nextToken());
         
         if (2007 - yr > 18) {
             System.out.println("Yes");
         }
         else if (2007 - yr < 18) {
             System.out.println("No");
         }
         else {
             if (2 - mon > 0) {
                 System.out.println("Yes");
             }
             else if (2 - mon < 0 ) {
                System.out.println("No");
             }
             else {
                 if (27 - day < 0) {
                     System.out.println("No");
                 }
                 else if (27 - day > 0) {
                     System.out.println("Yes");
                 }
                 else {
                     System.out.println("Yes");
                 }
             }
         }       
       
         
     }
    }

}
    


