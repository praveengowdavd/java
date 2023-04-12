package org.assignmenst;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class No_10_filedownload extends Parent{
    @Test
    public void test() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/download");
        driver.findElement(By.xpath("//a[@href='download/5mb script.xml']")).click();
//        driver.findElement(By.xpath("//a[@href='download/M3.jpg']")).click();
        Thread.sleep(2000);

    }
}
