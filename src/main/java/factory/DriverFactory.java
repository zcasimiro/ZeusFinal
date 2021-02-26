

package factory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import utils.PropertyLoader;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class DriverFactory {

    static PropertyLoader pl = new PropertyLoader();

    private static final ThreadLocal<AndroidDriver<AndroidElement>> driverManager = new ThreadLocal<>();
    private static final ThreadLocal<AppiumDriverLocalService> serviceManager = new ThreadLocal<>();

    private static AndroidDriver<AndroidElement> driver;
    private static AppiumDriverLocalService service;
    private static final Logger logger = LoggerFactory.getLogger(DriverFactory.class);

    public static void startServer () {
        AppiumServiceBuilder builder;//declaramos la variable builder
        logger.info(" --> Creating Appium service");
        builder = new AppiumServiceBuilder()//builder = es una variable que guarda una instancia de AppiumServiceBuilder
                .withCapabilities(createAppiumCapabilities())//llama el metodo withCapabilites
                //.usingAnyFreePort()//llama otro metodo usar cualquier puerto libre
                .withArgument(GeneralServerFlag.LOG_LEVEL,pl.get().getProperty("logLevel"));

        service = builder.build();//se arma el builder y se construye con el método build y se guarda en la variable service
        service.start();//se llama el metodo start de la variable service para iniciar el servidor
        logger.info(" --> Appium service created");
    }

    public static void stopServer () {
        service.stop();
        logger.info(" --> Appium service stopped");
    }

    public static AndroidDriver<AndroidElement> getDriver () {
        driver = new AndroidDriver<>(service, createCapabilities());
        driverManager.set(driver);
        serviceManager.set(service);
        //driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        return driver;
    }


    private static DesiredCapabilities createAppiumCapabilities(){
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability ("appPackage",pl.get().getProperty("appPackage"));
        desiredCapabilities.setCapability("appActivity",pl.get().getProperty("appActivity"));
        desiredCapabilities.setCapability("automationName",pl.get().getProperty("automationName"));
        desiredCapabilities.setCapability("platformName",pl.get().getProperty("platformName"));
        //desiredCapabilities.setCapability(MobileCapabilityType.APP, "C:\\Users\\Branchbit\\IdeaProjects\\zeus.apk");//instala el apk
        desiredCapabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 0);
        desiredCapabilities.setCapability(MobileCapabilityType.NO_RESET, Boolean.TRUE);
        //desiredCapabilities.setCapability(MobileCapabilityType.FULL_RESET, Boolean.FALSE);
        desiredCapabilities.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS, Boolean.TRUE);
        return desiredCapabilities;
    }

    private static DesiredCapabilities createCapabilities(){
        DesiredCapabilities capabilities = new DesiredCapabilities();
        return capabilities;
    }

    protected void tomaScreenShot(String proceso) throws IOException {
        Date date = new Date();
        DateFormat hourFormat = new SimpleDateFormat("HH-mm-ss_");
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy_");
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile,new File("target/Capturas/" + dateFormat.format(date) + hourFormat.format(date) + proceso + ".jpg"));
    }

}
