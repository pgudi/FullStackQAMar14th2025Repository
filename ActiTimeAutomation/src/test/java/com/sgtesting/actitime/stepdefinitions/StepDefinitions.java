package com.sgtesting.actitime.stepdefinitions;

import com.sgtesting.actitime.pageobjectmodel.ActiTimePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class StepDefinitions {
    private static WebDriver oDriver=null;
    private static ActiTimePage oPage=null;
    public Logger log= LogManager.getLogger("BDD Automation");
    /**
     * I launch the Chrome Browser
     */
    @Given("^I launch the Chrome Browser$")
    public void I_launch_the_Chrome_Browser()
    {
        try
        {
            log.info("The Execution of Step I_launch_the_Chrome_Browser started here");
            oDriver=new ChromeDriver();
            oPage=new ActiTimePage(oDriver);
            oDriver.manage().window().maximize();
            log.info("The Execution of Step I_launch_the_Chrome_Browser Ended here");
        }catch(Exception e)
        {
            log.error("There is an exception araised during the Execution of Step I_launch_the_Chrome_Browser:"+e);
        }
    }
    /**
     * I navigate the Application URL
     */
    @And("^I navigate the Application URL$")
    public void I_navigate_the_Application_URL()
    {
        try
        {
            log.info("The Execution of Step I_navigate_the_Application_URL started here");
            oDriver.get("http://localhost/login.do");
            Thread.sleep(3000);
            log.info("The Execution of Step I_navigate_the_Application_URL ended here");
        }catch(Exception e)
        {
            log.error("There is an exception araised during the Execution of Step I_navigate_the_Application_URL:"+e);
        }
    }

    /**
     * I enter username in username text field
     */
    @When("^I enter \"(.*)\" in username text field$")
    public void I_enter_username_in_username_text_field(String username)
    {
        try
        {
            log.info("The Execution of Step I_enter_username_in_username_text_field started here");
            oPage.getUserName().sendKeys(username);
            log.info("The Execution of Step I_enter_username_in_username_text_field ended here");
        }catch(Exception e)
        {
            log.error("There is an exception araised during the Execution of Step I_enter_username_in_username_text_field:"+e);
        }
    }

    /**
     * I enter password in password text field
     */
    @When("^I enter \"(.*)\" in password text field$")
    public void I_enter_password_in_password_text_field(String password)
    {
        try
        {
            log.info("The Execution of Step I_enter_password_in_password_text_field started here");
            oPage.getPassword().sendKeys(password);
            log.info("The Execution of Step I_enter_password_in_password_text_field ended here");
        }catch(Exception e)
        {
            log.error("There is an exception araised during the Execution of Step I_enter_password_in_password_text_field:"+e);
        }
    }

    /**
     * I click on SignIn button
     */
    @And("^I click on SignIn button$")
    public void I_click_on_SignIn_button()
    {
        try
        {
            log.info("The Execution of Step I_click_on_SignIn_button started here");
            oPage.getLoginButton().click();
            Thread.sleep(5000);
            log.info("The Execution of Step I_click_on_SignIn_button ended here");
        }catch(Exception e)
        {
            log.error("There is an exception araised during the Execution of Step I_click_on_SignIn_button:"+e);
        }
    }

    /**
     * I find the Home Page
     */
    @Then("^I find the Home Page$")
    public void I_find_the_Home_Page()
    {
        String expected,actual;
        try
        {
            log.info("The Execution of Step I_find_the_Home_Page started here");
            expected="actiTIME - Enter Time-Track";
            actual=oDriver.getTitle();
            Assert.assertEquals(actual, expected);
            log.info("The Execution of Step I_find_the_Home_Page ended here");
        }catch(Exception e)
        {
            log.error("There is an exception araised during the Execution of Step I_find_the_Home_Page:"+e);
        }
    }
    /**
     * I minimize the flyout window
     */
    @And("^I minimize the flyout window$")
    public void I_minimize_the_flyout_window()
    {
        try
        {
            log.info("The Execution of Step I_minimize_the_flyout_window started here");
            oPage.getFlyOutWindow().click();
            Thread.sleep(2000);
            log.info("The Execution of Step I_minimize_the_flyout_window ended here");
        }catch(Exception e)
        {
            log.error("There is an exception araised during the Execution of Step I_minimize_the_flyout_window:"+e);
        }
    }

    /**
     * I find the Logout Link in Home Page
     */
    @Given("^I find the Logout Link in Home Page$")
    public void I_find_the_Logout_Link_in_Home_Page()
    {
        try
        {
            log.info("The Execution of Step I_find_the_Logout_Link_in_Home_Page started here");
            WebElement oLink=oPage.getLogoutLink();
            Assert.assertTrue(oLink.isDisplayed());
            log.info("The Execution of Step I_find_the_Logout_Link_in_Home_Page ended here");
        }catch(Exception e)
        {
            log.error("There is an exception araised during the Execution of Step I_find_the_Logout_Link_in_Home_Page:"+e);
        }
    }

    /**
     * I click on Logout Link
     */
    @When("^I click on Logout Link$")
    public void I_click_on_Logout_Link()
    {
        try
        {
            log.info("The Execution of Step I_click_on_Logout_Link started here");
            oPage.getLogoutLink().click();
            Thread.sleep(2000);
            log.info("The Execution of Step I_click_on_Logout_Link ended here");
        }catch(Exception e)
        {
            log.error("There is an exception araised during the Execution of Step I_click_on_Logout_Link:"+e);
        }
    }

    /**
     * I find the Login Page
     */
    @Then("^I find the Login Page$")
    public void I_find_the_Login_Page()
    {
        String expected,actual;
        try
        {
            log.info("The Execution of Step I_find_the_Login_Page started here");
            expected="actiTIME - Login";
            actual=oDriver.getTitle();
            Assert.assertEquals(actual, expected);
            log.info("The Execution of Step I_find_the_Login_Page ended here");
        }catch(Exception e)
        {
            log.error("There is an exception araised during the Execution of Step I_find_the_Login_Page:"+e);
        }
    }

    /**
     * I close Chrome Browser
     */
    @And("^I close Chrome Browser$")
    public void I_close_Chrome_Browser()
    {
        try
        {
            log.info("The Execution of Step I_close_Chrome_Browser started here");
            oDriver.quit();
            log.info("The Execution of Step I_close_Chrome_Browser ended here");
        }catch(Exception e)
        {
            log.error("There is an exception araised during the Execution of Step I_close_Chrome_Browser:"+e);
        }
    }

    /**
     * I click on User Menu
     */
    @When("^I click on User Menu$")
    public void I_click_on_User_Menu()
    {
        try
        {
            oDriver.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
            Thread.sleep(2000);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    /**
     * I click on Add User button
     */
    @And("^I click on Add User button$")
    public void I_click_on_Add_User_button()
    {
        try
        {
            oDriver.findElement(By.xpath("//div[text()='Add User']")).click();
            Thread.sleep(2000);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    /**
     * I enter firstname in firstname text field
     */
    @And("^I enter firstname in firstname text field$")
    public void I_enter_firstname_in_firstname_text_field()
    {
        try
        {
            oDriver.findElement(By.name("firstName")).sendKeys("demo");
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    /**
     * I enter lastname in lastname text field
     */
    @And("^I enter lastname in lastname text field$")
    public void I_enter_lastname_in_lastname_text_field()
    {
        try
        {
            oDriver.findElement(By.name("lastName")).sendKeys("User1");
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    /**
     * I enter email in email text field
     */
    @And("^I enter email in email text field$")
    public void I_enter_email_in_email_text_field()
    {
        try
        {
            oDriver.findElement(By.name("email")).sendKeys("demo@gss.com");
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    /**
     * I enter username in username text field of userpage
     */
    @And("^I enter username in username text field of userpage$")
    public void I_enter_username_in_username_text_field_of_userpage()
    {
        try
        {
            oDriver.findElement(By.name("username")).sendKeys("demoUser1");
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    /**
     * I enter password in password text field of userpage
     */
    @And("^I enter password in password text field of userpage$")
    public void I_enter_password_in_password_text_field_of_userpage()
    {
        try
        {
            oDriver.findElement(By.name("password")).sendKeys("098765");
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    /**
     * I enter password in retypepassword text field of userpage
     */
    @And("^I enter password in retypepassword text field of userpage$")
    public void I_enter_password_in_retypepassword_text_field_of_userpage()
    {
        try
        {
            oDriver.findElement(By.name("passwordCopy")).sendKeys("098765");
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    /**
     * I click on create user button in userpage
     */
    @And("^I click on create user button in userpage$")
    public void I_click_on_create_user_button_in_userpage()
    {
        try
        {
            oDriver.findElement(By.xpath("//span[text()='Create User']")).click();
            Thread.sleep(5000);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    /**
     * I find the created user in the user list page
     */
    @Then("^I find the created user in the user list page$")
    public void I_find_the_created_user_in_the_user_list_page()
    {
        String expected,actual;
        try
        {
            expected="actiTIME - User List";
            actual=oDriver.getTitle();
            Assert.assertEquals(actual, expected);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    /**
     * I click on newly created user
     */
    @When("^I click on newly created user$")
    public void I_click_on_newly_created_user()
    {
        try
        {
            oDriver.findElement(By.xpath("//span[text()='User1, demo']")).click();
            Thread.sleep(2000);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    /**
     * I click on Delete User button
     */
    @And("^I click on Delete User button$")
    public void I_click_on_Delete_User_button()
    {
        try
        {
            oDriver.findElement(By.id("userDataLightBox_deleteBtn")).click();
            Thread.sleep(2000);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    /**
     * I click on OK button in Alert Window
     */
    @And("^I click on OK button in Alert Window$")
    public void I_click_on_OK_button_in_Alert_Window()
    {
        try
        {
            Alert oAlert=oDriver.switchTo().alert();
            String content=oAlert.getText();
            System.out.println(content);
            oAlert.accept();
            Thread.sleep(2000);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }


}
