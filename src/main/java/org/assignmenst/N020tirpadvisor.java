package org.assignmenst;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.Set;

public class N020tirpadvisor extends Parent {
    @Test
    public void test() throws InterruptedException {
        driver.get("https://www.tripadvisor.in/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        String parent = driver.getWindowHandle();
        driver.findElement(By.xpath("(//input[@type='search'])[2]")).sendKeys("Club Mahindra");
        driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//span[text()='Club Mahindra Madikeri, Coorg']")).click();

        Thread.sleep(2000);

        Set<String> windowid = driver.getWindowHandles();
        for (String id : windowid) {
            if (parent.equals(id)) {

            } else {
                driver.switchTo().window(id);
                driver.findElement(By.xpath("//div[@class='XZzcc Vb PP']")).click();
                Thread.sleep(3000);
            }

        }
        Set<String> window2 = driver.getWindowHandles();
        for(String id1 :window2)
        {
            if(parent.equals(windowid)){

            }
            if(windowid.equals(id1)){

            }
            else{
                driver.switchTo().window(id1);
            }
        }
        Thread.sleep(3000);

        Actions act = new Actions(driver);
       WebElement star1 = driver.findElement(By.xpath("(//label[@class='_S'])[1]"));
       act.moveToElement(star1).build().perform();
        WebElement star2 = driver.findElement(By.xpath("(//label[@class='_S'])[2]"));
        act.moveToElement(star2).build().perform();
        WebElement star3 = driver.findElement(By.xpath("(//label[@class='_S'])[3]"));
        act.moveToElement(star3).build().perform();
        WebElement star4 = driver.findElement(By.xpath("(//label[@class='_S'])[4]"));
        act.moveToElement(star4).build().perform();
         driver.findElement(By.xpath("(//label[@class='_S'])[5]")).click();

         driver.findElement(By.xpath("//div[@class='RCAPL u']")).click();
         driver.findElement(By.id("menu-item-2023-01-01")).click();
         driver.findElement(By.xpath("(//span[@class='OKHdJ z Pc PQ Pp PD W _S Gn Z B2 BF _M ncFvv hzzSG wSSLS'])[3]")).click();
         driver.findElement(By.id("review-text")).sendKeys("hi helloooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo");
         driver.findElement(By.id("review-title")).sendKeys("assignment");
         driver.findElement(By.xpath("//button[@class='rmyCe _G B- z _S c Wc wSSLS w pexOo sOtnj']")).click();
         Thread.sleep(3000);


    }
}

