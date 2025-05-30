package com.sgtesting.products;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Products {

    @Test
    public void createProduct()
    {
        System.out.println("the Product demoProduct1 has created successfully!");
    }

    @Test
    public void modifyProduct()
    {
        System.out.println("the Product demoProduct1 has modified successfully!");
    }

    @Test
    public void deleteProduct   ()
    {
        System.out.println("the Product demoProduct1 has deleted successfully!");
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
