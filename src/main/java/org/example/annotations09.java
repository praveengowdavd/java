package org.example;

import org.testng.annotations.*;

public class annotations09 {

    @AfterMethod
    public void afterMethod()
    {
        System.out.println("after method");
    }
    @AfterClass
    public void afterClass()
    {
        System.out.println("after class");
    }

    @Test
    public void test()
    {
        System.out.println("test");
    }
    @AfterSuite
    public void afterSuite()
    {
        System.out.println("afterSuite");
        System.out.println("this the order of annotations");
    }
    @BeforeClass
    public void beforeClass()
    {
        System.out.println("before class");
    }
    @BeforeMethod
    public void beforeMethod()
    {
        System.out.println("before method");
    }
    @BeforeSuite
    public void beforeSuite()
    {
        System.out.println("before suite");
    }


}

