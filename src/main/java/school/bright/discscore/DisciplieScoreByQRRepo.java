package school.bright.discscore;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import school.bright.generic.ObjectBase;

import java.util.List;

public class DisciplieScoreByQRRepo extends ObjectBase {
    public DisciplieScoreByQRRepo(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }
    @FindBy(className = "android.widget.TextView")
    public static List<WebElement> textView;

    @FindBy(xpath = "//android.widget.TextView[@text='QR Code']")
    public static WebElement qrCodeButton;

    @FindBy(xpath = "//android.widget.TextView[@text='Enter Student ID']")
    public static WebElement enterStudetIDButton;

}
