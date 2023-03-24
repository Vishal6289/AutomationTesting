package Learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertTest {
    @Test
    public void Test() throws InterruptedException
    {
        SoftAssert softAssert=new SoftAssert();
        String Expectedtitle="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
        String expectedText="Search for products, brands and more";
        WebDriver driver=new EdgeDriver();
        driver.get("https://www.flipkart.com/");
        driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
        String Actualresult=driver.getTitle();
        softAssert.assertEquals(Actualresult, Expectedtitle);
        String actaulText=driver.findElement(By.xpath("//input[@placeholder]")).getAttribute("placeholder");
        softAssert.assertEquals(actaulText, expectedText);
        softAssert.assertAll();
    }
}
