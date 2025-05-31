package com.sgtesting.softassertion;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.File;

public class AssertNullDemo {
    SoftAssert soft=new SoftAssert();
    @Test
    public void assertNullTesting()
    {
        try
        {
            File fin=null;
            soft.assertNull(fin);
            System.out.println("This line executes after assertNull Statement!!");
            soft.assertAll();
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    @Test
    public void assertNotNullTesting()
    {
        try
        {
            File fin=null;
            fin=new File("D:\\Demo");
            soft.assertNotNull(fin);
            System.out.println("This line executes after assertNotNull Statement!!");
            soft.assertAll();
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
