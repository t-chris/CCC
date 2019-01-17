import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int coins = Integer.parseInt(br.readLine());
        int one = Integer.parseInt(br.readLine());
        int two = Integer.parseInt(br.readLine());
        int three = Integer.parseInt(br.readLine());
        int times = 0;
        while (coins != 0)
        {
            coins-=1;
            one++;
            times++;
            if (one%35 == 0)
            {
                coins+=30;
            }
            if (coins <= 0)
            {
                break;
            }

            coins-=1;
            two++;
            times++;
            if (two%100 == 0)
            {
                coins+=60;
            }
            if (coins <= 0)
            {
                break;
            }

            coins-=1;
            three++;
            times++;
            if (three%10 == 0)
            {
                coins+=9;   
            }
 
        }
        System.out.printf("Martha plays " + times + " times before going broke.");
    }
    
}
