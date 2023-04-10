package com.rentalCar.pom;

import com.rentalCar.ui.utils.GetDate;
import com.rentalCar.ui.utils.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class InitialPage extends InitialBasePage {

    private final Waits _wait = new Waits();

    public void choosePickupLocation(){
        _wait.wait(webDriver).until(ExpectedConditions.visibilityOf(pickupLocationLbl));
        pickupLocationLbl.click();
        pickupLocationLbl.sendKeys("Florida");
        WebElement locationList = webDriver.findElement(By.xpath("//*[@class='qs-location__autocomplete']"));
        List<WebElement> locationArrive = locationList.findElements(By.xpath("//*[@class='item-autocomplete__label']"));
        for (WebElement e : locationArrive) {
            if (e.getText().contains("Aeropuerto de Florida Keys Marathon")) {
                e.click();
                break;
            }
        }
    }

    public void choosePickupDate(){
        pickupDateLbl.click();
        WebElement nextMonth = webDriver.findElement(By.xpath("//*[@class='month-item']"));
        List<WebElement> date = nextMonth.findElements(By.xpath("//*[@class='day-item']"));
        for (WebElement e : date) {
            if (date.size() == (GetDate.getDay()-1)){
                e.click();
                break;
            }
        }


    }
}
