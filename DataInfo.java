import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import objectrepository.Contact;
import objectrepository.TaxCreditCo;

public class DataInfo {
	
	
	@DataProvider(name="LoginData")
	public Object[][] getData() {
		
		Object[][] data = new Object[2][8];
		
		//Name
		data[0][0]="Apple";
		//Title
		data[0][1]="Tester";
		//Email
		data[0][2]="test@email.com";
		//Phone
		data[0][3]=555555555;
		//Company
		data[0][4]="TheBest";
		//Size
		data[0][5]=500;
		//State
		data[0][6]="CA";
		//Additional Info
		data[0][7]="I hope all is well";
		
		//Name
		data[1][0]="Orange";
		//Title
		data[1][1]="IT";
		//Email
		data[1][2]="good@email.com";
		//Phone
		data[1][3]=555555555;
		//Company
		data[1][4]="Hard Work";
		//Size
		data[1][5]=1000;
		//State
		data[1][6]="CO";
		//Additional Info
		data[1][7]="I hope all is well.  Please come again.";
		
		return data;
	}

}