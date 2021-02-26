package steps;

import factory.DriverFactory;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Gafete;

public class GafeteSteps {

    AndroidDriver androidDriver = DriverFactory.getDriver();
    Gafete ps= new Gafete(androidDriver);


    @When("El usuario oprime el menu Gafete")
    public void el_usuario_oprime_el_menu_gafete() throws InterruptedException {
        ps.clickGafete();
    }

    @Then("El usuario visualice la pantalla Gafete")
    public void el_usuario_visualice_la_pantalla_gafete() throws InterruptedException {
        ps.clickcerrar();
    }


}
