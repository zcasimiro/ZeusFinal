package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.PageFactory;

import static java.lang.Thread.sleep;

public class ZeusBox extends BasePage{

    public ZeusBox (AndroidDriver driver){
        super(driver);


        //Inicar los elementos en el decorador
        PageFactory.initElements(getAfDecorator(),this);
    }

    @AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[3]/android.view.ViewGroup/android.widget.TextView")
    private AndroidElement menuZeusBox;
    @AndroidFindBy (id = "com.upax.zeusgeneric:id/zIvToolbarLogo")
    private AndroidElement homeLogo;
    @AndroidFindBy (id="com.upax.zeusgeneric:id/main_toggle_btn")
    private AndroidElement modoCuadrillas;
    @AndroidFindBy (id="com.upax.zeusgeneric:id/tv_sort_label")
    private AndroidElement modolista;
    @AndroidFindBy (id="com.upax.zeusgeneric:id/tv_sort_name_asc")
    private AndroidElement ordenaralfabeticamente;
    @AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.ImageView")
    private AndroidElement carpeta;
    @AndroidFindBy(id = "com.upax.zeusgeneric:id/item_clickable")
    private AndroidElement archivo;
    @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Navegar hacia arriba\"]")
    private AndroidElement backVisualizador;
    @AndroidFindBy (xpath = "//android.widget.ImageButton[@content-desc=\"Navegar hacia arriba\"]")
    private AndroidElement backZeusBox;
    @AndroidFindBy (xpath = "//android.widget.ImageButton[@content-desc=\"Navegar hacia arriba\"]")
    private AndroidElement backHomePrincipal;
    /*@AndroidFindBy(uiAutomator = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView[2]")
    private AndroidElement menuTareasporHacer;*/


    public void clickmenuZeusBox () throws InterruptedException{
        //waitVisibilityOfElement(menuZeusBox);
        MobileElement elementToClick = (MobileElement) driver
                .findElementByAndroidUIAutomator("new UiScrollable("
                        + "new UiSelector().scrollable(true)).scrollIntoView("
                        + "new UiSelector().textContains(\"ZeusBox\"));");
        elementToClick.click();

    }
    public void clickmodocuadrillas () throws InterruptedException{
        sleep(1000);
        waitVisibilityOfElement(modoCuadrillas);
        modoCuadrillas.click();
    }
    public void clickmodolista () throws InterruptedException{
        sleep(1000);
        waitVisibilityOfElement(modolista);
        modolista.click();
    }

    public void clickordenarpornombre () throws InterruptedException{
        sleep(1000);
        waitVisibilityOfElement(ordenaralfabeticamente);
        ordenaralfabeticamente.click();
    }


    public void clickingresaralacarpeta() throws InterruptedException{
        sleep(1000);
        waitVisibilityOfElement(carpeta);
        carpeta.click();
    }

    public void clickarchivo() throws InterruptedException {
        sleep(1000);
        waitVisibilityOfElement(archivo);
        archivo.click();

    }


    public void clickbackvisualizador() throws InterruptedException {
        sleep(1000);
        waitVisibilityOfElement(backVisualizador);
        backVisualizador.click();
    }


    public void clickregresarZeusBox() throws InterruptedException {
        sleep(1000);
        waitVisibilityOfElement(backZeusBox);
        backZeusBox.click();
    }

    public void clickregresamenuprincipal() throws InterruptedException {
        sleep(1000);
        waitVisibilityOfElement(backHomePrincipal);
        backHomePrincipal.click();
    }



}
