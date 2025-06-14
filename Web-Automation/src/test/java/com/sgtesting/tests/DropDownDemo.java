package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDownDemo {
    private static WebDriver oBrowser=null;
    public static void main(String[] args) {
        launchBrowser();
        navigateURL();
        handleDropDown();
        displayItemDetails();
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
    private static void handleDropDown()
    {
        try
        {
            WebElement oEle=oBrowser.findElement(By.id("tools"));
            Select oSelect=new Select(oEle);

            oSelect.selectByVisibleText("Selenium WebDriver");
            Thread.sleep(2000);
            oSelect.selectByIndex(1);
            Thread.sleep(2000);
            oSelect.selectByValue("rc");
            Thread.sleep(2000);
            oSelect.selectByContainsVisibleText("WebDriver");
            Thread.sleep(2000);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    private static void displayItemDetails()
    {
        try
        {
            WebElement oEle=oBrowser.findElement(By.id("tools"));
            Select oSelect=new Select(oEle);

           List<WebElement> oLists = oSelect.getOptions();
           for(int i=0;i<oLists.size();i++)
           {
               WebElement list=oLists.get(i);
               String content=list.getText();
               System.out.println(content);
           }
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
