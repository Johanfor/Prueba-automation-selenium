package com.rentalCar.ui.utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Waits {

    public void waitUntilRenderingPage(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(
                webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));
    }

    public WebDriverWait wait(WebDriver driver){
        WebDriverWait waiting = new WebDriverWait(driver, Duration.ofSeconds(30));
        return waiting;
    }
}
