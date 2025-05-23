package com.sgtesting.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserDemo {
    static WebDriver oBrowser=null;
    public static void main(String[] args) {
        launchBrowser();
        navigateURL();
        closeApplication();
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

    private static void closeApplication()
    {
        oBrowser.close();
    }
}
