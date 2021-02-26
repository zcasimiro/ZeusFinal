package steps;

import factory.DriverFactory;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.MissionAndVision;
import pages.SalinasGroup;

public class SalinasGroupSteps {

    AndroidDriver androidDriver = DriverFactory.getDriver();
    SalinasGroup gs =new SalinasGroup(androidDriver);

    @When("El usuario oprime el menu de Grupo Salinas")
    public void el_usuario_oprime_el_menu_de_grupo_salinas() throws InterruptedException {
        gs.clickMenuSalinasGroup();
    }

    @Then("El usuario visualice la pantalla de Grupo Salinas")
    public void el_usuario_visualice_la_pantalla_de_grupo_salinas() {

    }


    @And("El usuario regresa a la pantalla principal")
    public void elUsuarioRegresaALaPantallaPrincipal() throws InterruptedException {
        gs.clickbackbuttonFuntions();
    }
}
