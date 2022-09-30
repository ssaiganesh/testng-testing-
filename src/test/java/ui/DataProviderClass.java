package ui;

import org.testng.annotations.DataProvider;

import java.lang.reflect.Method;

public class DataProviderClass {

    @DataProvider(name = "create")
    public Object[][] dataSet1(Method m) {

        Object[][] testdata = null;

        if (m.getName().equals("test1"))
            testdata = new Object[][]
                    {
                            {"username", "password", "test"},
                            {"username1", "password1", "test1"},
                            {"username2", "password2", "test2"},

                    };
        else if (m.getName().equals("test"))
            testdata = new Object[][]
                    {
                            {"username", "password"},
                            {"username1", "password1"},
                            {"username2", "password2"},

                    };

        return testdata;
    }
}

