package com.sgtesting.softassertion;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertSameDemo {
    SoftAssert soft=new SoftAssert();
    @Test
    public void assertSameTesting()
    {
        try
        {
            String s1="Welcome";
            String s2="Welcome";
            soft.assertSame(s1,s2);
            System.out.println("This line executes after assertSame Statement!!");
            soft.assertAll();
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
            soft.assertNotSame(s1,s2);
            System.out.println("This line executes after assertNotSame Statement!!");
            soft.assertAll();
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
