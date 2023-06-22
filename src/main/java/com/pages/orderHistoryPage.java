package com.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;

@DefaultUrl("https://opencart.abstracta.us/")
public class orderHistoryPage extends PageObject {
    @FindBy(xpath= "//a[@class='list-group-item' and text()='Order History']")
    WebElement btnOrderHistory;

    @FindBy(xpath = "//h1[text()='Account']")
    WebElement txtMensaje;



    public void btnOrderHistory(){
        btnOrderHistory.click();
    }

    public boolean OrderSucces()
    {
        return txtMensaje.isDisplayed();
    }



}
