package com.steps;

import com.pages.LoginPage;
import com.pages.registroPage;
import net.thucydides.core.annotations.Step;

public class stepRegistro {

    registroPage registro;
    @Step
    public void AbrirPaginaLogueado() {
        registro.open();
    }

    @Step
    public void btnProducto() {
        registro.btnProduct();
    }

    @Step
    public void btnAddCart() {
        registro.btnAddCart();
    }
    @Step
    public boolean isProductAddedToCart() {
       return registro.isProductAddedToCart();
    }
}
