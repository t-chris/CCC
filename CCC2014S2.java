import java.io.*;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int x = Integer.parseInt(br.readLine());
        HashMap<String, String> hmap = new HashMap<String, String>();

        
        ArrayList<String> a = new ArrayList<String>();
        ArrayList<String> b = new ArrayList<String>();
        
        st = new StringTokenizer(br.readLine());
        for (int i = 0 ; i < x ; i++)
        {
            a.add(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0 ; i < x ; i++)
        {
            b.add(st.nextToken());
        }
        
        int counter = 0;
        for (int i = 0 ; i < x ; i++)
        {
            
            hmap.putIfAbsent(a.get(i), b.get(i));
            
            if (a.get(i).equals(b.get(i)))
            {
                counter++;
            }
            
            if (hmap.containsKey(a.get(i)) && !hmap.get(a.get(i)).equals(b.get(i)))
            {
                counter++;
            }
            else if(hmap.containsKey(b.get(i)) && !hmap.get(b.get(i)).equals(a.get(i)))
            {
                counter++;
            }
                    
        }
        
        if (counter == 0)
        {
            System.out.println("good");
        }
        else
        {
            System.out.println("bad");
        }
        
    }
        
}
