import java.io.*;
public class CCC2000S1J3 {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int coins = Integer.parseInt(br.readLine());
        int one = Integer.parseInt(br.readLine());
        int two = Integer.parseInt(br.readLine());
        int three = Integer.parseInt(br.readLine());
        int times = 0;
        
        while (coins != 0)
        {
            coins--;
            one++;
            
            if (one%35 == 0)
            {
                coins+=30;
            }
            coins--;
            
            two++;
            if (two%100 == 0)
            {
                coins+=60;  
            }
            coins--;
            
            three++;
            if (three%10 == 0)
            {
                coins+=9;
            }
            
            times+=3;
        }
        System.out.printf("Martha plays " + times + " times before going broke.");
    }
    
}
