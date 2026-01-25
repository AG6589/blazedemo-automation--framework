package com.blazedemo.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    By fromPort = By.name("fromPort");
    By toPort = By.name("toPort");
    By findFlightsBtn = By.xpath("//input[@value='Find Flights']");

    public void selectDepartureCity(String city) {
        new Select(driver.findElement(fromPort)).selectByValue(city);
    }

    public void selectDestinationCity(String city) {
        new Select(driver.findElement(toPort)).selectByValue(city);
    }

    public void clickFindFlights() {
        driver.findElement(findFlightsBtn).click();
    }
}

