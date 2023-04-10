package com.rentalCar.pom;

import com.rentalCar.stepsDefinitions.ui.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InitialBasePage extends BaseTest {

    @FindBy(xpath = "//*[contains(@id,'pickupLocation')][1]")
    WebElement pickupLocationLbl;
    @FindBy(xpath = "//*[contains(@id,'from-input')][1]")
    WebElement pickupDateLbl;
    @FindBy(xpath = "//i[@class='button__icon icon-search'][1]")
    WebElement searchBtn;

    public InitialBasePage() {
        PageFactory.initElements(webDriver, this);
    }

}
