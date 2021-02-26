package pages;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.PageFactory;

public class FunctionsAndNoFunctions extends BasePage {


    public FunctionsAndNoFunctions(AndroidDriver driver) {
        super(driver);

        //iniciar los elementos para el decorador
        PageFactory.initElements(getAfDecorator(),this);
    }
    @AndroidFindBy (uiAutomator = "new UiSelector().className(\"android.widget.TextView\").text(\"Funciones y no funciones\")")
    private AndroidElement menuFunctionsandNoFuntions;
    @AndroidFindBy (id = "com.upax.zeusgeneric:id/zIvToolbarLogo")
    private AndroidElement homeLogo;
    @AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]/android.view.ViewGroup/android.widget.TextView")
    private AndroidElement menuFuntions;
    @AndroidFindBy (xpath="//android.widget.ImageButton[@content-desc=\"Navegar hacia arriba\"]")
    private AndroidElement backbuttonFuntions;
    @AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android.view.ViewGroup/android.widget.TextView")
    private AndroidElement menuNoFunctions;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.TextView\").text(\"Tareas por hacer\")")
    private AndroidElement menuTareasporHacer;


    public void clickMenuFuntionsandnoFunctions () {
        waitVisibilityOfElement(homeLogo);
        MobileElement elementToClick = (MobileElement) driver
                .findElementByAndroidUIAutomator("new UiScrollable("
                        + "new UiSelector().scrollable(true)).scrollIntoView("
                        + "new UiSelector().textContains(\"Funciones y no funciones\"));");
        elementToClick.click();
    }

    public void clickmenuFuntions(){
        waitVisibilityOfElement(menuFuntions);
        menuFuntions.click();
    }

    public void clickbackbuttonFuntions(){
        waitVisibilityOfElement(backbuttonFuntions);
        backbuttonFuntions.click();
        driver.navigate().back();
    }
    public void clickNoFunctions(){
        waitVisibilityOfElement(menuNoFunctions);
        menuNoFunctions.click();
    }
}
