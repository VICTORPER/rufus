package co.com.loginPOM.stepdefinitions;

import com.steps.stepLogin;
import com.steps.stepOrderHistory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class stepDefinitionOrderHistory {
    @Steps
    stepLogin login;

    @Steps
    stepOrderHistory orderHistory;

    @Given("Dado que me encuentro logueado correctamente")
    public void dadoQueMeEncuentroLogueadoCorrectamente() {
        Assert.assertTrue(login.isDisplayed());
    }

    @When("Doy click en la opcion Order History")
    public void doyClickEnLaOpcionOrderHistory() {
      orderHistory.btnOrderHistory();
    }

    @Then("carga la pagina que muestra el historial de las compras")
    public void cargaLaPaginaQueMuestraElHistorialDeLasCompras() {
        Assert.assertTrue(orderHistory.isDisplayed());
    }
}
