package org.example.OnlineClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseOver extends BaseClass{
    @Test
    public void test() throws InterruptedException {
        driver.get("https://www.myntra.com/");
       WebElement home = driver.findElement(By.xpath("(//a[text()='Home & Living'])[1]"));
        WebElement bed =  driver.findElement(By.xpath("//a[text()='Bed Runners']"));
        Actions act = new Actions(driver);
        act.moveToElement(home).build().perform();
        Thread.sleep(2000);
        bed.click();
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();


    }
}
