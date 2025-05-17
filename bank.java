import java.util.Scanner;
class bank{
public String accno;
public String name;
public long balance;
Scanner KB = new Scanner(System.in);
void openAccount(){
System.out.print("Enter Account No:");
accno=KB.next();
System.out.print("Enter Name:");
name=KB.next();
System.out.print("Enter balance:");
balance=KB.nextLong();
}
void showaccount(){
System.out.println(accno + "," + name + "," + balance);
}}