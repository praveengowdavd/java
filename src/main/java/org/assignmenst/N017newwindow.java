package org.assignmenst;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;

public class N017newwindow extends Parent{
    @Test
    public void test()
    {
        driver.get("https://the-internet.herokuapp.com/windows");
        driver.findElement(By.xpath("//a[text()='Click Here']")).click();

        String parentid = driver.getWindowHandle();
        System.out.println(parentid);
        Set<String> windowid = driver.getWindowHandles();
        for(String id:windowid)
        {
            System.out.println(id);
            if(parentid.equals(id))
            {

            }
            else {
                driver.switchTo().window(id);
            }
        }
//       String text = driver.findElement(By.xpath("//div[@class='example']")).getText();
//        System.out.println(text);
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(),"New Window");

    }
}
