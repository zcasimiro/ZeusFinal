package steps;

import factory.DriverFactory;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.FunctionsAndNoFunctions;
import pages.MissionAndVision;

public class FunctionsAndNoFunctionsSteps {

    AndroidDriver androidDriver = DriverFactory.getDriver();
    FunctionsAndNoFunctions fa =new FunctionsAndNoFunctions(androidDriver);

    @When("El usuario oprime el menu Funciones y no Funciones")
    public void el_usuario_oprime_el_menu_funciones_y_no_funciones() {
        fa.clickMenuFuntionsandnoFunctions();

    }

    @Then("El usuario visualiza el bottom sheet Funciones y no Funciones")
    public void el_usuario_visualiza_el_bottom_sheet_funciones_y_no_funciones() {


    }

    @When("El usuario selecciona Funciones")
    public void el_usuario_selecciona_funciones() {
        fa.clickmenuFuntions();

    }

    @Then("El usuario visualiza la pantalla funciones")
    public void el_usuario_visualiza_la_pantalla_funciones() {


    }

    @Then("El usuario vuelve al menu")
    public void el_usuario_vuelve_al_menu() {
        fa.clickbackbuttonFuntions();

    }

    @When("El usuario selecciona No Funciones")
    public void el_usuario_selecciona_no_funciones() {
        fa.clickNoFunctions();

    }

    @Then("El usuario visualiza la pantalla No funciones")
    public void el_usuario_visualiza_la_pantalla_no_funciones() {


    }

}
