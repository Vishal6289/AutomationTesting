package Learning;

import org.testng.annotations.Test;

@Test(groups  ="Registration")
public class GroupTest {
    @Test(groups = "regression")
    public void test1()
    {
        System.out.println("test1");
    }
    @Test(groups = "regression")
    public void test2()
    {
        System.out.println("test2");
    }
    @Test(groups = "regration, smoke")
    public void test3()
    {
        System.out.println("test3");

    }
    @Test(groups = "smoke")
    public void test4()
    {
        System.out.println("test4");
    }
}
