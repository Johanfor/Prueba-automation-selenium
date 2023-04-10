package com.rentalCar.stepsDefinitions.ui;

import com.rentalCar.pom.InitialPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class CompleteDriverInformation extends BaseTest {

    private final InitialPage _initialPage = new InitialPage();

    @Given("The user opens milles page")
    public void theUserOpensMillesPage() {
        webDriver.get(this._properties.get().getProperty("RentalCarUrl"));
    }
    @When("The user selects the car to rent")
    public void theUserSelectsTheCarToRent() {
        _initialPage.choosePickupLocation();
        _initialPage.choosePickupDate();
    }
    @Then("The user completes driver information")
    public void theUserCompletesDriverInformation() {

    }
}
