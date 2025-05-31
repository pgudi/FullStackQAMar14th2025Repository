package com.sgtesting.hardassertion;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;

public class AssertNullDemo {

    @Test
    public void assertNullTesting()
    {
        try
        {
            File fin=null;
            Assert.assertNull(fin);
            System.out.println("This line executes after assertNull Statement!!");
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
            Assert.assertNotNull(fin);
            System.out.println("This line executes after assertNotNull Statement!!");
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
