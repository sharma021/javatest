import static java.lang.Float.sum;  
import java.util.Scanner;  
public class average {  
   public static void main(String[] args)  
    {  
      int n, count = 1;   
      float  xF, averageF, sumF = 0;   
      Scanner sc = new Scanner(System.in);     
      System.out.println("Enter the number of values:");  
      n = sc.nextInt();  
      while (count <= n)   
             {   
                  System.out.println("Enter number"+count);  
                  xF = sc.nextInt();  
                  sumF += xF;   
                  ++count;   
             }   
                  averageF = sumF/n;   
        System.out.println("Avergage for these numbers becomes"+averageF);  
    }    
}  