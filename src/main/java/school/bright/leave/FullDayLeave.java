package school.bright.leave;

import io.qameta.allure.Step;
import school.bright.attendance.CheckinTeacherAttendanceRepo;
import school.bright.broadcast.BroadcastRepo;
import school.bright.classroom.OnlineClassRoomRepo;
import school.bright.generic.Base;

public class FullDayLeave extends Base {
    public static FullDayLeaveRepo fdlr;
    public static CheckinTeacherAttendanceRepo ctar;
    public static OnlineClassRoomRepo ocrp;
    public static BroadcastRepo br;
    public FullDayLeave(){
        fdlr=new FullDayLeaveRepo(appiumDriver);
        ctar=new CheckinTeacherAttendanceRepo(appiumDriver);
        ocrp=new OnlineClassRoomRepo(appiumDriver);
        br=new BroadcastRepo(appiumDriver);
    }
    @Step("navigate to full day leave screen")
    public static void navigateToFullDayLeaveScreen() throws InterruptedException {
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
        waitForMobileElement(fdlr.fullDay);
        fdlr.fullDay.click();
    }

    @Step("apply full day leave")
    public static void applyFullDayLeave() throws InterruptedException {
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
        ocrp.dateButton.get(8).click();
        waitForMobileElement(ocrp.selectButton);
        ocrp.selectButton.click();
        waitForMobileElement(ctar.nextButton);
        ctar.nextButton.click();
        waitForMobileElement(ocrp.CLOSE);
        ocrp.CLOSE.click();
        waitForMobileElement(fdlr.endDate);
        fdlr.endDate.click();
        Thread.sleep(2000);
        ocrp.dateButton.get(9).click();
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
