package com.hepsiburada.test.pages;

import com.hepsiburada.test.utils.CommonUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoppingDeliveryPage extends CommonUtils {

    By continueButton = By.xpath("//*[text()='Devam Et']");


    public ShoppingDeliveryPage(WebDriver driver) {
        super(driver);
    }

    public void addToDeliveryAddress() {

        checkPageIsLoaded();
        waitForElementToBeVisible(continueButton);
        clickTo(continueButton);

    }

}

