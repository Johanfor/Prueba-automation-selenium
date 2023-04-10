package com.rentalCar.pom;

import com.rentalCar.stepsDefinitions.ui.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReserveCarBasePage extends BaseTest {

    @FindBy(xpath = "//div[@id='car_1']//button[contains(text(),'RESERVAR')]")
    WebElement secondCarBtn;
    @FindBy(id = "inpName")
    WebElement nameLbl;
    @FindBy(id = "phoneCustom")
    WebElement phoneNumber;
    @FindBy(id = "inpEmail")
    WebElement elementLabl;
    @FindBy(xpath = "//span[contains(text(),'Siguiente')]")
    WebElement nextBtn;
    @FindBy(xpath = "//*[contains(text(),'Métodos de Pago')]")
    WebElement methodPaymentText;

    public ReserveCarBasePage() {
        PageFactory.initElements(webDriver, this);
    }

}
