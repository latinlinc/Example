package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Contact {
	
	WebDriver driver;
	
	public Contact(WebDriver driver) {
		
		this.driver = driver;
	}
	
	By name = By.name("firstname");
	
	By title = By.name("jobtitle");
	
	By email = By.name("email");
	
	By phone = By.name("phone");
	
	By company = By.name("company");
	
	By companySize = By.name("company_size");
	
	By state = By.name("state");
	
	By additionalInfo = By.name("message");
	
	By submit = By.cssSelector(".primary[value='Submit']");
	
	public WebElement Name() {
		return driver.findElement(name);
	}
	
	public WebElement Title() {
		return driver.findElement(title);
	}
	
	public WebElement Email() {
		return driver.findElement(email);
	}
	
	public WebElement Phone() {
		return driver.findElement(phone);
	}	
	
	public WebElement Company() {
		return driver.findElement(company);
	}	
		
	public WebElement CompanySize() {
		return driver.findElement(companySize);
	}
	
	public WebElement State() {
		return driver.findElement(state);
	}
	
	public WebElement AdditionalInfo() {
		return driver.findElement(additionalInfo);
	}
	
	public WebElement Submit() {
		return driver.findElement(submit);
	}
			
}