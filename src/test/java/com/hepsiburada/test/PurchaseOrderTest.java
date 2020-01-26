package com.hepsiburada.test;

import com.hepsiburada.test.pages.*;
import org.junit.Test;

public class PurchaseOrderTest extends BaseTest {

    @Test
    public void purchaseOrderTest() {
        HomePage homePage = new HomePage(this.driver);
        homePage.goToLoginPage();
        LoginPage loginPage = new LoginPage(this.driver);
        loginPage.enterEmail("hepsiburadatest2@outlook.com");
        loginPage.enterPassword("!LvQ8-D-");
        loginPage.clickLoginButton();
        homePage.search("Kitap");
        SearchResultPage searchResultPage = new SearchResultPage(this.driver);
        searchResultPage.getFirsrtProduct();
        ProductPage productPage = new ProductPage(this.driver);
        productPage.getProductName();
        productPage.addToCart();
        productPage.goToCart();
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(this.driver);
        shoppingCartPage.completeShopping();
        ShoppingDeliveryPage shoppingDeliveryPage = new ShoppingDeliveryPage(this.driver);
        shoppingDeliveryPage.addToDeliveryAddress();
        PaymentPage paymentPage = new PaymentPage(this.driver);
        paymentPage.selectPaymentOptions();
        OrderSummaryPage orderSummaryPage = new OrderSummaryPage(this.driver);
        orderSummaryPage.completeOrder();
        homePage.cancelOrder();
    }
}
