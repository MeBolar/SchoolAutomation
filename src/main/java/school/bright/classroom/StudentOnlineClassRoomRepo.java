package school.bright.classroom;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import school.bright.generic.ObjectBase;

public class StudentOnlineClassRoomRepo extends ObjectBase {
    public StudentOnlineClassRoomRepo(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    @FindBy(xpath = "//android.widget.TextView[@text='Academic Year']")
    public static WebElement academicYear;

    @FindBy(xpath = "//android.widget.TextView[@text='2035']")
    public static WebElement year2035;

    @FindBy(xpath = "//android.widget.TextView[@text='Next']")
    public static WebElement nextButton;

    @FindBy(xpath = "//android.widget.TextView[@text='CLOSE']")
    public static WebElement closeButton;

    @FindBy(xpath = "//android.widget.TextView[@text='2023']")
    public static WebElement year2023;

    @FindBy(xpath = "//android.widget.TextView[@text='Semester']")
    public static WebElement semester;

    @FindBy(xpath = "//android.widget.TextView[@text='2']")
    public static WebElement semester2;

}
