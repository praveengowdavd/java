package org.assignmenst;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class Parent {

    WebDriver driver;

    @BeforeClass
    @Parameters({"browser"})
    public void open(String browser)
    {
        if (browser.equals("chrome"))
        {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            System.out.println("open browser");
        }
        else if (browser.equals("edge"))
        {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }
    }

    @AfterClass
    public void close()
    {
        System.out.println("close browser");
        driver.quit();
    }
}
