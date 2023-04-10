package com.rentalCar.stepsDefinitions.ui;

import com.rentalCar.TestRunner;
import com.rentalCar.ui.driverFactory.DriverManagerFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseTest {

    @Before(value = "@RENTAL_CAR")
    public void setUp() {
        driverManager = DriverManagerFactory.getDriver(TestRunner.BROWSER.get());
        webDriver = driverManager.getWebDriver();
    }

    @After
    public void tearDown() {
        driverManager.quitDriver();
    }
}
