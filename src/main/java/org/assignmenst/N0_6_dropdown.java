package org.assignmenst;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class N0_6_dropdown extends Parent {
    @Test

    public void test() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/dropdown");
//        driver.findElement(By.id("dropdown")).click();
//        driver.findElement(By.xpath("//option[text()='Option 1']")).click();
//        driver.findElement(By.id("dropdown")).click();
//        driver.findElement(By.xpath("//option[text()='Option 2']")).click();
//        Thread.sleep(4000);

//        using asserts
        WebElement dd =driver.findElement(By.id("dropdown"));

        Select sel = new Select(dd);
        sel.selectByIndex(1);
         System.out.println(sel.getFirstSelectedOption().getText());
        Assert.assertEquals(sel.getFirstSelectedOption().getText(),"Option 1");



    }
}
