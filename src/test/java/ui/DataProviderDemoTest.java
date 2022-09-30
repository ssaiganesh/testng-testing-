package ui;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemoTest {

    @Test(dataProvider = "create", dataProviderClass = DataProviderClass.class)
    public void test(String username, String password)
    {
        System.out.println(username+"======"+password);
    }

    @Test(dataProvider = "create", dataProviderClass = DataProviderClass.class)
    public void test1(String username, String password, String test)// arguments are arranged according to dataset
    {
        System.out.println(test+"==="+username+"======"+password);
    }


}
