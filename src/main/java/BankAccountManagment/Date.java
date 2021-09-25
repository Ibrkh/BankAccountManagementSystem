package BankAccountManagment;

public class Date
{
	// Attributes
	int Day;
	int Month;
	int Year;
	
	// Default Constructor
	Date()
	{
		Day = -1;
		Month = -1;
		Year = -1;
	}
	
	//Parameterized Constructor
	Date(int day,int month, int year)
	{
		this.Day = day;
		this.Month = month;
		this.Year = year;
	}
	
	public String getDate()
	{
		String date = null;
		
		date = Day + "/" + Month + "/" + Year;
	
		return date;
	}

	void DisplayDate()
	{
		System.out.println("Creation Date: " + Day + "/" + Month + "/" + Year);
	}
}

