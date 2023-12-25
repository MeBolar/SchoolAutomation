package school.bright.leave;

import io.qameta.allure.Step;
import school.bright.attendance.CheckinTeacherAttendanceRepo;
import school.bright.broadcast.BroadcastRepo;
import school.bright.classroom.OnlineClassRoomRepo;
import school.bright.generic.Base;

public class StudentHalfDayLeave extends Base {
    public static StudentHalfDayLeaveRepo shdlr;
    public static HalfDayLeaveRepo hdlr;
    public static FullDayLeaveRepo fdlr;
    public static OnlineClassRoomRepo ocrp;
    public static BroadcastRepo br;
    public static CheckinTeacherAttendanceRepo ctar;
    static HalfDayLeave halfDayLeave=new HalfDayLeave();
    public StudentHalfDayLeave() throws InterruptedException {
        shdlr = new StudentHalfDayLeaveRepo(appiumDriver);
        hdlr = new HalfDayLeaveRepo(appiumDriver);
        fdlr = new FullDayLeaveRepo(appiumDriver);
        ocrp = new OnlineClassRoomRepo(appiumDriver);
        br = new BroadcastRepo(appiumDriver);
        ctar = new CheckinTeacherAttendanceRepo(appiumDriver);
    }

    @Step("Navigate to half day leave screen")
    public static void navigateToHalfDayScreen() throws InterruptedException {
        halfDayLeave.navigateToHalfDayLeaveScreen();
    }

    @Step("Apply half day leave")
    public static void applyHalfDayLeave() throws InterruptedException {
        waitForMobileElement(ctar.nextButton);
        ctar.nextButton.click();
        waitForMobileElement(ocrp.CLOSE);
        ocrp.CLOSE.click();
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
        ocrp.dateButton.get(5).click();
        waitForMobileElement(ocrp.selectButton);
        ocrp.selectButton.click();
        waitForMobileElement(ctar.nextButton);
        ctar.nextButton.click();
        waitForMobileElement(ocrp.CLOSE);
        ocrp.CLOSE.click();
        waitForMobileElement(hdlr.season);
        hdlr.season.click();
        waitForMobileElement(hdlr.morning);
        hdlr.morning.click();
        waitForMobileElement(ctar.nextButton);
        ctar.nextButton.click();
        waitForMobileElement(br.description);
        br.description.clear();
        br.description.sendKeys("Errand");
        waitForMobileElement(fdlr.rememberCheckBox);
        fdlr.rememberCheckBox.click();
        waitForMobileElement(ctar.nextButton);
        ctar.nextButton.click();
        waitForMobileElement(ocrp.submitButton);
        ocrp.submitButton.click();
        waitForMobileElement(ocrp.CLOSE);
        ocrp.CLOSE.click();
        //app will be navigated to home page
    }

}
