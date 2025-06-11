package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathAxesDemo {
    private static WebDriver oBrowser=null;
    public static void main(String[] args) {
        launchBrowser();
        navigateURL();
    //    relativeXpathFollowingSibling();
    //    relativeXpathPrecedingSibling();
    //    relativeXpathFollowing();
    //    relativeXpathPreceding();
    //    relativeXpathAncestor();
        relativeXpathDescendant();
    }

    private static void launchBrowser()
    {
        oBrowser=new ChromeDriver();
    }

    private static void navigateURL()
    {
        try
        {
            oBrowser.get("file:///D:/HTML/WebTableHTML.html");
            Thread.sleep(5000);
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    /**
     * Xpath Axes
     * Case 1: Based on Sachin Tendular Name enter Salary for him
     */
    private static void relativeXpathFollowingSibling()
    {
        oBrowser.findElement(By.xpath("//td[text()='Sachin Tendulkar']/following-sibling::td/following-sibling::td/following-sibling::td/following-sibling::td/input")).sendKeys("24000");
    }

    /**
     * Xpath Axes
     * Case 2: Make the status as active for Indian Freedom Fighter Designation
     */
    private static void relativeXpathPrecedingSibling()
    {
        oBrowser.findElement(By.xpath("//td[text()='Indian Freedom Fighter']/preceding-sibling::td[1]/preceding-sibling::td[1]/input")).click();
    }

    /**
     * Xpath Axes
     * Case 3: Enter the salary for the person who is next to SAchin Tendulkar
     */
    private static void relativeXpathFollowing()
    {
        oBrowser.findElement(By.xpath("//td[text()='Sachin Tendulkar']/following::tr[1]/td[6]/input")).sendKeys("22000");
    }

    /**
     * Xpath Axes
     * Case 4: Enter the status as Active for Person who is previous to Rahul Dravid
     */
    private static void relativeXpathPreceding()
    {
        oBrowser.findElement(By.xpath("//td[text()='Rahul Dravid']/preceding::tr[1]/td[1]/input")).click();
    }

    /**
     * Xpath Axes
     * Case 5: get table Attribute Details based any Salary Text field
     */
    private static void relativeXpathAncestor()
    {
        String str=oBrowser.findElement(By.xpath("//input[@id='edit5']/ancestor::td/ancestor::tr/ancestor::table")).getAttribute("id");
        System.out.println("Table Id Attribute Value:"+str);
    }

    /**
     * Xpath Axes
     * Case 5: Based on table , make the status as active for Person Name Bhagat Singh
     */
    private static void relativeXpathDescendant()
    {
       oBrowser.findElement(By.xpath("//table[@id='tbl1']/descendant::tr[3]/td[1]/input")).click();

    }



}
