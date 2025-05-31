package com.sgtesting.hardassertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertSameDemo {

    @Test
    public void assertSameTesting()
    {
        try
        {
            String s1="Welcome";
            String s2="Welcome";
            Assert.assertSame(s1,s2);
            System.out.println("This line executes after assertSame Statement!!");
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    @Test
    public void assertNotSameTesting()
    {
        try
        {
            String s1="Welcome";
            String s2=new String("Welcome");
            Assert.assertNotSame(s1,s2);
            System.out.println("This line executes after assertNotSame Statement!!");
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
