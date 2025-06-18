package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorDemo {
    private static WebDriver oBrowser=null;
    public static void main(String[] args) {
        launchBrowser();
        navigateURL();
        showURL();
        showTitle();
        showLinksCount();
    //    enterValueInTextField1();
    //    enterValueInTextField2();
    //    clickButton1();
    //    clickButton2();
    //    clickCheckbox1();
    //    clickCheckbox2();
        clickRadioButton1();
        clickRadioButton2();
    }

    private static void launchBrowser()
    {
        oBrowser=new ChromeDriver();
    }

    private static void navigateURL()
    {
        try
        {
            oBrowser.get("file:///D:/HTML/Sample.html");
            Thread.sleep(5000);
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    private static void showURL()
    {
        JavascriptExecutor js= (JavascriptExecutor) oBrowser;
        String url= (String) js.executeScript("var url=document.URL;return url;");
        System.out.println("URL of Application :"+url);
    }

    private static void showTitle()
    {
        JavascriptExecutor js= (JavascriptExecutor) oBrowser;
        String title= (String) js.executeScript("var title=document.title;return title;");
        System.out.println("Title of Application :"+title);
    }

    private static void showLinksCount()
    {
        JavascriptExecutor js= (JavascriptExecutor) oBrowser;
        long linksCount= (long) js.executeScript("var links=document.getElementsByTagName('A');return links.length;");
        System.out.println("# of Links in Application :"+linksCount);
    }

    private static void enterValueInTextField1()
    {
        JavascriptExecutor js= (JavascriptExecutor) oBrowser;
        js.executeScript("document.getElementById('uid1user1name1').value='demoUser1';");
    }

    private static void enterValueInTextField2()
    {
        JavascriptExecutor js= (JavascriptExecutor) oBrowser;
        WebElement oEle=oBrowser.findElement(By.id("uid1user1name1"));
        js.executeScript("arguments[0].value='demoUser2'",oEle);
    }

    private static void clickButton1()
    {
        JavascriptExecutor js= (JavascriptExecutor) oBrowser;
        js.executeScript("document.getElementById('btn1submit1button1').click();");
    }

    private static void clickButton2()
    {
        JavascriptExecutor js= (JavascriptExecutor) oBrowser;
        WebElement oEle=oBrowser.findElement(By.id("btn1submit1button1"));
        js.executeScript("arguments[0].click();",oEle);
    }

    private static void clickCheckbox1()
    {
        JavascriptExecutor js= (JavascriptExecutor) oBrowser;
        js.executeScript("document.getElementById('chk1windows').click();");
    }

    private static void clickCheckbox2()
    {
        JavascriptExecutor js= (JavascriptExecutor) oBrowser;
        WebElement oEle=oBrowser.findElement(By.id("chk2linux"));
        js.executeScript("arguments[0].click();",oEle);
    }

    private static void clickRadioButton1()
    {
        JavascriptExecutor js= (JavascriptExecutor) oBrowser;
        js.executeScript("document.getElementById('rad1chrome').click();");
    }

    private static void clickRadioButton2()
    {
        JavascriptExecutor js= (JavascriptExecutor) oBrowser;
        WebElement oEle=oBrowser.findElement(By.id("rad2firefox"));
        js.executeScript("arguments[0].click();",oEle);
    }
}
