package BankAccountManagment;

public class BankAccount_Checking extends BankAccount
{
	//Attributes
	int TransactionCount;
	
	BankAccount_Checking()
	{
		TransactionCount = 1;
	}
	
	public void MonthlyTransactions()
	{
		if(TransactionCount == 3)
			this.AccountBalance = this.AccountBalance - 10;
		
	}
}	