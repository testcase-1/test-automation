package com.hepsiburada.test.pages;

import com.hepsiburada.test.utils.CommonUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage extends CommonUtils {

    By productName = By.id("product-name");
    By addToCartButton = By.id("addToCart");
    By shoppingCartButton = By.id("shoppingCart");

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public String getProductName() {
        return getElementText(productName);
    }


    public void addToCart() {
        checkPageIsLoaded();
        waitForElementToBeVisible(addToCartButton);
        clickTo(addToCartButton);

    }

    public void goToCart() {
        checkPageIsLoaded();
        waitForElementToBeVisible(shoppingCartButton);
        clickTo(shoppingCartButton);
    }

}
