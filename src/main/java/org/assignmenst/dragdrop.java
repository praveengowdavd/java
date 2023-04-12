package org.assignmenst;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class dragdrop extends Parent{
    @Test
     public void test() throws InterruptedException {
        Actions act = new Actions(driver);
        driver.get("https://the-internet.herokuapp.com/drag_and_drop");
        Thread.sleep(1000);
       WebElement sour = driver.findElement(By.xpath("(//div[@class='column'])[1]"));
       WebElement dest = driver.findElement(By.xpath("(//div[@class='column'])[2]"));
       act.moveToElement(sour).build().perform();
       act.dragAndDrop(sour,dest).build().perform();
       Thread.sleep(1000);

    }
}
