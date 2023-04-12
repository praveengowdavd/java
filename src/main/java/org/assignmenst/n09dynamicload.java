package org.assignmenst;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class n09dynamicload extends Parent{
    @Test
    public void test()
    {
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
        driver.findElement(By.xpath("//button[text()='Start']")).click();
        WebDriverWait wait=new WebDriverWait(driver,20);
        WebElement web = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("finish")));
        System.out.println(web.getText());
    }
}
