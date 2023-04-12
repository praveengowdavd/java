package org.example.OnlineClass;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class screenshot extends BaseClass{
    @Test
    public void test() throws IOException {
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        File ss= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(ss,new File("data/amazon.png"));
    }
}
