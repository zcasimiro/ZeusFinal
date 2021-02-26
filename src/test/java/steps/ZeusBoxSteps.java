package steps;

import factory.DriverFactory;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BasePage;
import pages.ZeusBox;

public class ZeusBoxSteps {

    AndroidDriver androidDriver = DriverFactory.getDriver();
    ZeusBox zb=new ZeusBox(androidDriver);


    @When("El usuario oprime ZeusBox")
    public void el_usuario_oprime_zeus_box() throws InterruptedException {
    zb.clickmenuZeusBox();
    }

    @Then("El usuario selecciona icono en modo cuadrillas")
    public void el_usuario_selecciona_icono_en_modo_cuadrillas() throws InterruptedException {
    zb.clickmodocuadrillas();

    }

    @Then("El usuario selecciona el icono modo lista")
    public void el_usuario_selecciona_el_icono_modo_lista() throws InterruptedException {
    zb.clickmodolista();
    }

    @Then("El usuario selecciona ordenar por Nombre A-Z")
    public void el_usuario_selecciona_ordenar_por_nombre_a_z() throws InterruptedException {
    zb.clickordenarpornombre();
    }

    @Then("El usuario ingresa a la carpeta")
    public void el_usuario_ingresa_a_la_carpeta() throws InterruptedException {
    zb.clickingresaralacarpeta();
    }

    @Then("El usuario selecciona el archivo")
    public void el_usuario_selecciona_el_archivo() throws InterruptedException {
    zb.clickarchivo();
    }

    @Then("El usuario selecciona el boton regresar del visualizador")
    public void el_usuario_selecciona_el_boton_regresar_del_visualizador() throws InterruptedException {
    zb.clickbackvisualizador();
    }

    @Then("El usuario ingresa a la fecha de retroceso de Zeus Box")
    public void el_usuario_ingresa_a_la_fecha_de_retroceso_de_zeus_box() throws InterruptedException {
    zb.clickregresarZeusBox();
    }

    @Then("El usuario ingresa al boton regresar del Home Principal")
    public void el_usuario_ingresa_al_boton_regresar_del_home_principal() throws InterruptedException {
    zb.clickregresamenuprincipal();
    }




}
