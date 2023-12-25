package school.bright.attendance;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import school.bright.generic.ObjectBase;

import java.util.List;

public class CheckInTeacherAttendanceFromRoomPageRepo extends ObjectBase {
    public CheckInTeacherAttendanceFromRoomPageRepo(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }
    @FindBy(xpath = "//android.widget.TextView[@text='Please Select Class Level']")
    public static WebElement selectClassLevel;

    @FindBy(xpath = "//android.widget.TextView[@text='A']")
    public static WebElement classLevelA;

    @FindBy(xpath = "//android.widget.TextView[@text='Class level']")
    public static WebElement classLevel;

    @FindBy(xpath = "//android.widget.TextView[@text='Class']")
    public static WebElement className;

    @FindBy(xpath = "//android.widget.TextView[@text='Subject']")
    public static WebElement subject;


    @FindBy(xpath = "//android.widget.TextView[@text='Please Select Class']")
    public static WebElement selectClass;

    @FindBy(xpath = "//android.widget.TextView[@text='A/1']")
    public static WebElement classA1;

    @FindBy(xpath = "//android.widget.TextView[@text='A/2']")
    public static WebElement classA2;

    @FindBy(xpath = "//android.widget.EditText[@text='Name/Student ID']")
    public static WebElement studentIDSearchBar;

    @FindBy(xpath = "//android.widget.TextView[@text='No list.']")
    public static WebElement noListText;

    @FindBy(className = "android.widget.ImageView")
    public static List<WebElement> imageView;

    @FindBy(xpath = "//android.widget.TextView[@text='ON TIME']")
    public static WebElement onTimeButtton;

    @FindBy(xpath = "//android.widget.TextView[@text='LATE']")
    public static WebElement lateButton;

    @FindBy(xpath = "//android.widget.TextView[@text='ABSENCE']")
    public static WebElement absenceButton;

    @FindBy(xpath = "//android.widget.TextView[@text='PERSONAL LEAVE']")
    public static WebElement personalLeaveButton;

    @FindBy(xpath = "//android.widget.TextView[@text='SICK LEAVE']")
    public static WebElement sickLeaveButton;

    @FindBy(xpath = "//android.widget.TextView[@text='EVENT']")
    public static WebElement eventButton;

    @FindBy(xpath = "//android.widget.TextView[@text='UNDEFINED']")
    public static WebElement undefinedButton;

    @FindBy(xpath = "//android.widget.TextView[@text='Next']")
    public static WebElement nextButton;

    @FindBy(xpath = "//android.widget.TextView[@text='Summary of students']")
    public static WebElement summaryOfStudents;

    @FindBy(className = "android.widget.TextView")
    public static List<WebElement> textView;

    @FindBy(className = "android.widget.EditText")
    public static WebElement searchBar;

    @FindBy(className = "android.widget.ImageView")
    public static WebElement topBackButton;

    @FindBy(xpath = "//android.widget.TextView[@text='Submit']")
    public static WebElement submitButton;

    @FindBy(xpath = "//android.widget.TextView[@text='Completed']")
    public static WebElement completedText;

    @FindBy(xpath = "//android.widget.TextView[@text='This room has already been taken attendance']")
    public static WebElement attendanceAlreadyTakenText;

    @FindBy(xpath = "//android.widget.TextView[@text='661583']")
    public static WebElement studentToSelect;
}
