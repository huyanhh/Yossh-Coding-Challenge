package application;

import java.io.Serializable;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class ExpenseViewerController implements Initializable
{	
	@FXML
	private TextField valueText;
	
	@FXML
	private TextField reasonText;
	
	@FXML
	private TextField dateText;
	
	@FXML
	private ListView list;
	
	ExpenseStorage storage;
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) 
	{
		storage = storage.getStorage();
	}
	
	
	
	
	
}
