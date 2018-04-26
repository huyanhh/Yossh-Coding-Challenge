package application;

import java.util.ArrayList;

public class ExpenseStorage 
{
	ArrayList<Expense> contents;
	
	public ExpenseStorage()
	{
		contents = new ArrayList<Expense>();
	}
	
	public void addExpense(Expense e)
	{
		contents.add(e);
	}
	
	public ExpenseStorage getStorage()
	{
		return this;
	}
	
	public int getSize()
	{
		return contents.size();
	}
}
