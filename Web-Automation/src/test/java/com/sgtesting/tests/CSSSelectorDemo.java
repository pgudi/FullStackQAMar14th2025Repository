package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

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
    //    relativeCssUsingAttributeNameValue();
    //    relativeCssUsingPartialAttributeValue();
    //    relativeCssUsingTagNameWithMultipleAttributeNameValue();
    //    relativeCssUsingTagNameWithAttributeName_01();
    //    relativeCssUsingTagNameWithAttributeName_02();
    //    relativeCssUsingTagNameWithAttributeName_03();
    //    relativeCssUsingTagNameWithAttributeName_04();
    //    relativeCssUsingNthChildConcept();
        relativeCssUsingSiblingConcept();
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
     * Case 7: Irrespective of any tag using attributeName
     *         and Attribute value combination identify the element
     * Syntax:  *[attributeName='attributeValue']
     */
    private static void relativeCssUsingAttributeNameValue()
    {
        oBrowser.findElement(By.cssSelector("*[type='button']")).click();
    }

    /**
     * relative CSS
     * Case 8: Partial Matching of Attribute Value to identify the element
     *    starts-with: ^=
     *    Ends-With:   $=
     *    contains:    *=
     * Syntax:
     *    <tagName>[attributeName ^= 'attributeValue']
     *    <tagName>[attributeName $= 'attributeValue']
     *    <tagName>[attributeName *= 'attributeValue']
     */
    private static void relativeCssUsingPartialAttributeValue()
    {
     //   oBrowser.findElement(By.cssSelector("input[id ^= 'btn1']")).click();
        oBrowser.findElement(By.cssSelector("input[id *= 'submit']")).click();
    }

    /**
     * relative CSS
     * Case 9: Identify Element using TagName with Multiple attributeName
     *         and value combination
     * Syntax:  <tagName>[attributeName='attributeValue']
     */
    private static void relativeCssUsingTagNameWithMultipleAttributeNameValue()
    {
        oBrowser.findElement(By.cssSelector("input[type='button'][value='Submit']")).click();
    }

    /**
     * relative CSS
     * Case 10: Identify Element using TagName with  attributeName
     *
     * Syntax:  <tagName>[attributeName]
     */
    private static void relativeCssUsingTagNameWithAttributeName_01()
    {
        // Find number of Links in the web Page
        List<WebElement> links=oBrowser.findElements(By.cssSelector("a[href]"));
        System.out.println("# of Links in the Application :"+links.size());
    }

    private static void relativeCssUsingTagNameWithAttributeName_02()
    {
        // Display NAme of Links in the web Page
        List<WebElement> links=oBrowser.findElements(By.cssSelector("a[href]"));
        for(int i=0;i<links.size();i++)
        {
            WebElement link=links.get(i);
            String content=link.getText();
            System.out.println("Link Name :"+content);
        }
    }

    private static void relativeCssUsingTagNameWithAttributeName_03()
    {
        // Display NAme of Links in the web Page
        List<WebElement> links=oBrowser.findElements(By.cssSelector("a[href]"));
        for(int i=0;i<links.size();i++)
        {
            WebElement link=links.get(i);
            String content=link.getText();
            if(content.equals("SeleniumHQ"))
            {
                link.click();
                break;
            }
        }
    }

    private static void relativeCssUsingTagNameWithAttributeName_04()
    {
        // StaleElementReferenceException: stale element reference:
        // stale element not found
        List<WebElement> links=oBrowser.findElements(By.cssSelector("a[href]"));
        for(int i=0;i<links.size();i++)
        {
            WebElement link=links.get(i);
            String content=link.getText();
            if(content.equals("SeleniumHQ"))
            {
                link.click();
            }
        }
    }

    /**
     * relative CSS
     * Case 11: Identify Element using nth-child concept
     * Syntax:  nth-child(number)
     */
    private static void relativeCssUsingNthChildConcept()
    {
        oBrowser.findElement(By.cssSelector("#frm3 :nth-child(1)")).sendKeys("FirstName01");
        oBrowser.findElement(By.cssSelector("#frm3 :nth-child(5)")).sendKeys("FirstName05");
        oBrowser.findElement(By.cssSelector("#frm3 :nth-child(10)")).sendKeys("FirstName010");
        oBrowser.findElement(By.cssSelector("#frm3 :last-child")).sendKeys("FirstName010");
    }

    /**
     * relative CSS
     * Case 12: Identify Element using sibling concepts
     * Syntax:  <element1> + <element2> +<element3>
     */
    private static void relativeCssUsingSiblingConcept()
    {
        oBrowser.findElement(By.cssSelector("#frm3 input + input + input + input")).sendKeys("FirstName01");
    }
}
