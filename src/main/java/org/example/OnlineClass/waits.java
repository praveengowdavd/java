package org.example.OnlineClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class waits extends BaseClass{
    @Test
    public void test()
    {
//        explicit waits
        driver.get("https://www.redbus.in/bus-tickets/mysore-to-bangalore?fromCityName=Mysore&fromCityId=129&toCityName=Bangalore&toCityId=122&onward=02-Apr-2023&srcCountry=IND&destCountry=IND&opId=0&busType=Any");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//div[@class='onward-modify-btn g-button clearfix fl']")).click();
        WebDriverWait wait = new WebDriverWait(driver,10);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class=' button ms-btn']")));
        element.click();
        WebDriverWait wait2 = new WebDriverWait(driver,10);
        WebElement busn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='f-bold busFound']")));
        System.out.println(busn.getText());


//implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);

    }
}
