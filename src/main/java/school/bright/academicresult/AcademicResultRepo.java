package school.bright.academicresult;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import school.bright.generic.ObjectBase;

import java.util.List;

public class AcademicResultRepo extends ObjectBase {
    public AcademicResultRepo(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    @FindBy(xpath = "//android.widget.TextView[@text='Academic Result']")
    public static WebElement academicResult;

    @FindBy(xpath = "//android.widget.TextView[@text='Type']")
    public static List<WebElement> type;

    @FindBy(xpath = "//android.widget.TextView[@text='Semester 1 Mid-Term']")
    public static WebElement sem1MidTerm;

    @FindBy(className = "android.widget.ImageView")
    public static List<WebElement> imageView;

    @FindBy(xpath = "//android.widget.TextView[@text='Semester 1 Final']")
    public static WebElement sem1Final;

    @FindBy(xpath = "//android.widget.TextView[@text='Semester 2 Mid-Term']")
    public static WebElement sem2MidTerm;

    @FindBy(xpath = "//android.widget.TextView[@text='Semester 2 Final']")
    public static WebElement sem2Final;

    @FindBy(xpath = "//android.widget.TextView[@text='Yearly']")
    public static WebElement yearly;
}
