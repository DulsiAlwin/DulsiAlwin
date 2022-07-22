package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BaseMethodActiTest;

public class LoginPageActiTest extends BaseMethodActiTest {
	public WebDriver driver;
	public LoginPageActiTest(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(ITO));
	}
	@FindBy(id="username")
	private WebElement username;
	@FindBy(name="pwd")
	private WebElement password;
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement login;
	public WebElement setUsrnam() {
		return username;
	}
	public WebElement setpswd() {
		return password;
	}
	public WebElement clicklogin() {
		return login;
	}

}
