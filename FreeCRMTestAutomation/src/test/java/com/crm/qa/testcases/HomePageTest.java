package com.crm.qa.testcases;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LoginPage;
import org.testng.annotations.BeforeMethod;

public class HomePageTest extends TestBase {
    LoginPage loginPage;
    public HomePageTest()
    {
        super();
    }
    @BeforeMethod
    public void setup()
    {
        initialization();
       loginPage=new LoginPage();
       loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
    }

}
