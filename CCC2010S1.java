import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;
public class Main3 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());
        if (num == 0)
        {
            System.exit(0);
        }
        st = new StringTokenizer(br.readLine());
        ArrayList<String> name = new ArrayList<>();
        int R = 0;
        int S = 0;
        int D = 0;
        int score = 0;
        int top1 = 0;
        int top2 = 0;
        String comp1 = "";
        String comp2 = "";
        for (int i = 0 ; i < num ; i++) {
            
            name.add(st.nextToken());
            
            R = Integer.parseInt(st.nextToken());
            
            S = Integer.parseInt(st.nextToken());
            
            D = Integer.parseInt(st.nextToken());
            
            score = 2*R + 3*S + D;
            if (i == 0)
            {
                top1 = score;
                comp1 = name.get(0);

            }
            if (score > top2 && i != 0)
            {
                if (score > top1)
                {
                    comp2 = comp1;
                    top2 = top1;
                    top1 = score;
                    comp1 = name.get(i);
                }
                else if (score == top1)
                {
                    if (comp1.compareTo(name.get(i)) < 0 )
                    {
                        comp2 = name.get(i);
                    }
                    if (comp1.compareTo(name.get(i)) > 0 )
                    {
                        int temp = top2;
                        top2 = top1;
                        top1 = temp;
                        
                        comp2 = comp1;
                        
                        comp1 = name.get(i);
                        

                    }
                }
                else
                {
                    top2 = score;
                    comp2 = name.get(i);
                }
            }
            if (i+1 != num)
            {
                st = new StringTokenizer(br.readLine());
            }
        }
        System.out.println(comp1);
        System.out.println(comp2);
    }
}
            
