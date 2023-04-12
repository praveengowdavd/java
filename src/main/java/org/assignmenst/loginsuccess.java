package org.assignmenst;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class loginsuccess extends Parent{

    @Test
    public void test() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/login");
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']")).click();
       String output = driver.findElement(By.xpath("//div[@class='flash success']")).getText();

        System.out.println(output);
        Thread.sleep(3000);
    }
}
