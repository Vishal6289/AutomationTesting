package Learning;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ReportTest {
    @Test
    public void reportTest1()
    {
        System.out.println("This is Test1");
    }
    @Test
    public void reportTest2()
    {
        Reporter.log("This is Test2");
        System.out.println("This is Test2");
    }
}
