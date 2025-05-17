class SavingsAccount
{private double balance;
private double interest;
public SavingsAccount(){balance=0;
interest=0;
}
public SavingsAccount(double initialBalance, double initialinterest)
{
balance=initialBalance;
interest=initialInterest;
}
public void deposit(double amount)
{balance=balance+amount;
}
public void withdraw(double amount)
{balance=balance-amount;
}
public void addInterest(){
balance=balance+balance*interest;
}
public double getBalance()
{return balance;
}}
public class SavingsAccountTester
{public static void main(String[] args)
{
SavingsAccount NainaSavings=new SavingsAccoun(10000,0.10);
NainaSavings.withdraw(2000);
NainaSavings.deposit(750);
NainaSavings.addInterest();
System.out.println(NainaSavings.getBalance());
System.out.println("Expected : 8750");
}}