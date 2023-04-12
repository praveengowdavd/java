package org.example.OnlineClass;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class form1 extends BaseClass {
    @Test
    public void test() throws InterruptedException {

        driver.manage().window().maximize();
        driver.get("https://demoqa.com/automation-practice-form");
        Faker fake = new Faker();
        String firstname = fake.name().firstName();
        String lastname = fake.name().lastName();
        String email = firstname+"@gmail.com";
        String mobile = fake.number().digits(10);

        driver.findElement(By.id("firstName")).sendKeys(firstname);
        driver.findElement(By.id("lastName")).sendKeys(lastname);
        driver.findElement(By.id("userEmail")).sendKeys(email);
        driver.findElement(By.id("userNumber")).sendKeys(mobile);
//        driver.findElement(By.id("gender-radio-1")).click();

//        driver.findElement(By.id("hobbies-checkbox-1")).click();
//        driver.findElement(By.id("hobbies-checkbox-2")).click();


        driver.findElement(By.id("dateOfBirthInput")).click();
        WebElement month = driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
        WebElement year = driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));

        Select sel = new Select(month);
//        sel.selectByIndex(10);
//        sel.selectByValue("10");
            sel.selectByVisibleText("November");

            Select sel2 = new Select(year);
            sel2.selectByVisibleText("1995");

            driver.findElement(By.xpath("'//div[@class='react-datepicker__day react-datepicker__day--009 react-datepicker__day--selected']"));




        Thread.sleep(2000);



    }
}
