package BankAccountManagment;

public class BankAccount
{
	// Attributes
	String AccountNumber;
	String AccountPassword;
	String AccountType;
	String AccountStatus;
	int AccountBalance;

	//Date Object
	Date CreationDate = new Date();
	
	// Default Constructor
	public BankAccount()
	{
		AccountNumber = null;
		AccountPassword = null;
		AccountType = null;
		AccountStatus = null;
		AccountBalance = -1;
	}
	
	//Parameterized Constructor
	public BankAccount(int Day, int Month, int Year, String AccountNumber, String AccountPassword, String AccountType, String AccountStatus, int AccountBalance)
	{
		CreationDate.Day = Day;
		CreationDate.Month = Month;
		CreationDate.Year = Year;
		
				this.AccountNumber = AccountNumber;
		this.AccountPassword = AccountPassword;
		this.AccountType = AccountType;
		this.AccountStatus = AccountStatus;
		this.AccountBalance = AccountBalance;
	}
	
	public String AccountNumber()
	{
		return this.AccountNumber;
	}
	
	public String AccountPassword()
	{
		return this.AccountPassword;
	}
	
	public int AccountBalance()
	{
		return this.AccountBalance;
	}

	public String AccountType()
	{
		return this.AccountType;
	}

	public String AccountStatus()
	{
		return this.AccountStatus;
	}
	
	public void Deposit(int Amount)
	{
		this.AccountBalance = this.AccountBalance + Amount;
	}
	
	public void ChangePassword(String AccountPassword)
	{
		this.AccountPassword = AccountPassword;
	}
	
	public void TransferAmount(BankAccount Reciepent, int Amount)
	{
		if(this.AccountBalance > Amount)
		{
			this.AccountBalance = this.AccountBalance - Amount;
			Reciepent.AccountBalance = Reciepent.AccountBalance + Amount;	
		}
		else
			System.out.println("\nBank balance not enough to transfer funds..\nTry again with a different amount !");
	}
	
	public float CalculateZakaat()
	{
		float zakaat = 0.0f;

		if(this.AccountType == "Saving")
		{	
			if(this.AccountBalance >= 20000)
			{
				zakaat = (float) ((this.AccountBalance*2.5)/100);

				System.out.println("Your annual zakat: RS" + zakaat);
				
				return zakaat;

			}
		}
		else
			System.out.println("Your yearly Zakaat cannot be calculated because your account type is 'Checkin Account'..\nMake your 'Savings Account' for being eligible to give zakaat !");
	
		return zakaat;

	}
	
	public void CashWithdrwawl(int Amount)
	{
		this.AccountBalance = this.AccountBalance - Amount;
	}
	
	public void AccountDetails()
	{
		System.out.println("ACCOUNT DETAILS\n");
		System.out.println("Account Number: " + AccountNumber);
		System.out.println("Account Password: " + AccountPassword);
		System.out.println("Account Type: " + AccountType + "	Account Status: " + AccountStatus);
		System.out.println("Account Password: " + AccountPassword);
		//SavingAccount.CreationDate.DisplayDate();		
		System.out.println("Account Balance: " + AccountBalance);
		System.out.println("\n");
	}
}
