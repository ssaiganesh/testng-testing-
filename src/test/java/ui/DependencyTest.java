package ui;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyTest {
	
	@Test
	public void userRegistration() {
		System.out.println("This is test1");
		Assert.fail();
	}
	
	@Test(dependsOnMethods = "userRegistration")
	public void userSearch() {
		System.out.println("This is test2");
	}
	

}
