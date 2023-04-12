package org.example.OnlineClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class test003 extends BaseClass {
    @Test
    public void Test003() {
        driver.get("https://www.googleadservices.com/pagead/aclk?sa=L&ai=DChcSEwjUtbfb_sH9AhWHg0sFHbItAwwYABAAGgJzZg&ohost=www.google.com&cid=CAESa-D2I90phNBoVV4fS50Eu8PR3ZODE0Au4mToRbqdin79o5TJRqkIlgVtmX3xKpBeCLTSwYxntPbhQOHIyjUgaKvd6Pxg2znckWD9MfLNErgg60lHy9OciduoKHyereTBAC9nxJTi7Aa8_eZQ&sig=AOD64_09YDU2TZOd-G1gdZIQ_zW_rxCHpw&q&adurl&ved=2ahUKEwjR_63b_sH9AhWaE7cAHeYZB2kQ0Qx6BAgIEAE");
        //
        // input[@id='twotabsearchtextbox']
//        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("laptop", Keys.ENTER);
        //span[@class='nav-a-content']
        //input[@id='twotabsearchtextbox' and @name='field-keywords']
        //input[@id='twotabsearchtextbox' or @name='nn']
        //span[text()='All Deals']
//        driver.findElement(By.xpath("//a[text()='Amazon miniTV']")).click();
        //input[contains(@id,'twotab')]
        //input[starts-with(@id,'twotab')]
//        (//input[@class='gNO89b'])[2]
    }
}