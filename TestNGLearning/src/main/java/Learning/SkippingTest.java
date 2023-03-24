package Learning;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkippingTest {
    Boolean dataSetup=true;
    @Test(enabled = false)
    public void test1()
    {
        System.out.println("Skip this test case as this is not complete");
    }
    @Test
    public void test2()
    {
        System.out.println("Skipping this test forcefully");
        throw new SkipException("Skipping this test");
    }
    @Test
    public void test3()
    {
        System.out.println("Skipping this based on condition");
        if(dataSetup==true)
        {
            System.out.println("Execute the case");
        }
        else
        {
            System.out.println("Do not execute the test");
            throw new SkipException("Do not execute the further steps");
        }
    }
}
