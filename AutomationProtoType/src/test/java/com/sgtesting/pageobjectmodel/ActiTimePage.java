package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimePage {

    public ActiTimePage(WebDriver oBrowser)
    {
        PageFactory.initElements(oBrowser, this);
    }

    //UserName text field in Login Page
    private WebElement username;
    public WebElement getUserName()
    {
        return username;
    }

    //Password text field in Login Page
    private WebElement pwd;
    public WebElement getPassword()
    {
        return pwd;
    }

    //Login buttin in Login page
    @FindBy(xpath = "//div[text()='Login ']")
    private WebElement oLoginBtn;
    public WebElement getLoginButton()
    {
        return oLoginBtn;
    }

    //Minimize Flyout window in Home Page
    private WebElement gettingStartedShortcutsPanelId;
    public WebElement getFlyOutWindow()
    {
        return gettingStartedShortcutsPanelId;
    }

    //Logout Link in Home Page
    @FindBy(linkText = "Logout")
    private WebElement oLogoutLink;
    public WebElement getLogoutLink()
    {
        return oLogoutLink;
    }
}
