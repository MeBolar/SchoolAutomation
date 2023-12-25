package school.bright.generic;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import io.github.ashwith.flutter.FlutterElement;
import io.github.ashwith.flutter.FlutterFinder;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.HashMap;
import java.util.Set;

public class Base {
    public static long wait=60;
    public static AppiumDriver appiumDriver;
 //   public static
 static Dimension size;

    private static MutableCapabilities capabilities;

    public static void clickOnButtonViaKey(String key){
        FlutterFinder finder= new FlutterFinder(appiumDriver);
        FlutterElement element=finder.byValueKey(key);
        element.click();
    }

    public static void clickOnButtonViaText(String text){
        FlutterFinder finder= new FlutterFinder(appiumDriver);
        FlutterElement element= finder.byText(text);
        element.click();
    }

    public static void enterValueViaKey(String key, String value){
        FlutterFinder finder= new FlutterFinder(appiumDriver);
        FlutterElement element=finder.byValueKey(key);
        element.click();
        element.sendKeys(value);
    }

    public static void waitForAnElementViaKey(String key){
        FlutterFinder finder= new FlutterFinder(appiumDriver);
        FlutterElement element=finder.byValueKey(key);
        WebDriverWait wwait= new WebDriverWait(appiumDriver,wait);
        wwait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void clickOnButtonViaToolTip(String key){
        FlutterFinder finder=new FlutterFinder(appiumDriver);
        FlutterElement element=finder.byToolTip(key);
        element.click();
    }

    public static void horizontalScroll(){
        size=appiumDriver.manage().window().getSize();
        int x_start=(int)(size.width*0.60);
        int x_end=(int)(size.width*0.30);
        int y=130;

    }

    public static void enterText(String text){
        appiumDriver.getKeyboard().sendKeys(text);
    }

    public static void getListByKey(String key){

        FlutterFinder finder= new FlutterFinder(appiumDriver);


        FlutterElement element=finder.byValueKey(key);

        element.click();

    }

    public static AppiumDriver waitForMobileElement(WebElement element){
        WebDriverWait appiumDriverWait= new WebDriverWait(appiumDriver,60);
        appiumDriverWait.until(ExpectedConditions.elementToBeClickable(element));
        return appiumDriver;
    }

    public static AppiumDriver waitFor10sec(WebElement element){
        WebDriverWait appiumDriverWait= new WebDriverWait(appiumDriver,10);
        appiumDriverWait.until(ExpectedConditions.elementToBeClickable(element));
        return appiumDriver;
    }

    public static void scrollDown(){
        //The viewing size of the device
        Dimension size = appiumDriver.manage().window().getSize();

        //Starting y location set to 80% of the height (near bottom)
        int starty = (int) (size.height * 0.80);
        //Ending y location set to 20% of the height (near top)
        int endy = (int) (size.height * 0.20);
        //x position set to mid-screen horizontally
        int startx = (int) size.width / 2;
        TouchAction touchAction = new TouchAction(appiumDriver);

        touchAction.longPress(PointOption.point(startx, starty))
                .moveTo(PointOption.point(startx, endy))
                .release()
                .perform();
    }
    public void scrollUsingTouchActions_ByElements(WebElement startElement, WebElement endElement) {
        TouchAction actions = new TouchAction(appiumDriver);

    }

    public static AppiumDriver switchContext(String context) {
        appiumDriver.getContext();
        Set<String> con = appiumDriver.getContextHandles();
        for (String c : con) {
            if (c.contains(context)) {
                appiumDriver.context(c);
                break;
            }
        }
        return appiumDriver;
    }


}
