import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        double[] villages = new double[size];
        for (int i = 0; i < size; i++)
        {
            villages[i] = s.nextInt();
        }
        Arrays.sort(villages);
        
        double[] neighbourhood = new double[size - 2];
        
        for (int i = 0; i < size - 2; i++)
        {
            neighbourhood[i] = (villages[i+1] - villages[i])/2 + (villages[i+2] - villages[i+1])/2;
        }
        Arrays.sort(neighbourhood);
        System.out.printf("%.1f", neighbourhood[0]);
       
        
        
        

        
        
    }
    
}
