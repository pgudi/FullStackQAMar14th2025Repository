package com.sgtesting.scenarios;

import com.sgtesting.pageobjectmodel.ActiTimePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginLogoutScenario {
    private static WebDriver oBrowser=null;
    private static ActiTimePage oPage=null;

    @Test(priority = 1)
    public void launchBrowser()
    {
        try
        {
            oBrowser=new ChromeDriver();
            oPage = new ActiTimePage(oBrowser);
            Thread.sleep(4000);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    @Test(priority = 2)
    public void navigate()
    {
        try
        {
            oBrowser.get("http://localhost/login.do");
            Thread.sleep(4000);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    @Test(priority = 3)
    public void login()
    {
        try
        {
            oPage.getUserName().sendKeys("admin");
            oPage.getPassword().sendKeys("manager");
            oPage.getLoginButton().click();
            Thread.sleep(4000);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    @Test(priority = 4)
    public void minimizeFlyoutWindow()
    {
        try
        {
            oPage.getFlyOutWindow().click();
            Thread.sleep(2000);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    @Test(priority = 5)
    public void logout()
    {
        try
        {
            oPage.getLogoutLink().click();
            Thread.sleep(2000);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    @Test(priority = 6)
    public void closeApplication()
    {
        try
        {
            oBrowser.close();
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
