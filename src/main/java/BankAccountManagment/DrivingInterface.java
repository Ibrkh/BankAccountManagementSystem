package BankAccountManagment;

import java.util.Scanner;

public class DrivingInterface 
{
	public static void main(String[] args) 
	{
		ADMIN admin = new ADMIN("Ibrahim", "Khan", "k190312", "ThinkPadE490");
		DatabaseHandler dbHandler = null;

		Scanner input = new Scanner(System.in);
		
		System.out.println("Bank Account Management System\n");
		System.out.println("Select a Database: ");
		System.out.println("1. File Handling");
		System.out.println("2. MySQL Database");
		System.out.println("3. Oracle XE Database");
		int Database_Option = input.nextInt();
		
		switch(Database_Option)
		{
			case 1:
			{				
				System.out.println("File Handling established as system Database...");				

				dbHandler = new FileHandling();
				dbHandler.ConnectDatabase(null);
				
				break;
			}
			case 2:
			{
				System.out.println("MySQL established as system Database...");
				
				dbHandler = new MySQL();
				dbHandler.ConnectDatabase(null);
				
				break;	
			}
			case 3:
			{
				System.out.println("Oracle XE established as system Database...");

				System.out.println("Bank Account Management System\n");

				break;
			}
		}
	}
}
