package pages;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.PageFactory;

import static java.lang.Thread.sleep;

public class SalinasGroup extends BasePage {

    public SalinasGroup(AndroidDriver driver) {
        super(driver);

        //iniciar los elementos para el decorador
        PageFactory.initElements(getAfDecorator(),this);
    }

    @AndroidFindBy(xpath = "//*[@text='Grupo Salinas']")
    private AndroidElement gridMenu;
   // @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v4.view.ViewPager/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[8]/android.view.ViewGroup/android.widget.TextView")
   @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.TextView\").text(\"Grupo Salinas\")")
    private AndroidElement menuSalinasGroup;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.TextView\").text(\"Tareas por hacer\")")
    private AndroidElement menuTareasporHacer;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.ImageView")
    private AndroidElement backbuttonFuntions;


    public void clickMenuSalinasGroup () throws InterruptedException {
        /*TouchAction ta = new TouchAction(driver);
        ta.press(PointOption.point(530, 1152));
        ta.moveTo(PointOption.point(530, 1160));
        ta.release();
        ta.perform();*/
        //Thread.sleep(3000);
        if (menuTareasporHacer.isDisplayed())
        swipeScreen(Direction.UP);

        waitVisibilityOfElement(menuSalinasGroup);
        menuSalinasGroup.click();
    }
    public void clickbackbuttonFuntions() throws InterruptedException {
       // waitVisibilityOfElement(backbuttonFuntions);
        sleep(4000);
        backbuttonFuntions.click();
        //driver.findElement(By.xpath("//*[@id='imgViewBack']")).click();
        driver.closeApp();

    }
}
