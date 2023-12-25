package school.bright.leave;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import school.bright.generic.ObjectBase;

import java.util.List;

public class LeaveRequestRepo extends ObjectBase {
    public LeaveRequestRepo(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }
    @FindBy(xpath = "//android.widget.TextView[@text='Leave Request']")
    public static WebElement leaveRequest;

    @FindBy(xpath = "//android.widget.TextView[@text='Pending']")
    public static List<WebElement> pendingLeaves;

    @FindBy(xpath = "//android.widget.TextView[@text='Approve']")
    public static WebElement approve;

    @FindBy(className = "android.widget.ImageView")
    public static List<WebElement> imageView;

    @FindBy(className = "android.view.ViewGroup")
    public static List<WebElement> viewGroup;


}
