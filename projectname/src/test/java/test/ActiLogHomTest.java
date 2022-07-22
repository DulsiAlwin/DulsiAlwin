package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import generic.ActiXL;
import generic.BaseMethodActiTest;
import pom.HomePageTest;
import pom.LoginPageActiTest;

public class ActiLogHomTest extends BaseMethodActiTest{
  @Test
  public void f() throws EncryptedDocumentException, IOException, InterruptedException {
	  LoginPageActiTest lp = new LoginPageActiTest(driver);
	  ActiXL xl =new ActiXL();
	  Thread.sleep(2000);
	  String usrnmaevalue = xl.readxl("Sheet1", 1, 0);
	  lp.setUsrnam().sendKeys(usrnmaevalue);
	  String pswrdvalue=xl.readxl("Sheet1", 1, 1);
	  lp.setpswd().sendKeys(pswrdvalue);
	  lp.clicklogin().click();
	  
	  HomePageTest hp =new HomePageTest(driver);
	  hp.clicklogout().click();
  }
}
