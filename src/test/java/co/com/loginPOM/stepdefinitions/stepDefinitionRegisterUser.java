package co.com.loginPOM.stepdefinitions;

import com.models.registerUserModels;
import com.steps.stepRegisterUser;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

import java.util.List;
import java.util.Map;


public class stepDefinitionRegisterUser {
    @Steps
    stepRegisterUser registerUser;
    @Given("que estoy en la pagina https:\\/\\/opencart.abstracta.us\\/")
    public void queEstoyEnLaPaginaHttpsOpencartAbstractaUs() {
        registerUser.OpenPage();
    }

    @When("Hago click en el boton MyAccount")
    public void hagoClickEnElBotonMyAccount() {
       registerUser.btnMyAccount();
    }

    @When("Doy click en el boton Register")
    public void doyClickEnElBotonRegister() {
        registerUser.btnRegister();
    }

    @When("Lleno el formulario")
    public void llenoElFormulario(DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        registerUser.inputFirstname(data.get(0).get("firstname"));
        registerUser.inputLastname(data.get(0).get("lastname"));
        registerUser.inputEmail(data.get(0).get("email"));
        registerUser.inputPhone(data.get(0).get("phone"));
        registerUser.inputPassword(data.get(0).get("password"));
        registerUser.inputConfirmPassword(data.get(0).get("confirmpassword"));

      registerUser.check();

    }

    @When("Hago click en el boton Continue")
    public void hagoClickEnElBotonContinue() {
      registerUser.btnContinue();
    }

    @Then("el usuario se registra con exito")
    public void elUsuarioSeRegistraConExito() {
        Assert.assertTrue(registerUser.isDisplayed());
    }

}
