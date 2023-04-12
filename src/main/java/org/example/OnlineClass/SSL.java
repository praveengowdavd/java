package org.example.OnlineClass;

import org.testng.annotations.Test;

public class SSL extends BaseClass{
    @Test
    public void test() throws InterruptedException {
        driver.get("https://expired.badssl.com/");
        Thread.sleep(2000);
    }
}
