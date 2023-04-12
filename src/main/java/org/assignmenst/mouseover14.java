package org.assignmenst;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class mouseover14 extends Parent{
    @Test
    public void test() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/hovers");
        Actions act = new Actions(driver);
        WebElement image1 = driver.findElement(By.xpath("(//div[@class='figure'])[1]"));
        act.moveToElement(image1).build().perform();
        WebElement image2 = driver.findElement(By.xpath("(//div[@class='figure'])[2]"));
        act.moveToElement(image2).build().perform();
        WebElement image3 = driver.findElement(By.xpath("(//div[@class='figure'])[3]"));
        act.moveToElement(image3).build().perform();
        Thread.sleep(3000);
    }
}
