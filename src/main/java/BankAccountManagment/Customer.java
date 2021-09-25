package BankAccountManagment;

class Customer
{	
	// Attributes
	String AccountNumber;
	String FirstName;
	String LastName;
	String Age;
	String Gender;
	String Address;
	String Email;
	String PhoneNumber;
	
	// Default Constructor
	public Customer()
	{
		AccountNumber = null;
		FirstName = null;
		LastName = null;
		Address = null;
		PhoneNumber = null;
		Email = null;
		Gender = null;
		Age = null;
	}
	
	
	//Parameterized Constructor
	public Customer(String AccountNumber, String FirstName, String LastName, String Age, String Gender, String Address, String PhoneNumber, String Email)
	{				
		this.AccountNumber = AccountNumber;
		this.FirstName = FirstName;
		this.LastName = LastName;
		this.Address = Address;
		this.Email = Email;
		this.PhoneNumber = PhoneNumber;
		this.Gender = Gender;
		this.Age = Age;		
	}
	
	public void EditCustomer(String FirstName, String LastName, String Age, String Gender, String Address, String PhoneNumber, String Email)
	{
		this.FirstName = FirstName;
		this.LastName = LastName;
		this.Address = Address;
		this.Email = Email;
		this.PhoneNumber = PhoneNumber;
		this.Gender = Gender;
		this.Age = Age;			
	}
}