package com.crm.qa.testcases;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends TestBase {
    LoginPage loginPage;
    HomePage homePage;
    ContactsPage contactsPage;
    public HomePageTest()
    {
        super();
    }
    @BeforeMethod
    public void setup()
    {
        initialization();
        contactsPage=new ContactsPage();
       loginPage=new LoginPage();
       homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
    }
    @Test(priority = 1)
    public void verifyHomePageTitleTest()
    {
      String homepageTitle=  homePage.VerifyHomePageTitle();
        Assert.assertEquals(homepageTitle,"Cogmento CRM","Home page title not mathced");
    }
    @Test(priority =2)
    public void verifyUserNameTest()
    {
        Assert.assertTrue(homePage.verifyCorrectUserName());
    }
    @Test
    public ContactsPage verifyContactLink()
    {
        return homePage.clickOnContactsLink();

    }
    @AfterMethod
    public void tearDown()
    {
        driver.quit();
    }

}
