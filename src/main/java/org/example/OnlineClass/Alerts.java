package org.example.OnlineClass;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Alerts extends BaseClass{
    @Test
    public void test() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
//        driver.findElement(By.xpath("//button[text()= 'Click for JS Alert']")).click();
//           Alert alt=driver.switchTo().alert();
//        alt.accept();

//        driver.findElement(By.xpath("//button[text()= 'Click for JS Confirm']")).click();
//        Alert alt=driver.switchTo().alert();

//        alt.dismiss();

           driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
           Alert alt=driver.switchTo().alert();
           alt.sendKeys("yes");
           alt.accept();





//           System.out.println(alt.getText());


        Thread.sleep(3000);

    }
}
