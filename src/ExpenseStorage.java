package application;

import java.util.ArrayList;

public class ExpenseStorage 
{
	ArrayList<Expense> storage;
	
	public ExpenseStorage()
	{
		storage = new ArrayList<Expense>();
	}
	
	public void addExpense(Expense e)
	{
		storage.add(e);
	}
}
