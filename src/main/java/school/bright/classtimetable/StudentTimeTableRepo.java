package school.bright.classtimetable;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import school.bright.generic.ObjectBase;

public class StudentTimeTableRepo extends ObjectBase {
    public StudentTimeTableRepo(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    @FindBy(xpath = "//android.widget.TextView[@text='TimeTable']")
    public static WebElement timeTable;
}
