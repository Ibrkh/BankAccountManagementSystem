package BankAccountManagment;

public class BankAccount_Saving extends BankAccount
{
	//Attributes
	float InterestRate;
	
	
	//Constructor
	BankAccount_Saving()
	{
		// 17% interest rate
		InterestRate = 17/100;
	}
	
	public float CalculateInterest()
	{
		float interest  = 0.0f;		
		interest =	InterestRate * this.AccountBalance;
		
		return interest;
	}
}
