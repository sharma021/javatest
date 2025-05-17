class SavingsAccount
{
	private double balance;
	private double interest;

	public SavingsAccount()
	{
		balance = 0;
		interest = 0;
	}

	public SavingsAccount(double initialBalance, double initialInterest)
	{
		balance = initialBalance;
		interest = initialInterest;
	}

	public void deposit(double amount)
	{
		balance = balance + amount;
	}

	public void withdraw(double amount)
	{
		balance = balance - amount;
	}

	public void addInterest()
	{
		balance = balance + balance * interest;
	}

	public double getBalance()
	{
		return balance;
	}

}
public class SavingsAccountTester
{
	public static void main(String[] args)
	{
		SavingsAccount VidyasSavings = new SavingsAccount(10000, 0.10);
		VidyasSavings.withdraw(2250);
		VidyasSavings.deposit(4500);
		VidyasSavings.addInterest();
		System.out.println(VidyasSavings.getBalance());
		System.out.println("Expected: 1265.0");
		
	}
}