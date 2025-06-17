package com.sgtesting.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;

import java.time.Duration;

public class FirefoxProfilesDemo {

    static WebDriver oBrowser=null;
    public static void main(String[] args) {
        launchBrowser();


    }

    private static void launchBrowser()
    {
        //Manul Approach
//        ProfilesIni profile=new ProfilesIni();
//        FirefoxProfile ffprofile =profile.getProfile("sgtest");
//
//        FirefoxOptions options=new FirefoxOptions();
//        options.setProfile(ffprofile);
//        oBrowser=new FirefoxDriver(options);

        ///Programtic approach
        FirefoxProfile ffprofile= new FirefoxProfile();
        ffprofile.setPreference("browser.startup.homepage","http://sgtestinginstitute.com/");
        FirefoxOptions options=new FirefoxOptions();
        options.setProfile(ffprofile);
        oBrowser=new FirefoxDriver(options);
    }

    private static void navigateURL()
    {
        try
        {
            oBrowser.get("http://localhost/login.do");
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
