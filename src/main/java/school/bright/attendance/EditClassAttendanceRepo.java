package school.bright.attendance;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import school.bright.generic.ObjectBase;

import java.util.List;

public class EditClassAttendanceRepo extends ObjectBase {
    public EditClassAttendanceRepo(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    @FindBy(xpath = "//android.widget.TextView[@text='Edit Class Attendance']")
    public static WebElement editClassAttendanceLabel;

    @FindBy(xpath = "//android.widget.TextView[@text='Check in']")
    public static WebElement checkInButton;

    @FindBy(className = "android.widget.ImageView")
    public static List<WebElement> imageView;
}
