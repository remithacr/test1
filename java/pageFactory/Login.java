package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login {
	
	@FindBy(xpath = "//*[@id='Login']/div[2]/div[2]/div/div[2]/div[3]/button")
	private WebElement email;

	public Login(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}

	public WebElement getEmail() {
		return email;
	}
}
