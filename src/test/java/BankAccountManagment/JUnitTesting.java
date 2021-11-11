//package BankAccountManagment;
//
//import static org.junit.Assert.*;
//
//import java.util.Scanner;
//
//import org.junit.Test;
//
//public class JUnitTesting 
//{
//	@Test
//	public void Date()
//	{
//		Date date1 = new Date(2, 3, 2000);		
//		System.out.println("My Birthday: " + date1.getDate());
//
//		Date date2 = new Date(23, 0, 2021);		
//		System.out.println("Today's Date: " + date2.getDate());
//		
//		Date date3 = new Date(9, 23, 2021);		
//		date3.DisplayDate();		
//	}
//
//	
//	@Test
//	public void BankADMIN() 
//	{
//		ADMIN admin = new ADMIN("Ibrahim", "Khan", "k190312", "ThinkPadE490");
//				
//		admin.AdminDetails();
//		
//		Scanner input = new Scanner(System.in);
//		System.out.println("Enter new password: ");
//		String password1 = input.nextLine();
//
//		System.out.println("Confirm password: ");
//		String password2 = input.nextLine();
//		
//		if(password1.equals(password2))
//		{
//			admin.EditPassword(password1);
//			System.out.println("Password changed Succesfully !");
//			admin.AdminDetails();
//			
//			assertEquals(password1, admin.AccountPassword());
//		}
//	}
//	
//
//	@Test
//	public void CreateAccount()
//	{
//		System.out.println("Creating a new Account..\n");
//		BankAccount account = new BankAccount(22, 9, 2021, "Ibrahim", "Khan", "House 1147 Islamabad", "ibrahimkhaan133@gmail.com", "03162533800", "Male", "21", "k190312", "ThinkPadE490", "Saving", "Active", 55000);			
//		System.out.println("Account Created !");
//	
//		System.out.println("Edit Account...\n");
//		
//		account.account.EditCustomer("Hassan", "Jamil", "21", "Male", "Block N North Nazimababd Karachi", "03155964778", "k190229@nu.edu.pk");
//		System.out.println("Account Edited !");
//		
//		account.AccountDetails();
//	}
//
//	
//	@Test
//	public void AccountDetails() 
//	{
//		BankAccount account = new BankAccount(22, 9, 2021, "Ibrahim", "Khan", "House 1147 Islamabad", "ibrahimkhaan133@gmail.com", "03162533800", "Male", "21", "k190312", "ThinkPadE490", "Saving", "Active", 55000);
//		
//		assertEquals("Ibrahim", account.account.FirstName);				//First Name
//		assertEquals("Khan", account.account.LastName);					//Last Name
//		assertEquals("22/9/2021", account.CreationDate.getDate());		//Account Creation Date
//		assertEquals("House 1147 Islamabad", account.account.Address);  // Address
//		assertEquals("ibrahimkhaan133@gmail.com", account.account.Email);// Email
//		assertEquals("03162533800", account.account.PhoneNumber);		// Phone Number
//		assertEquals("Male", account.account.Gender);					// Gender
//		assertEquals("21", account.account.Age);						// Age
//		assertEquals("k190312", account.AccountNumber());					// Account Number
//		assertEquals("ThinkPadE490", account.AccountPassword());			// Account Password
//		assertEquals("Saving", account.AccountType());					// Account Type
//		assertEquals("Active", account.AccountStatus());					// Account Status
//		assertEquals(55000, account.AccountBalance());					// Account Balance
//		
//		account.AccountDetails();
//	}
//
//	
//	@Test
//	public void DepositMoney()
//	{
//		BankAccount account = new BankAccount(22, 9, 2021, "Ibrahim", "Khan", "House 1147 Islamabad", "ibrahimkhaan133@gmail.com", "03162533800", "Male", "21", "k190312", "ThinkPadE490", "Saving", "Active", 55000);
//
//		System.out.println("Welcome to Money Deposit Interface\n");
//
//		Scanner input = new Scanner(System.in);		
//		System.out.println("Enter the amount: ");
//		int amount = input.nextInt();
//		
//		account.Deposit(amount);
//				
//		assertEquals((account.AccountBalance()), account.AccountBalance());		
//		System.out.println("Money Deopisted Successfully !");
//	}
//
//	
//	@Test
//	public void FundsTransactions()
//	{
//		BankAccount account1 = new BankAccount(22, 9, 2021, "Ibrahim", "Khan", "House 1147 Islamabad", "ibrahimkhaan133@gmail.com", "03162533800", "Male", "21", "k190312", "ThinkPadE490", "Saving", "Active", 55000);
//		BankAccount account2 = new BankAccount(22, 9, 2021, "Mahnoor", "Muratza", "Gulshan Karachi", "mahnoor.murtaza@gmail.com", "03321657223", "Female", "20", "k190229", "ZemAssociates", "Saving", "Active", 75000);
//
//		System.out.println("\nWelcome to Funds Transfer Interface\n");
//		
//		Scanner input = new Scanner(System.in);
//		System.out.println("Enter reciever's Account Number: ");
//		String reciever = input.nextLine();
//		
//		System.out.println("Enter the amount: ");
//		int amount = input.nextInt();
//		
//		if(account2.AccountNumber == "k190229")
//			account1.TransferAmount(account2, amount);
//		else 
//			System.out.println("Invalid Account number !");
//		
//		//System.out.println(account2.AccountNumber);
//		
//		assertEquals((account2.AccountBalance()), account2.AccountBalance());		
//		System.out.println("Transaction Successful !");
//	}
//
//	
//	@Test
//	public void CashWithdrawal()
//	{
//		BankAccount account = new BankAccount(22, 9, 2021, "Ibrahim", "Khan", "House 1147 Islamabad", "ibrahimkhaan133@gmail.com", "03162533800", "Male", "21", "k190312", "ThinkPadE490", "Saving", "Active", 55000);
//
//		System.out.println("\nWelcome to Cash Withdrawal Interface\n");
//
//		Scanner input = new Scanner(System.in);
//		System.out.println("Enter the amount: ");
//		int amount = input.nextInt();
//		
//		if(amount > 0)
//			account.CashWithdrwawl(amount);
//		else 
//			System.out.println("Invalid amount !");
//		
//		assertEquals((account.AccountBalance()), account.AccountBalance());		
//		System.out.println("Cash Withdrawal Successful !");
//
//	}
//
//	
//	@Test
//	public void CalculateZakaat()
//	{
//		BankAccount account = new BankAccount(22, 9, 2021, "Ibrahim", "Khan", "House 1147 Islamabad", "ibrahimkhaan133@gmail.com", "03162533800", "Male", "21", "k190312", "ThinkPadE490", "Saving", "Active", 55000);
//
//		System.out.println("Welcome to Islamic Zakaat Interface\n");
//
//		@SuppressWarnings("unused")
//		Scanner input = new Scanner(System.in);
//		System.out.println("Enter Account Number: ");
//
//		if(account.AccountNumber == "k190312")
//			account.CalculateZakaat();
//		else 
//			System.out.println("Invalid Account number !");
//		
//		assertEquals((account.AccountBalance()), account.AccountBalance());		
//	}
//}
