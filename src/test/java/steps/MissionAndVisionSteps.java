package steps;

import factory.DriverFactory;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.MissionAndVision;

import java.io.IOException;

public class MissionAndVisionSteps {

    AndroidDriver androidDriver = DriverFactory.getDriver();
    MissionAndVision mv =new MissionAndVision(androidDriver);

    public MissionAndVisionSteps(AndroidDriver androidDriver) {
    }

    @And("el usuario ingresa al modulo Vision y mision")
    public void elUsuarioIngresaAlModuloVisionYMision() throws IOException, InterruptedException {
        mv.clickMenuMissionAndVision();
    }

    @And("el usuario selecciona el apartado del video Vision y lo reproduce")
    public void elUsuarioSeleccionaElApartadoDelVideoVisionYLoReproduce() throws IOException, InterruptedException {
        mv.reproduceVideo('V');
    }

    @And("el usuario selecciona el apartado del video Mision y lo reproduce")
    public void elUsuarioSeleccionaElApartadoDelVideoMisionYLoReproduce() throws IOException, InterruptedException {
        mv.reproduceVideo('M');
    }

    @Then("el usuario sale del modulo Vision y mision")
    public void el_usuario_sale_del_modulo_vision_y_mision() throws IOException, InterruptedException {
        mv.regresarMenuMV();
    }


    @And("el usuario cierra la sesion MV")
    public void elUsuarioCierraLaSesionMV() throws IOException, InterruptedException {
        //mv.cierraSesionMV();
    }



}


