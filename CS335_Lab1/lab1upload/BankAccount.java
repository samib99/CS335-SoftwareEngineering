package atm;

public class BankAccount {
	/**
	 * This class adds and subtracts balance from the bank account.
	 */

    private double balance;

	//Constructors
	public BankAccount()
	{
		balance = 0;
	}
	/** 
	 * This displays balance
	 * @param initialBalance
	 * @return balance
	 */
	public BankAccount(double initialBalance)
	{
		balance = initialBalance;
	}
	/**This adds your deposit onto your current balance.
	 * 
	 * @param amount
	 * @return balance
	 */
	// Methods
	public void deposit(double amount)
	   {      
		balance = balance + amount;
	       
	    } 
	/**
	 * Subtracts withdrawal amount from balance
	 * @param amount
	 * @return balance
	 */
	
	public boolean withdraw(double amount)    
	{ 
		if (balance>= amount)
			{
			balance = balance - amount;
			return true;
			}
		else
			return false;
        
    } 
	/** Gets balance
	 * @param balance
	 * @return balance
	 */
	
	public double getBalance() 
	{ 
		return balance;
	}
}

