package org.assignmenst;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class N0_10_fileupload extends Parent{
    @Test
    public void test() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/upload");
        driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\mkmoh\\IdeaProjects\\java\\src\\main\\java\\org\\assignmenst\\checkboxes.java");
        driver.findElement(By.id("file-submit")).click();
        Thread.sleep(3000);

    }
}
