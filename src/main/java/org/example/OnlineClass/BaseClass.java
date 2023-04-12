package org.example.OnlineClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BaseClass
{
    WebDriver driver;
    @BeforeClass
    public void open()
    {
        DesiredCapabilities dc =new DesiredCapabilities();
        dc.setAcceptInsecureCerts(true);
        ChromeOptions c0 = new ChromeOptions();
        c0.merge(dc);

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(c0);
        System.out.println("open the browser");
    }
//    @Test
//    public void test()


//    {
//        System.out.println("execute test case");
//        driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=486458706470&hvpos=&hvnetw=g&hvrand=1985199777476630733&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007768&hvtargid=kwd-10573980&hydadcr=14453_2154373&gclid=Cj0KCQiA0oagBhDHARIsAI-BbgfULOjwjhSF6xm1hKS_VUYijVxlM7L5mHQecYxw1vtA9nMr3VGTjiMaAmkCEALw_wcB");
//    }
    @AfterClass
    public void close()
    {
        System.out.println("close the browser");
        driver.quit();
    }
}
