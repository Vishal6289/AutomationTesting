package Common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
public static WebDriver driver=null;
@BeforeSuite
public void launchBrowser()
{
    driver=new EdgeDriver();

}
@AfterSuite
    public void closeBrowser()
    {
        driver.close();
    }
}
