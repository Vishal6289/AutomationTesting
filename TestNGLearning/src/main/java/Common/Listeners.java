package Common;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

public class Listeners extends Screenshot implements ITestListener
{
    @Override
    public void onStart(ITestContext context)
    {
        System.out.println("Test has started");
    }


    @Override
    public void onTestFailure(ITestResult result)

    {
        System.out.println("Test failed-Screenshot Captured");
        try {
            getScreenshot();
        }catch (IOException e){
            e.printStackTrace();
        }


    }
}
