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
        System.out.println("Test started.");

    }

    public void onTestSuccess(ITestResult result) {
        Reporter.log("Status of Test is - " + result.getStatus());
    }

    public void onTestFailure(ITestResult result) {
        System.out.println("Test failed - screenshot captured");

        try {
            getScreenshot();
        } catch (IOException e) {
            e.printStackTrace();
        }

//        Reporter.log("<a href=\'C:\\Users\\shank\\eclipse-workspace\\reportLogsForTest\\screenshot\">Test Results</a>");
    }

    public void onTestSkipped(ITestResult result) {
        // TODO Auto-generated method stub
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        // TODO Auto-generated method stub
    }

    public void onTestFailedWithTimeout(ITestResult result) {
        // TODO Auto-generated method stub
    }

    public void onStart(ITestContext context) {
        // TODO Auto-generated method stub
    }

    public void onFinish(ITestContext context) {
        // TODO Auto-generated method stub
    }

}