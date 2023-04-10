package com.rentalCar.stepsDefinitions.ui;

import com.rentalCar.pom.InitialPage;
import com.rentalCar.pom.ReserveCarPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;


public class CompleteDriverInformation extends BaseTest {

    private final InitialPage _initialPage = new InitialPage();
    private final ReserveCarPage _reserveCarPage = new ReserveCarPage();

    @Given("The user opens milles page")
    public void theUserOpensMillesPage() {
        webDriver.get(this._properties.get().getProperty("RentalCarUrl"));
    }
    @When("The user selects the car to rent")
    public void theUserSelectsTheCarToRent() {
        _initialPage.choosePickupLocation();
        _initialPage.choosePickupDate();
        _initialPage.clickOnSearchButton();
        _reserveCarPage.chooseSecondCar();
    }
    @Then("The user completes driver information")
    public void theUserCompletesDriverInformation() {
        _reserveCarPage.fillDriverInformation();
        _reserveCarPage.clickOnNextBtn();
        Assert.assertEquals(true, _reserveCarPage.paymentElement().isDisplayed());
    }
}
