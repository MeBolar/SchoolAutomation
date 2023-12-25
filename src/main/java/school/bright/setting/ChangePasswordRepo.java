package school.bright.setting;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import school.bright.generic.ObjectBase;

import java.util.List;

public class ChangePasswordRepo extends ObjectBase {
    public ChangePasswordRepo(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }
    @FindBy(xpath = "//android.widget.TextView[@text='Change Password']")
    public static WebElement changePassword;

    @FindBy(className = "android.widget.EditText")
    public static List<WebElement> editText;

    @FindBy(xpath = "//android.widget.TextView[@text='Confirm']")
    public static WebElement confirm;

    @FindBy(xpath = "//android.widget.TextView[@text='CLOSE']")
    public static WebElement close;

}
