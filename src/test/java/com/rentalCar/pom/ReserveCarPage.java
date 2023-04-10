package com.rentalCar.pom;

import com.rentalCar.ui.utils.Waits;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ReserveCarPage extends ReserveCarBasePage{

    private final Waits _wait = new Waits();

    public void chooseSecondCar(){
        _wait.wait(webDriver).until(ExpectedConditions.visibilityOf(secondCarBtn));
        secondCarBtn.click();
    }

    public void fillDriverInformation(){
        nameLbl.sendKeys("Johan Forero");
        phoneNumber.sendKeys("1020304050");
        elementLabl.sendKeys("johan.test@mailtest.com");
    }

    public void clickOnNextBtn(){
        nextBtn.click();
    }

    public WebElement paymentElement(){

       return methodPaymentText;
    }
}
