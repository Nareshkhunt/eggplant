package com.eggplant;

import com.eggplant.driver.DriverManager;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
    private DriverManager driverManager = new DriverManager();
    @Before
    public void setUp() {
        driverManager.openBrowser();
        //driverManager.navigateTo("https://www.gmail.com/");
        driverManager.navigateTo("https://www.wikipedia.org/");
        driverManager.maxBroser();
        driverManager.applyImplicit();
        driverManager.handleCookies();
    }
    @After
    public void tearDown() {
        driverManager.closeBrowser();
    }
}

