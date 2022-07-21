package test;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class SampleTest {
	@Test
	public void f() {
		Reporter.log("Hello",true);
	}
}