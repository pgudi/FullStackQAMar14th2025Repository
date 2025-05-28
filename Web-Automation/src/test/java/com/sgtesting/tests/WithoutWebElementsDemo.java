package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithoutWebElementsDemo {

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
            oBrowser.findElement(By.id("username")).sendKeys("demoUser1");
            Thread.sleep(2000);
            oBrowser.findElement(By.id("username")).clear();
            Thread.sleep(2000);
            oBrowser.findElement(By.id("username")).sendKeys("demoUser2");
            Thread.sleep(2000);
            oBrowser.findElement(By.id("username")).clear();
            Thread.sleep(2000);
            oBrowser.findElement(By.id("username")).sendKeys("demoUser3");
            Thread.sleep(2000);
            oBrowser.findElement(By.id("username")).clear();
            Thread.sleep(2000);
            oBrowser.findElement(By.id("username")).sendKeys("demoUser123456");
            Thread.sleep(2000);
            String data=oBrowser.findElement(By.id("username")).getAttribute("value");
            System.out.println("Data Availabel in Username:"+data);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
