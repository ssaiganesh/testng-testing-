package ui;

import common.BaseTest;
import common.Retry;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ListenerDemoTest extends BaseTest {

//    @Test(retryAnalyzer = Retry.class) // since listener can be added to xml file
    @Test
     public void launchApp()
     {
         driver.get("https://ebay.com");
         Assert.fail();
     }
}
