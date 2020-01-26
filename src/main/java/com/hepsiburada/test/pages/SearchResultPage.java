package com.hepsiburada.test.pages;

import com.hepsiburada.test.utils.CommonUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchResultPage extends CommonUtils {

    public SearchResultPage(WebDriver driver) {
        super(driver);
    }

    By firstItem = By.cssSelector("li.search-item:nth-child(1)");

    public void getFirsrtProduct() {
        clickTo(firstItem);
    }
}
