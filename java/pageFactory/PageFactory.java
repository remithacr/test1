package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PageFactory {

	public static void main(String args[]){
		WebDriver driver = new FirefoxDriver();
		driver.get("");
		Login log = new Login(driver);
		 //Login login = org.openqa.selenium.support.PageFactory.initElements(driver, Login.class);
		 
		 
	}
}
