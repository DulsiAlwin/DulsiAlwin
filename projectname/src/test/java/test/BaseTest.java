package test;

import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.BaseMethodTest;

public class BaseTest extends BaseMethodTest {
  @Test
  public void f() {
	  Reporter.log("Got it!!",true);
  }
}
