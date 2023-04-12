package org.example.OnlineClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragDrop extends BaseClass {
    @Test
    public void test() throws InterruptedException {
        driver.get("https://demo.guru99.com/test/drag_drop.html");
       WebElement source = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
        WebElement destin = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
        Actions act = new Actions(driver);
        act.dragAndDrop(source,destin).build().perform();
        Thread.sleep(3000);

    }
}
