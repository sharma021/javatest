public class MainString{
   public static void main(String args[]){
	String str1= new String("Hello");
	String str2= new String("Hi");
	String str3= new String("Hello");
	System.out.println("str1 equals to str2:"+str1.equals(str2));
	System.out.println(str1.toLowerCase());
	System.out.println(str2.toUpperCase());
	System.out.println(str3.reverse());
   }
}