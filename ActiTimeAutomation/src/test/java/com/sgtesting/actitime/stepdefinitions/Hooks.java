package com.sgtesting.actitime.stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void setUp()
    {
        System.out.println("Establish Oracle Database connectivity");
    }

    @After
    public void cleanup()
    {
        System.out.println("Disconnect the Oracle Database connectivity");
    }
}
