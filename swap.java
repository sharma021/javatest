import java.util.*;

class swap
{
	public static void main(String []s)
	{
		int a,b;
		//Scanner class to read value
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter a: ");
		a=sc.nextInt();
		System.out.print("Enter b: ");
		b=sc.nextInt();

		System.out.println("Before swapping - a: "+ a +", b: " + b);
		////using thrid variable
		int temp;
		temp=a;
		a=b;
		b=temp;
		//////////////////////
		System.out.println("After swapping  - a: "+ a +", b: " + b);
	}
}