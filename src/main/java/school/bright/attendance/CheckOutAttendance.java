package school.bright.attendance;

import com.beust.ah.A;
import io.qameta.allure.Step;
import school.bright.generic.Base;
import school.bright.login.AppLoginRepo;

public class CheckOutAttendance extends Base {
    public static CheckinTeacherAttendanceRepo ctar;
    public static CheckOutAttendanceRepo coar;
    public static CheckInTeacherAttendanceFromRoomPageRepo cafrp;
    public static AppLoginRepo alr;
    public CheckOutAttendance(){
        coar=new CheckOutAttendanceRepo(appiumDriver);
        ctar= new CheckinTeacherAttendanceRepo(appiumDriver);
        alr=new AppLoginRepo(appiumDriver);
        cafrp=new CheckInTeacherAttendanceFromRoomPageRepo(appiumDriver);
    }

    @Step("Test case to navigate to check out attendance screen")
    public static void navigateToCheckOutScreenFromHomePage(){
        waitForMobileElement(ctar.attendanceButton);
        ctar.attendanceButton.click();
        waitForMobileElement(ctar.checkOutAttendanceButton);
        ctar.checkOutAttendanceButton.click();
    }

    @Step("Test case to checkout attendance via QR code")
    public static void checkOutAttendanceViaQRCode(){
        waitForMobileElement(ctar.cancelButton);
        ctar.cancelButton.click();
        waitForMobileElement(ctar.OKButton);
        ctar.OKButton.click();
        //Click on close button of success message
        waitForMobileElement(alr.closeButton);
        alr.closeButton.click();
    }

    @Step("Test case to checkout attendance without any student id entered")
    public static void checkOutAttendanceWithoutStudentID() throws InterruptedException {
        waitForMobileElement(coar.studentIdTab);
        coar.studentIdTab.click();
        waitForMobileElement(ctar.keypad0);
        //Enter student id
        ctar.keypad0.click();
        ctar.keypad0.click();
        ctar.keypad0.click();
        ctar.keypad0.click();
        ctar.keypad1.click();
        Thread.sleep(1000);
        //Deleteing 1 character
        ctar.listOfImageView.get(1).click();
        //Clearing all the characters
        ctar.clearButton.click();
        waitForMobileElement(ctar.nextButton);
        //Click on Next button
        ctar.nextButton.click();
        //Close the pop up
        waitForMobileElement(alr.closeButton);
        alr.closeButton.click();
    }

    @Step("Test case to checkout attendance with wrong student id.")
    public static void checkOutAttendanceWithWrongStudentID() throws InterruptedException {
        waitForMobileElement(ctar.keypad0);
        //Enter student id
        ctar.keypad9.click();
        ctar.keypad9.click();
        ctar.keypad5.click();
        ctar.keypad6.click();
        waitForMobileElement(ctar.nextButton);
        //Click on Next button
        ctar.nextButton.click();
        //Close the pop up
        waitForMobileElement(alr.closeButton);
        alr.closeButton.click();
        Thread.sleep(2000);
        //Clearing all the characters
        ctar.clearButton.click();
    }

    @Step("Test case to checkout attendance with valid student id.")
    public static void checkOutAttendanceWithValidStudentID() throws InterruptedException {
        waitForMobileElement(ctar.keypad0);
        //Enter student id
        ctar.keypad0.click();
        ctar.keypad0.click();
        ctar.keypad0.click();
        ctar.keypad0.click();
        ctar.keypad1.click();
        Thread.sleep(1000);
        waitForMobileElement(ctar.nextButton);
        //Click on Next button
        ctar.nextButton.click();
        //accept the pop up
        waitForMobileElement(ctar.OKButton);
        ctar.OKButton.click();
        //Close the pop up
        waitForMobileElement(alr.closeButton);
        alr.closeButton.click();
        //Navigate back to home page
        appiumDriver.navigate().back();

    }
}
