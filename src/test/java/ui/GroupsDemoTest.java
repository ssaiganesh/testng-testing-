package ui;

import org.testng.annotations.*;

// notice that test cases without priority is run first before priority = 1 and 2. So better to set priority for everything or for nothing.
// Or if a test case needs to be run before a specific test case.


@Test(groups = "user-registration")
public class GroupsDemoTest {

    @BeforeClass
    public void beforeClass(){
        System.out.println("executed before all tests in this class");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("executed after all tests in this class..");
    }

    @BeforeGroups(value = "regression")
    public void beforeRegressionGroup(){
        System.out.println("Executed before regression group");
    }

    @AfterGroups(value = {"regression","bvt"}) // after each test in the group; only if run configuration is for group not if run class;
    public void afterRegressionBVTGroups(){
        System.out.println("executed after regression and bvt");
    }

    @Test(priority = 1, groups="regression")
    public void Test1() {
        System.out.println("Test1 executed.");
    }


    @Test (priority = 2, groups="regression")
    public void Test2() {
        System.out.println("Test2 executed.");
    }

    @Test (groups={"regression", "bvt"})
    public void Test3() {
        System.out.println("Test3 executed.");
    }

    @Test ( groups = "bvt")
    public void Test4() {
        System.out.println("Test4 executed.");
    }

}
