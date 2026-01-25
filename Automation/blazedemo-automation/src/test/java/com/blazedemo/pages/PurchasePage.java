package com.blazedemo.pages;

import org.openqa.selenium.*;

public class PurchasePage {

    WebDriver driver;

    public PurchasePage(WebDriver driver) {
        this.driver = driver;
    }

    By name = By.id("inputName");
    By address = By.id("address");
    By city = By.id("city");
    By state = By.id("state");
    By zip = By.id("zipCode");
    By card = By.id("creditCardNumber");
    By cardName = By.id("nameOnCard");
    By purchaseBtn = By.xpath("//input[@value='Purchase Flight']");

    public void enterPassengerDetails(String n, String add, String c, String s, String z, String cardNo, String cname) {
        driver.findElement(name).sendKeys(n);
        driver.findElement(address).sendKeys(add);
        driver.findElement(city).sendKeys(c);
        driver.findElement(state).sendKeys(s);
        driver.findElement(zip).sendKeys(z);
        driver.findElement(card).sendKeys(cardNo);
        driver.findElement(cardName).sendKeys(cname);
    }

    public void clickPurchase() {
        driver.findElement(purchaseBtn).click();
    }
}

