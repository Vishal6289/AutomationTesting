package Learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class DataProviderDemoTest {
    @Test(dataProvider="create",dataProviderClass = DataProviderDemo.class)
    public void test(String Username, String Password)
    {
        System.out.println(Username+"------"+Password);
    }
}
