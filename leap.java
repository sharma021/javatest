import java.util.Scanner;
public class leap {
   public static void main(String[] args){
      int year;
      System.out.println("Enter an Year :: ");
      Scanner sc = new Scanner(System.in);
      year = sc.nextInt();

      if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
         System.out.println("Yeah! its leap");
      else
         System.out.println("Nope, 365 days only! Not a leap year");
   }
}