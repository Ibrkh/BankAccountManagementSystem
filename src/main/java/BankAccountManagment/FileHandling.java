package BankAccountManagment;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling extends DatabaseHandler
{
	FileHandling()
	{
		//default constructor
	}

	public void ConnectDatabase(Customer customer)
	{
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.println("Bank Account Management System\n");
		System.out.println("1. Already have an account ? Sign-In");
		System.out.println("2. Create a new account. Sign-Up");
		int Account_Login = input.nextInt();
		
		switch(Account_Login)
		{
			case 1:
			{				
				System.out.println("Bank Account Sign-In Interface\n");
				
				System.out.println("Enter your Account Number: ");
				String accountNumber = input.next();
				
					if(accountNumber.equals(customer.AccountNumber))
					{
						System.out.println("Enter your Account Password: ");
						String accountPassword = input.next();

						for(int j=0; j<customer.Accounts.size(); j++)
							if(accountPassword.equals(customer.Accounts.get(j).AccountPassword))
								System.out.println("Account Login Succesful !");
					}
					
				break;
			}
			case 2:
			{
				System.out.println("Bank Account Sign-Up Interface\n");

				System.out.println("Enter your First Name: ");
				String firstName = input.next();
				
				System.out.println("Enter your Last Name: ");
				String lastName = input.next();
				
				System.out.println("Enter your Age: ");
				int age = input.nextInt();
				
				System.out.println("Enter your Gender: ");
				String gender = input.next();
				
				System.out.println("Enter your Home Address: ");
				String address = input.next();
				
				System.out.println("Enter your Email Address: ");
				String email = input.next();
				
				System.out.println("Enter your Phone Number: ");
				String phone = input.next();
				
				System.out.println("Processing... please wait\n");
				
				System.out.println("Enter your new account number: ");
				String accountNumber = input.next();

				String password1 = "";
				
				while(true)
				{
					System.out.println("Enter a Password: ");
					password1 = input.next();
					
					System.out.println("Re-Enter Password: ");
					String password2 = input.next();
					
					if(password1.equals(password2))
						break;
					else
						System.out.println("Password didn't match !");
				}
				
				System.out.println("Enter your Account Type (Savings/Checkings): ");
				String accountType = input.next();
				
				String accountStatus = "Account Active";
				
				System.out.println("Your Bank Account has been created ");
				System.out.println("Enter an amount to deposit in your account: ");
				int accountBalance = input.nextInt();
				
				try {
					FileWriter fw = new FileWriter("accountsdata.csv",true);
					fw.write(accountNumber +","+firstName+","+lastName+","+address+","+email+","+phone+","+ password1 +","+ accountType +","+ accountStatus + "," + accountBalance);
					fw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				break;	
			}
					
		}
	}
}
