package com.crm.qa.base;

import com.crm.qa.util.TestUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestBase {
    public static WebDriver driver;
    public static Properties prop;
    public TestBase()
    {
        try
        {
            prop = new Properties();
            FileInputStream fileInputStream = new FileInputStream("D:\\Testing\\AutomationTesting\\FreeCRMTestAutomation\\src\\" +
                    "main\\java\\com\\crm\\qa\\config\\config.properties");
            prop.load(fileInputStream);
            System.out.println("Browser name is"+prop.getProperty("browser"));
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void initialization()
    {
        String BrowserName= prop.getProperty("browser");
        if(BrowserName.equals("chrome")) {

         driver=new ChromeDriver();
        }
        else if (BrowserName.equals("edge")) {
             driver=new EdgeDriver();
        }
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
        driver.get(prop.getProperty("url"));
    }
}