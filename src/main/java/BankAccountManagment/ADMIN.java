package BankAccountManagment;

public class ADMIN
{
	// Attributes
	String FirstName;
	String LastName;
	String AdminID;
	String IDPassword;
	
	public ADMIN()
	{
		FirstName = null;
		LastName = null;
		AdminID = null;
		IDPassword = null;
	}

	public ADMIN(String fname, String lname, String ID, String Password)
	{
		FirstName = fname;
		LastName = lname;
		AdminID = ID;
		IDPassword = Password;
	}

	public void EditPassword(String Password)
	{
		IDPassword = Password;
	}	
	
	public String AccountPassword()
	{
		return this.IDPassword;
	}

	 
	public void AdminDetails()
	{
		System.out.println("ADMIN Details.\n");
		System.out.println("Admin Name: " + FirstName + " " + LastName);
		System.out.println("AdminID: " + AdminID);
		System.out.println("Admin Password: " + IDPassword);
	}
}

