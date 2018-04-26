package application;

public class Expense 
{
	// date of the expense
	public Date date;
	
	//value of the expense
	public double value;
	
	// reason for the expense
	public String reason;
	
	/**
	 * default constructor for Expense
	 */
	public Expense()
	{
		date = new Date();
		value = 0.00;
		reason = "";
	}
	
	/**
	 * constructor for Expense
	 * @param day	day of expense
	 * @param month	month of expense
	 * @param year	year of expense
	 * @param v		value of expense
	 * @param r		reason for expense
	 */
	public Expense(int day, int month, int year, double v, String r)
	{
		date = new Date(day, month, year);
		value = v;
		reason = r;
	}
	
	/**
	 * constructor for Expense
	 * @param d		date for expense
	 * @param v		value of expense
	 * @param r		reason for expense
	 */
	public Expense(Date d, double v, String r)
	{
		date = d;
		value = v;
		reason = r;
	}
	
	/**
	 * retrieves date
	 * @return	date of expense
	 */
	public Date getDate()
	{
		return date;
	}
	
	/**
	 * allows user to set the date of the expense
	 * @param d
	 */
	public void setDate(Date d)
	{
		date = d;
	}
}
