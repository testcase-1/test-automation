package com.hepsiburada.test.pages;

import com.hepsiburada.test.utils.CommonUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends CommonUtils {

    By emailID = By.id("email");
    By passwordID = By.id("password");
    By loginButtonClass = By.xpath("/html/body/div[2]/div[2]/div[1]/section[1]/div/div[3]/form/div[4]/button");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void enterEmail(String email) {

        waitForElementToBeVisible(emailID);
        sendKeys(emailID, email);
    }

    public void enterPassword(String password) {

        waitForElementToBeVisible(passwordID);
        sendKeys(passwordID, password);
    }

    public void clickLoginButton() {
        clickTo(loginButtonClass);
    }
}

