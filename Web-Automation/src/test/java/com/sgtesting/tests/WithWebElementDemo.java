package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithWebElementDemo {
    static WebDriver oBrowser=null;
    public static void main(String[] args) {
        launchBrowser();
        navigateURL();
        login();
    }

    private static void launchBrowser()
    {
        oBrowser=new ChromeDriver();
    }

    private static void navigateURL()
    {
        try
        {
            oBrowser.get("http://localhost/login.do");
            Thread.sleep(5000);
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    private static void login()
    {
        try
        {
            WebElement oEle=oBrowser.findElement(By.id("username"));
            oEle.sendKeys("demoUser1");
            Thread.sleep(2000);
            oEle.clear();
            Thread.sleep(2000);
            oEle.sendKeys("demoUser2");
            Thread.sleep(2000);
            oEle.clear();
            Thread.sleep(2000);
            oEle.sendKeys("demoUser3");
            Thread.sleep(2000);
            oEle.clear();
            Thread.sleep(2000);
            oEle.sendKeys("demoUser123456");
            Thread.sleep(2000);
            String data=oEle.getAttribute("value");
            System.out.println("Data Availabel in Username:"+data);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
