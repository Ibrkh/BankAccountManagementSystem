package BankAccountManagment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class MySQL extends DatabaseHandler
{

	MySQL()
	{
		//default constructor
	}
	
	@Override
	public void ConnectDatabase(Customer customer)
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Bank_Account_Management_System", "root", "system2000");
			System.out.println("MySQL Server Connected...");
		
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
					
					String MySQLQuery1 = "INSERT INTO Customer (Account_Number, First_Name, Last_Name, Home_Address, Email_Address, Phone_Number) VALUES (?, ?, ?, ?, ?, ?)";
					
					PreparedStatement statement1 = connection.prepareStatement(MySQLQuery1);
					statement1.setString(1, accountNumber);
					statement1.setString(2, firstName);
					statement1.setString(3, lastName);
					statement1.setString(4, address);
					statement1.setString(5, email);
					statement1.setString(6, phone);
					
					int QueryInserted1 = statement1.executeUpdate();
					if(QueryInserted1 > 0)
						System.out.println("Customer insertion successful in MySQL Database..");
					
//					String MySQLQuery2 = "INSERT INTO BankAccount (Account_Number, Account_Password, Account_Type, Account_Status, Account_Balance) VALUES (?, ?, ?, ?, ?)";
//					
//					statement1 = connection.prepareStatement(MySQLQuery2);
//					statement1.setString(1, accountNumber);
//					statement1.setString(2, password1);
//					statement1.setString(3, accountType);
//					statement1.setString(4, accountStatus);
//					statement1.setInt(5, accountBalance);
//					 
//					int QueryInserted2 = statement1.executeUpdate();
//					if(QueryInserted2 > 0)
//						System.out.println("Customer Bank Account insertion successful in MySQL Database..");
					break;	
				}
						
			}
			connection.close();
			
			System.out.println("MySQL server disconnected...");
		}
		catch (ClassNotFoundException e)
		{
			System.out.println("Driver not Found !");
		}
		catch (SQLException e)
		{
			System.out.println("Connection not Established !");
		}
	}	
}
