package main;
import java.io.*;
import java.util.StringTokenizer;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x1 = Integer.parseInt(st.nextToken());
        int y1 = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int x2 = Integer.parseInt(st.nextToken());
        int y2 = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int charge = Integer.parseInt(st.nextToken());
        int distance = Math.abs((x2-x1)) + Math.abs((y2-y1));
        //If you can get to a point in x charges, you can get to it in x + 2n charges, where n is any integer.
        //Also, the charge has to be equal or more than the quickest path.
        if ((charge >= distance) && ((charge-distance)%2 == 0))
        {
            System.out.println("Y");
        }
        else
        {
            System.out.println("N");
        }
        
    }
}
    
