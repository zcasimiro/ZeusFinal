package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import javafx.beans.property.Property;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import utils.PropertyLoader;
import java.io.IOException;
import java.util.List;

import static java.lang.Thread.sleep;

public class Tareas extends BasePage {

    private static final Logger logger =  LoggerFactory.getLogger(Tareas.class);
    static PropertyLoader propertyLoader = new PropertyLoader();
    boolean evidencia = Boolean.parseBoolean(propertyLoader.get().getProperty("evidencia"));
    public Tareas(AndroidDriver driver) { //constuctor hereda de la clase padre
        super(driver);
        //iniciar los elementos para el decorador
        PageFactory.initElements(getAfDecorator(), this);
    }


    //  TAREAS POR HACER
    @AndroidFindBy(xpath = "//*[@text='Tareas por hacer']")
    private List<AndroidElement> opcionTareasPorHacer;
    @AndroidFindBy (uiAutomator = "new UiSelector().className(\"android.widget.TextView\").text(\"Tarea Automatización Zeus\")")
    private AndroidElement selectTask;
    @AndroidFindBy (id="android:id/search_src_text")
    private  AndroidElement Searchtask;
    @AndroidFindBy(id="com.upax.zeusgeneric:id/btnNext")
    private AndroidElement btnSiguiente;


    //Pantalla de pregunta multiple
    @AndroidFindBy(className = "android.widget.CheckBox")
    private List<AndroidElement> opcionesPreguntasMultiples;
    @AndroidFindBy(id="com.upax.zeusgeneric:id/btnNext")
    private AndroidElement botonSiguientePregMult;

    //Pantalla de pregunta abierta
    @AndroidFindBy(className = "android.widget.EditText")
    private AndroidElement textoPreguntaAbierta;

    //Pantalla de pregunta con respuesta unica
    @AndroidFindBy(className = "android.widget.RadioButton")
    private List<AndroidElement> uniqueAnswerList;

    //Pantalla de video y selfie
    @AndroidFindBy(xpath = "//android.widget.LinearLayout/android.widget.ImageView")
    private List<AndroidElement> campoVideoSelfie;

    //Boton de la camara
    @AndroidFindBy(id = "com.upax.zeusgeneric:id/btnTake")
    private AndroidElement botonTomarFotoCamara;
    @AndroidFindBy(id = "com.upax.zeusgeneric:id/btnAccept")
    private AndroidElement botonConfirmarFoto;

    //Boton para seleccionar una foto
    @AndroidFindBy(id="com.android.documentsui:id/icon_thumb")
    private List<AndroidElement> filesToUpload;

    //Boton para capturar video 360
    @AndroidFindBy(id = "com.upax.zeusgeneric:id/button_capture")
    private AndroidElement recordVideoButton;
    @AndroidFindBy(id="com.upax.zeusgeneric:id/miror")
    private AndroidElement detenerGrabacion;

    @AndroidFindBy(id="com.upax.zeusgeneric:id/llBackArrow")
    private AndroidElement botonRegresar;

    //Boton para NO preguntas logicas
    @AndroidFindBy(id="com.upax.zeusgeneric:id/btnAction")
    private AndroidElement noPreguntasLogicas;

    //Botones de regreso
    @AndroidFindBy(id = "com.upax.zeusgeneric:id/iv_back")
    private AndroidElement btnRegresarPC;

    @AndroidFindBy(id = "com.upax.zeusgeneric:id/zivBDClose")
    private AndroidElement btnRegresarPE;



    public void ingresaModulo(int opc) throws IOException, InterruptedException {
        switch (opc){
            case 1 : logger.info("ZeusLog= Ingresar al módulo de Tareas por hacer");
                tomaEvidencia(evidencia, "IngresaModuloTareasPorHacer", 8000);
                driver.findElement(By.xpath("//*[@text='Tareas por hacer']")).click();

                break;
            case 2: logger.info("ZeusLog= Ingresar al módulo de Formador de equipos");
                driver.findElement(By.xpath("//*[@text='Formador de equipos']")).click();
                tomaEvidencia(evidencia, "IngresaModuloFormadorDeEquipos", 2000);
                break;
            case 3 : logger.info("ZeusLog= Ingresar al módulo de Compensacion y beneficios");
                driver.findElement(By.xpath("//*[@text='Compensación y beneficios']")).click();
                tomaEvidencia(evidencia, "IngresaModuloCompensacionYBeneficios", 2000);
                break;
            case 4 : logger.info("ZeusLog= Ingresar al módulo de Capacitación y comunicacion");
                driver.findElement(By.xpath("//*[@text='Capacitación y Comunicación']")).click();
                tomaEvidencia(evidencia, "IngresaModuloCapacitacionyComunicacion", 2000);
                break;
            case 5 : logger.info("ZeusLog= Ingresar al módulo de Mis talentos");
                driver.findElement(By.xpath("//*[@text='Mis talentos']")).click();
                tomaEvidencia(evidencia, "IngresaModuloMisTalentos", 2000);
                break;
            case 6 : logger.info("ZeusLog= Ingresar al módulo de Cliente objetivp");
                driver.findElement(By.xpath("//*[@text='Cliente Objetivo']")).click();
                tomaEvidencia(evidencia, "IngresaModuloCompensacionYBeneficios", 2000);
                break;
            case 7 : logger.info("ZeusLog= Ingresar al módulo de Indicadores");
                driver.findElement(By.xpath("//*[@text='Indicadores']")).click();
                tomaEvidencia(evidencia, "IngresaModuloIndicadores", 2000);
                break;
            case 8: logger.info("ZeusLog= Ingresar al módulo de Como me siento");
                driver.findElement(By.xpath("//*[@text='¿Cómo me siento?']")).click();
                tomaEvidencia(evidencia, "IngresaModuloComoMeSiento", 2000);
                break;
            case 9 : logger.info("ZeusLog= Ingresar al módulo de Herramientas");
                driver.findElement(By.xpath("//*[@text='Herramientas']")).click();
                tomaEvidencia(evidencia, "IngresaModuloherramientas", 2000);
                break;
            case 10 : logger.info("ZeusLog= Ingresar al módulo de Vision y Mision");
                driver.findElement(By.xpath("//*[@text='Visión y misión']")).click();
                tomaEvidencia(evidencia, "IngresaModuloCapacitacionyComunicacion", 2000);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + opc);
        }
    }


    public void ingresaTarea () throws IOException, InterruptedException {
        //driver.findElement(By.xpath("//*[@text='Tarea Automatización Zeus']")).click();
        waitVisibilityOfElement(selectTask);
        selectTask.click();
    }
    public void BuscarTarea () throws IOException, InterruptedException {
        logger.info("ZeusLog= El usuario ingresa a la Tarea");
        tomaEvidencia(evidencia,"PantallaTareasAsignadas", 10000);
        waitVisibilityOfElement(Searchtask);
        Searchtask.sendKeys("Tarea Automatización Zeus");

        //driver.findElement(By.xpath("//*[@text='Tarea Automatización Zeus']")).click();
    }

    public void usuarioVisualizaContenido() throws IOException, InterruptedException {
        tomaEvidencia(evidencia,"PantallaDocumentosAdjuntos", 15000);
        //waitVisibilityOfElements(documentoMaterial);
        //driver.findElement(By.id("com.upax.zeusgeneric:id/image_tipo_material")).click();
        //tomaScreenShot("PantallaDocumentoPDF", 3000);
        //driver.findElement(By.xpath("//*[@id='back']")).click();
        driver.findElement(By.xpath("//*[@text='Siguiente']")).click();
        tomaEvidencia(evidencia,"PantallaConfirmacionVerDocumentos", 3000);
        driver.findElement(By.xpath("//*[@text='Siguiente']")).click();
    }

    public void seleccionaPreguntasMultiples (String a1, String a2, String a3) throws IOException {
        waitVisibilityOfElement(btnSiguiente);
        tomaEvidencia(evidencia,"PantallaPreguntasMultiples");
        for(AndroidElement opciones : opcionesPreguntasMultiples){
            logger.info("ZeusLog= elemento seleccionado", opciones.getText());
            if(opciones.getText().contains(a1) || opciones.getText().contains(a2) || opciones.getText().contains(a3)){
                opciones.click();
            }
        }
        tomaEvidencia(evidencia,"PantallaPreguntasMultiplesContestadas");
        btnSiguiente.click();
    }

    public void capturaTextoAbierto (String mensaje) throws IOException {
        waitVisibilityOfElement(textoPreguntaAbierta);
        tomaEvidencia(evidencia,"PantallaTextoAbierto");
        textoPreguntaAbierta.sendKeys(mensaje);
        tomaEvidencia(evidencia,"PantallaTextoAbiertoContestado");
        btnSiguiente.click();
    }

    public void capturaRespuestaUnica (String respuestaUsuario) throws IOException {
        waitVisibilityOfElement(btnSiguiente);
        tomaEvidencia(evidencia,"PantallaRespuestaUnica");
        for (AndroidElement respuesta : uniqueAnswerList){
            if(respuesta.getText().contains(respuestaUsuario)){
                respuesta.click();
            }
        }
        tomaEvidencia(evidencia,"PantallaRespuestaUnicaContestada");
        btnSiguiente.click();
    }

    public void usuarioDescargaVideo () throws IOException, InterruptedException {
        logger.info("ZeusLog= El usuario descarga video");
        boolean valor= Boolean.parseBoolean(propertyLoader.get().getProperty("primeravezvideo"));
        if (valor) {
            campoVideoSelfie.get(0).click();
            sleep(40000);
            campoVideoSelfie.get(0).click();
        }
        else  {
            sleep(1000);
            campoVideoSelfie.get(0).click();

        }
        sleep(4000);
        driver.navigate().back();

    }

    public void usuarioTomaSelfie () throws IOException {
        logger.info("ZeusLog= El usuario toma Selfie");
        tomaEvidencia(evidencia,"PantallaVideoSelfieS");
        campoVideoSelfie.get(1).click();
        waitVisibilityOfElement(botonTomarFotoCamara);
        botonTomarFotoCamara.click();
        waitVisibilityOfElement(botonConfirmarFoto);
        logger.info(" -> Next section");
        botonConfirmarFoto.click();
        waitVisibilityOfElement(btnSiguiente);
        tomaEvidencia(evidencia,"PantallaVideoSelfieSV");
        btnSiguiente.click();
    }

    public void usuarioCargaFoto () throws IOException {
        logger.info("ZeusLog= El usuario carga una foto");
        tomaEvidencia(evidencia,"PantallaCargaImagen");
        campoVideoSelfie.get(0).click();
        filesToUpload.get(0).click();
        waitVisibilityOfElement(btnSiguiente);
        tomaEvidencia(evidencia,"PantallaCargadaImagen");
        btnSiguiente.click();
    }

    public void usuarioGrabaAudio () throws IOException, InterruptedException {
        logger.info("ZeusLog= El usuario graba un audio");
        tomaEvidencia(evidencia,"PantallaGrabaAudio");
        campoVideoSelfie.get(0).click();
        sleep(21000);
        campoVideoSelfie.get(0).click();
        tomaEvidencia(evidencia,"PantallaGraboAudio");
        waitVisibilityOfElement(btnSiguiente);
        btnSiguiente.click();
    }

    public void usuarioGrabaVideo () throws InterruptedException{
        campoVideoSelfie.get(0).click();
        waitVisibilityOfElement(recordVideoButton);
        String packageName= ((AndroidDriver) driver).getCurrentPackage();
        String grantCameraPermission= "adb shell pm grant " + packageName +" android.permission.CAMERA";
        String grantLocationPermission= "adb shell pm grant " + packageName +" android.permission.ACCESS_FINE_LOCATION";
        try {
            Runtime.getRuntime().exec(grantCameraPermission);

        } catch (IOException e) {
            e.printStackTrace();
        }
        recordVideoButton.click();
        sleep(10000);
        detenerGrabacion.click();
        recordVideoButton.click();
        waitVisibilityOfElement(btnSiguiente);
        btnSiguiente.click();
    }

    public void preguntasLogicas (char respuesta) throws IOException {
        logger.info("PantallaPreguntaLogica");
        tomaEvidencia(evidencia,"PantallaPreguntaLogica");
        if (respuesta == 'N' || respuesta == 'n') {
            logger.info("ZeusLog= El usuario selecciono NO en pregunta logica");
            uniqueAnswerList.get(1).click();
            tomaEvidencia(evidencia,"PantallaPreguntaLogicaNo");
            btnSiguiente.click();
            //waitVisibilityOfElement(noPreguntasLogicas);
            //tomaScreenShot("PantallaPreguntaLogicaNoConfirmacion");
            //noPreguntasLogicas.click();
        } else {
            logger.info("ZeusLog= El usuario selecciono SI en pregunta logica");
            tomaEvidencia(evidencia,"PantallaPreguntaLogicaSi");
            uniqueAnswerList.get(0).click();
            tomaEvidencia(evidencia,"PantallaPreguntaLogicaSi");
            btnSiguiente.click();
        }
    }

    public void seleccionaPais () throws IOException {
        waitVisibilityOfElement(btnSiguiente);
        tomaEvidencia(evidencia,"PantallaSeleccionaPais");
        for(AndroidElement pais : opcionesPreguntasMultiples){
            if(pais.getText().equalsIgnoreCase(propertyLoader.get().getProperty("Pais"))){
                pais.click();
            }
        }
        tomaEvidencia(evidencia,"PantallaSeleccionadoPais");
        btnSiguiente.click();
    }

    public void seleccionaEstado() throws IOException {
        waitVisibilityOfElement(btnSiguiente);
        tomaEvidencia(evidencia,"PantallaSeleccionaEstado");
        for(AndroidElement estado : uniqueAnswerList){
            if (estado.getText().equalsIgnoreCase(propertyLoader.get().getProperty("Estado"))){
                estado.click();
            }
        }
        tomaEvidencia(evidencia,"PantallaSeleccionadoEstado");
        btnSiguiente.click();
    }

    public void felicidadesUsuarioTermina () throws IOException {
        logger.info("ZeusLog= EL usuario termino su primera capacitacion");
        waitVisibilityOfElement(btnSiguiente);
        tomaEvidencia(evidencia,"PantallaFelicidadesFinCapacitacion");
        btnSiguiente.click();
    }

    public void usuarioConfirmaFinalizar () throws IOException, InterruptedException {
        logger.info("ZeusLog= EL usuario confirma Finalizar");
        //waitVisibilityOfElement(noPreguntasLogicas);
        //tomaEvidencia(evidencia,"PantallaConfirmaFinCapacitacion");
        //noPreguntasLogicas.click();
        //tomaEvidencia(evidencia,"PantallaConfirmaFinCapacitacion",6000);
        //driver.findElement(By.xpath("//*[@id='iv_back']")).click();
        sleep(5000);
        driver.findElement(By.xpath("//*[@text='Aceptar']")).click();
    }


    public void regresarmenuprinicpal () throws InterruptedException {
        waitVisibilityOfElement(btnRegresarPC);
        btnRegresarPC.click();
        driver.closeApp();
    }



}
