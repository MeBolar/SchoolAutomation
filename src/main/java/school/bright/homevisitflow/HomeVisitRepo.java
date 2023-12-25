package school.bright.homevisitflow;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import school.bright.generic.ObjectBase;

public class HomeVisitRepo extends ObjectBase {
    public HomeVisitRepo(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    @FindBy(xpath = "//android.widget.TextView[@text='SDQ / Home Visit']")
    public static WebElement homeVisit;


}
