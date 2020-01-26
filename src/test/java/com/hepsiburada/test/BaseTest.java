package com.hepsiburada.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {

    WebDriver driver;

    public BaseTest() {
    }

    @Before
    public void startUp() {
        String browserName = "Firefox";
        if (browserName.equalsIgnoreCase("Chrome")) {
            WebDriverManager.chromedriver().setup();
            this.driver = new ChromeDriver();
        }

        if (browserName.equalsIgnoreCase("Firefox")) {
            WebDriverManager.firefoxdriver().setup();
            this.driver = new FirefoxDriver();
        }

        this.driver.get("https://www.hepsiburada.com/");
    }

//    @After
//    public void quit() {
//        this.driver.quit();
//    }
}

