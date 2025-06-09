package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class XPathDemo {
    private static WebDriver oBrowser=null;
    public static void main(String[] args) {
        launchBrowser();
        navigateURL();
    //    absoluteXPath();
    //    relativeXPathUsingTagName();
    //    relativeXPathUsingTagNameWithIndex();
    //    relativeXPathUsingTagNameWithAttributeNameValue();
    //    relativeXPathUsingAttributeNameValue();
    //    relativeXPathUsingAttributeValueAlone();
    //    relativeXPathUsingMultipleAttributes();
    //    relativeXPathUsingMultipleAttributesByAnd();
    //    relativeXPathUsingMultipleAttributesByOR();
    //    relativeXPathUsingTagNameWithAttributeName_1();
    //    relativeXPathUsingTagNameWithAttributeName_2();
    //    relativeXPathUsingTagNameWithAttributeName_3();
    //    relativeXPathUsingTagNameWithAttributeName_4();
    //    relativeXPathUsingPartialAttributeValue();
    //    relativeXPathUsingTextContent();
        relativeXPathUsingPartialTextContent();
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

    private static void absoluteXPath()
    {
        oBrowser.findElement(By.xpath("html/body/div/form/input")).sendKeys("DemoUser1");
    }

    /**
     *  Relative xPath
     *  case 1: based on TagName identify the Element
     *  Syntax: //<tagName>
     */
    private static void relativeXPathUsingTagName()
    {
        oBrowser.findElement(By.xpath("//input")).sendKeys("DemoUser1");
    }

    /**
     *  Relative xPath
     *  case 2: based on TagName with index identify the Element
     *  Syntax: //<tagName>[index]
     */
    private static void relativeXPathUsingTagNameWithIndex()
    {
        oBrowser.findElement(By.xpath("//input[2]")).sendKeys("DemoUser1");
    }

    /**
     *  Relative xPath
     *  case 3: based on TagName with Attribute Name and Value
     *          combination to identify the Element
     *  Syntax: //<tagName>[@attributeName='AttributeValue]
     */
    private static void relativeXPathUsingTagNameWithAttributeNameValue()
    {
        oBrowser.findElement(By.xpath("//input[@name='pass1word1']")).sendKeys("DemoUser2");
    }

    /**
     *  Relative xPath
     *  case 4: Irrespective of TagName with Attribute Name and Value
     *          combination to identify the Element
     *  Syntax: //*[@attributeName='AttributeValue]
     */
    private static void relativeXPathUsingAttributeNameValue()
    {
        oBrowser.findElement(By.xpath("//*[@id='pwd1pass1word1']")).sendKeys("DemoUser2");
    }

    /**
     *  Relative xPath
     *  case 5: Irrespective of TagName and Attribute Name use attribute value alone to identify
     *           the element
     *  Syntax: //*[@attributeName='AttributeValue]
     */
    private static void relativeXPathUsingAttributeValueAlone()
    {
        oBrowser.findElement(By.xpath("//*[@*='pwd1pass1word1']")).sendKeys("DemoUser2");
    }

    /**
     *  Relative xPath
     *  case 6: Multiple Attribute Name and attribute value combination
     *           to identify the element
     *  Syntax: //<tagName>[@attributeName='AttributeValue][@attributeName='AttributeValue]
     */
    private static void relativeXPathUsingMultipleAttributes()
    {
        oBrowser.findElement(By.xpath("//input[@type='button'][@value='Submit']")).click();
    }

    /**
     *  Relative xPath
     *  case 7: Multiple Attribute Name and attribute value combination
     *           to identify the element uisng And Operator
     *  Syntax: //<tagName>[@attributeName='AttributeValue and @attributeName='AttributeValue]
     */
    private static void relativeXPathUsingMultipleAttributesByAnd()
    {
        oBrowser.findElement(By.xpath("//input[@type='button' and @value='Submit']")).click();
    }

    /**
     *  Relative xPath
     *  case 8: Multiple Attribute Name and attribute value combination
     *           to identify the element uisng Or Operator
     *  Syntax: //<tagName>[@attributeName='AttributeValue or @attributeName='AttributeValue]
     */
    private static void relativeXPathUsingMultipleAttributesByOR()
    {
        oBrowser.findElement(By.xpath("//input[@type='button' or @value='Submit']")).click();
    }

    /**
     *  Relative xPath
     *  case 9: tagName with AttributeName combination
     *           to identify the element uisng Or Operator
     *  Syntax: //<tagName>[@attributeName]
     */
    private static void relativeXPathUsingTagNameWithAttributeName_1()
    {
        // Number of Links avaliable in the Web PAge
        List<WebElement> links=oBrowser.findElements(By.xpath("//a[@href]"));
        System.out.println("# of Links in a Web PAge:"+links.size());
    }

    private static void relativeXPathUsingTagNameWithAttributeName_2()
    {
        // Display Links Names avaliable in the Web PAge
        List<WebElement> links=oBrowser.findElements(By.xpath("//a[@href]"));

        for(int i=0;i<links.size();i++)
        {
            WebElement link=links.get(i);
            String content=link.getText();
            System.out.println(content);
        }
    }

    private static void relativeXPathUsingTagNameWithAttributeName_3()
    {
        // Click on Apache POI Link avaliable in the Web PAge
        List<WebElement> links=oBrowser.findElements(By.xpath("//a[@href]"));

        for(int i=0;i<links.size();i++)
        {
            WebElement link=links.get(i);
            String content=link.getText();
            if(content.equals("POI Apache"))
            {
                link.click();
                break;
            }
        }
    }

    private static void relativeXPathUsingTagNameWithAttributeName_4()
    {
        // org.openqa.selenium.StaleElementReferenceException:
        // stale element reference: stale element not found
        List<WebElement> links=oBrowser.findElements(By.xpath("//a[@href]"));

        for(int i=0;i<links.size();i++)
        {
            WebElement link=links.get(i);
            String content=link.getText();
            if(content.equals("POI Apache"))
            {
                link.click();
            }
        }
    }

    /**
     *  Relative xPath
     *  case 10: Based on Partial matching of  attribute name  identify the element uisng Or Operator
     *    starts-with(@attributename, 'partialattributeValue)
     *    ends-with(@attributename, 'partialattributeValue)
     *    contains(@attributename, 'partialattributeValue)
     *
     *  Syntax:
     *   //input[starts-with(@attributename, 'partialattributeValue)]
     *   //input[ends-with(@attributename, 'partialattributeValue)]
     *   //input[contains(@attributename, 'partialattributeValue)]
     */
    private static void relativeXPathUsingPartialAttributeValue()
    {
      //  oBrowser.findElement(By.xpath("//input[starts-with(@id,'btn1')]")).click();
        oBrowser.findElement(By.xpath("//input[contains(@id,'submit')]")).click();
    }

    /**
     *  Relative xPath
     *  case 11: based on Text Content identify the Element
     *  Syntax: //<tagName>[@attributeName='AttributeValue]
     */
    private static void relativeXPathUsingTextContent()
    {
        oBrowser.findElement(By.xpath("//a[text()='SeleniumHQ']")).click();
    }

    /**
     *  Relative xPath
     *  case 12: Based on Partial Text Content  identify the element uisng Or Operator
     *    starts-with(text(), 'partialtextcontent)
     *    ends-with(text(), 'partialtextcontent)
     *    contains(text(), 'partialtextcontent)
     *
     *  Syntax:
     *   //input[starts-with(text(), 'partialtextcontent)]
     *   //input[ends-with(text(), 'partialtextcontent)]
     *   //input[contains(text(), 'partialtextcontent)]
     */
    private static void relativeXPathUsingPartialTextContent()
    {
          oBrowser.findElement(By.xpath("//a[starts-with(text(),'POI')]")).click();
     //   oBrowser.findElement(By.xpath("//input[contains(text(),'POI')]")).click();
    }
}
