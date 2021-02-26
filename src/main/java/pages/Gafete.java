package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.PageFactory;

import static java.lang.Thread.sleep;

public class Gafete extends BasePage{

    public Gafete (AndroidDriver driver){
        super(driver);

        //Iniciar los elementos para el decorador
        PageFactory.initElements(getAfDecorator(),this);
    }

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.LinearLayout[2]/android.widget.TextView[1]")
    private AndroidElement gafete;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ImageButton")
    private AndroidElement close;

    public void clickGafete () throws InterruptedException{
        waitVisibilityOfElement(gafete);
        gafete.click();
    }
    public void clickcerrar () throws InterruptedException{
        sleep(1000);
        waitVisibilityOfElement(close);
        close.click();
    }
}
