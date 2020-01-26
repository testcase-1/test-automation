package com.hepsiburada.test.pages;

import com.hepsiburada.test.utils.CommonUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoppingCartPage extends CommonUtils {

    public ShoppingCartPage(WebDriver driver) {
        super(driver);
    }

    By completeShoppingButton = By.cssSelector(".btn-primary");

    public void completeShopping() {

        checkPageIsLoaded();
        waitForElementToBeVisible(completeShoppingButton);
        clickTo(completeShoppingButton);
    }

}
