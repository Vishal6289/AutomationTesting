package com.crm.qa.base;

import com.crm.qa.util.TestUtil;
import com.crm.qa.util.WebEventListener;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestBase {
    public static WebDriver driver;
    public static Properties prop;
    public static EventFiringWebDriver e_driver;
    public static WebEventListener eventListener;
    public TestBase()
    {
        try
        {
            prop = new Properties();
            FileInputStream fileInputStream = new FileInputStream("D:\\Testing\\AutomationTesting\\FreeCRMTestAutomation\\src\\" +
                    "main\\java\\com\\crm\\qa\\config\\config.properties");
            prop.load(fileInputStream);
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
            ChromeOptions options=new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");
         driver=new ChromeDriver(options);
        }
        else if (BrowserName.equals("edge")) {
            EdgeOptions options1=new EdgeOptions();
            options1.addArguments("--remote-allow-origins=*");
             driver=new EdgeDriver(options1);
        }
        e_driver=new EventFiringWebDriver(driver);
        eventListener= new WebEventListener();
        e_driver.register(eventListener);

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
        driver.get(prop.getProperty("url"));
    }
}