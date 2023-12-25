package school.bright.login;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import school.bright.generic.ObjectBase;

import java.util.List;

public class AppLoginRepo extends ObjectBase {
    public AppLoginRepo(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    @FindBy(className = "android.view.ViewGroup")
    public static List<WebElement> button;

    @FindBy(className = "android.widget.EditText")
    public static List<WebElement> editField;

    @FindBy(className = "android.widget.TextView")
    public static List<WebElement> textView;

    @FindBy(xpath = "//android.widget.EditText[@text='School']")
    public static WebElement schoolButton;

    @FindBy(xpath = "//android.widget.EditText[@text='Search School']")
    public static WebElement searchSchoolTextField;

    @FindBy(xpath = "//android.widget.TextView[@text='CLOSE']")
    public static WebElement closeButton;

    @FindBy(xpath = "//android.widget.TextView[@text='Logout']")
    public static WebElement logoutButton;

    @FindBy(xpath = "//android.widget.TextView[@text='Confirm']")
    public static WebElement confirmButton;

}
