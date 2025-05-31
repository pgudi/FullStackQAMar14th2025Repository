package com.sgtesting.softassertion;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertEqualsDemo {
    SoftAssert soft=new SoftAssert();
    @Test
    public void assertEqualsTesting()
    {
        try
        {
            String s1,s2;
            s1="Welcome";
            s2="Welcome";
            soft.assertEquals(s1,s2);
            System.out.println("This line executes after assertEquals Statement!!");
            soft.assertAll();
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    @Test
    public void assertNotEqualsTesting()
    {
        try
        {
            String s1,s2;
            s1="Welcome";
            s2="Programming";
            soft.assertNotEquals(s1,s2);
            System.out.println("This line executes after assertNotEquals Statement!!");
            soft.assertAll();
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
