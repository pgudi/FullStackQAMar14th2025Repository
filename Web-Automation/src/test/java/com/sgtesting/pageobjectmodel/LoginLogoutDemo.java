package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginLogoutDemo {
    private static WebDriver oBrowser=null;
    private static ActiTimePage oPage=null;
    public static void main(String[] args) {
        launchBrowser();
        navigate();
        login();
        minimizeFlyOutWin();
        logout();
        closeApplication();
    }

    private static void launchBrowser()
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

    private static void navigate()
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

    private static void login()
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

    private static void minimizeFlyOutWin()
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

    private static void logout()
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

    private static void closeApplication()
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
