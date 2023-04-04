package Common;

import org.testng.Assert;
import org.testng.annotations.Test;
public class ListernerDemoTest extends BaseTest{
    @Test(retryAnalyzer = MyRetry.class)
    public void launchApp()
    {
        driver.get("https://flipkart.com");
        Assert.assertTrue(false);

    }
}
