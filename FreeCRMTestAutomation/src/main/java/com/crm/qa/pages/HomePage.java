package com.crm.qa.pages;

import com.crm.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase {
    LoginPage loginpage;

    @FindBy(xpath = "//span[@class='user-display']")
    WebElement userNameLabel;

    @FindBy(xpath = "//span[contains(text(),'Contacts')]")
    WebElement contactsLink;

    @FindBy(xpath = "//span[contains(text(),'Deals')]")
    WebElement dealsLink;

    @FindBy(xpath = "//span[contains(text(),'Task')]")
    WebElement taskLink;

    public HomePage()
    {
        PageFactory.initElements(driver,this);
    }

    public String VerifyHomePageTitle()
    {

         return driver.getTitle();
    }
    public ContactsPage clickOnContactsLink()
    {
        contactsLink.click();
        return new ContactsPage();
    }

    public DealsPage clickOnDealsLink()
    {
        contactsLink.click();
        return clickOnDealsLink();
    }

    public TaskPage clickOnTaskPage()
    {
        taskLink.click();
        return new TaskPage();
    }
}