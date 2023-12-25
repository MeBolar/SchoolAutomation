package school.bright.attendance;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import school.bright.generic.ObjectBase;

import java.util.List;

public class CheckinTeacherAttendanceRepo extends ObjectBase {
    public CheckinTeacherAttendanceRepo(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }
    @FindBy(xpath = "//android.widget.TextView[@text='Balance']")
    public static WebElement balanceText;

    @FindBy(className = "android.widget.ImageView")
    public static List<WebElement> imageView;

    @FindBy(xpath = "//android.widget.TextView[@text='Check In/Out']")
    public static WebElement checkInCheckOut;

    @FindBy(xpath = "//android.widget.TextView[@text='Class Attendance']")
    public static WebElement classAttendance;

    @FindBy(xpath="//android.widget.TextView[@text='Check In Attendance']")
    public static WebElement checkInAttendanceButton;

    @FindBy(xpath = "//android.widget.TextView[@text='Discipline Score']")
    public static WebElement disciplineScoreButton;

    @FindBy(xpath = "//android.widget.TextView[@text='Add Discipline Score']")
    public static WebElement addDisciplineScoreButton;

    @FindBy(xpath = "//android.widget.TextView[@text='Reduce Discipline Score']")
    public static WebElement reduceDisciplineScoreButton;

    @FindBy(xpath = "//android.widget.TextView[@text='Online Classroom']")
    public static WebElement onlineClassroom;

    @FindBy(xpath = "//android.widget.TextView[@text='Edit Class Attendance']")
    public static WebElement editClassAttendanceButton;

    @FindBy(xpath = "//android.widget.TextView[@text='Check Out Attendance']")
    public static WebElement checkOutAttendanceButton;

    @FindBy(xpath = "//android.widget.TextView[@text='Take Class Attendance']")
    public static WebElement takeClassAttendance;

    @FindBy(className = "android.widget.TextView")
    public static List<WebElement> button;

    @FindBy(xpath="//android.widget.TextView[@text='Check Ontime with QR Code']")
    public static WebElement checkinOntimeWithQRCode;

    @FindBy(xpath = "//android.widget.TextView[@text='OK']")
    public static WebElement OKButton;

    @FindBy(className = "android.widget.ImageView")
    public static WebElement backButton;

    @FindBy(xpath = "//android.widget.TextView[@text='Check Late with QR Code']")
    public static WebElement checkinLateWithQRCode;

    @FindBy(xpath = "//android.widget.TextView[@text='Check Late with Student ID']")
    public static WebElement checkinLateWithStudentID;

    @FindBy(xpath = "//android.widget.EditText[@text='Enter Student ID']")
    public static WebElement enterStudentID;

    @FindBy(className = "android.widget.ImageView")
    public static List<WebElement> listOfImageView;

    @FindBy(xpath="//android.widget.TextView[@text='Clear']")
    public static WebElement clearButton;

    @FindBy(xpath = "//android.widget.TextView[@text='Next']")
    public static WebElement nextButton;

    @FindBy(xpath = "//android.widget.TextView[@text='Cancel']")
    public static WebElement cancelButton;

    @FindBy(xpath = "//android.widget.TextView[@text='0']")
    public static WebElement keypad0;

    @FindBy(xpath = "//android.widget.TextView[@text='1']")
    public static WebElement keypad1;

    @FindBy(xpath = "//android.widget.TextView[@text='2']")
    public static WebElement keypad2;

    @FindBy(xpath = "//android.widget.TextView[@text='3']")
    public static WebElement keypad3;

    @FindBy(xpath = "//android.widget.TextView[@text='4']")
    public static WebElement keypad4;

    @FindBy(xpath = "//android.widget.TextView[@text='5']")
    public static WebElement keypad5;

    @FindBy(xpath = "//android.widget.TextView[@text='6']")
    public static WebElement keypad6;

    @FindBy(xpath = "//android.widget.TextView[@text='7']")
    public static WebElement keypad7;

    @FindBy(xpath = "//android.widget.TextView[@text='8']")
    public static WebElement keypad8;

    @FindBy(xpath = "//android.widget.TextView[@text='9']")
    public static WebElement keypad9;

    @FindBy(xpath = "//android.widget.TextView[@text='Attendance']")
    public static WebElement attendanceButton;

}
