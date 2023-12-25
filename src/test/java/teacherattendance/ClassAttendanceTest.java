package teacherattendance;

import org.testng.annotations.Test;
import school.bright.generic.TestBase;
import school.bright.pages.Pages;

import static school.bright.attendance.ClassAttendance.attendanceTaken;
import static school.bright.attendance.ClassAttendance.mathAttendanceTaken;

public class ClassAttendanceTest extends TestBase {
    @Test(priority = 0, description = "Navigate to take class attendance screen")
    public void navigateToClassAttendanceScreen(){
        Pages.ClassAttendance().navigateToClassAttendaceFromHomePage();
    }

    @Test(priority = 1, description = "Navigate to detail page by enterig class level, class and subject")
    public void navigateToDetailPageOfClassAttendance() throws InterruptedException {
        Pages.ClassAttendance().navigateToDetailScreenOfClassAttendance();
    }

    @Test(priority = 2, description = "Unsuccessfully take attendance")
    public void unsuccessfullyTakeAttendance() throws InterruptedException {
        if(attendanceTaken==false){
            Pages.CheckInTeacherAttendanceFromRoomPage().dontCheckInAllStudentsAsOnTime();
            Pages.CheckInTeacherAttendanceFromRoomPage().dontCheckinAllStudentsAsLate();
            Pages.CheckInTeacherAttendanceFromRoomPage().dontCheckinAllStudentsAsAbsence();
            Pages.CheckInTeacherAttendanceFromRoomPage().dontCheckinAllStudentsAsPersonalLeave();
            Pages.CheckInTeacherAttendanceFromRoomPage().dontCheckinAllStudentsAsSick();
            Pages.CheckInTeacherAttendanceFromRoomPage().dontCheckinAllStudentsAsEvent();
            Pages.CheckInTeacherAttendanceFromRoomPage().dontCheckinAllStudentsAsUndefined();
        }else{
            System.out.println("This course has already bee taken attendance");
        }
    }
    @Test(priority = 3, description = "Successfully take attendance")
    public void successfullyTakeAttendance() throws InterruptedException {
        if(attendanceTaken==false){
            Pages.ClassAttendance().successfullyTakeClassAttendance();
        }else{
            System.out.println("This course has already bee taken attendance");
        }

    }

    @Test(priority = 4, description = "Copy attendance for maths")
    public void copyAttendanceForMath() throws InterruptedException {
        Pages.ClassAttendance().navigateToClassAttendaceFromHomePage();
        Pages.ClassAttendance().navigateToDetailScreen();
        if(mathAttendanceTaken==false){
            Pages.ClassAttendance().copyAttendanceForMath();
        }

    }

}
