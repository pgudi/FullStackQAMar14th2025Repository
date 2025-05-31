package com.sgtesting.hardassertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertEqualsDemo {
    @Test
    public void assertEqualsTesting()
    {
        try
        {
            String s1,s2;
            s1="Welcome";
            s2="Welcome";
            Assert.assertEquals(s1,s2);
            System.out.println("This line executes after assertEquals Statement!!");
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
            Assert.assertNotEquals(s1,s2);
            System.out.println("This line executes after assertNotEquals Statement!!");
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
