package com.crm.qa.pages;

import com.crm.qa.base.TestBase;
import jdk.jfr.Name;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {
    //Page Factory- OR;
    @FindBy(xpath="//input[@name='email']")
     WebElement username;
    @FindBy(xpath ="//input[@name='password']")
    WebElement password;
    @FindBy(xpath = "//div[contains(text(),'Login')]")
    WebElement loginBtn;
    @FindBy(xpath = "//a[contains(text(),'Sign Up')]")
    WebElement SignUpBtn;
    
    //Initialization the Page Objects:
    public LoginPage()
    {
        PageFactory.initElements(driver,this);
    }
    //Actions:
    public String validateLoginPageTitle()
    {
        return driver.getTitle();

    }
    public HomePage login(String un, String pwd)
    {
        username.sendKeys(un);
        password.sendKeys(pwd);
        loginBtn.click();
        return new HomePage();
    }
}
