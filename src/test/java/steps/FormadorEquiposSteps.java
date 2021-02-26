package steps;

import factory.DriverFactory;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FormadorEquiposSteps {

    AndroidDriver androidDriver = DriverFactory.getDriver();
    FormadorEquiposSteps fe=new FormadorEquiposSteps(androidDriver);

    @When("El usuario ingresa al modulo Familia socios")
    public void el_usuario_ingresa_al_modulo_familia_socios() throws InterruptedException {
        fe.clickFSocio();

    }

    @Then("El usuario selecciona el submenu ¿Qué es un formador de equipos?")
    public void el_usuario_selecciona_el_submenu_qué_es_un_formador_de_equipos() {
       fe.clickformadorequipos();
    }

    @Then("El usuario selecciona regresa al submenu Formador de Equipos")
    public void el_usuario_selecciona_regresa_al_submenu_formador_de_equipos() {
        fe.backsubmenuformadordeequipos();
    }

    @Then("El usuario cierra el menu Formador de equipos")
    public void el_usuario_cierra_el_menu_formador_de_equipos() {
        fe.closedequipos();

    }
}
