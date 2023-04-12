package com.crm.qa.pages;

import com.crm.qa.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPage extends TestBase {

    @FindBy(xpath = "//span[@class='selectable ']")
    WebElement contactsLable;
    @FindBy(xpath = "//input[@name='first_name']")
    WebElement firstName;
    @FindBy(xpath = "//input[@name='last_name']")
    WebElement lastName;
    @FindBy(xpath = "//div[@name='company']")
    WebElement company;
    @FindBy(xpath ="//button[@class=\"ui linkedin button\"]")
    WebElement save;


public ContactsPage()
{
    PageFactory.initElements(driver,this);
}

public boolean verifyContactLabel()
{
    return contactsLable.isDisplayed();
}
public void selectContactByName()
{
    driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div[2]/div/table/tbody/tr[1]/td[2]/a")).click();
}
public void createNewContact(String Fname,String Lname, String Comp)
{
firstName.sendKeys(Fname);
lastName.sendKeys(Lname);
company.sendKeys(Comp);
save.click();
}
}
