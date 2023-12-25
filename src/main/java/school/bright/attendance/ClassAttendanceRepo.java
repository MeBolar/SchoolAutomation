package school.bright.attendance;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import school.bright.generic.ObjectBase;

import java.util.List;

public class ClassAttendanceRepo extends ObjectBase {
    public ClassAttendanceRepo(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    @FindBy(xpath = "//android.widget.TextView[@text='Please Select Subject']")
    public static WebElement selectSubject;

    @FindBy(xpath = "//android.widget.TextView[@text='English']")
    public static WebElement englishSubject;

    @FindBy(xpath = "//android.widget.TextView[@text='Math']")
    public static WebElement mathSubject;

    @FindBy(xpath = "//android.widget.TextView[@text='Take Class Attendance']")
    public static WebElement takeClassAttendanceTitle;



    @FindBy(className = "android.widget.ImageView")
    public static List<WebElement> imageView;
}
