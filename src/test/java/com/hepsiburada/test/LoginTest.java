package com.hepsiburada.test;

import com.hepsiburada.test.pages.*;
import org.junit.Test;

public class LoginTest extends BaseTest {

    public void LoginTest() {
    }

    @Test
    public void loginTest() {

        HomePage homePage = new HomePage(this.driver);
        homePage.goToLoginPage();
        LoginPage loginPage = new LoginPage(this.driver);
        loginPage.enterEmail("hepsiburadatest2@outlook.com");
        loginPage.enterPassword("!LvQ8-D-");
        loginPage.clickLoginButton();
    }

}

