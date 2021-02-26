package steps;

import factory.DriverFactory;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Login;
import pages.Tareas;

import java.io.IOException;

public class TareasSteps {


    AndroidDriver androidDriver = DriverFactory.getDriver();
    Tareas generalDeFunciones = new Tareas(androidDriver);


    @Then("el usuario ingresa al modulo Tareas por hacer")
    public void el_usuario_ingresa_al_modulo_Tareas_por_hacer() throws IOException, InterruptedException {
        generalDeFunciones.ingresaModulo(1);
    }

    @Given("el usuario busca una Tarea por hacer")
    public void el_usuario_busca_una_tarea_por_hacer() throws IOException, InterruptedException {
        generalDeFunciones.BuscarTarea();
    }

    @Then("el usuario selecciona Tarea Automatizacion Zeus")
    public void el_usuario_selecciona_Tarea_Automatizacion_Zeus() throws IOException, InterruptedException {
        generalDeFunciones.ingresaTarea();
    }


    @Then("el usuario muestra el documento adjunto y continua")
    public void el_usuario_muestra_el_documento_adjunto_y_continua() throws IOException, InterruptedException {
        generalDeFunciones.usuarioVisualizaContenido();
    }

    @Then("el usuario contesta las pregunta de respuestas multiples y continua")
    public void el_usuario_contesta_las_pregunta_de_respuestas_multiples_y_continua() throws IOException {
        generalDeFunciones.seleccionaPreguntasMultiples("Whatszeus","Capacitación","Tareas");
    }

    @Then("el usuario captura la pregunta abierta y continua")
    public void el_usuario_captura_la_pregunta_abierta_y_continua() throws IOException {
        generalDeFunciones.capturaTextoAbierto("Mensaje proporcionado por el Automatizador de Zeus");
    }

    @Then("el usuario contesta la pregunta de respuesta unica")
    public void el_usuario_contesta_la_pregunta_de_respuesta_unica() throws IOException {
        generalDeFunciones.capturaRespuestaUnica("Whatszeus");
    }

    @Then("el usuario descarga el video y lo reproduce")
    public void el_usuario_descarga_el_video_y_lo_reproduce() throws IOException, InterruptedException {
        generalDeFunciones.usuarioDescargaVideo();
    }

    @Then("el usuario toma una selfie y continua")
    public void el_usuario_toma_una_selfie_y_continua() throws IOException {
        generalDeFunciones.usuarioTomaSelfie();
    }

    @Then("el usuario carga una imagen y continua")
    public void el_usuario_carga_una_imagen_y_continua() throws IOException {
        generalDeFunciones.usuarioCargaFoto();
    }

    @Then("el usuario graba un audio y continua")
    public void el_usuario_graba_un_audio_y_continua() throws IOException, InterruptedException {
        generalDeFunciones.usuarioGrabaAudio();
    }

    @Then("el usuario graba un video y continua")
    public void el_usuario_graba_un_video_y_continua() throws InterruptedException {
        generalDeFunciones.usuarioGrabaVideo();
    }

    @Then("el usuario contesta NO en preguntas logicas")
    public void el_usuario_contesta_no_en_preguntas_logicas() throws IOException {
        generalDeFunciones.preguntasLogicas('n');
    }

    @Then("el usuario contesta SI en preguntas logicas")
    public void el_usuario_contesta_si_en_preguntas_logicas() throws IOException {
        generalDeFunciones.preguntasLogicas('s');
    }

    @Then("el usuario confirma el termino del cuestionario")
    public void el_usuario_confirma_el_termino_del_cuestionario() throws IOException, InterruptedException {
        generalDeFunciones.usuarioConfirmaFinalizar();
    }

    @Then("el usuario selecciona el pais para viajar")
    public void el_usuario_selecciona_el_pais_para_viajar () throws IOException {
        generalDeFunciones.seleccionaPais();
    }

    @Then("el usuario selecciona el Estado para viajar")
    public void el_usuario_selecciona_el_Estado_para_viajar () throws IOException {
        generalDeFunciones.seleccionaEstado();
    }

    @Then("el uusuario termina su primera capacitacion")
    public void el_uusuario_termina_su_primera_capacitacion () throws IOException {
        generalDeFunciones.felicidadesUsuarioTermina();
    }


    @Then("el usuario sale del modulo Tarea por hacer")
    public void el_usuario_sale_del_modulo_tarea_por_hacer() throws InterruptedException {
    generalDeFunciones.regresarmenuprinicpal();
    }


}
