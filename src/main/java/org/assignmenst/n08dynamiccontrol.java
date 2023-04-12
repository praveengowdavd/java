package org.assignmenst;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class n08dynamiccontrol extends Parent{
    @Test
    public void test()
    {
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();

        WebDriverWait wait = new WebDriverWait(driver,10);
        WebElement msg = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("message")));
        System.out.println(msg.getText());
        Assert.assertEquals(msg.getText(),"It's gone!");

        driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();
        WebElement msg1 = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("message")));
        System.out.println(msg1.getText());
        Assert.assertEquals(msg1.getText(),"It's back!");

        driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
        WebElement msg3 = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("message")));
        System.out.println(msg3.getText());
        Assert.assertEquals(msg3.getText(),"It's enabled!");

        driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
        WebElement msg4 = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("message")));
        System.out.println(msg4.getText());
        Assert.assertEquals(msg4.getText(),"It's disabled!");











    }
}
