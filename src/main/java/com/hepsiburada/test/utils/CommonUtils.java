package com.hepsiburada.test.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.NoSuchElementException;

/*
Contains common methods which are used other classes
 */

public class CommonUtils {

    private static int timeout = 10;

    WebDriver driver;
    public WebDriverWait wait;

    public CommonUtils(WebDriver driver) {

        this.driver = driver;
    }

    public void clickTo(By by) {
        driver.findElement(by).click();
    }

    public WebElement getElement(By by) {
        try {
            return driver.findElement(by);
        } catch (Exception e) {
            System.out.println(String.format("Element %s does not exist - proceeding", by));
        }
        return null;
    }


    public void sendKeys(By by, String text) {
        WebElement element = getElement(by);
        clearField(element);
        try {
            element.sendKeys(text);
        } catch (Exception e) {
            System.out.println(String.format("Error in sending [%s] to the following element: %s", text, by.toString()));
        }

    }

    public void waitForElementToBeVisible(By by) {
        try {
            wait = new WebDriverWait(driver, timeout);
            wait.until(ExpectedConditions.presenceOfElementLocated(by));
        } catch (Exception e) {
            throw new NoSuchElementException(String.format("The following element was not visible: %s", by));
        }
    }

    public void checkPageIsLoaded() {

        ExpectedCondition<Boolean> expectation = new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver driver) {
                return ((JavascriptExecutor) driver).executeScript("return document.readyState").toString().equals("complete");
            }
        };
        try {
            Thread.sleep(2000);
            wait = new WebDriverWait(driver, 30);
            wait.until(expectation);
        } catch (Throwable error) {

        }
    }

    public void clearField(WebElement element) {
        try {
            element.clear();
            waitForElementTextToBeEmpty(element);
        } catch (Exception e) {
            System.out.print(String.format("The following element could not be cleared: [%s]", element.getText()));
        }
    }

    public void waitForElementTextToBeEmpty(WebElement element) {
        String text;
        try {
            text = element.getText();
            int maxRetries = 10;
            int retry = 0;
            while ((text.length() >= 1) || (retry < maxRetries)) {
                retry++;
                text = element.getText();
            }
        } catch (Exception e) {
            System.out.print(String.format("The following element could not be cleared: [%s]", element.getText()));
        }

    }

    public String getElementText(By by) {
        try {
            return driver.findElement(by).getAttribute("text");
        } catch (Exception e) {
            System.out.println(String.format("Element %s does not exist - proceeding", by));
        }
        return null;
    }


}


