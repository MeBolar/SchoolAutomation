package school.bright.classtimetable;

import io.qameta.allure.Step;
import school.bright.generic.Base;
import school.bright.topupamount.Topuprepo;

public class StudentTimeTable extends Base {
    public static StudentTimeTableRepo sttr;
    public static TimeTableRepo ttr;
    public static Topuprepo tr;
    public StudentTimeTable(){
        tr=new Topuprepo(appiumDriver);
        sttr=new StudentTimeTableRepo(appiumDriver);
        ttr=new TimeTableRepo(appiumDriver);
    }

    @Step("Student time table flow")
    public static void checkStudentTimeTable() throws InterruptedException {
        waitForMobileElement(sttr.timeTable);
        sttr.timeTable.click();
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
