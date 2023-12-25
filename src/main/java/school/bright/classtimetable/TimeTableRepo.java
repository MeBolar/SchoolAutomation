package school.bright.classtimetable;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import school.bright.generic.ObjectBase;

import java.util.List;

public class TimeTableRepo extends ObjectBase {
    public TimeTableRepo(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    @FindBy(xpath = "//android.widget.TextView[@text='Timetable']")
    public static WebElement timeTable;

    @FindBy(xpath = "//android.widget.TextView[@text='S']")
    public static List<WebElement> S;

    @FindBy(xpath = "//android.widget.TextView[@text='M']")
    public static WebElement M;

    @FindBy(xpath = "//android.widget.TextView[@text='T']")
    public static List<WebElement> T;

    @FindBy(xpath = "//android.widget.TextView[@text='W']")
    public static WebElement W;

    @FindBy(xpath = "//android.widget.TextView[@text='F']")
    public static WebElement F;

    @FindBy(xpath = "//android.widget.TextView[@text='Academic Year']")
    public static WebElement academicYear;

    @FindBy(xpath = "//android.widget.TextView[@text='2037']")
    public static WebElement year2037;


}
