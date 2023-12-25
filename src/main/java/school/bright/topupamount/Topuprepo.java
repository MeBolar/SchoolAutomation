package school.bright.topupamount;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import school.bright.generic.ObjectBase;

import java.util.List;

public class Topuprepo extends ObjectBase {
    public Topuprepo(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    @FindBy(xpath = "//android.widget.TextView[@text='Top Up']")
    public static WebElement topUpButton;

    @FindBy(className = "android.widget.ImageView")
    public static List<WebElement> imageView;

    @FindBy(xpath = "//android.widget.TextView[@text='Do not show again within 7 days']")
    public static WebElement checkBox;

    @FindBy(xpath = "//android.widget.TextView[@text='Top Up 50']")
    public static WebElement topUp50;

    @FindBy(className = "android.widget.Button")
    public static WebElement confirmButton;

    @FindBy(className = "android.view.ViewGroup")
    public static List<WebElement> viewGroup;

    @FindBy(xpath = "//android.widget.TextView[@text='Other']")
    public static WebElement other;

    @FindBy(xpath = "//android.widget.TextView[@text='OK']")
    public static WebElement okButton;

    @FindBy(className = "android.widget.EditText")
    public static WebElement textField;

    @FindBy(xpath = "//android.widget.TextView[@text='Tuition']")
    public static WebElement tuition;


}
