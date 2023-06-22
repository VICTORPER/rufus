package com.steps;

import com.pages.LoginPage;
import net.thucydides.core.annotations.Step;

public class stepLogin {
   LoginPage loginPage;

    @Step
    public void AbrirPagina() {
        loginPage.open();
    }

    @Step
    public void btnAccount() {
        loginPage.btnMyAccount();
    }

    @Step
    public void btnLogin() {
        loginPage.btnLogin();
    }
    @Step
    public void IngresarUser(String user)    {
        loginPage.ingresarUsuario(user);
    }
    @Step
    public void IngresarPassword(String pass)
    {
        loginPage.ingresarPassword(pass);
    }

    @Step
    public void btnInicioSesion() {
        loginPage.btnIniciarSesion();
    }

    @Step
    public boolean isDisplayed(){
        return loginPage.isHomePageDisplayed();
    }
}



