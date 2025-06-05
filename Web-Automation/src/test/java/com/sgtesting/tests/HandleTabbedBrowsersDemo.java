package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandleTabbedBrowsersDemo {
    static WebDriver oBrowser=null;
    public static void main(String[] args) {
        launchBrowser();
        navigateURL();
        handleTabbewdBrowsers();
    }

    private static void launchBrowser()
    {
        oBrowser=new ChromeDriver();
        oBrowser.manage().window().maximize();
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

    private static void handleTabbewdBrowsers()
    {
        try
        {
            WebElement oLink=oBrowser.findElement(By.linkText("actiTIME Inc."));
            System.out.println("Before Click on link number of Child Browsers:"+getChildBrowsersCount());
            oLink.click();
            Thread.sleep(2000);
            System.out.println("After Click on link number of Child Browsers:"+getChildBrowsersCount());
            if(getChildBrowsersCount() > 0)
            {
                getChildBrowsersDetails();
            }
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    private static int getChildBrowsersCount()
    {
        int count=0;
        count=oBrowser.getWindowHandles().size()-1;
        return count;
    }

    private static void getChildBrowsersDetails()
    {
        try
        {
            String parentBrowser=oBrowser.getWindowHandle();
            System.out.println("Parent Browser:"+parentBrowser);
            Object childBrowsers[]=oBrowser.getWindowHandles().toArray();
            for(int i=1;i<childBrowsers.length;i++)
            {
                String childBrowser=childBrowsers[i].toString();
                System.out.println("Child Browser :"+childBrowser);
                oBrowser.switchTo().window(childBrowser);
                Thread.sleep(2000);
                String tilte=oBrowser.getTitle();
                System.out.println("Child Browser Title:"+tilte);
                String url=oBrowser.getCurrentUrl();
                System.out.println("Child Browser URL :"+url);
                oBrowser.findElement(By.id("cookie-button--got-it")).click();
                Thread.sleep(2000);
                oBrowser.findElement(By.linkText("Get started")).click();
                Thread.sleep(2000);
            }
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
