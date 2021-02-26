package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import utils.PropertyLoader;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import static java.lang.Thread.sleep;
import static java.time.Duration.ofSeconds;

public class FamiliaSocio extends BasePage {

    private static final Logger logger =  LoggerFactory.getLogger(Tareas.class);



    public FamiliaSocio (AndroidDriver driver){
        super(driver);

        //Iniciar los elementos en el decorador
        PageFactory.initElements(getAfDecorator(),this);

    }
    //Accesar Menu Familia Socios
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.TextView\").text(\"Familia socios\")")
    private AndroidElement menuFamiliaSocios;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.TextView\").text(\"Tareas por hacer\")")
    private AndroidElement menuTareasporHacer;
    @AndroidFindBy(id="android:id/search_src_text")
    private  AndroidElement Searchtask;
    @AndroidFindBy(id="com.upax.zeusgeneric:id/txtName")
    private AndroidElement selectask;
    @AndroidFindBy(id="com.upax.zeusgeneric:id/btnNext")
    private AndroidElement btnnext;

    //Pantalla para pregunta abierta
    @AndroidFindBy(className = "android.widget.EditText")
    private AndroidElement writedescription;

    //Pantalla para pregunta pregunta multiple
    @AndroidFindBy(className = "android.widget.CheckBox")
    private AndroidElement opcionpregunta;

    //Pantalla para pregunta respuesta multiple
    @AndroidFindBy(className = "android.widget.RadioButton")
    private AndroidElement opcionrespuesta;
    //Pantalla multiple
    //Audio
    @AndroidFindBy(className = "android.widget.ImageView")
    private AndroidElement cargaraudio;
    //Cargar Archivo
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[3]/android.widget.LinearLayout/android.widget.ImageView")
    private  AndroidElement cargararchivo;

    @AndroidFindBy (id="com.android.documentsui:id/dir_list")
    private AndroidElement selectlist;

    @AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[1]")
    private  AndroidElement selectDescargas;
    @AndroidFindBy (className = "android.widget.ImageView")
    private AndroidElement selectarchivoEvidencia;
    /* @AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView")
    private  AndroidElement seleccionarcarpeta;
    @AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView")
    private AndroidElement filesToUpload;*/

    //toma foto
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[4]/android.widget.LinearLayout/android.widget.ImageView")
    private AndroidElement tomafoto;
    @AndroidFindBy(id = "com.upax.zeusgeneric:id/focusView")
    private AndroidElement capturar;

    @AndroidFindBy(xpath = "[{\"key\":\"elementId\",\"value\":\"ed3a0bcf-a2a1-48d5-bff1-850b7f6fa117\",\"name\":\"elementId\"},{\"key\":\"index\",\"value\":\"1\",\"name\":\"index\"},{\"key\":\"package\",\"value\":\"com.upax.zeusgeneric\",\"name\":\"package\"},{\"key\":\"class\",\"value\":\"android.widget.ImageView\",\"name\":\"class\"},{\"key\":\"text\",\"value\":\"\",\"name\":\"text\"},{\"key\":\"checkable\",\"value\":\"false\",\"name\":\"checkable\"},{\"key\":\"checked\",\"value\":\"false\",\"name\":\"checked\"},{\"key\":\"clickable\",\"value\":\"true\",\"name\":\"clickable\"},{\"key\":\"enabled\",\"value\":\"true\",\"name\":\"enabled\"},{\"key\":\"focusable\",\"value\":\"true\",\"name\":\"focusable\"},{\"key\":\"focused\",\"value\":\"false\",\"name\":\"focused\"},{\"key\":\"long-clickable\",\"value\":\"false\",\"name\":\"long-clickable\"},{\"key\":\"password\",\"value\":\"false\",\"name\":\"password\"},{\"key\":\"scrollable\",\"value\":\"false\",\"name\":\"scrollable\"},{\"key\":\"selected\",\"value\":\"false\",\"name\":\"selected\"},{\"key\":\"bounds\",\"value\":\"[365,1705][715,1952]\",\"name\":\"bounds\"},{\"key\":\"displayed\",\"value\":\"true\",\"name\":\"displayed\"}]")
    private AndroidElement campovideoSelfie;

    // toma un video
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[3]/android.widget.LinearLayout/android.widget.ImageView")
    private AndroidElement tomavideo;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.view.View")
    private AndroidElement grabarvideo;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.view.View")
    private AndroidElement detenervideo;
    // coloca firma
    @AndroidFindBy(xpath = "[{\"key\":\"elementId\",\"value\":\"ebaece3b-1df4-4ea9-b089-38144df360f9\",\"name\":\"elementId\"},{\"key\":\"index\",\"value\":\"1\",\"name\":\"index\"},{\"key\":\"package\",\"value\":\"com.upax.zeusgeneric\",\"name\":\"package\"},{\"key\":\"class\",\"value\":\"android.widget.ImageView\",\"name\":\"class\"},{\"key\":\"text\",\"value\":\"\",\"name\":\"text\"},{\"key\":\"checkable\",\"value\":\"false\",\"name\":\"checkable\"},{\"key\":\"checked\",\"value\":\"false\",\"name\":\"checked\"},{\"key\":\"clickable\",\"value\":\"true\",\"name\":\"clickable\"},{\"key\":\"enabled\",\"value\":\"true\",\"name\":\"enabled\"},{\"key\":\"focusable\",\"value\":\"true\",\"name\":\"focusable\"},{\"key\":\"focused\",\"value\":\"false\",\"name\":\"focused\"},{\"key\":\"long-clickable\",\"value\":\"false\",\"name\":\"long-clickable\"},{\"key\":\"password\",\"value\":\"false\",\"name\":\"password\"},{\"key\":\"scrollable\",\"value\":\"false\",\"name\":\"scrollable\"},{\"key\":\"selected\",\"value\":\"false\",\"name\":\"selected\"},{\"key\":\"bounds\",\"value\":\"[365,1582][715,1932]\",\"name\":\"bounds\"},{\"key\":\"displayed\",\"value\":\"true\",\"name\":\"displayed\"}]")
    private AndroidElement Firma;
    @AndroidFindBy(xpath="com.upax.zeusgeneric:id/btnSave")
    private  AndroidElement Guardar;

    //Pantalla Finalizacion de la tarea
    @AndroidFindBy (id="com.upax.zeusgeneric:id/btnAction")
    private AndroidFindBy confirmarfinalizaciontarea;
    @AndroidFindBy(id="com.upax.zeusgeneric:id/iv_back")
    private AndroidFindBy backHome;


    public void clickSocios() throws InterruptedException{
        //waitVisibilityOfElement(menuFamiliaSocios);

        MobileElement elementToClick = (MobileElement) driver
                .findElementByAndroidUIAutomator("new UiScrollable("
                        + "new UiSelector().scrollable(true)).scrollIntoView("
                        + "new UiSelector().textContains(\"Familia socios\"));");
        elementToClick.click();


        /*if (menuTareasporHacer.isDisplayed())
            swipeScreen(Direction.UP);

        waitVisibilityOfElement(menuFamiliaSocios);
        menuFamiliaSocios.click();*/
    }



    public void BuscarTarea () throws IOException, InterruptedException {
        //logger.info("ZeusLog= El usuario ingresa a la Tarea");
        //tomaEvidencia(evidencia,"PantallaTareasAsignadas", 10000);
        sleep(1000);
        waitVisibilityOfElement(Searchtask);
        Searchtask.sendKeys("Tarea Zeus Automatizar_TesZai");
        //driver.findElement(By.xpath("//*[@text='Tarea Automatización Zeus']")).click();
    }


    public void ingresaTarea () throws IOException, InterruptedException {
        //driver.findElement(By.xpath("//*[@text='Tarea Automatización Zeus']")).click();
        waitVisibilityOfElement(selectask);
        selectask.click();
        sleep(1000);
        btnnext.click();
    }


    public void ingresadescripcion() throws InterruptedException {
        sleep(1000);
        waitVisibilityOfElement(writedescription);
        //tomaEvidencia(evidencia,"PantallaTextoAbierto");
        writedescription.sendKeys("mensaje");
        //tomaEvidencia(evidencia,"PantallaTextoAbiertoContestado");
        btnnext.click();
    }

    public void seleccionarpregunta() throws InterruptedException {
        sleep(1000);
        waitVisibilityOfElement(opcionpregunta);
        opcionpregunta.click();
        btnnext.click();
    }


    public void seleccionarespuesta() throws InterruptedException {
        sleep(1000);
        waitVisibilityOfElement(opcionrespuesta);
        opcionrespuesta.click();
        btnnext.click();

    }

    public void grabaaudio() throws InterruptedException {
        /*logger.info("ZeusLog= El usuario graba un audio");
        tomaEvidencia(evidencia, "PantallaGrabaAudio");*/
        sleep(1000);
        cargaraudio.click();
        sleep(5000);
        cargaraudio.click();
       /* tomaEvidencia(evidencia, "PantallaGraboAudio");
        waitVisibilityOfElement(btnnext);*/
        //btnnext.click();
    }

    public void cargararchivo() throws InterruptedException {
        /*logger.info("ZeusLog= El usuario carga una foto");
        tomaEvidencia(evidencia,"PantallaCargaImagen");*/
        sleep(1000);
        cargararchivo.click();
        sleep(1000);
        selectDescargas.click();
        sleep(1000);
        selectarchivoEvidencia.click();
       // waitVisibilityOfElement(btnnext);
       /* tomaEvidencia(evidencia,"PantallaCargadaImagen");*/
        //btnnext.click();
    }


    public void tomafoto() throws InterruptedException {
        /*logger.info("ZeusLog= El usuario carga una foto");
        tomaEvidencia(evidencia,"PantallaCargaImagen");*/
        sleep(1000);
        tomafoto.click();
        sleep(1000);
        capturar.click();
        sleep(1000);
       // waitVisibilityOfElement(btnnext);
        /*tomaEvidencia(evidencia,"PantallaCargadaImagen");*/
        btnnext.click();
    }

    public void tomavideo() throws InterruptedException {
        tomavideo.click();
        waitVisibilityOfElement(grabarvideo);
        String packageName= ((AndroidDriver) driver).getCurrentPackage();
        String grantCameraPermission= "adb shell pm grant " + packageName +" android.permission.CAMERA";
        String grantLocationPermission= "adb shell pm grant " + packageName +" android.permission.ACCESS_FINE_LOCATION";
        try {
            Runtime.getRuntime().exec(grantCameraPermission);

        } catch (IOException e) {
            e.printStackTrace();
        }
        grabarvideo.click();
        sleep(10000);
        detenervideo.click();
        grabarvideo.click();
        waitVisibilityOfElement(btnnext);
        btnnext.click();
    }


    public void colocartufirma() throws InterruptedException {
        sleep(1000);
        waitVisibilityOfElement(Firma);
        Firma.click();
        sleep(1000);
        waitVisibilityOfElement(Guardar);
        Guardar.click();
        btnnext.click();
        sleep(1000);
        btnnext.click();
    }

    public void finalizarcuestionario() throws InterruptedException {
        logger.info("ZeusLog= EL usuario confirma Finalizar");
        sleep(5000);
        driver.findElement(By.xpath("//*[@text='Aceptar']")).click();
    }

    }

