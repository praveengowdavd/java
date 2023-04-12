package org.example.OnlineClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Calendarredbus extends BaseClass{
    @Test
    public void test() throws InterruptedException {
        driver.get("https://www.redbus.in/");
        driver.findElement(By.id("onward_cal")).click();
        String month = driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();

        while(!month.equals("Nov 2023")) {
            driver.findElement(By.xpath("//td[@class='next']")).click();
            // update of month
            month = driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();

        }
        driver.findElement(By.xpath("//td[text()='15']")).click();

        Thread.sleep(3000);
    }
}