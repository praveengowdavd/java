package org.assignmenst;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;

public class N018notification extends Parent{
    @Test
    public void test() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/notification_message_rendered");

//        Thread.sleep(3000);

       for( int i=1;i<=5;i++) {

            Thread.sleep(2000);
           WebElement button =driver.findElement(By.xpath("//a[text()='Click here']"));
            button.click();
           String text = driver.findElement(By.id("flash-messages")).getText();
           System.out.println(text+i);







       }


//        driver.findElement(By.xpath("//a[text()='Click here']")).click();
//        String text1 = driver.findElement(By.id("flash")).getText();
//        System.out.println(text1);
//        driver.findElement(By.xpath("//a[text()='Click here']")).click();
//        String text2 = driver.findElement(By.id("flash")).getText();
//        System.out.println(text2);
//        driver.findElement(By.xpath("//a[text()='Click here']")).click();
//        String text3 = driver.findElement(By.id("flash")).getText();
//        System.out.println(text3);
//


    }
    }


