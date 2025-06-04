package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesDemo {
    static WebDriver oBrowser=null;
    public static void main(String[] args) {
        launchBrowser();
        navigateURL();
        framesDemo();
    }

    private static void launchBrowser()
    {
        oBrowser=new ChromeDriver();
    }

    private static void navigateURL()
    {
        try
        {
            oBrowser.get("https://docs.oracle.com/javase/8/docs/api/");
            Thread.sleep(5000);
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    private static void framesDemo()
    {
        try
        {
            oBrowser.switchTo().frame(0);
            oBrowser.findElement(By.xpath("//a[text()='java.awt']")).click();
            Thread.sleep(2000);
            oBrowser.switchTo().defaultContent();
            oBrowser.switchTo().frame("packageFrame");
            oBrowser.findElement(By.xpath("//span[normalize-space()='ActiveEvent']")).click();
            Thread.sleep(2000);
            oBrowser.switchTo().defaultContent();
            WebElement oFrame=oBrowser.findElement(By.xpath("//frame[@title='Package, class and interface descriptions']"));
            oBrowser.switchTo().frame(oFrame);
            String content=oBrowser.findElement(By.xpath("//div[@class='description']//div[1]")).getText();
            System.out.println(content);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }

}
