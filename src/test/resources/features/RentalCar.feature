@REGRESSION @UI
Feature: Rental car through miles page

  @RENTAL_CAR
  Scenario: Complete driver information
    Given The user opens milles page
    When The user selects the car to rent
    Then The user completes driver information
