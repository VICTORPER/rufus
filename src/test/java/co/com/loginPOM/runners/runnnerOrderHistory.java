package co.com.loginPOM.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features="src/test/resources/features/orderHistory.feature",
        glue="co/com/loginPOM/stepdefinitions", snippets = CucumberOptions.SnippetType.CAMELCASE


)
public class runnnerOrderHistory {
}
