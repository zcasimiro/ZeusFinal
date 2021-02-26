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

import static java.lang.Thread.sleep;

public class Login extends  BasePage {

    private static final Logger logger =  LoggerFactory.getLogger(Tareas.class);
    static PropertyLoader propertyLoader = new PropertyLoader();
    boolean evidencia = Boolean.parseBoolean(propertyLoader.get().getProperty("tomaevidencia"));



    public Login(AndroidDriver driver) { //constuctor hereda de la clase padre
        super(driver);
        //iniciar los elementos para el decorador
        PageFactory.initElements(getAfDecorator(),this);
    }
    //all selectores for login page
    @AndroidFindBy(id="com.upax.zeusgeneric:id/userId")
    private AndroidElement userTextField;
    @AndroidFindBy(id="com.upax.zeusgeneric:id/tv_continue")//seleccionamos el boton
    private AndroidElement userButton; //y lo guarda en la variable userButton
    @AndroidFindBy(id="com.upax.zeusgeneric:id/password")
    private AndroidElement userPasswordTextField;
    @AndroidFindBy(id="com.upax.zeusgeneric:id/tv_log_in")
    private AndroidElement buttonPassword;
    @AndroidFindBy(id="com.upax.zeusgeneric:id/et_phone_number")
    private AndroidElement userPhoneTextField;
    @AndroidFindBy(id="com.upax.zeusgeneric:id/btn_send")
    /*private AndroidElement Accesstocalls;
    @AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Button")
    private AndroidElement AllowCalls;
    @AndroidFindBy(id="com.android.permissioncontroller:id/permission_allow_button")*/
    private AndroidElement buttonPhone;
    @AndroidFindBy(id="com.upax.zeusgeneric:id/et_code")
    private AndroidElement userActivationCode;
    @AndroidFindBy(id="com.upax.zeusgeneric:id/btn_next")
    private AndroidElement buttonActivationCode;
    @AndroidFindBy(id = "com.upax.zeusgeneric:id/ZFragmentConfiguration")
    private AndroidElement btnConfiguraciones;
    @AndroidFindBy(id="com.upax.zeusgeneric:id/tvHelloUser")
    private AndroidElement nombreUsuario;



    public void doLogin (String numEmploy){
        waitVisibilityOfElement(userTextField);
        //userTextField.clear();
        userTextField.sendKeys(numEmploy);
    }

    public void continueFirstScreen () {
        userButton.click();
    }

    public void putPassword (String numPassword){
        waitVisibilityOfElement(userPasswordTextField);
        userPasswordTextField.sendKeys(numPassword);
    }

    public void continueSecondScreen () {
        buttonPassword.click();
    }

    public void putCellphoneNumber (String phoneNumber){
        waitVisibilityOfElement(userPhoneTextField);
        userPhoneTextField.sendKeys(phoneNumber);
    }

    public void continueThirdScreen(){
        buttonPhone.click();
    }


    public  void putActivationNumber (String activationCode) throws InterruptedException, IOException {

      /*  waitVisibilityOfElement(userActivationCode);
        userActivationCode.sendKeys(activationCode);
        sleep(70000);  */

        logger.info("ZeusLog= Pantalla para capturar el codigo de activacion");
        boolean valor = Boolean.parseBoolean(propertyLoader.get().getProperty("codigoActivacionFijo"));
        if(!valor) {
            waitVisibilityOfElement(userActivationCode);
            tomaEvidencia(evidencia,"PantallaCodigoActivacion");
            tomaEvidencia(evidencia,"PantallaCodigoActivacionCapturado", 45000);
        } else {
            waitVisibilityOfElement(userActivationCode);
            tomaEvidencia(evidencia,"PantallaCodigoActivacion");
            userActivationCode.sendKeys(activationCode);
            tomaEvidencia(evidencia,"PantallaCodigoActivacionCapturado");
        }

    }

    public void continueFourthScreen(){
        buttonActivationCode.click();
    }




    public void cierraSesion () throws IOException, InterruptedException {
        //waitingVisibilityOfElement(btnConfiguraciones);
        btnConfiguraciones.click();
        sleep(4000);
        MobileElement elementToClick = (MobileElement) driver
                .findElementByAndroidUIAutomator("new UiScrollable("
                        + "new UiSelector().scrollable(true)).scrollIntoView("
                        + "new UiSelector().textContains(\"Cerrar sesión\"));");
        elementToClick.click();
        sleep(6000);
        driver.findElement(By.xpath("//*[@text='Cerrar sesión']")).click();
        sleep(3000);
        driver.findElement(By.xpath("//*[@text='Aceptar']")).click();
        sleep(3000);
        driver.closeApp();
    }

    public void validapantallaprincipal () throws IOException, InterruptedException {
        logger.info("ZeusLog= Validar la pantalla principal");
        waitVisibilityOfElement(nombreUsuario);
        tomaEvidencia(evidencia,"ValidaAcceso", 2000);
    }



}








