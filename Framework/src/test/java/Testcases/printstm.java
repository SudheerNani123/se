package Testcases;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class printstm {
@Test
	public void print() {
	int a=20,b=10;
	Assert.assertEquals(a,b);
	
		Reporter.log("nani",true);
	}
@Test
public void aa() {
	Reporter.log("nani sudheer",true);
}

}
