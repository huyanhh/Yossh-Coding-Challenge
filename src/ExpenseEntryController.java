package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class ExpenseEntryController implements Initializable{

	@FXML
	private Button saveButton;
	
	@FXML
	private TextField valueText;
	
	@FXML
	private TextField reasonText;
	
	@FXML
	private TextField dayText;
	
	@FXML
	private TextField monthText;
	
	@FXML
	private TextField yearText;
	
	ExpenseStorage storage;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) 
	{
		storage = new ExpenseStorage();
	}
	
	@FXML
	public void saveButtonClick(ActionEvent event) throws IOException 
	{
		
		int day = Integer.parseInt(dayText.getText());
		int month = Integer.parseInt(monthText.getText());
		int year = Integer.parseInt(yearText.getText());
		
		double value = Double.parseDouble(valueText.getText());
		String reason = reasonText.getText();
		
		Expense e = new Expense(day, month, year, value, reason);
		
		storage.addExpense(e);
	}
	


}
