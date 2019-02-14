import java.io.*;
import java.util.StringTokenizer;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) throws IOException {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     StringTokenizer st;
     ArrayList<String> city = new ArrayList<String>();
     ArrayList<Integer> temp = new ArrayList<Integer>();
     int lowest = 0;
     int i = 0;
     int inum = 0;
     while (!city.contains("Waterloo"))
     {
         st = new StringTokenizer(br.readLine()); //Cathy is SMART smart.
         city.add(st.nextToken());
         temp.add(Integer.parseInt(st.nextToken()));
         if (temp.get(i) < lowest)
         {
             lowest = temp.get(i);
             inum = i;
         }
         i++;
     }
     System.out.println(city.get(inum));
    }

}
