package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.PageFactory;

public class Values extends BasePage {


    public Values(AndroidDriver driver) {
        super(driver);

        //iniciar los elementos para el decorador
        PageFactory.initElements(getAfDecorator(),this);
    }


    @AndroidFindBy(xpath = "//*[@text='Valores']")
    private AndroidElement menuValores;
    @AndroidFindBy (id = "com.upax.zeusgeneric:id/zIvToolbarLogo")
    private AndroidElement homeLogo;
    @AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.ImageView")
    private AndroidElement backButton;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.TextView\").text(\"Tareas por hacer\")")
    private AndroidElement menuTareasporHacer;


    public void clickMenuValores () {
        waitVisibilityOfElement(homeLogo);
        MobileElement elementToClick = (MobileElement) driver
                .findElementByAndroidUIAutomator("new UiScrollable("
                        + "new UiSelector().scrollable(true)).scrollIntoView("
                        + "new UiSelector().textContains(\"Valores\"));");
        elementToClick.click();
    }



    public void viewValuesScreen () {
        waitVisibilityOfElement(backButton);
        backButton.click();
        driver.closeApp();
    }

   /* public void recorreImagenesValores() throws IOException, InterruptedException {
        tomaEvidencia(evidencia, "PantallaPrincipalValores", 3000);
        segundaOpcionValores.click();
        tomaEvidencia(evidencia, "PantallaPrincipalValoresSegundaOpc", 3000);
        terceraOpcionValores.click();
    }

    public void regresaMenuValores () throws IOException, InterruptedException {
        tomaEvidencia(evidencia, "PantallaPrincipalValoresTerceraOpc", 3000);
        optRegresarValores.click();
        tomaEvidencia(evidencia, "RegresaMenuPrincipalDesdeValores", 3000);
    }

   */

}
