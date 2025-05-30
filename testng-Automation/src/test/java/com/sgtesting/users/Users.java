package com.sgtesting.users;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Users {

    @Test
    public void createUser()
    {
        System.out.println("the User demoUser1 has created successfully!");
    }

    @Test
    public void modifyUser()
    {
        System.out.println("the User demoUser1 has modified successfully!");
    }

    @Test
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
