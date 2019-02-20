import java.io.*;
import java.util.StringTokenizer;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int numChar = Integer.parseInt(br.readLine());
        ArrayList<String> chars = new ArrayList<>();
        ArrayList<String> bin = new ArrayList<>();

        for (int i = 0 ; i < numChar ; i++)
        {
            st = new StringTokenizer(br.readLine());
            chars.add(st.nextToken());
            bin.add(st.nextToken());
        }
        String encode = br.readLine();
        String done = "";
        while (encode.length() > 0)
        {
            for (int j = 0 ; j < numChar ; j++)
            {
                if (encode.startsWith(bin.get(j)))
                {
                    done += chars.get(j);
                    encode = encode.substring((bin.get(j)).length());
                    break;
                }
            }

        }
        System.out.println(done);
    }
        
}
