package com.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;

@DefaultUrl("https://opencart.abstracta.us/index.php?route=account/account")
public class registroPage extends PageObject {
    @FindBy(xpath = "//*[@id='menu']/div[2]/ul/li[6]/a")
    WebElement btnProduct;

    @FindBy(xpath = "//*[@id='content']/div[2]/div[1]/div/div[2]/div[2]/button[1]/span")
    WebElement btnAddCart;

    @FindBy(xpath = "//*[contains(@class, 'alert-success')]")
    WebElement successMessage;

    public void btnProduct() {
        btnProduct.click();

    }

    public void btnAddCart() {
        btnAddCart.click();

    }

    public boolean isProductAddedToCart() {
        return successMessage.isDisplayed();
    }
}