package school.bright.leave;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import school.bright.generic.ObjectBase;

import java.util.List;

public class FullDayLeaveRepo extends ObjectBase {
    public FullDayLeaveRepo(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    @FindBy(xpath = "//android.widget.TextView[@text='Leave']")
    public static WebElement leave;

    @FindBy(xpath = "//android.widget.TextView[@text='Full Day']")
    public static WebElement fullDay;

    @FindBy(xpath = "//android.widget.TextView[@text='Leave Reason']")
    public static WebElement leaveReason;

    @FindBy(xpath = "//android.widget.TextView[@text='Sick leave']")
    public static WebElement sickLeave;

    @FindBy(xpath = "//android.widget.TextView[@text='Starting Date']")
    public static WebElement startingDate;

    @FindBy(xpath = "//android.widget.TextView[@text='Ending Date']")
    public static WebElement endDate;

    @FindBy(xpath = "//android.widget.TextView[@text='Remember']")
    public static WebElement rememberCheckBox;

    @FindBy(className = "android.widget.EditText")
    public static List<WebElement> textField;

    @FindBy(className = "android.widget.TextView")
    public static List<WebElement> provinceOptions;
}
