package school.bright.discscore;

import io.qameta.allure.Step;
import school.bright.attendance.CheckinTeacherAttendanceRepo;
import school.bright.generic.Base;
import school.bright.login.AppLoginRepo;

public class DisciplineScoreByQR extends Base {
    public static DisciplieScoreByQRRepo dsqr;
    public static AddDisciplineScoreRepo adsr;
    public static AppLoginRepo alr;
    public static CheckinTeacherAttendanceRepo ctar;
    public DisciplineScoreByQR(){
        dsqr=new DisciplieScoreByQRRepo(appiumDriver);
        ctar=new CheckinTeacherAttendanceRepo(appiumDriver);
        adsr=new AddDisciplineScoreRepo(appiumDriver);
        alr=new AppLoginRepo(appiumDriver);
    }

    @Step("Adding discipline score by QR code")
    public static void addDisciplineScoreByQRCode() throws InterruptedException {
        Thread.sleep(6000);
        dsqr.textView.get(1).click();

        waitForMobileElement(dsqr.qrCodeButton);
        dsqr.qrCodeButton.click();

        waitForMobileElement(ctar.OKButton);
        ctar.OKButton.click();

        waitForMobileElement(adsr.pickUpTrashText);
        adsr.checkBox.get(2).click();
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

    @Step("Trying to add discipline score by without entering student ID")
    public static void addDisciplineScoreWithoutEnteringStudentID() throws InterruptedException {
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

    @Step("Trying to add discipline score by entering wrong student ID")
    public static void addDisciplineScoreByWrongStudentID() throws InterruptedException {
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
    @Step("Trying to add disciplie score by valid student ID")
    public static void addDisciplineScoreByValidStudentID() throws InterruptedException {
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
        waitForMobileElement(adsr.pickUpTrashText);
        adsr.checkBox.get(2).click();
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
