package org.assignmenst;

import org.example.OnlineClass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class multiselect extends Parent{
    @Test
    public void test() throws InterruptedException {
        driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
        WebElement ele = driver.findElement(By.xpath("//select[@name='selenium_commands']"));
        Select sel = new Select(ele);
        sel.selectByVisibleText("Browser Commands");
        sel.selectByVisibleText("Navigation Commands");
        sel.selectByVisibleText("WebElement Commands");

        Thread.sleep(3000);
    }
}
