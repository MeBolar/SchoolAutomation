package school.bright.overallreport;

import io.appium.java_client.AppiumDriver;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import school.bright.generic.ObjectBase;

import javax.xml.xpath.XPath;
import java.nio.file.WatchEvent;
import java.security.cert.X509Certificate;
import java.util.List;

public class ReportRepo extends ObjectBase {
    public ReportRepo(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    @FindBy(xpath = "//android.widget.TextView[@text='Report']")
    public static WebElement report;

    @FindBy(xpath = "//android.widget.TextView[@text='Attendance']")
    public static WebElement attendanceButton;

    @FindBy(xpath = "//android.widget.TextView[@text='Academic Year']")
    public static WebElement academicYear;

    @FindBy(xpath = "//android.widget.TextView[@text='Class level']")
    public static WebElement classLevel;

    @FindBy(xpath = "//android.widget.TextView[@text='Class']")
    public static WebElement classLabel;

    @FindBy(xpath = "//android.widget.TextView[@text='A/1']")
    public static WebElement a1Class;

    @FindBy(className = "android.widget.ImageView")
    public static List<WebElement> imageView;

    @FindBy(xpath = "//android.widget.TextView[@text='On Time']")
    public static WebElement onTimeLabel;

    @FindBy(xpath = "//android.widget.TextView[@text='Late']")
    public static WebElement lateLabel;

    @FindBy(xpath = "//android.widget.TextView[@text='Absence']")
    public static WebElement absenceLabel;

    @FindBy(xpath = "//android.widget.TextView[@text='Event']")
    public static WebElement eventLabel;

    @FindBy(xpath = "//android.widget.TextView[@text='Sick leave']")
    public static WebElement sickLeave;

    @FindBy(xpath = "//android.widget.TextView[@text='Personal leave']")
    public static WebElement personalLeave;

    @FindBy(xpath = "//android.widget.TextView[@text='Undefined']")
    public static WebElement undefined;

    @FindBy(xpath = "//android.widget.TextView[@text='Subject']")
    public static WebElement subjectTab;

    @FindBy(xpath = "//android.widget.TextView[@text='Subject']")
    public static List<WebElement> subject;

    @FindBy(xpath = "//android.widget.TextView[@text='Discipline Score']")
    public static WebElement disciplineScore;

    @FindBy(className = "android.widget.EditText")
    public static WebElement searchBar;

    @FindBy(className = "android.view.ViewGroup")
    public static List<WebElement> viewGroup;

    @FindBy(xpath = "//android.widget.TextView[@text='Executive Report']")
    public static WebElement executiveReport;

    @FindBy(xpath = "//android.widget.TextView[@text='More Detail']")
    public static WebElement moreDetail;

    @FindBy(xpath = "//android.widget.TextView[@text='A']")
    public static WebElement classA;

    @FindBy(xpath = "//android.widget.TextView[@text='Personal']")
    public static WebElement personalTab;

    @FindBy(xpath = "//android.widget.TextView[@text='Uncheck Name']")
    public static WebElement uncheckName;

    @FindBy(xpath = "//android.widget.TextView[@text='Broadcast']")
    public static WebElement broadcast;

    @FindBy(xpath = "//android.widget.TextView[@text='Recipient']")
    public static WebElement recipient;

    @FindBy(xpath="//android.widget.TextView[@text='Top Up']")
    public static WebElement topUp;

    @FindBy(className = "android.widget.TextView")
    public static List<WebElement> textView;

    @FindBy(xpath = "//android.widget.TextView[@text='Sales']")
    public static WebElement sales;

    @FindBy(xpath = "//android.widget.TextView[@text='Tuition']")
    public static WebElement tuition;

    @FindBy(xpath = "//android.widget.TextView[@text='Next']")
    public static WebElement nextButton;

    @FindBy(xpath = "//android.widget.TextView[@text='Personal Report']")
    public static WebElement personalReport;

    @FindBy(xpath = "//android.widget.TextView[@text='List']")
    public static WebElement listButton;

    @FindBy(xpath = "//android.widget.TextView[@text='Leave']")
    public static WebElement leave;

    @FindBy(xpath = "//android.widget.TextView[@text='Purchase']")
    public static WebElement purchase;

    @FindBy(xpath = "//android.widget.TextView[@text='Broadcast']")
    public static WebElement broadcastButton;

    @FindBy(xpath = "//android.widget.TextView[@text='Math']")
    public static WebElement math;

    @FindBy(xpath = "//android.widget.TextView[@text='Class Level']")
    public static WebElement levelClass;
}
