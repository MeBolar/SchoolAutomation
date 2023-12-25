package school.bright.leave;

import io.qameta.allure.Step;
import school.bright.attendance.CheckinTeacherAttendanceRepo;
import school.bright.broadcast.BroadcastRepo;
import school.bright.classroom.OnlineClassRoomRepo;
import school.bright.generic.Base;

public class HalfDayLeave extends Base {
    public static HalfDayLeaveRepo hdlr;
    public static FullDayLeaveRepo fdlr;
    public static OnlineClassRoomRepo ocrp;
    public static BroadcastRepo br;
    public static CheckinTeacherAttendanceRepo ctar;
    public HalfDayLeave(){
        hdlr=new HalfDayLeaveRepo(appiumDriver);
        ctar=new CheckinTeacherAttendanceRepo(appiumDriver);
        fdlr=new FullDayLeaveRepo(appiumDriver);
        ocrp=new OnlineClassRoomRepo(appiumDriver);
        br=new BroadcastRepo(appiumDriver);
    }
    @Step("Navigate to half day leave")
    public static void navigateToHalfDayLeaveScreen() throws InterruptedException {
        Thread.sleep(4000);
        try{
            Thread.sleep(3000);
            //Click on menu button
            ctar.imageView.get(0).click();
        }catch (Exception e){
            //Click on menu button
            ctar.imageView.get(0).click();
        }
        waitForMobileElement(fdlr.leave);
        fdlr.leave.click();
        try{
            Thread.sleep(4000);
            hdlr.halfDay.click();
        }catch (Exception e){
            waitForMobileElement(fdlr.leave);
            fdlr.leave.click();
            waitForMobileElement(hdlr.halfDay);
            hdlr.halfDay.click();
        }

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
