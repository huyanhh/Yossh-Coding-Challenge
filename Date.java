package application;

/**
 * Date class that holds a day, month, and year
 * @author Jacob Parcell
 *
 */
public class Date 
{
	// day of expense
	public int day;
	
	// month of expense
	public int month;
	
	// year of expense
	public int year;
	
	/**
	 * default constructor for date
	 */
	public Date()
	{
		day = 1;
		month = 1;
		year = 1996;
	}
	
	/**
	 * constructor for date
	 * @param d		user given day
	 * @param m		user given month
	 * @param y		user given year
	 */
	public Date(int d, int m, int y)
	{
		day = d;
		month = m;
		year = y;
	}
	
	/**
	 * retrieve month
	 * @return	month of expense
	 */
	public int getMonth()
	{
		return month;
	}
	
	/**
	 * change month
	 * @param m	month of expense
	 */
	public void setMonth(int m)
	{
		month = m;
	}
	
	/**
	 * retrieve day
	 * @return	day of expense
	 */
	public int getDay()
	{
		return day;
	}
	
	/**
	 * change day
	 * @param d		day of expense
	 */
	public void setDay(int d)
	{
		day = d;
	}	
	
	/**
	 * retrieve year
	 * @return	year of expense
	 */
	public int getYear()
	{
		return year;
	}
	
	/**
	 * change year
	 * @param y		year of expense
	 */
	public void setYear(int y)
	{
		year = y;
	}
	
	/**
	 * retrieve full date
	 * @return	string representation of date
	 */
	public String getDate()
	{
		return month + "/" + day + "/" + year;
	}
	
}
