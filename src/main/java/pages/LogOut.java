package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOut extends BasePage{

    public LogOut(AndroidDriver driver) {
        super(driver);
        PageFactory.initElements(getAfDecorator(),this);
    }

    @AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.support.v7.app.ActionBar.Tab[3]/android.widget.ImageView")
    private AndroidElement menuTab;
    @AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[5]/android.widget.LinearLayout")
    private AndroidElement closeSession;
    @AndroidFindBy(id="com.upax.zeusgeneric:id/btnAction")
    private AndroidElement acceptButton;

    public void logout () {
        goToCloseWindow();
        clickCloseSession();
        clickAccept();
    }

    public void goToCloseWindow () {
        waitVisibilityOfElement(menuTab);
        menuTab.click();
    }

    public void clickCloseSession () {
        waitVisibilityOfElement(closeSession);
        closeSession.click();
    }

    public void clickAccept () {
        waitVisibilityOfElement(acceptButton);
        acceptButton.click();
    }

}
