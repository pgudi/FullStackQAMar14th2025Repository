package com.sgtesting.scenarios;

import com.sgtesting.pageobjectmodel.ActiTimePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
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
            Assert.assertNotNull(oBrowser);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    @Test(priority = 2)
    public void navigate()
    {
        String actual,expected;
        try
        {
            expected="actiTIME - Login";
            oBrowser.get("http://localhost/login.do");
            Thread.sleep(4000);
            actual=oBrowser.getTitle();
            Assert.assertEquals(actual, expected);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    @Test(priority = 3, dataProvider = "logindata")
    public void login(String username, String password)
    {
        try
        {
            oPage.getUserName().sendKeys(username);
            oPage.getPassword().sendKeys(password);
            oPage.getLoginButton().click();
            Thread.sleep(4000);
            WebElement oEle=oBrowser.findElement(By.xpath("//td[@class='pagetitle']"));
            Assert.assertTrue(oEle.isDisplayed());
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
            WebElement oEle=oBrowser.findElement(By.xpath("//div[@id='gettingStartedShortcutsPanelId']/div[3]"));
            String val=oEle.getAttribute("style");
            Assert.assertTrue(val.contains("display: none;"));
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    @Test(priority = 5)
    public void logout()
    {
        String actual,expected;
        try
        {
            expected="actiTIME - Login";
            oPage.getLogoutLink().click();
            Thread.sleep(2000);
            actual=oBrowser.getTitle();
            Assert.assertEquals(actual, expected);
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
            oBrowser.quit();
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    @DataProvider(name = "logindata")
    public Object[] getLogin()
    {
        return new Object[][] {{"admin","manager"}};
    }
}
