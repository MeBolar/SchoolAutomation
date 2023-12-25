package school.bright.discscore;

import io.qameta.allure.Step;
import school.bright.attendance.CheckinTeacherAttendanceRepo;
import school.bright.generic.Base;
import school.bright.login.AppLoginRepo;

public class ReduceDisciplineScoreByStudentID extends Base {
    public static ReduceDisciplineScoreByStudentIDRepo rdssi;
    public static CheckinTeacherAttendanceRepo ctar;
    public static DisciplieScoreByQRRepo dsqr;
    public static AddDisciplineScoreRepo adsr;
    public static AppLoginRepo alr;
    public ReduceDisciplineScoreByStudentID(){
        rdssi=new ReduceDisciplineScoreByStudentIDRepo(appiumDriver);
        ctar=new CheckinTeacherAttendanceRepo(appiumDriver);
        dsqr=new DisciplieScoreByQRRepo(appiumDriver);
        alr=new AppLoginRepo(appiumDriver);
    }

    @Step("Test case to reduce discipline score without entering student ID")
    public static void reduceDisciplineScoreWithoutEnteringStudentID() throws InterruptedException {
        Thread.sleep(4000);
        dsqr.textView.get(1).click();
        waitForMobileElement(dsqr.enterStudetIDButton);
        dsqr.enterStudetIDButton.click();
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
        //Click on Next button
        ctar.nextButton.click();
        //Close the pop up
        Thread.sleep(1000);
        alr.closeButton.click();
    }

    @Step("Test case to reduce discipline score by entering wrong student ID")
    public static void reduceDisciplineScoreByWrongStudentID() throws InterruptedException {
        Thread.sleep(1000);
        //Enter student id
        ctar.keypad9.click();
        ctar.keypad9.click();
        ctar.keypad5.click();
        ctar.keypad6.click();
        Thread.sleep(1000);
        ctar.nextButton.click();
        //Close the pop up
        Thread.sleep(1000);
        waitForMobileElement(alr.closeButton);
        alr.closeButton.click();
        Thread.sleep(3000);
        ctar.clearButton.click();
    }

    @Step("Test case to reduce discipline score by entering valid student ID")
    public static void reduceDisciplineScoreByValidStudentID() throws InterruptedException {
        Thread.sleep(3000);
        //Enter student id
        ctar.keypad0.click();
        ctar.keypad0.click();
        ctar.keypad0.click();
        ctar.keypad0.click();
        ctar.keypad1.click();
        Thread.sleep(1000);
        ctar.nextButton.click();
        Thread.sleep(1000);
        ctar.cancelButton.click();
        Thread.sleep(1000);
        ctar.nextButton.click();
        Thread.sleep(1000);
        ctar.OKButton.click();
        waitForMobileElement(adsr.escapeFromSchool);
        adsr.checkBox.get(9).click();
        Thread.sleep(3000);
        scrollDown();
        scrollDown();
        scrollDown();
        scrollDown();
        scrollDown();
        waitForMobileElement(ctar.nextButton);
        ctar.nextButton.click();

        waitForMobileElement(adsr.SUBMITButton);
        adsr.SUBMITButton.click();
        waitForMobileElement(alr.closeButton);
        alr.closeButton.click();
    }

}
