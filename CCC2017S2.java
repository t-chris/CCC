import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int numWaves = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] wave = new int[numWaves];
        for (int i = 0; i < numWaves ; i++)
        {
            wave[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(wave);
        
        int[] order = new int[numWaves];
        
        
        if (numWaves % 2 == 0)
        {
            for (int i = 0; i < numWaves ; i+=2)
            {
                order[i] = wave[(numWaves/2 - 1) - i/2];
                order[i+1] = wave[numWaves/2 + i/2];   
            }
        }
        else
        {
            for (int i = 0; i < numWaves ; i +=2)
            {
            order[i] = wave[(numWaves/2) - i/2];
            if (i != (numWaves - 1))
                {
                    order[i+1] = wave[(numWaves/2 + 1)  + i/2];
                }
            else
                {
                    break;
                }
            }
        }
            for  (int i = 0; i < numWaves ; i++)
            {
                System.out.print(order[i] + " ");
            }

        }
        
    }
    
