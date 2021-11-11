package BankAccountManagment;

public abstract class DatabaseHandler 
{
	public DatabaseHandler()
	{
		//Default Constructor
	}
	
	public abstract void ConnectDatabase(Customer customer);
}
