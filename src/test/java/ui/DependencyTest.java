package ui;

import org.testng.Assert;
import org.testng.annotations.Test;

// Group dependencies can add in testng xml 
public class DependencyTest {
	
	@Test
	public void userRegistration() {
		System.out.println("This is test1");
		Assert.fail();
	}
	
	@Test(dependsOnMethods = "userRegistration")
	public void userSearch() {
		// Depends on test result of userRegistration. Only if it is success, this userSearch test will run. 
		System.out.println("This is test2");
	}
}
