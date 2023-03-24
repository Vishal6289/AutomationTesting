package Learning;

import org.testng.annotations.*;

public class Login {
    @BeforeTest
    public void LogintoApplication(){
        System.out.println("Login to Application");
    }
    @AfterTest
    public void LogoutfromApplication(){
        System.out.println("Logout from Application");
    }
    @BeforeMethod
    public void ConnectToDB(){
        System.out.println("Connect to DataBase");
    }
    @AfterMethod
    public void DisconnectFromDB(){
        System.out.println("Disconnect from DataBase");
    }
    @Test (priority = 1,description = "This is login test")
    public void loginTest()

    {
        System.out.println("Login is successful");
    }




    @Test(priority = 2, description = "This is logout test")
    public void logoutTest()
    {
        System.out.println("Logout is successful");
    }
}