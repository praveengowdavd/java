package org.assignmenst;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class checkboxes extends  Parent{
    @Test
    public void test() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/checkboxes");
       WebElement checkbox1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
       boolean initial = checkbox1.isSelected();
       checkbox1.click();
       boolean after = checkbox1.isSelected();


        Assert.assertNotEquals(initial,after);
        Thread.sleep(10000);

    }


}
