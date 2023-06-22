package com.steps;

import com.pages.checkoutPage;
import net.thucydides.core.annotations.Step;

public class stepCheckout {

    checkoutPage checkout;
    @Step
    public void optionCheckout() {
        checkout.optionCheckout();
    }

    @Step
    public void btnContinueStep2()
    {
      checkout.BtnContinuestep2();
    }
    @Step
    public void btnContinueStep3()
    {
        checkout.BtnContinuestep3();
    }
    @Step
    public void btnContinueStep4()
    {
        checkout.BtnContinuestep4();
    }
    @Step
    public void checkboxAgree()
    {
        checkout.checkboxAgree();
    }
    @Step
    public void btnContinueStep5()
    {
        checkout.BtnContinuestep5();
    }

    @Step
    public void btnConfirmOrder()
    {
        checkout.btnConfirmOrder();
    }

    @Step
    public Boolean iscConfirmOrderDisplayed()
    {
       return checkout.isConfirmOrderDisplayed();
    }
}
