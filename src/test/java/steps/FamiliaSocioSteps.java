package steps;

import factory.DriverFactory;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.FamiliaSocio;
import pages.ZeusBox;

import java.io.IOException;

public class FamiliaSocioSteps {

    AndroidDriver androidDriver = DriverFactory.getDriver();
    FamiliaSocio fs=new FamiliaSocio(androidDriver);

    @When("El usuario ingresa al modulo Familia socios")
    public void el_usuario_ingresa_al_modulo_familia_socios() throws InterruptedException {
    fs.clickSocios();

    }

    @Then("El usuario busca una tarea por hacer")
    public void el_usuario_busca_una_tarea_por_hacer() throws IOException, InterruptedException {
    fs.BuscarTarea();
    }

    @Then("El usuario selecciona Tarea Zeus Automatizar_TestZai y continua")
    public void el_usuario_selecciona_tarea_zeus_automatizar_test_zai_y_continua() throws IOException, InterruptedException {
    fs.ingresaTarea();
    }

    @Then("El usuario ingresa una breve descripción y continua")
    public void el_usuario_ingresa_una_breve_descripción_y_continua() throws InterruptedException {
    fs.ingresadescripcion();
    }

    @Then("El usuario selecciona una opcion de la pregunta  y continua")
    public void el_usuario_selecciona_una_opcion_de_la_pregunta_y_continua() throws InterruptedException {
    fs.seleccionarpregunta();
    }

    @Then("El usuario selecciona una respuesta y continua")
    public void el_usuario_selecciona_una_respuesta_y_continua() throws InterruptedException {
    fs.seleccionarespuesta();
    }

    @Then("El usuario selecciona graba un audio y continua")
    public void el_usuario_selecciona_graba_un_audio_y_continua() throws InterruptedException {
    fs.grabaaudio();
    }

    @Then("El usuario carga un archivo y continua")
    public void el_usuario_carga_un_archivo_y_continua() throws InterruptedException {
    fs.cargararchivo();
    }

    @Then("El usuario toma una foto y continua")
    public void el_usuario_toma_una_foto_y_continua() throws InterruptedException {
    fs.tomafoto();
    }

    @Then("El usuario toma un video y continua")
    public void el_usuario_toma_un_video_y_continua() throws InterruptedException {
    fs.tomavideo();
    }

    @Then("El usuario coloca una firma y continua")
    public void el_usuario_coloca_una_firma_y_continua() throws InterruptedException {
    fs.colocartufirma();
    }

    @Then("El usuario confirma el termino del cuestionario")
    public void el_usuario_confirma_el_termino_del_cuestionario() throws InterruptedException {
    fs.finalizarcuestionario();
    }

    @Then("El usuario sale del modulo tareas")
    public void el_usuario_sale_del_modulo_tareas() {

    }


}
