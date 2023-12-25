package school.bright.leave;

import io.qameta.allure.Step;
import school.bright.attendance.CheckinTeacherAttendanceRepo;
import school.bright.broadcast.BroadcastRepo;
import school.bright.classroom.OnlineClassRoomRepo;
import school.bright.classroom.StudentOnlineClassRoomRepo;
import school.bright.generic.Base;

public class StudentFullDayLeave extends Base {
    public static StudentFullDayLeaveRepo sfdlr;
    public static StudentOnlineClassRoomRepo socr;
    public static FullDayLeaveRepo fdlr;
    public static CheckinTeacherAttendanceRepo ctar;
    public static OnlineClassRoomRepo ocrp;
    public static BroadcastRepo br;
    static FullDayLeave fullDayLeave=new FullDayLeave();
    public StudentFullDayLeave(){
        sfdlr=new StudentFullDayLeaveRepo(appiumDriver);
        socr=new StudentOnlineClassRoomRepo(appiumDriver);
        fdlr=new FullDayLeaveRepo(appiumDriver);
        ctar=new CheckinTeacherAttendanceRepo(appiumDriver);
        ocrp=new OnlineClassRoomRepo(appiumDriver);
        br=new BroadcastRepo(appiumDriver);
    }

    @Step("Navigate to full day leave screen")
    public static void navigateToFullDayScreen() throws InterruptedException {
        fullDayLeave.navigateToFullDayLeaveScreen();
    }

    @Step("Apply full day leave")
    public static void applyFullDayLeave() throws InterruptedException {
        Thread.sleep(2000);
        waitForMobileElement(socr.nextButton);
        socr.nextButton.click();
        Thread.sleep(2000);
        waitForMobileElement(socr.closeButton);
        socr.closeButton.click();
        waitForMobileElement(fdlr.leaveReason);
        fdlr.leaveReason.click();
        waitForMobileElement(fdlr.sickLeave);
        fdlr.sickLeave.click();
        waitForMobileElement(ctar.nextButton);
        ctar.nextButton.click();
        waitForMobileElement(ocrp.CLOSE);
        ocrp.CLOSE.click();
        waitForMobileElement(fdlr.startingDate);
        fdlr.startingDate.click();
        Thread.sleep(2000);
        ocrp.dateButton.get(3).click();
        waitForMobileElement(ocrp.selectButton);
        ocrp.selectButton.click();
        waitForMobileElement(ctar.nextButton);
        ctar.nextButton.click();
        waitForMobileElement(ocrp.CLOSE);
        ocrp.CLOSE.click();
        waitForMobileElement(fdlr.endDate);
        fdlr.endDate.click();
        Thread.sleep(2000);
        ocrp.dateButton.get(4).click();
        waitForMobileElement(ocrp.selectButton);
        ocrp.selectButton.click();
        waitForMobileElement(ctar.nextButton);
        ctar.nextButton.click();

        waitForMobileElement(br.description);
        br.description.clear();
        br.description.sendKeys("Sick");

        waitForMobileElement(fdlr.rememberCheckBox);
        fdlr.rememberCheckBox.click();
        //Enter house number
        Thread.sleep(2000);
        fdlr.textField.get(1).clear();
        fdlr.textField.get(1).sendKeys("11/11");
        Thread.sleep(2000);
        //Enter province
        fdlr.textField.get(2).click();
        Thread.sleep(2000);
        fdlr.provinceOptions.get(1).click();
        Thread.sleep(2000);
        //Enter Amphur
        fdlr.textField.get(3).click();
        Thread.sleep(2000);
        fdlr.provinceOptions.get(1).click();
        //Enter district
        Thread.sleep(2000);
        fdlr.textField.get(4).click();
        Thread.sleep(2000);
        fdlr.provinceOptions.get(1).click();
        //Enter phone number
        Thread.sleep(2000);
        fdlr.textField.get(5).clear();
        fdlr.textField.get(5).sendKeys("0123456789");
        waitForMobileElement(ctar.nextButton);
        ctar.nextButton.click();
        waitForMobileElement(ocrp.submitButton);
        ocrp.submitButton.click();
        waitForMobileElement(ocrp.CLOSE);
        ocrp.CLOSE.click();
        //app will be navigated to home page
    }

}
