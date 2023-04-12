package org.assignmenst;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class logifailure extends Parent{
    @Test
    public void test()
    {
        Faker fake = new Faker();
        String name = fake.funnyName().name();
        String pass = fake.name().username();

        driver.get("https://the-internet.herokuapp.com/login");
        driver.findElement(By.id("username")).sendKeys(name);
        driver.findElement(By.id("password")).sendKeys(pass);
        driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']")).click();
        String output = driver.findElement(By.xpath("//div[@class='flash error']")).getText();
        System.out.println(output);
    }

}
