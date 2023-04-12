package org.example.OnlineClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.Set;

public class windiwhandle extends BaseClass{
    @Test
    public void test() throws InterruptedException {
        driver.get("https://canarabank.com/");
        String parentwindow = driver.getWindowHandle();
        String parenttitle = driver.getTitle();
        System.out.println("parentid:"+parentwindow);
        System.out.println("parenttitle :"+parenttitle);

       WebElement login = driver.findElement(By.xpath("//p[text()='LOGIN']"));
        Actions act = new Actions(driver);
        act.moveToElement(login).build().perform();
        driver.findElement(By.xpath("//a[text()='Net Banking - Canara']")).click();

        Set<String> windowid =driver.getWindowHandles();
        for(String id:windowid)
        {
            System.out.println(id);
            if(parentwindow.equals(id))
            {

            }
            else {
                driver.switchTo().window(id);
            }
        }
        driver.findElement(By.xpath("(//a[text()='About Us'])[1]")).click();
        driver.close();
        driver.switchTo().window(parentwindow);
        driver.findElement(By.xpath("//a[text()='Financial Results']")).click();






        Thread.sleep(2000);


    }
}

