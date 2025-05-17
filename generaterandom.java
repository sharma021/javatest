import java.util.*;
class generaterandom{
public static void main(String[] args){
int counter,flag=0,m=0,var=0;
Random rnum=new Random();
System.out.println("Random number is : ");
for(counter=1;counter<=1;counter++)
var=rnum.nextInt(100);
System.out.println(var);
m=var/2;
if(var==0||var==1){
System.out.println("is not prime");
}else{
for(int i=2;i<m;i++)
if(var%i==0){
System.out.println("is not prime");
flag=1;
break;
}}
if(flag==0)
{System.out.println("is a prime number");
}
}}