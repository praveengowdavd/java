package org.example.OnlineClass;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class facebook extends BaseClass{
    @Test
    public void test() throws InterruptedException {
        driver.get("https://www.facebook.com/login/");
        Faker fake = new Faker();
        String name = fake.name().firstName();
        String email = name + "@gmail.com";
        System.out.println(email);


        driver.findElement(By.id("email")).sendKeys(email);
        Thread.sleep(2000);
        driver.findElement(By.id("pass")).sendKeys("abc");
        driver.findElement(By.id("loginbutton")).click();

        // same can be done in phone number and etc..
        String phone = fake.phoneNumber().cellPhone();
        String num = fake.number().digits(10);
        System.out.println(phone);
        System.out.println(num);

    }
}
