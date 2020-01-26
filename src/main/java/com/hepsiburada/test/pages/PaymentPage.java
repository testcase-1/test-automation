package com.hepsiburada.test.pages;

import com.hepsiburada.test.utils.CommonUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaymentPage extends CommonUtils {

    By paymentName = By.xpath("//*[text()='Havale']");
    By bankName = By.xpath("//*[@id=\"payment-type-2\"]/div/ul/li[1]/div");
    By continueButton = By.xpath("//*[@id=\"short-summary\"]/div[1]/div[2]/button");
    By paymentType = By.xpath("/html/body/div[2]/div/div/div/div/div/div[1]/div[2]");
    By continuePaymentButton = By.xpath("/html/body/div[2]/div/div/div/div/div/div[2]/div[3]/button[2]");

    public PaymentPage(WebDriver driver) {
        super(driver);
    }

    public void selectPaymentOptions() {

        checkPageIsLoaded();
        waitForElementToBeVisible(paymentName);
        clickTo(paymentName);
        checkPageIsLoaded();
        waitForElementToBeVisible(bankName);
        clickTo(bankName);
        clickTo(continueButton);
        checkPageIsLoaded();
        waitForElementToBeVisible(paymentType);
        clickTo(paymentType);
        checkPageIsLoaded();
        waitForElementToBeVisible(continueButton);
        clickTo(continuePaymentButton);
    }


}
