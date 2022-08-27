package jenkinsscripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestCase2 {
	@Test
	public void tc2()
	{
		Reporter.log("Hello selenium", true);
	}
}
