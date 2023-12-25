package school.bright.classroom;

import io.qameta.allure.Step;
import school.bright.attendance.CheckinTeacherAttendanceRepo;
import school.bright.generic.Base;

public class StudentOnlineClassRoom extends Base {
    public static StudentOnlineClassRoomRepo socr;
    public static CheckinTeacherAttendanceRepo ctar;
    public StudentOnlineClassRoom(){
        socr= new StudentOnlineClassRoomRepo(appiumDriver);
        ctar=new CheckinTeacherAttendanceRepo(appiumDriver);
    }


    @Step("Navigate to online class room screen")
    public static void navigateToOnlineClassRoom(){
        waitForMobileElement(ctar.onlineClassroom);
        ctar.onlineClassroom.click();
    }

    @Step("Select semester")
    public static void selectSemester() throws InterruptedException {
        waitForMobileElement(socr.academicYear);
        socr.academicYear.click();
        Thread.sleep(2000);
        waitForMobileElement(socr.year2035);
        socr.year2035.click();
        Thread.sleep(2000);
        waitForMobileElement(socr.nextButton);
        socr.nextButton.click();
        Thread.sleep(2000);
        waitForMobileElement(socr.closeButton);
        socr.closeButton.click();
        //Select academic year as 2023
        waitForMobileElement(socr.academicYear);
        socr.academicYear.click();
        Thread.sleep(2000);
        scrollDown();
        waitForMobileElement(socr.year2023);
        socr.year2023.click();
        Thread.sleep(2000);
        //Select semester as 2
        waitForMobileElement(socr.semester);
        socr.semester.click();
        Thread.sleep(2000);
        waitForMobileElement(socr.semester2);
        socr.semester2.click();
        waitForMobileElement(socr.nextButton);
        socr.nextButton.click();
    }

    @Step("Send homework")
    public static void sendHomeWork(){

    }

}
