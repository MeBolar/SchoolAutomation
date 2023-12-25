package school.bright.leave;

import io.qameta.allure.Step;
import school.bright.attendance.CheckinTeacherAttendanceRepo;
import school.bright.generic.Base;

public class LeaveRequest extends Base {
    public static CheckinTeacherAttendanceRepo ctar;
    public static LeaveRequestRepo lrr;
    public LeaveRequest(){
        lrr=new LeaveRequestRepo(appiumDriver);
        ctar=new CheckinTeacherAttendanceRepo(appiumDriver);
    }


    @Step("Navigate to leave request screen")
    public static void navigateToLeaveRequestScreen() throws InterruptedException {
        Thread.sleep(4000);
        try{
            Thread.sleep(3000);
            //Click on menu button
            ctar.imageView.get(0).click();
        }catch (Exception e){
            //Click on menu button
            ctar.imageView.get(0).click();
        }
        Thread.sleep(3000);
        scrollDown();
        waitForMobileElement(lrr.leaveRequest);
        lrr.leaveRequest.click();
    }

    @Step("Approve pending leaves")
    public static void approvePendingLeaves() throws InterruptedException {
        Thread.sleep(2000);
        waitForMobileElement(lrr.leaveRequest);
        lrr.pendingLeaves.get(0).click();
        Thread.sleep(3000);
        scrollDown();
        waitForMobileElement(lrr.approve);
        lrr.approve.click();
        try{
            //navigate back
            Thread.sleep(2000);
            lrr.viewGroup.get(0).click();
        }catch (Exception e){

        }
        
        //Navigate back to leave request screen
        Thread.sleep(2000);
        lrr.imageView.get(0).click();
    }

}
