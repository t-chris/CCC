import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testNum = Integer.parseInt(br.readLine());
        double[] array = new double[testNum];
        int sum = 0;
        for (int i = 0 ; i < testNum ; i++)
        {
            sum += Integer.parseInt(br.readLine());
        }
        double average = (double)sum/testNum;
        
        System.out.printf("%.1f", average);
        System.out.println();

    }    
}
