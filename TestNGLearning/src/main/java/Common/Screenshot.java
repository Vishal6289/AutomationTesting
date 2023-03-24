package Common;
import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class Screenshot
{
    public void getScreenshot() throws IOException
{
    Date currentdate=new Date();
    String SCfilename= currentdate.toString().replace(" ", "-");
    File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
    FileUtils.copyFile(screenshotFile,new File(".//screenshot/"+SCfilename+".png"));

}}

