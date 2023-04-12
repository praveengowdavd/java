package org.example.OnlineClass;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class frames extends BaseClass{
    @Test
    public void test()
    {
        driver.get("https://docs.oracle.com/javase/7/docs/api/");
        driver.switchTo().frame("packageListFrame");
        driver.findElement(By.xpath("//a[text()='java.applet']")).click();

        driver.switchTo().defaultContent();
        driver.switchTo().frame("packageFrame");
        driver.findElement(By.xpath("//i[text()='AudioClip']")).click();

    }
}
