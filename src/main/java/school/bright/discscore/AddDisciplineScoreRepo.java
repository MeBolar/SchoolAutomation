package school.bright.discscore;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import school.bright.generic.ObjectBase;

import java.util.List;

public class AddDisciplineScoreRepo extends ObjectBase {
    public AddDisciplineScoreRepo(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }
    @FindBy(className = "android.widget.EditText")
    public static WebElement searchBar;

    @FindBy(className = "android.view.ViewGroup")
    public static List<WebElement> checkBox;

    @FindBy(xpath = "//android.widget.TextView[@text='Pick up trash ']")
    public static WebElement pickUpTrashText;

    @FindBy(xpath = "//android.widget.TextView[@text='escape from school']")
    public static WebElement escapeFromSchool;

    @FindBy(xpath = "//android.widget.TextView[@text='Note']")
    public static List<WebElement> noteButton;

    @FindBy(xpath = "//android.widget.EditText[@text='please enter remark.']")
    public static WebElement pleaseEnterRemarrk;

    @FindBy(className = "android.widget.ImageView")
    public static List<WebElement> imageView;

    @FindBy(className = "android.widget.EditText")
    public static WebElement textView;

    @FindBy(xpath = "//android.widget.TextView[@text='SUBMIT']")
    public static WebElement SUBMITButton;


}
