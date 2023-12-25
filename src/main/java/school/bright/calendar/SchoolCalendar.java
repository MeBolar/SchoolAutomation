package school.bright.calendar;

import io.qameta.allure.Step;
import school.bright.attendance.CheckinTeacherAttendanceRepo;
import school.bright.generic.Base;
import school.bright.topupamount.Topuprepo;

public class SchoolCalendar extends Base {
    public static CheckinTeacherAttendanceRepo ctar;
    public static SchoolCalendarRepo scr;
    public static Topuprepo tr;
    public SchoolCalendar(){
        scr=new SchoolCalendarRepo(appiumDriver);
        ctar=new CheckinTeacherAttendanceRepo(appiumDriver);
        tr=new Topuprepo(appiumDriver);
    }


    @Step("Navigate to school calendar screen")
    public static void navigateToSchoolCalendarScreen() throws InterruptedException {
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
        waitForMobileElement(scr.schoolCalendar);
        scr.schoolCalendar.click();
    }


    @Step("Validate calendar use cases")
    public static void validateCalendarUseCases() throws InterruptedException {
        Thread.sleep(4000);
        scr.arrowButton.get(1).click();
        Thread.sleep((2000));
        scr.arrowButton.get(2).click();
        Thread.sleep((2000));
        tr.imageView.get(0).click();

    }


}
