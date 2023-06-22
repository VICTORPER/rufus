package com.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;

@DefaultUrl("https://opencart.abstracta.us/index.php?route=account/account")

public class checkoutPage extends PageObject {

    @FindBy(xpath= "//span[contains(text(),'Checkout')]")
    WebElement pestanaProducto;

    @FindBy(xpath= "//input[@value='Continue']")
    WebElement btnContinuestep2;
    @FindBy(xpath="//input[@id='button-shipping-address']")
    WebElement btnContinuestep3;

    @FindBy(xpath="//input[@id='button-shipping-method']")
    WebElement btnContinuestep4;

    @FindBy(xpath="//input[@value='1']")
    WebElement btnAgree;

    @FindBy(xpath="//input[@id='button-payment-method']")
    WebElement BtnContinuestep5;

    @FindBy(xpath= "//input[@value='Confirm Order']")
    WebElement btnConfirmOrder;

    @FindBy(xpath = "//h1[contains(text(), 'Your order has been placed!')]")
    WebElement txtMessageConfirm;

    public void optionCheckout() {
        pestanaProducto.click();

    }
    public void BtnContinuestep2() {
        btnContinuestep2.click();
    }
    public void BtnContinuestep3() {
        btnContinuestep3.click();
    }
    public void BtnContinuestep4() {
        btnContinuestep4.click();
    }

    public void checkboxAgree() {
        btnAgree.click();
    }

    public void BtnContinuestep5() {
        BtnContinuestep5.click();
    }

    public void btnConfirmOrder() {
        btnConfirmOrder.click();
    }
    public boolean isConfirmOrderDisplayed()
    {
        return txtMessageConfirm.isDisplayed();
    }
}
