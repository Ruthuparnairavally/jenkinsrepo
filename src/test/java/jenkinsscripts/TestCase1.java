package jenkinsscripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestCase1 {

	@Test
	public void tc1()
	{
		Reporter.log("Hello java", true);
	}
}
