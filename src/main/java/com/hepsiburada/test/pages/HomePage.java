package com.hepsiburada.test.pages;

import com.hepsiburada.test.utils.CommonUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends CommonUtils {

    By myAccount = By.id("myAccount");
    By loginPageForward = By.id("login");
    By searchInput = By.id("productSearch");
    By serarchButton = By.id("buttonProductSearch");
    By myOrders = By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div/ul/li[1]/a");
    By orderDetailButton = By.className("order-row__summary__toggle__icon");
    By cancelButton = By.xpath("//*[text()='İptal Et']");
    By cancelReasonButton = By.xpath("/html/body/div[4]/div/div/div[2]/div[1]/div/div[1]/div/label/div[1]/span");
    By cancelReason = By.xpath("//*[text()='Ürünleri almaktan vazgeçtim']");
    By cancelOrderButton = By.xpath("/html/body/div[4]/div/div/div[2]/div[2]/button");
    By cancelInfo = By.xpath("//*[text()='Ürün iptal edildi']");
    By cancelPopup = By.xpath("/html/body/div[4]/div/div/button/svg");


    public HomePage(WebDriver driver) {
        super(driver);
    }


    public void goToLoginPage() {

        checkPageIsLoaded();
        clickTo(myAccount);
        checkPageIsLoaded();
        waitForElementToBeVisible(loginPageForward);
        clickTo(loginPageForward);
        checkPageIsLoaded();
    }

    public void search(String productName) {

        sendKeys(searchInput, productName);
        clickTo(serarchButton);
    }

    public void cancelOrder() {

        clickTo(myAccount);
        waitForElementToBeVisible(myOrders);
        clickTo(myOrders);
        checkPageIsLoaded();
        waitForElementToBeVisible(orderDetailButton);
        clickTo(orderDetailButton);
        checkPageIsLoaded();
        waitForElementToBeVisible(cancelButton);
        clickTo(cancelButton);
        checkPageIsLoaded();
        waitForElementToBeVisible(cancelReasonButton);
        clickTo(cancelReasonButton);
        waitForElementToBeVisible(cancelReason);
        clickTo(cancelReason);
        waitForElementToBeVisible(cancelOrderButton);
        clickTo(cancelOrderButton);
        checkPageIsLoaded();
        clickTo(cancelPopup);

    }

}
