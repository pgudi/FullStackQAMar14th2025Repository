package com.sgtesting.softassertion;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertConditionDemo {
    SoftAssert soft=new SoftAssert();
    @Test
    public void assertTrueTesting()
    {
        try
        {
            int x,y;
            x=100;y=150;
            soft.assertTrue(y>x);
            System.out.println("This line executes after assertTrue Statement!!");
            soft.assertAll();
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
            soft.assertFalse(x>=y);
            System.out.println("This line executes after assertFalse Statement!!");
            soft.assertAll();
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
