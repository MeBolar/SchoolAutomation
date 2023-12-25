package school.bright.classroom;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import school.bright.generic.ObjectBase;

import java.util.List;

public class OnlineClassRoomRepo extends ObjectBase {
    public OnlineClassRoomRepo(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    @FindBy(xpath = "//android.widget.TextView[@text='Class Level']")
    public static WebElement classLevel;

    @FindBy(xpath = "//android.widget.TextView[@text='All']")
    public static WebElement all;

    @FindBy(xpath = "//android.widget.TextView[@text='A']")
    public static WebElement classLevelA;

    @FindBy(xpath = "//android.widget.TextView[@text='Math']")
    public static WebElement math;

    @FindBy(xpath = "//android.widget.TextView[@text='Create Topic']")
    public static WebElement createTopic;

    @FindBy(className = "android.widget.EditText")
    public static WebElement mainTopic;

    @FindBy(className = "android.view.ViewGroup")
    public static List<WebElement> button;

    @FindBy(className = "android.widget.ImageView")
    public static List<WebElement> cancelButton;

    @FindBy(className = "android.widget.TextView")
    public static List<WebElement> imageViewButton;

    @FindBy(xpath = "//android.widget.TextView[@text='Homeworks']")
    public static WebElement homeWorksTab;

    @FindBy(xpath = "//android.widget.TextView[@text='Yadthip SarnsiriExtra']")
    public static WebElement yadthip;

    @FindBy(xpath = "//android.widget.TextView[@text='Autotest Teacher']")
    public static WebElement autoTestTeacher;

    @FindBy(className = "android.widget.ImageView")
    public static WebElement closeButton;

    @FindBy(xpath = "//android.widget.TextView[@text='Create']")
    public static WebElement createButton;

    @FindBy(xpath = "//android.widget.TextView[@text='Assignment']")
    public static WebElement assignementLabel;

    @FindBy(className = "android.widget.EditText")
    public static List<WebElement> textField;

    @FindBy(className = "android.widget.EditText")
    public static WebElement inputTextField;

    @FindBy(xpath = "//android.widget.TextView[@text='Full Score']")
    public static WebElement fullScoreButton;

    @FindBy(xpath = "//android.widget.TextView[@text='OK']")
    public static WebElement okButton;

    @FindBy(xpath = "//android.widget.TextView[@text='Delivery Format']")
    public static List<WebElement> deliveryFormat;

    @FindBy(xpath = "//android.widget.TextView[@text='Deadline Date']")
    public static List<WebElement> deadLineDate;

    @FindBy(xpath = "//android.widget.TextView[@text='Select']")
    public static WebElement selectButton;

    @FindBy(className = "android.widget.Button")
    public static List<WebElement> dateButton;

    @FindBy(xpath = "//android.widget.TextView[@text='Submit']")
    public static WebElement submitButton;

    @FindBy(xpath = "//android.widget.TextView[@text='CLOSE']")
    public static WebElement CLOSE;

    @FindBy(className = "android.widget.ImageView")
    public static List<WebElement> appImageButtons;

    @FindBy(xpath = "//android.widget.TextView[@text='Edit']")
    public static WebElement edit;

    @FindBy(xpath = "//android.widget.TextView[@text='Individual']")
    public static WebElement individualButton;

    @FindBy(xpath = "//android.widget.TextView[@text='List']")
    public static WebElement listButton;

    @FindBy(xpath = "//android.widget.TextView[@text='Materials']")
    public static WebElement materialsTab;

    @FindBy(className = "android.widget.EditText")
    public static WebElement searchBar;

}
