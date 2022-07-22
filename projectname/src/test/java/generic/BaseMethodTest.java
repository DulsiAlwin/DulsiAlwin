package generic;

import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class BaseMethodTest {
	  public WebDriver driver;
	  @BeforeMethod
	  public void beforeMethod() {
		  WebDriverManager.chromedriver().setup();
		  driver =new ChromeDriver();
		  driver.get("https://demo.actitime.com/login.do");
	  }

	  @AfterMethod
	  public void afterMethod() {
		  driver.quit();
	  }
}
