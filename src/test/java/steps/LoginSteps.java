package steps;

import factory.DriverFactory;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.slf4j.LoggerFactory;
import pages.Login;
import utils.PropertyLoader;

import java.io.IOException;
import java.util.logging.Logger;
import utils.PropertyLoader;

import static java.lang.Thread.sleep;

public class LoginSteps {

    static PropertyLoader pl = new PropertyLoader();
    Login login;
    AndroidDriver androidDriver;
    //private static final Logger logger = (Logger) LoggerFactory.getLogger(LoginSteps.class);ç

    @Before
    @Given("Iniciar el servidor")
    public void iniciar_servidor () {
        DriverFactory.startServer();
    }

    //@Before(order=1)
    @Given("El usuario tenga sus credenciales vigentes")
    public void el_usuario_tenga_sus_credenciales_vigentes() throws InterruptedException {
        String limpiarDatos = "adb shell pm clear com.upax.zeusgeneric";
        try {
            Runtime.getRuntime().exec(limpiarDatos);
            sleep (30000);
            //logger.info("ZeusLog= Se eliminaron datos cache de la aplicacion");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //@Before(order=2)
    @When("El usuario ejecute la aplicacion en su dispositivo")
    public void el_usuario_ejecute_la_aplicacion_en_su_dispositivo() {
        androidDriver = DriverFactory.getDriver();
        login = new Login(androidDriver);
    }

    //@Before(order=3)
    @Then("El usuario captura el numero del empleado")
    public void el_usuario_captura_el_numero_del_empleado() {
        login.doLogin(pl.get().getProperty("noEmpleado"));
        //tomaScreenShot("Capturanumeroempleado");
    }

    //@Before(order=4)
    @Then("El usuario da clic en continuar en la pantalla empleado")
    public void el_usuario_da_clic_en_continuar_en_la_pantalla_empleado() {
        login.continueFirstScreen();
    }

    //@Before(order=5)
    @Then("El usuario ingresa el password")
    public void el_usuario_ingresa_el_password() {
        login.putPassword(pl.get().getProperty("userPassword"));
    }

    //@Before(order=6)
    @Then("El usuario da clic en continuar en la pantalla password")
    public void el_usuario_da_clic_en_continuar_en_la_pantalla_password() {
        login.continueSecondScreen();
    }

    //@Before(order=7)
    @Then("El usuario captura el numero de celular")
    public void el_usuario_captura_el_numero_de_celular() {
        login.putCellphoneNumber(pl.get().getProperty("noTelefono"));
    }

    //@Before(order=8)
    @Then("El usuario da clic en continuar en la pantalla numero de celular")
    public void el_usuario_da_clic_en_continuar_en_la_pantalla_numero_de_celular() {
        login.continueThirdScreen();
    }

    //@Before(order=9)
    @Then("El usuario captura el numero de activacion")
    public void el_usuario_captura_el_numero_de_activacion() throws InterruptedException, IOException {
        login.putActivationNumber(pl.get().getProperty("noCodigo"));
    }

    //@Before(order=10)
    @Then("El usuario da clic en continuar en la pantalla numero de activacion")
    public void el_usuario_da_clic_en_continuar_en_la_pantalla_numero_de_activacion() {
        login.continueFourthScreen();
    }

    //mision y vision

    //@After(order=2)
    @Then("Se cierra sesión exitosamente")
    public void Se_cierra_sesión_exitosamente () {
        //cerrar sesion
    }

    //@After(order=1)
    @Then("desinstala el app")
    public void desinstala_el_app () throws InterruptedException {
        sleep(15000);
        if (androidDriver != null) {
            androidDriver.removeApp(pl.get().getProperty("appPackage"));
            androidDriver.quit();
        }
    }

    @And("el usuario cierra la sesion")
    public void elUsuarioCierraLaSesion() throws IOException, InterruptedException {
    login.cierraSesion();
    }

    @And("El usuario valida el acceso a la aplicación")
    public void elUsuarioValidaElAccesoALaAplicación() throws IOException, InterruptedException {
        login.validapantallaprincipal();
    }

    @After
    @Then("stop server")
    public void stop_server () {
        DriverFactory.stopServer();
    }
}