package co.com.loginPOM.stepdefinitions;

import com.steps.stepCheckout;
import com.steps.stepLogin;
import com.steps.stepRegistro;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class stepDefinitionCheckout {

    @Steps
    stepRegistro registro;
    @Steps
    stepLogin login;
    @Steps
    stepCheckout checkout;

    @Given("Abro la pagina de inicio")
    public void abroLaPaginaDeInicio() {
        login.AbrirPagina();

    }

    @Given("Ingreso sesion con mi usuario y contrasena {string} y contrasena {string}")
    public void ingresoSesionConMiUsuarioYContrasenaYContrasena(String usuario, String contrasena) {
        login.btnAccount();
        login.IngresarUser(usuario);
        login.IngresarPassword(contrasena);
        login.btnInicioSesion();
    }

    @Given("Agrego un producto al carrito")
    public void agregoUnProductoAlCarrito() {
        registro.btnProducto();
        registro.btnAddCart();

    }

    @Given("Que me encuentro con productos agregados al carrito")
    public void queMeEncuentroConProductosAgregadosAlCarrito() {
        Assert.assertTrue(registro.isProductAddedToCart());

    }

    @When("Doy click en la pestana Checkout")
    public void doyClickEnLaPestanaCheckout() {
    checkout.optionCheckout();

    }

    @When("Doy click en el boton Continue de la seccion step2")
    public void doyClickEnElBotonContinueDeLaSeccionStep2() {
     checkout.btnContinueStep2();
    }

    @When("Doy click en el boton Continue de la seccion step3")
    public void doyClickEnElBotonContinueDeLaSeccionStep3() {
        checkout.btnContinueStep3();
    }

    @When("Doy click en el boton Continue de la seccion step4")
    public void doyClickEnElBotonContinueDeLaSeccionStep4() {
        checkout.btnContinueStep4();
    }

    @When("Doy click en la caja de texto I have read and agree to the Terms & Conditions")
    public void doyClickEnLaCajaDeTextoIHaveReadAndAgreeToTheTermsConditions() {
     checkout.checkboxAgree();
    }

    @When("Doy click en el boton Continue de la seccion step5")
    public void doyClickEnElBotonContinueDeLaSeccionStep5() {
     checkout.btnContinueStep5();
    }

    @When("Doy click en el boton Confirm Order de la seccion step6")
    public void doyClickEnElBotonConfirmOrderDeLaSeccionStep6() {
        checkout.btnConfirmOrder();
    }

    @Then("Se confirma la orden de compra")
    public void seConfirmaLaOrdenDeCompra() {
        Assert.assertTrue(checkout.iscConfirmOrderDisplayed());
    }
}
