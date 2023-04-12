package org.example.OnlineClass;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class scroll extends BaseClass{
    @Test
    public void test()
    {
        driver.get("https://www.amazon.in/");
//        ((JavascriptExecutor)driver).executeScript("scroll(0,1000)");
        WebElement aboutus = driver.findElement(By.xpath("//a[text()='About Us']"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",aboutus );

    }
}
