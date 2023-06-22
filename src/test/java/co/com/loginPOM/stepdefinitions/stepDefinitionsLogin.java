package co.com.loginPOM.stepdefinitions;

import com.steps.stepLogin;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class stepDefinitionsLogin {
    @Steps
    stepLogin login;
    @Given("que ingreso a la pagina https:\\/\\/opencart.abstracta.us\\/")
    public void queIngresoALaPaginaHttpsOpencartAbstractaUs()
    {
        login.AbrirPagina();
    }
    @When("Doy click en el boton MyAccount")
    public void doyClickEnElBotonMyAccount() {
        login.btnAccount();

    }

    @When("ingreso los datos de usuario {string} y contrasena {string}")
    public void ingresoLosDatosDeUsuarioYContrasena(String usuario, String contrasena) {
        login.IngresarUser(usuario);
        login.IngresarPassword(contrasena);
        login.btnInicioSesion();
    }

    @Then("valido el ingreso exitoso")
    public void validoElIngresoExitoso() {
        Assert.assertTrue(login.isDisplayed());
    }
}
