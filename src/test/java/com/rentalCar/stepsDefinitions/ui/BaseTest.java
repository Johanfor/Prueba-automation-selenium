package com.rentalCar.stepsDefinitions.ui;

import com.rentalCar.ui.driverFactory.DriverManager;
import com.rentalCar.ui.utils.AppProperties;
import org.openqa.selenium.WebDriver;

import java.util.Properties;

public abstract class BaseTest {

    protected DriverManager driverManager;
    protected static WebDriver webDriver;
    protected static ThreadLocal<Properties> _properties = new AppProperties().getAppProperties();


}
