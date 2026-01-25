package com.blazedemo.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.blazedemo.base.BaseTest;
import com.blazedemo.pages.*;

public class BookFlightTest extends BaseTest {

    
    @Test
public void bookLowestFlightTest() {

    try {

        HomePage home = new HomePage(driver);
        home.selectDepartureCity("Philadelphia");
        home.selectDestinationCity("London");
        home.clickFindFlights();

        FlightsPage flights = new FlightsPage(driver);
        flights.chooseLowestPriceFlight();

        PurchasePage purchase = new PurchasePage(driver);
        purchase.enterPassengerDetails(
                "Suryance Raj", "Gandhi Nagar East", "Hazaribag",
                "Jharkhand", "825301", "4111111111111111", "SK Verma"
        );
        purchase.clickPurchase();

        ConfirmationPage confirm = new ConfirmationPage(driver);
        Assert.assertEquals(confirm.getPageTitle(), "BlazeDemo Confirmation");

    } catch (Exception e) {
        e.printStackTrace();   // 👈 this will FORCE console output
        Assert.fail("Test failed due to exception: " + e.getMessage());
    }
}

}

