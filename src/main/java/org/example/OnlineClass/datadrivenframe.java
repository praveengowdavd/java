package org.example.OnlineClass;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;



import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class datadrivenframe extends BaseClass {
    @Test(dataProvider = "login")
    public void test(String email, String password) throws InterruptedException {
        String expectedtitle = "nopCommerce demo store. Shopping Cart";
        driver.get("https://demo.nopcommerce.com/login?returnurl=%2Fcart");

        driver.findElement(By.id("Email")).sendKeys(email);
        driver.findElement(By.id("Password")).sendKeys(password);
        driver.findElement(By.xpath("(//div[@class='buttons'])[2]")).click();

        System.out.println(driver.getTitle());
        //        how to send some msges to report
        Reporter.log("emailid" + email);
        Reporter.log("password" + password);
        Assert.assertEquals(expectedtitle, driver.getTitle());


        Thread.sleep(2000);
    }

    @DataProvider(name = "login")
    public Object[][] data() throws IOException {
        Object logindata[][] = new Object[3][2];

        String path = System.getProperty("user.dir") + File.separator + "data" + File.separator + "logindata.xlsx";
        System.out.println(path);

        FileInputStream file = new FileInputStream(path);
        XSSFWorkbook wb = new XSSFWorkbook(file);
        XSSFSheet sh = wb.getSheetAt(0);
        String val = sh.getRow(0).getCell(0).getStringCellValue();
        System.out.println(val);
        int lastRow = sh.getLastRowNum();


        for (int i = 0; i <= lastRow; i++) {


            String email = sh.getRow(i).getCell(0).getStringCellValue();
            String password = sh.getRow(i).getCell(1).getStringCellValue();
            logindata[i][0]=email;
            logindata[i][1]=password;

        }



//        logindata[0][0]= "myemail.com";
//         logindata[0][1]="mypass";
//
//        logindata[1][0]="praveen4@gmail.com";
//        logindata[1][1]="praveen";
//
//
//        logindata[2][0]="praveenku@gmail.com";
//        logindata[2][1]="bypass";

        return logindata;


    }

}
