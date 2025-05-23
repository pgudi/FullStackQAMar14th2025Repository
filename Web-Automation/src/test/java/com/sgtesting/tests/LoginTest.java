package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginTest {
    private static WebDriver oBrowser=null;
    public static void main(String[] args) {
        launchBrowser();
        navigaeURL();
        login();
    }

    private static void launchBrowser()
    {
        try
        {
            oBrowser=new ChromeDriver();
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    private static void navigaeURL()
    {
        try
        {
            oBrowser.navigate().to("http://localhost/login.do");
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    private static void login()
    {
        try
        {
            By by=By.id("username");
            WebElement oEle=oBrowser.findElement(by);
            oEle.sendKeys("admin");
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
