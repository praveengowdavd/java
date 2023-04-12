package org.assignmenst;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class contextmenu extends Parent{
    @Test
    public void test() throws InterruptedException {

        driver.get("https://the-internet.herokuapp.com/context_menu");
       WebElement count = driver.findElement(By.id("hot-spot"));
        Actions act =new Actions(driver);
        act.contextClick(count).build().perform();
//        act.contextClick(count).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();

        Thread.sleep(4000);
        Alert alt = driver.switchTo().alert();
        alt.accept();
        System.out.println(alt.getText());

        Thread.sleep(3000);

    }
}
