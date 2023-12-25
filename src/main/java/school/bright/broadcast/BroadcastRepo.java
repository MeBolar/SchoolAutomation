package school.bright.broadcast;

import io.appium.java_client.AppiumDriver;
import org.apache.commons.io.input.WindowsLineEndingInputStream;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import school.bright.generic.ObjectBase;

import java.util.List;

public class BroadcastRepo extends ObjectBase {
    public BroadcastRepo(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }
    @FindBy(xpath = "//android.widget.TextView[@text='Broadcast']")
    public static WebElement broadcastButton;

    @FindBy(xpath = "//android.widget.TextView[@text='Delivery Format']")
    public static WebElement deliveryFormat;

    @FindBy(xpath = "//android.widget.TextView[@text='Group']")
    public static WebElement group;

    @FindBy(xpath = "//android.widget.TextView[@text='Recipient']")
    public static WebElement recipient;

    @FindBy(xpath = "//android.widget.TextView[@text='All Students']")
    public static WebElement allStudents;

    @FindBy(xpath = "//android.widget.TextView[@text='Individual']")
    public static WebElement individual;

    @FindBy(xpath = "//android.widget.TextView[@text='Students']")
    public static WebElement students;

    @FindBy(xpath = "//android.widget.TextView[@text='All (Everyone in the School)']")
    public static WebElement allEveryoneInTheSchool;

    @FindBy(xpath = "//android.widget.EditText[@text='Main topic']")
    public static WebElement mainTopic;

    @FindBy(xpath = "//android.widget.EditText[@text='Reply']")
    public static WebElement reply;

    @FindBy(xpath = "//android.widget.TextView[@text='No Repsonse']")
    public static WebElement noResponse;

    @FindBy(xpath = "//android.widget.TextView[@text='Send Now']")
    public static WebElement sendNow;

    @FindBy(xpath = "//android.widget.EditText[@text='Please fill in the details']")
    public static WebElement description;

    @FindBy(xpath = "//android.widget.TextView[@text='Only Selected Student(s)']")
    public static WebElement onlySelectedStudents;

    @FindBy(xpath = "//android.widget.TextView[@text='A']")
    public static WebElement classA;

    @FindBy(className = "android.view.ViewGroup")
    public static List<WebElement> button;

    @FindBy(xpath = "//android.widget.TextView[@text='Acknowledge']")
    public static WebElement acknowledge;

    @FindBy(xpath = "//android.widget.TextView[@text='Confirm']")
    public static WebElement confirm;

    @FindBy(xpath = "//android.widget.TextView[@text='Agree/Disagree']")
    public static WebElement agreeOrDisagree;

    @FindBy(xpath = "//android.widget.TextView[@text='Set time']")
    public static WebElement setTime;

    @FindBy(xpath = "//android.widget.TextView[@text='DD/MM/YYYY']")
    public static WebElement date;

    @FindBy(xpath = "//android.widget.TextView[@text='HH:mm']")
    public static WebElement time;

    @FindBy(xpath = "//android.widget.TextView[@text='Teacher/Staff']")
    public static WebElement teacherOrStaff;

    @FindBy(xpath = "//android.widget.TextView[@text='Class level']")
    public static WebElement classLevel;

    @FindBy(xpath = "//android.widget.TextView[@text='Class']")
    public static WebElement className;

    @FindBy(xpath = "//android.widget.TextView[@text='A/1']")
    public static WebElement classA1;


}
