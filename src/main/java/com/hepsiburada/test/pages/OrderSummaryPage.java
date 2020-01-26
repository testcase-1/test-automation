package com.hepsiburada.test.pages;

import com.hepsiburada.test.utils.CommonUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderSummaryPage extends CommonUtils {

    By completeOrderButton = By.xpath("//*[text()='Siparişi Onayla']");

    public OrderSummaryPage(WebDriver driver) {

        super(driver);
    }

    public void completeOrder() {

        checkPageIsLoaded();
        waitForElementToBeVisible(completeOrderButton);
        clickTo(completeOrderButton);
    }
}
