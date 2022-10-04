package common;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import utilities.testUtils;



public class Listeners extends testUtils implements ITestListener{

    public void onTestStart(ITestResult result) {
        Reporter.log("Test Name is - " + result.getName());
        System.out.println("Test started. ");

    }

    public void onTestSuccess(ITestResult result) {
        Reporter.log("Status of Test is - " + result.getStatus());
    }

    public void onTestFailure(ITestResult result) {
        Reporter.log("Test failed - screenshot captured. ");
        String screenshotfilename = null;
        try {
        	screenshotfilename = (String) getScreenshot();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        System.setProperty("org.uncommons.reportng.escape-output", "false"); // this is to view the screenshot below. HTML characters will be recognised
        
		Reporter.log("<a href=\"C:\\Users\\shank\\eclipse-workspace\\seleniumTesting\\screenshot\\"+ screenshotfilename +"\">Test Results</a>");
    }

    public void onTestSkipped(ITestResult result) {
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
    }

    public void onTestFailedWithTimeout(ITestResult result) {
    }

    public void onStart(ITestContext context) {
    }

    public void onFinish(ITestContext context) {
    }

}