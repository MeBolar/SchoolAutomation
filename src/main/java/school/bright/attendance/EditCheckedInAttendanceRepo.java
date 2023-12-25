package school.bright.attendance;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import school.bright.generic.ObjectBase;

public class EditCheckedInAttendanceRepo extends ObjectBase {

    public EditCheckedInAttendanceRepo(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    @FindBy(xpath = "//android.widget.TextView[@text='Edit Check In Attendance']")
    public static WebElement editCheckinButton;

    @FindBy(xpath = "//android.widget.TextView[@text='Class level']")
    public static WebElement classLevelLabel;
}
