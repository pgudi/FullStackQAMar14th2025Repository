package com.sgtesting.parameters;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {

    @Test(dataProvider = "credentials")
    public void login(String user, String pwd)
    {
        System.out.println(user+"  --> "+pwd);
    }

    @DataProvider(name = "credentials")
    public Object[][] getLoginData()
    {
        return new Object[][] {{"user1","manager"},
                {"user2","manager"},
                {"user3","manager"}
        };
    }
}
