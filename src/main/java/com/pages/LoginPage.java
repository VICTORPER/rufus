package com.pages;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
@DefaultUrl("https://opencart.abstracta.us/")
public class LoginPage extends PageObject {

    @FindBy(xpath= "//a[contains(text(),'My Account')]")
    WebElement btnMyAccount;

    @FindBy(xpath= "//input[@value='Login']")
    WebElement btnLogin;

    @FindBy(xpath= "//input[@name='email']")
    WebElement txtemail;

    @FindBy (xpath = "//input[@name='password']")
    WebElement txtPassword;

    @FindBy (xpath = "//input[@value='Login']")
    WebElement btnIniciarSesion;

     @FindBy(xpath = "//h2[text()='My Account']")
     WebElement txtMensaje;

    public void btnMyAccount(){
        btnMyAccount.click();
    }
    public void btnLogin(){
        btnLogin.click();
    }
    public void ingresarUsuario(String usuario) {
        txtemail.sendKeys(usuario);

    }
    public void ingresarPassword(String password) {
        txtPassword.sendKeys(password);

    }
    public void btnIniciarSesion(){
        btnIniciarSesion.click();
    }
    public boolean isHomePageDisplayed()
    {
        return txtMensaje.isDisplayed();
    }


}
