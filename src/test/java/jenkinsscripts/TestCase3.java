package jenkinsscripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestCase3 {
	@Test
	public void tc3()
	{
		Reporter.log("Hello python", true);
	}
}
