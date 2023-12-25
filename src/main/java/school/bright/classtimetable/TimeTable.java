package school.bright.classtimetable;

import io.qameta.allure.Step;
import school.bright.attendance.CheckinTeacherAttendanceRepo;
import school.bright.generic.Base;
import school.bright.topupamount.Topuprepo;

public class TimeTable extends Base {
    public static TimeTableRepo ttr;
    public static Topuprepo tr;
    public static CheckinTeacherAttendanceRepo ctar;
    public TimeTable(){
        tr=new Topuprepo(appiumDriver);
        ttr=new TimeTableRepo(appiumDriver);
        ctar=new CheckinTeacherAttendanceRepo(appiumDriver);
    }

    @Step("Navigate to time table screen")
    public static void checkTimeTable() throws InterruptedException {
        waitForMobileElement(ttr.timeTable);
        ttr.timeTable.click();
        Thread.sleep(4000);
        ttr.S.get(0).click();
        Thread.sleep(2000);
        ttr.M.click();
        Thread.sleep(2000);
        ttr.T.get(0).click();
        Thread.sleep(2000);
        ttr.W.click();
        Thread.sleep(2000);
        ttr.T.get(1).click();
        Thread.sleep(2000);
        ttr.F.click();
        Thread.sleep(2000);
        ttr.S.get(1).click();
        //Click on academic year
        Thread.sleep(2000);
        ttr.academicYear.click();
        waitForMobileElement(ttr.year2037);
        ttr.year2037.click();
        Thread.sleep(3000);
        tr.imageView.get(0).click();
        //user navigated to home screen
    }

}
