package com.sgtesting.hardassertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertConditionDemo {

    @Test
    public void assertTrueTesting()
    {
        try
        {
            int x,y;
            x=100;y=150;
            Assert.assertTrue(y>x);
            System.out.println("This line executes after assertTrue Statement!!");
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    @Test
    public void assertFalseTesting()
    {
        try
        {
            int x,y;
            x=100;y=150;
            Assert.assertFalse(x>=y);
            System.out.println("This line executes after assertFalse Statement!!");
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
