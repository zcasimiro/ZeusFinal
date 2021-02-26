package pages;

import io.appium.java_client.AppiumFluentWait;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.apache.commons.io.FileUtils;
import org.aspectj.util.FileUtil;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;

import static java.lang.Thread.sleep;
import static java.time.Duration.ofSeconds;

import java.io.File;
import java.util.List;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public abstract class BasePage {

    private static final Logger logger = LoggerFactory.getLogger(BasePage.class);
    protected AndroidDriver driver; //drier movil utilizado a todas laspaginas
    private static final Duration TIMEOUT_DECORATOR = ofSeconds(60); //timepo de esper del decorador
    private AppiumFieldDecorator appiumFieldDecorator; //variable para usar las anotaciones @AndroiFinBY..


    //Constructor
    public BasePage (AndroidDriver driver){
        this.driver = driver;//inicializacin de mi variable Driver
        //Instancia de la lase AppiumFielDecorator para los decoradores
        appiumFieldDecorator = new AppiumFieldDecorator(driver,TIMEOUT_DECORATOR);
    }

    /**
     * la fucion [waitVisibilityOfElement] permite
     * esperar hasta que un eleletosea visible
     * @param androidElement (el elemnto que se va a comprobar)
     */
    protected void waitVisibilityOfElement (AndroidElement androidElement){ //
        try{
            //esperar hast que el elemento sea visible
            getWait().until(ExpectedConditions.visibilityOf(androidElement));
        }catch (TimeoutException e){
            e.printStackTrace();//lanza el error sino es visible
        }
    }


    protected FluentWait<AndroidDriver> getWait() {
        return new AppiumFluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(180))//Cuanto tiempo va a esperar al elemento
                .pollingEvery(Duration.ofMillis(250)) //cada cuanto tiempo va a volver a intentarlo
                .ignoring(NoSuchElementException.class) // si no lo encuentra manda error
                .ignoring(ElementNotVisibleException.class); // si no es visible manda error
    }

    /**
     * Devuelv la instancia del decorador para poder
     * usar los decotradores del driver android
     * @return AppiumFieldDecorator
     */

    protected  AppiumFieldDecorator getAfDecorator() {
        return appiumFieldDecorator;

    }

    protected void tomaEvidencia(boolean func, String proceso) throws IOException {
        if (func) {
            Date date = new Date();
            DateFormat hourFormat = new SimpleDateFormat("HH-mm-ss_");
            DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy_");
            File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(srcFile, new File("target/Capturas/" + dateFormat.format(date) + hourFormat.format(date) + proceso +".jpg"));
        }

    }

    protected void tomaEvidencia(boolean func, String proceso, int milisegundos) throws IOException, InterruptedException {
        sleep(milisegundos);
        if (func) {
            Date date = new Date();
            DateFormat hourFormat = new SimpleDateFormat("HH-mm-ss_");
            DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy_");
            File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(srcFile, new File("target/Capturas/" + dateFormat.format(date) + hourFormat.format(date) + proceso +".jpg"));

        }

    }
    public enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT;
    }

    /**
     * Performs swipe from the center of screen
     *
     * @param dir the direction of swipe
     * @version java-client: 7.3.0
     **/
    public void swipeScreen(Direction dir) {
        System.out.println("swipeScreen(): dir: '" + dir + "'"); // always log your actions

        // Animation default time:
        //  - Android: 300 ms
        //  - iOS: 200 ms
        // final value depends on your app and could be greater
        final int ANIMATION_TIME = 200; // ms

        final int PRESS_TIME = 200; // ms

        int edgeBorder = 10; // better avoid edges
        PointOption pointOptionStart, pointOptionEnd;

        // init screen variables
        Dimension dims = driver.manage().window().getSize();

        // init start point = center of screen
        pointOptionStart = PointOption.point(dims.width / 2, dims.height / 2);

        switch (dir) {
            case DOWN: // center of footer
                pointOptionEnd = PointOption.point(dims.width / 2, dims.height - edgeBorder);
                break;
            case UP: // center of header
                pointOptionEnd = PointOption.point(dims.width / 2, edgeBorder);
                break;
            case LEFT: // center of left side
                pointOptionEnd = PointOption.point(edgeBorder, dims.height / 2);
                break;
            case RIGHT: // center of right side
                pointOptionEnd = PointOption.point(dims.width - edgeBorder, dims.height / 2);
                break;
            default:
                throw new IllegalArgumentException("swipeScreen(): dir: '" + dir + "' NOT supported");
        }

        // execute swipe using TouchAction
        try {
            new TouchAction(driver)
                    .press(pointOptionStart)
                    // a bit more reliable when we add small wait
                    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(PRESS_TIME)))
                    .moveTo(pointOptionEnd)
                    .release().perform();
        } catch (Exception e) {
            System.err.println("swipeScreen(): TouchAction FAILED\n" + e.getMessage());
            return;
        }

        // always allow swipe action to complete
        try {
            Thread.sleep(ANIMATION_TIME);
        } catch (InterruptedException e) {
            // ignore
        }
    }


        }



