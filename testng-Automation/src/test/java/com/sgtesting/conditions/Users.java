package com.sgtesting.conditions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Users {

    @Test(priority = -5)
    public void createUser()
    {
        System.out.println("the User demoUser1 has created successfully!");
    }

    @Test(priority = 0, enabled = false)
    public void modifyUser()
    {
        System.out.println("the User demoUser1 has modified successfully!");
    }

    @Test(priority = 1)
    public void deleteUser()
    {
        System.out.println("the User demoUser1 has deleted successfully!");
    }

    @BeforeClass
    public void setUp()
    {
        System.out.println("Launch Browser and Navigate Application URL and Login into the Application");
    }

    @AfterClass
    public void cleanup()
    {
        System.out.println("Logout from the Application and close Application");
        System.out.println("+++++++++++++++++++++++++++++");
    }
}
