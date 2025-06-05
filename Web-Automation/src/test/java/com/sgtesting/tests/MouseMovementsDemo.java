package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovementsDemo {
    static WebDriver oBrowser=null;
    public static void main(String[] args) {
        launchBrowser();
        navigateURL();
        getMenuDetails();
    }

    private static void launchBrowser()
    {
        oBrowser=new ChromeDriver();
    }

    private static void navigateURL()
    {
        try
        {
            oBrowser.get("https://www.flipkart.com/");
            Thread.sleep(5000);
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }


    private static void getMenuDetails()
    {
        try
        {
            WebElement oFashion=oBrowser.findElement(By.xpath("//span[contains(text(),'Fashion')]"));
            Thread.sleep(2000);
            Actions oMouse=new Actions(oBrowser);
            oMouse.moveToElement(oFashion).build().perform();
            Thread.sleep(2000);
            WebElement womenEthnic=oBrowser.findElement(By.linkText("Women Ethnic"));
            oMouse.moveToElement(womenEthnic).build().perform();
            Thread.sleep(2000);
            oBrowser.findElement(By.linkText("Women Sarees")).click();
            Thread.sleep(2000);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
