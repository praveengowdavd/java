package org.example.OnlineClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class test002 extends BaseClass{
    @Test
    public void test(){
        driver.get("https://www.amazon.in/");
//        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("laptop", Keys.ENTER);
//        driver.findElement(By.name("field-keywords")).sendKeys("laptop",Keys.ENTER);
//          driver.findElement(By.linkText("Best Sellers")).click();
//        driver.findElement(By.partialLinkText("Today")).click();
        List<WebElement> aTags =driver.findElements(By.tagName("a"));
        System.out.println(aTags.size());
        for(int i=0;i<=aTags.size();i++){
            System.out.println(aTags.get(i).getText());
           System.out.println(aTags.get(i).getAttribute("href"));
        }

    }

}
