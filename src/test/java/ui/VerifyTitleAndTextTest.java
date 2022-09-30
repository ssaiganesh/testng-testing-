package ui;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class VerifyTitleAndTextTest {

    @Test
    public void titleAndTextTest() throws InterruptedException
    {
        SoftAssert softAssert = new SoftAssert();
        String expectedTitle = "Electronics, Cars, Fashion, Collectibles & More | eBay";
        String expectedText = "Search";
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        String actualTitle = driver.getTitle();
        System.out.println("Verifying Title");
//        Assert.assertEquals(actualTitle, expectedTitle, "Title verification failed."); // Hard assertion stops test once failed here.
        softAssert.assertEquals(actualTitle, expectedTitle, "Title verification failed.");
        String actualText = driver.findElement(By.xpath("//input[@id='gh-btn']")).getAttribute("value"); // getText doesn't work as Search is in value attribute
        System.out.println("Verifying Text");
//        Assert.assertEquals(actualText, expectedText, "Text verification failed.");
        softAssert.assertEquals(actualText, expectedText, "Text verification failed.");
        System.out.println("Closing browser");
        driver.close();
        softAssert.assertAll();
        //  assertAll :
        //  Report assertion failure if not will consider as passed. But goes through full test unlike hard assert which stops at first assertionError
    }

}
