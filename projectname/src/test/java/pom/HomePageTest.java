package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BaseMethodActiTest;

public class HomePageTest extends BaseMethodActiTest {
	public WebDriver driver;
	public  HomePageTest (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="logoutLink")
	WebElement logout;
	public WebElement clicklogout() {
		return logout;
	}
}
