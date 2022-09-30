package ui;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipDemoTest {

    Boolean dataSetup=true;

    @Test(enabled = false)
    public void skipTest1()
    {
        System.out.println("This test is skipped as it is not complete.");
    }

    @Test
    public void skipTest2()
    {
        System.out.println("This test is skipped forcefully.");
        throw new SkipException("Skipping this test forcefully");
    }

    @Test
    public void skipTest3()
    {
        System.out.println("Skipping this test based on condition");
        if (dataSetup)
        {
            System.out.println("Execute the teste");
        }
        else
        {
            System.out.println("Do not execute further tests");
            throw new SkipException("Do not execute further steps");
        }
        System.out.println("These are further steps if not skipped ");
    }
}
