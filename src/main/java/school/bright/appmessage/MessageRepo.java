package school.bright.appmessage;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import school.bright.generic.ObjectBase;

import java.util.List;

public class MessageRepo extends ObjectBase {
    public MessageRepo(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }
    @FindBy(xpath = "//android.widget.TextView[@text='Message']")
    public static WebElement message;

    @FindBy(xpath = "//android.widget.TextView[@text='Response']")
    public static WebElement response;

    @FindBy(xpath = "//android.widget.TextView[@text='System']")
    public static WebElement system;

    @FindBy(xpath = "//android.widget.TextView[@text='General']")
    public static WebElement general;

    @FindBy(className = "android.widget.TextView")
    public static List<WebElement> textView;

    @FindBy(xpath = "//android.widget.TextView[@text='All']")
    public static WebElement allFilter;

    @FindBy(xpath = "//android.widget.TextView[@text='Read']")
    public static WebElement readFilter;

    @FindBy(xpath = "//android.widget.TextView[@text='Unread']")
    public static WebElement unreadFilter;

    @FindBy(xpath = "//android.widget.TextView[@text='Read All']")
    public static WebElement readAllFilter;

    @FindBy(className = "android.widget.ImageView")
    public static List<WebElement> imageView;

    @FindBy(className = "android.view.ViewGroup")
    public static List<WebElement> viewGroup;
}
