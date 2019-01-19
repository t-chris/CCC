import java.io.*;

public class Main {


    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       String x = br.readLine();
       
       while (!(x.equals("quit!")))
       {
           String s = String.valueOf(x.charAt(x.indexOf("or")-1));
            
           
           if ((x.substring(x.length()-2, x.length())).contains("or") && x.length() > 4 && !(s.equals("a")||s.equals("e")||s.equals("i")||s.equals("o")||s.equals("u")||s.equals("y")))
           {
               
               String can = x.replace("or", "our");
               System.out.println(can);
               
           }
           else
           {
              System.out.println(x);
           }
            x = br.readLine();   
               
       }
               
       
       
       
    }
    }

    
