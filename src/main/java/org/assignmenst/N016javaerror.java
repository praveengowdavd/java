package org.assignmenst;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class N016javaerror extends Parent{
    @Test
    public void test()
    {
        driver.get("https://the-internet.herokuapp.com/javascript_error");
       String abc = driver.findElement(By.xpath("//body[@onload='loadError()']")).getText();
       System.out.println(abc);

    }
}
