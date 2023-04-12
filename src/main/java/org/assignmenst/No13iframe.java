package org.assignmenst;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class No13iframe extends Parent{
    @Test
    public void test() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/iframe");
        driver.manage().window().maximize();
//        driver.findElement(By.xpath("(//SPAN[@class='tox-mbtn__select-label'])[1]")).click();
//        driver.findElement(By.xpath("//div[@class='tox-menu-nav__js tox-collection__item tox-collection__item--active']")).click();
        Thread.sleep(2000);
        driver.switchTo().frame("mce_0_ifr");
        driver.findElement(By.id("tinymce")).sendKeys("hi myself praveen kumar d");

//        driver.navigate().to("https://www.google.com/");

        Thread.sleep(5000);
    }
}
