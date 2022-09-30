package ui;

import org.testng.annotations.*;

public class LoginTest {

    @BeforeTest // Before all cases
    public void loginToApplication() {
        System.out.println("Login to application.");
    }


    @AfterTest // After all cases
    public void logoutFromApplication() {
        System.out.println("Logout from application.");
    }


    @BeforeMethod // Before each test case
    public void connectToDB(){
        System.out.println("DB Connected");
    }


    @AfterMethod // After each test case
    public void disconnectFromDB() {
        System.out.println("DB Disconnected and cleared.");
    }


    @Test (priority = 1, description = "This is a login test")
    public void loginTest() {
        System.out.println("Login Successful.");
    }


    @Test (priority = 2, description = "This is a logout test")
    public void logoutTest() {
        System.out.println("Logout Successful");
    }
}
