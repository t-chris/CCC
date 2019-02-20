import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int maxWeight = Integer.parseInt(br.readLine());
        int numCars = Integer.parseInt(br.readLine());
        int[] bridge = new int[numCars+3];
        int okay = 0;
        bridge[0] = 0;
        bridge[1] = 0;
        bridge[2] = 0;
        
        for (int i = 3 ; i < numCars + 3 ; i++)
        {
           bridge[i] = Integer.parseInt(br.readLine());
           int weight = bridge[i] + bridge[i-1] + bridge[i-2] + bridge[i-3];
           if (weight > maxWeight)
           {
               break;
           }
           else
           {
               okay++;
           }
        }
        System.out.println(okay);
    }
        
}
