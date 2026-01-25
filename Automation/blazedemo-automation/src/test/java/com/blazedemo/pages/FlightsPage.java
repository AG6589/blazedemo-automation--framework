package com.blazedemo.pages;

import java.time.Duration;
import java.util.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlightsPage {

    WebDriver driver;

    public FlightsPage(WebDriver driver) {
        this.driver = driver;
    }

    By rows = By.xpath("//table[@class='table']//tr");
    By priceColumn = By.xpath(".//td[6]");
    By chooseBtn = By.xpath(".//td[1]//input");


    public void chooseLowestPriceFlight() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("table.table")));

        List<WebElement> rows = driver.findElements(By.cssSelector("table.table tr"));

        double lowestPrice = Double.MAX_VALUE;
        WebElement lowestPriceRow = null;

        for (int i = 1; i < rows.size(); i++) { // skip header row

            List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
            String priceText = cols.get(5).getText();   // 6th column = price

            double price = Double.parseDouble(priceText.replace("$", "").trim());

            if (price < lowestPrice) {
                lowestPrice = price;
                lowestPriceRow = rows.get(i);
            }
        }

        System.out.println("Lowest price found: " + lowestPrice);

        lowestPriceRow.findElements(By.tagName("td"))
                      .get(0)
                      .findElement(By.tagName("input"))
                      .click();
    }


}

