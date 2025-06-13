package com.sgtesting.actitime.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepDefinitions {
    public static WebDriver oBrowser=null;
    /**
     * Step Name:
     * I launch chrome Browser
     */
    @Given("^I launch chrome Browser$")
    public void I_launch_chrome_Browser()
    {
        try
        {
            oBrowser=new ChromeDriver();
            oBrowser.manage().window().maximize();
            Thread.sleep(4000);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    /**
     * Step Name:
     * I navigate the Application URL
     */
    @And("^I navigate the Application URL$")
    public void I_navigate_the_Application_URL()
    {
        try
        {
            oBrowser.get("http://localhost/login.do");
            Thread.sleep(4000);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    /**
     * Step Name:
     * I close the application
     */
    @And("^I close the application$")
    public void I_close_the_application()
    {
        try
        {
            oBrowser.quit();
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
