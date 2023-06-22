package com.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;

@DefaultUrl("https://opencart.abstracta.us/")
public class registerUserPage extends PageObject {
    @FindBy(xpath= "//a[contains(text(),'My Account')]")
    WebElement btnMyAccount;

    @FindBy(xpath= "//a[@href='https://opencart.abstracta.us:443/index.php?route=account/register' and @class='list-group-item']")
    WebElement btnRegister;

    @FindBy(xpath="//input[@name='firstname']")
    WebElement txtFirtsname;

    @FindBy(xpath="//input[@name='lastname']")
    WebElement txtLastname;

    @FindBy(xpath="//input[@name='email']")
    WebElement txtEmail;

    @FindBy(xpath="//input[@name='telephone']")
    WebElement txtPhone;

    @FindBy(xpath="//input[@name='password']")
    WebElement txtPaswword;

    @FindBy(xpath="//input[@id='input-confirm']")
    WebElement txtConfirmPassword;

    @FindBy(xpath="//input[@name='agree']")
    WebElement check;

    @FindBy (xpath = "//input[@value='Continue']")
    WebElement btnContinue;

    @FindBy(xpath = "//h1[text()='Account']")
    WebElement txtMensaje;



    public void btnMyAccount(){
        btnMyAccount.click();
    }

    public void btnRegisterUser(){
        btnRegister.click();
    }

    public void txtFirtsname(String firtsname){
        txtFirtsname.sendKeys(firtsname);
     }
    public void txtLastname(String lastname) {
        txtLastname.sendKeys(lastname);
    }

    public void txtEmail(String email)
    {
        txtEmail.sendKeys(email);
    }

    public void txtPhone (String phone)
    {
        txtPhone.sendKeys(phone);
    }

    public void txtPassword (String password)
    {
        txtPaswword.sendKeys(password);
    }
    public void txtConfirmPassword (String confirm)
    {
        txtConfirmPassword.sendKeys(confirm);
    }
    public void check ()
    {
        check.click();
    }

    public void btnContinue()
    {
        btnContinue.click();
    }
    public boolean registerSuccesfull()
    {
        return txtMensaje.isDisplayed();
    }
}
