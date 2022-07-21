package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageTest {
	WebDriver driver;
	
	@FindBy(id="username")
	private WebElement username;
	@FindBy(name="pwd")
	private WebElement password;
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement login;
}
