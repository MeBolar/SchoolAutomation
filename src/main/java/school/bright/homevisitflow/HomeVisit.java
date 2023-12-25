package school.bright.homevisitflow;

import io.qameta.allure.Step;
import school.bright.attendance.CheckinTeacherAttendanceRepo;
import school.bright.generic.Base;

public class HomeVisit extends Base {
    public static HomeVisitRepo hvr;
    public static CheckinTeacherAttendanceRepo ctar;
    public HomeVisit(){
        hvr=new HomeVisitRepo(appiumDriver);
        ctar=new CheckinTeacherAttendanceRepo(appiumDriver);
    }

    @Step("Navigate to home visit screen")
    public static void navigateToHomeVisitScreen() throws InterruptedException {
        Thread.sleep(4000);
        try{
            Thread.sleep(3000);
            //Click on menu button
            ctar.imageView.get(0).click();
        }catch (Exception e){
            //Click on menu button
            ctar.imageView.get(0).click();
        }
        scrollDown();
        waitForMobileElement(hvr.homeVisit);
        hvr.homeVisit.click();
    }

}
