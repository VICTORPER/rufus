package com.steps;

import com.pages.registerUserPage;
import net.thucydides.core.annotations.Step;

public class stepRegisterUser {
    registerUserPage registerUser;


  @Step
  public void OpenPage() {
      registerUser.open();
  }

  @Step
   public void btnMyAccount()
  {
      registerUser.btnMyAccount();
  }

  @Step
   public void btnRegister()
  {
      registerUser.btnRegisterUser();
  }

  @Step
  public void inputFirstname(String firstname)
  {

      registerUser.txtFirtsname(firstname);

  }

    @Step
    public void inputLastname(String lastname)
    {
        registerUser.txtLastname(lastname);
    }
    @Step
    public void inputEmail(String email)
    {
        registerUser.txtEmail(email);
    }

    @Step
    public void inputPhone(String phone)
    {
        registerUser.txtPhone(phone);
    }
    @Step
    public void inputPassword(String password)
    {
        registerUser.txtPassword(password);
    }

    @Step
    public void inputConfirmPassword(String confirm)
    {
        registerUser.txtConfirmPassword(confirm);
    }

    @Step
    public void check()
    {
        registerUser.check();
    }

    @Step
    public void btnContinue(){
        registerUser.btnContinue();
    }

    @Step
    public boolean isDisplayed(){
        return registerUser.registerSuccesfull();
    }

}
