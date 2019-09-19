import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectrepository.Contact;
import objectrepository.TaxCreditCo;

public class Login {
	
@Test(dataProvider="LoginData", dataProviderClass = DataInfo.class)	
public void Login1(String username, String title, String email, int phone, String company, int size, String state, String addInfo ) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tony\\Documents\\Chrome_Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://taxcreditco.com");
		TaxCreditCo rd = new TaxCreditCo(driver);
		Contact cd = new Contact(driver);
		
		
		rd.Contact().click();
		
		cd.Name().sendKeys(username);
		cd.Title().sendKeys(title);
		cd.Email().sendKeys(email);
		cd.Phone().sendKeys(String.valueOf(phone));
		cd.Company().sendKeys(company);
		cd.CompanySize().sendKeys(String.valueOf(size));
		cd.State().sendKeys(state);
		cd.AdditionalInfo().sendKeys(addInfo);
		
		
		cd.Submit().click();
		
		
	}

}