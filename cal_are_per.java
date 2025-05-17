class measure {
   double length = 17.2;
   double breadth = 8.5;

   measure()
   {
      this.length = 20.5;
      this.breadth = 81.8;

      double area = length*breadth;
      System.out.println( "Area of rectangle : " + area);

      double peri = 2*(length+breadth);
      System.out.println("Perimeter of rectangle: " + peri);
   }
}

public class cal_are_per extends measure {
     cal_are_per()
    {
       super();
      
      double height = 3.6;

      double surface_area = 2*(height*breadth)+2*(height*length)+2*(breadth*length);
      double perimeter = 4*(length +breadth + height);
      System.out.println("perimeter of box: "+ perimeter);
      System.out.println("surface area of box: " + surface_area);
   }


public static void main(String[] args)
{
   new cal_are_per();
}

}
