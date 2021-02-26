package steps;

import factory.DriverFactory;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Values;

public class ValuesSteps {

    AndroidDriver androidDriver = DriverFactory.getDriver();
    Values vs= new Values(androidDriver);

    @When("El usuario oprime el menu de Valores")
    public void el_usuario_oprime_el_menu_de_valores() {
        vs.clickMenuValores();
    }

    @Then("El usuario visualice la pantalla de Valores")
    public void el_usuario_visualice_la_pantalla_de_valores() {
        vs.viewValuesScreen();
    }

    @And("El usuario regresa al Home")
    public void elUsuarioRegresaAlHome() {
    }

    @And("El  usuario cierra la sesión")
    public void elUsuarioCierraLaSesión() {
    }
}
