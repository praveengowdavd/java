package org.assignmenst;

import org.openqa.selenium.Alert;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.Set;

public class N019amazon extends Parent{
    @Test
    public void test() throws InterruptedException {

        driver.get("https://www.flipkart.com/.");
        driver.manage().window().maximize();

       driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
       Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("iPhone 13 256 GB.");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
        Thread.sleep(2000);
      String amount2 = driver.findElement(By.xpath("(//div[@class='_30jeq3 _1_WHN1'])[4]")).getText();

      System.out.println(amount2);
        Thread.sleep(2000);

        driver.get(" https://www.amazon.in");
        driver.manage().window().maximize();
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(" iPhone 13 256 GB.");
        driver.findElement(By.id("nav-search-submit-button")).click();
       String amount1 = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[2]")).getText();

       System.out.println(amount1);
        Thread.sleep(2000);

        int amount22 = Integer.parseInt(amount2);
        int amount11 = Integer.parseInt(amount1);
        if(amount11>amount22)
        {
            System.out.println("By iphone in amazon with price: "+amount11);
        }
        else {
            System.out.println("Buy iphone in flipkart with price:"+amount22);
        }
        if(amount11==amount22)
        {
            System.out.println("you can buy iphone anywhere the price is same"+amount11+amount22);
        }






    }
}
