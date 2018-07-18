

//File Nam e InsufficientFundsException.java
public class InsufficientFundsException extends Exception
{
	private double amount;
	public InsufficientFundsException(double amount)
	{
		this.amount = amount;
	}
	public double getAmount() {
		return amount;
	}
	
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
}