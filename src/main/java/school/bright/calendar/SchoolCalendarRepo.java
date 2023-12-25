package school.bright.calendar;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import school.bright.generic.ObjectBase;

import java.util.List;

public class SchoolCalendarRepo extends ObjectBase {
    public SchoolCalendarRepo(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }
    @FindBy(xpath = "//android.widget.TextView[@text='School Calendar']")
    public static WebElement schoolCalendar;

    @FindBy(className = "android.widget.ImageView")
    public static List<WebElement> arrowButton;

}
