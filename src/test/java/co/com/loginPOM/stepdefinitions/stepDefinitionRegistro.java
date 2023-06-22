package co.com.loginPOM.stepdefinitions;

import com.steps.stepLogin;
import com.steps.stepRegistro;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class stepDefinitionRegistro {
    @Steps
    stepRegistro registro;
    @Steps
    stepLogin login;

    @Given("me encuentro en la pagina de inicio")
    public void meEncuentroEnLaPaginaDeInicio() {
        login.AbrirPagina();
    }

    @Given("estoy en la pantalla MyAccount")
    public void estoyenlapantallaMyAccount() {
        login.btnAccount();
    }
    @Given("Inicio sesion con mi usuario y contrasena {string} y contrasena {string}")
    public void inicioSesionConMiUsuarioYContrasenaYContrasena(String usuario, String contrasena) {
        login.IngresarUser(usuario);
        login.IngresarPassword(contrasena);
        login.btnInicioSesion();
    }

    @Given("Que me encuentro logueado en la pagina")
    public void queMeEncuentroLogueadoEnLaPagina() {
        registro.AbrirPaginaLogueado();
    }

    @When("Doy click en el boton Phones & PDAs")
    public void doyClickEnElBotonPhonesPDAs() {
        registro.btnProducto();
    }

    @When("Doy click en boton ADD TO CARD")
    public void doyClickEnBotonADDTOCARD() {
        registro.btnAddCart();
    }

    @Then("se agrega el producto al carrito")
    public void seAgregaElProductoAlCarrito() {
        Assert.assertTrue(registro.isProductAddedToCart());
    }


}
