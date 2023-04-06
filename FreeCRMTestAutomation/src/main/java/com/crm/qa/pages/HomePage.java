package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
    LoginPage loginpage;

    @FindBy(xpath = "//*[@id=\'top-header-menu\']/div[2]/span[1]")
    WebElement UserNameLabel;


}
