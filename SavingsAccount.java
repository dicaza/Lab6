/*
 * Class: CMSC203
 * Instructor: Khandan Monshi
 * Due: April 14th 2024
 * Platform/Compiler: Eclipse
 * I pledge that I have completed the programming
 * assignment independently. I have not copied the code
 * from a student or any source. I have not given my code
 * to any student.
 * Print your Name here: David Icaza
 */
public class SavingsAccount extends BankAccount
{
	private double rate = .025;
	private int savingsNumber = 0;
	private String accountNumber;
	
	//First constructor
	public SavingsAccount(String name, double amt)
	{
		super(name, amt);
		accountNumber = super.getAccountNumber() + "-" + savingsNumber;
	}
	
	//Copy constructor
	public SavingsAccount(SavingsAccount oldAccount, double amt)
	{
		super(oldAccount, amt);//This calls the copy constructor of the super class
		savingsNumber = oldAccount.savingsNumber + 1;
		accountNumber = super.getAccountNumber() + "-" + savingsNumber;
	}
	
	public void postInterest()
	{
		double interest = getBalance() * rate / 12;
		deposit(interest);
	}
	
	@Override
	public String getAccountNumber()
	{
		return accountNumber;
	}
}
