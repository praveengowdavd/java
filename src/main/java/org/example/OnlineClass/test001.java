package org.example.OnlineClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class test001 extends BaseClass {
    @Test
    public void test(){
        driver.get("https://www.google.com/");
//        driver.findElement(By.id("input")).sendKeys("laptop", Keys.ENTER);
//        driver.findElement(By.name("q")).sendKeys("selenium jobs",Keys.ENTER);
        driver.findElement(By.linkText("ಕನ್ನಡ")).click();


    }

}
