package org.assignmenst;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class N0_12floating extends Parent{
    @Test
    public void test() throws InterruptedException {
        driver.get(" https://the-internet.herokuapp.com/floating_menu");
//        ((JavascriptExecutor)(driver)).executeScript("scroll(0,500)");
//        ((JavascriptExecutor)(driver)).executeScript("scroll(500,0)");
        WebElement Powered = driver.findElement(By.xpath("//a[text()='Elemental Selenium']"));
        ((JavascriptExecutor)(driver)).executeScript("arguments[0].scrollIntoView(true);",Powered);
//        WebElement menu = driver.findElement(By.id("menu"));
//        ((JavascriptExecutor)(driver)).executeScript("arguments[0].scrollIntoView(true);",menu);
        Thread.sleep(3000);

    }
}
