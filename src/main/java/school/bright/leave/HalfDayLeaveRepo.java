package school.bright.leave;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import school.bright.generic.ObjectBase;

public class HalfDayLeaveRepo extends ObjectBase {
    public HalfDayLeaveRepo(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    @FindBy(xpath = "//android.widget.TextView[@text='Half Day']")
    public static WebElement halfDay;

    @FindBy(xpath = "//android.widget.TextView[@text='Season']")
    public static WebElement season;

    @FindBy(xpath = "//android.widget.TextView[@text='Morning']")
    public static WebElement morning;
}
