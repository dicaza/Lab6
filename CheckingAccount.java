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
public class CheckingAccount extends BankAccount
{
	private final double FEE = 0.15;
	
	public CheckingAccount(String name, double amt)
	{
		super(name, amt);
		setAccountNumber(getAccountNumber() + "-10");
	}
	
	public boolean withdraw(double amt)
	{
		amt += FEE;
		return super.withdraw(amt);
	}
}
