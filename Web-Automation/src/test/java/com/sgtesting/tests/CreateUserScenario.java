package com.sgtesting.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateUserScenario {
    private static WebDriver oBrowser=null;
    public static void main(String[] args) {
        launchBrowser();
        navigate();
        login();
        minimizeFlyOutWindow();
        createUser();
        deleteUser();
        logout();
        closeApplication();
    }

    private static void launchBrowser()
    {
        try
        {
            oBrowser=new ChromeDriver();
            oBrowser.manage().window().maximize();
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    private static void navigate()
    {
        try
        {
            oBrowser.navigate().to("http://localhost/login.do");
            Thread.sleep(5000);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    private static void login()
    {
        try
        {
            oBrowser.findElement(By.id("username")).sendKeys("admin");
            oBrowser.findElement(By.name("pwd")).sendKeys("manager");
            oBrowser.findElement(By.xpath("//div[normalize-space()='Login']")).click();
            Thread.sleep(5000);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    private static void minimizeFlyOutWindow()
    {
        try
        {
            oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
            Thread.sleep(2000);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    private static void createUser()
    {
        try
        {
            oBrowser.findElement(By.cssSelector("a[class='content users'] div[class='img']")).click();
            Thread.sleep(2000);
            oBrowser.findElement(By.xpath("//div[@class='buttonText']")).click();
            Thread.sleep(2000);
            oBrowser.findElement(By.name("firstName")).sendKeys("demo");
            oBrowser.findElement(By.name("lastName")).sendKeys("User1");
            oBrowser.findElement(By.name("email")).sendKeys("demo@yahoo.com");
            oBrowser.findElement(By.id("userDataLightBox_usernameField")).sendKeys("demoUser1");
            oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("Welcome123");
            oBrowser.findElement(By.name("passwordCopy")).sendKeys("Welcome123");
            oBrowser.findElement(By.xpath("//span[normalize-space()='Create User']")).click();
            Thread.sleep(4000);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    private static void deleteUser()
    {
        try
        {
            oBrowser.findElement(By.xpath("//span[normalize-space()='User1, demo']")).click();
            Thread.sleep(2000);
            oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
            Thread.sleep(2000);

            Alert oAlert = oBrowser.switchTo().alert();
            String content=oAlert.getText();
            System.out.println(content);
            oAlert.accept();
            Thread.sleep(2000);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    private static void logout()
    {
        try
        {
            oBrowser.findElement(By.cssSelector("#logoutLink")).click();
            Thread.sleep(2000);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    private static void closeApplication()
    {
        try
        {
            oBrowser.close();
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
