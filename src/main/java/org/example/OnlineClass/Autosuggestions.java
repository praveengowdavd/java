package org.example.OnlineClass;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

import static java.lang.Thread.sleep;

public class Autosuggestions extends BaseClass{
    @Test
    public void test() throws InterruptedException {
        driver.get("https://www.makemytrip.com/");

        driver.manage().window().maximize();
//        driver.findElement(By.xpath("//div[@class='fsw_inputBox searchCity inactiveWidget ']")).click();
//        driver.findElement(By.xpath("//span[@class='ic_circularclose_grey']")).click();


//       driver.findElement(By.xpath("//input[@class='react-autosuggest__input react-autosuggest__input--open']")).sendKeys("bangalore");
//        List<WebElement> list = driver.findElements(By.xpath("//ul[@class='react-autosuggest__suggestions-list']/li"));
//        System.out.println(list.size());
//        for(WebElement src : list)
//        {
//          System.out.println(src.getText());
//            if(src.getText().contains("Mumbai"))
//            {
//             src.click();
//             break;
//            }
//        }

//        driver.findElement(By.xpath("//div[@class='fsw_inputBox searchToCity inactiveWidget ']")).click();
//        driver.findElement(By.xpath("//input[@class='react-autosuggest__input react-autosuggest__input--open']")).sendKeys("mysore");


        driver.findElement(By.xpath("//div[@class='fsw_inputBox dates inactiveWidget ']")).click();
//        String dep = driver.findElement(By.xpath("(//div[@class='DayPicker-Caption'])[1]")).getText();
//       String dep = driver.findElement(By.xpath("//div[text()='June']")).getText();
        String dep = driver.findElement(By.xpath("//div[@class='DayPicker-Month']")).getText();
        while(!dep.equals("Aug23")){
            driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
            dep = driver.findElement(By.xpath("//div[@class='DayPicker-Month']")).getText();
        }
        driver.findElement(By.xpath("//div[@aria-label='Sat Aug 05 2023']")).click();
//                (//span[@class='selectedDateField appendBottom8 pointer'])[2]



    }
}
