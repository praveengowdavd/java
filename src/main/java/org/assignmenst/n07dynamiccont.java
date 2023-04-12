package org.assignmenst;

import org.example.OnlineClass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class n07dynamiccont extends Parent {
    @Test
    public void test() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/dynamic_content?with_content=static");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.navigate().refresh();
        String txt = driver.findElement(By.xpath("(//div[@class='large-10 columns'])[3]")).getText();
        driver.navigate().refresh();
        String txt1 = driver.findElement(By.xpath("(//div[@class='large-10 columns'])[3]")).getText();
        Assert.assertNotEquals(txt,txt1);



//        for (int i = 1; i == 5; i++) {
//            driver.get(driver.getCurrentUrl());
//            driver.navigate().to(driver.getCurrentUrl());
//            driver.navigate().refresh();
//            Thread.sleep(2000);
//            System.out.println("no of refresh"+i);


        }
    }
