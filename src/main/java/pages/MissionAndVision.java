package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

import static java.lang.Thread.sleep;
import static pages.Login.propertyLoader;

public class MissionAndVision extends BasePage {

    boolean evidencia = Boolean.parseBoolean(propertyLoader.get().getProperty("tomaevidencia"));
    public MissionAndVision (AndroidDriver driver){
        super(driver);

        //iniciar los elementos para el decorador
        PageFactory.initElements(getAfDecorator(),this);
    }

    @AndroidFindBy (xpath = "//*[@text='Visión y misión']")
    private AndroidElement menuVisionAndVision;
    @AndroidFindBy (id = "com.upax.zeusgeneric:id/zIvToolbarLogo")
    private AndroidElement homeLogo;
    @AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView[2]")
    private AndroidElement opcSegundaV;
    @AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView[3]")
    private AndroidElement clicktercerslideV;
    @AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView[2]")
    private AndroidElement opcSegundaM;
    @AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView[3]")
    private AndroidElement opcTerceraM;
    @AndroidFindBy (id = "com.upax.zeusgeneric:id/zpliv_view")
    private AndroidElement playvideo;
    //@AndroidFindBy (xpath="//android.widget.ImageButton[@content-desc=\"Navegar hacia arriba\"]")
    //private AndroidElement backButton;
    //@AndroidFindBy(id = "com.upax.zeusgeneric:id/zplimgBackMision")
    //private AndroidElement btnRegresarVD;
    @AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.ImageView")
    private AndroidElement btnRegresarMV;
    @AndroidFindBy(id = "com.upax.zeusgeneric:id/ZFragmentConfiguration")
    private AndroidElement btnConfiguraciones;



    public void regresarMenuMV() throws IOException, InterruptedException {
        //waitVisibilityOfElement(btnRegresarMV);
        //tomaEvidencia(evidencia, "RegresarPantallaPrincipal", 10000);
        tomaEvidencia(evidencia, "RegresarPantallaPrincipal", 2000);
        btnRegresarMV.click();
        //driver.navigate().back();
    }

    public void clickMenuMissionAndVision() throws InterruptedException, IOException {
        waitVisibilityOfElement(homeLogo);
        tomaEvidencia(evidencia, "RegresarPantallaPrincipal", 5000);
        MobileElement elementToClick = (MobileElement) driver
                .findElementByAndroidUIAutomator("new UiScrollable("
                        + "new UiSelector().scrollable(true)).scrollIntoView("
                        + "new UiSelector().textContains(\"Visión y misión\"));");
        elementToClick.click();
    }

    /*
    public void clickTercerSlide(){
        waitVisibilityOfElement(clicktercerslideV);
        clicktercerslideV.click();
    }

    public void clickplayvideo() throws InterruptedException {
        waitVisibilityOfElement(playvideo);
        playvideo.click();
        sleep(4000);
        driver.navigate().back();
    }

    /*public void back () {
        driver.navigate().back();
    }

    public void clickregresarmenuprinicipal (){
        waitVisibilityOfElement(btnRegresarMV);
        btnRegresarMV.click();
        //driver.closeApp();

        MobileElement elementToClick = (MobileElement) driver
                .findElementByAndroidUIAutomator("new UiScrollable("
                        + "new UiSelector().scrollable(true)).scrollIntoView("
                        + "new UiSelector().textContains(\"Cerrar sesión\"));");
        elementToClick.click();

    }
*/

    public void reproduceVideo (char opc)throws IOException, InterruptedException {
        if (opc == 'V') { // Reproduccion del video de Vision
            tomaEvidencia(evidencia, "PantallaVision", 2000);
            opcSegundaV.click();
            clicktercerslideV.click();
            tomaEvidencia(evidencia,"PantallaVisionVideo", 2000);
            playvideo.click();
            sleep(10000);
            tomaEvidencia(evidencia,"ReproduccionVideoVision", 10000);
            driver.navigate().back();
        } else {  // Reproduccion del video de Mision
            MobileElement elementToClick = (MobileElement) driver
                    .findElementByAndroidUIAutomator("new UiScrollable("
                            + "new UiSelector().scrollable(true)).scrollIntoView("
                            + "new UiSelector().textContains(\"Nuestra Misión\"));");
            elementToClick.click();
            tomaEvidencia(evidencia, "PantallaMision", 2000);
            opcSegundaM.click();
            opcTerceraM.click();
            tomaEvidencia(evidencia,"PantallaMisionVideo", 2000);
            playvideo.click();
            sleep(10000);
            tomaEvidencia(evidencia,"ReproduccionVideoMision", 10000);
            driver.navigate().back();
        }
    }

    public void cierraSesionMV () throws IOException, InterruptedException {
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

}
