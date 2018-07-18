import java.util.Scanner;

//File Nam e BankDem o.java
public class BankDemo
{
	public static void main(String [] args)throws InsufficientFundsException
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter account number");
		int x=s.nextInt();
		CheckingAccount c = new CheckingAccount(x);
		System .out.println("Depositing amount  $: ");
		double d=s.nextDouble();
		c.deposit(d);
		try
		{
			System .out.println("\nWithdrawing amount $ : ");
			double d1=s.nextDouble();
			c.withdraw(d1);
			System .out.println("Depositing amount  $: ");
			double d3=s.nextDouble();
			c.deposit(d3);
			System .out.println("\nWithdrawing amount $ : ");
			double d2=s.nextDouble();
			c.withdraw(d2);
			
		}catch(InsufficientFundsException e)
		
		{
			throw e;
			
			//System .out.println("Sorry, but you are short $ " + e.getAmount());
			
			//e.printStackTrace();
		}
	}
}