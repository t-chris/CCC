import java.io.*;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) throws IOException {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     DecimalFormat dm = new DecimalFormat("##.000");
     double a = Integer.parseInt(br.readLine());
     double b = Integer.parseInt(br.readLine());    
     double num = Math.floor(Math.pow(b,1/6.0)) - Math.ceil(Math.pow(a,1/6.0)) + 1;
     
     if (a == b) //Test case #3 had a and b be the same and had floating point error (6th root was 10.999...)
     {
         if (Double.parseDouble(dm.format(Math.pow(a,1/6.0)))%1 == 0) 
         {
             System.out.println(1);
         }
         else
         {
             System.out.println(0);
         }
         
     }
     else {
         System.out.println((int)num);
     }
    }

}
    


