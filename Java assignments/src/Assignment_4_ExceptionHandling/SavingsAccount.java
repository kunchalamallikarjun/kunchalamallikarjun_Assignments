package Assignment_4_ExceptionHandling;

public class SavingsAccount {
	long id;
	double balance=0;
	double amount;
	
	public void deposit(double amount)
	{
		System.out.println("Enter the amount you wannt to deposit");
		
		balance=balance+amount;
	}
	public void withdraw(double amount) throws Exception
	{
		if(amount>balance)
		{
			throw new Exception("InsufficientBalanceException");
		}
		else if(amount<0) 
		{
			throw new Exception("IllegalBankTransactionException");
		}
		else
		{
			balance=balance-amount;
			System.out.println("Balance after widhrawl: "+balance);
			
		}
		
	}

}

