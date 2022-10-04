package ui;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ReportsTest {

    @Test
    public void reportTest1() {
        System.out.println("This is Test 1.");
    }

    @Test
    public void reportTest2() {
        Reporter.log("This is Test 2."); // to print the statements specific to the test.
        System.out.println("This is Test 2.");
    }

    @Test
    public void reportTest3() {
        Reporter.log("This is Test 3.");
        System.out.println("This is Test 3.");
    }

    @Test
    public void reportTest4() {
        System.out.println("This is Test 4.");
    }
}
