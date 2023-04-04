package com.crm.qa.testcases;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {
 LoginPage loginpage;
 HomePage homePage;
//    public LoginPageTest(){
//        super();
//    }
    @BeforeMethod
            public void setup(){
         initialization();
        loginpage =new LoginPage();
    }
    @AfterTest
    public void tearDown(){
        driver.quit();
    }
    @Test(priority = 1)
    public void LoginPageTitleTest()
    {
        String title=loginpage.validateLoginPageTitle();
        Assert.assertEquals(title,"Cogmento CRM");
    }
    @Test(priority = 2)
    public void LoginTest()
    {
        homePage=  loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
    }

}
