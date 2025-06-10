package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelectorDemo {

    private static WebDriver oBrowser=null;
    public static void main(String[] args) {
        launchBrowser();
        navigateURL();
    //    absoluteCSSPath();
    //    relativeCssUsingTagName();
    //    relativeCssUsingTagNameWithIdAttributeValue();
    //    relativeCssUsingIdAttributeValue();
    //    relativeCssUsingTagNameWithClassAttributeValue();
    //    relativeCssUsingClassAttributeValue();
    //    relativeCssUsingTagNameWithAttributeNameValue();
        relativeCssUsingAttributeNameValue();
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

    private static void absoluteCSSPath()
    {
        oBrowser.findElement(By.cssSelector("html body div form input")).sendKeys("DemoUser1");
    }

    /**
     * relative CSS
     * Case 1: Identify Element using tagName alone
     * Syntax:  <tagName>
     */
    private static void relativeCssUsingTagName()
    {
        oBrowser.findElement(By.cssSelector("input")).sendKeys("DemoUser1");
    }

    /**
     * relative CSS
     * Case 2: Identify Element using tagName with id attribute
     * Syntax:  <tagName>#td attribute
     */
    private static void relativeCssUsingTagNameWithIdAttributeValue()
    {
        oBrowser.findElement(By.cssSelector("input#pwd1pass1word1")).sendKeys("DemoUser1");
    }

    /**
     * relative CSS
     * Case 3: Identify Element using  id attribute value alone
     * Syntax:  #td attribute
     */
    private static void relativeCssUsingIdAttributeValue()
    {
        oBrowser.findElement(By.cssSelector("#pwd1pass1word1")).sendKeys("DemoUser2");
    }

    /**
     * relative CSS
     * Case 4: Identify Element using tagName with class attribute
     * Syntax:  <tagName>.class attribute
     */
    private static void relativeCssUsingTagNameWithClassAttributeValue()
    {
        oBrowser.findElement(By.cssSelector("input.pass1word1")).sendKeys("DemoUserPassword2");
    }

    /**
     * relative CSS
     * Case 5: Identify Element using  class attribute
     * Syntax:  .class attribute
     */
    private static void relativeCssUsingClassAttributeValue()
    {
        oBrowser.findElement(By.cssSelector(".pass1word1")).sendKeys("DemoUserPassword4");
    }

    /**
     * relative CSS
     * Case 6: Identify Element using TagName with attributeName
     *         and value combination
     * Syntax:  <tagName>[attributeName='attributeValue']
     */
    private static void relativeCssUsingTagNameWithAttributeNameValue()
    {
        oBrowser.findElement(By.cssSelector("input[type='button']")).click();
    }

    /**
     * relative CSS
     * Case 7: Irrespective aof any tag using attributeName
     *         and Attribute value combination identify the element
     * Syntax:  *[attributeName='attributeValue']
     */
    private static void relativeCssUsingAttributeNameValue()
    {
        oBrowser.findElement(By.cssSelector("*[type='button']")).click();
    }
}
