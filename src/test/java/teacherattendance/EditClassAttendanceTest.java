package teacherattendance;

import org.testng.annotations.Test;
import school.bright.generic.TestBase;
import school.bright.pages.Pages;

import static school.bright.attendance.ClassAttendance.attendanceTaken;

public class EditClassAttendanceTest extends TestBase {
    @Test(priority = 0, description = "Navigate to edit class attendance screen")
    public void navigateToEditClassAttendanceScreen(){
        Pages.EditClassAttendance().navigateToEditClassAttendanceScreen();
    }

    @Test(priority = 1, description = "Negative test cases for editting class attendance")
    public void unsuccessfullyEditClassAttendace() throws InterruptedException {
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


    @Test(priority = 3, description = "Edit class attendance as success")
    public void editClassAttendanceAsSuccess() throws InterruptedException {
        Pages.EditClassAttendance().editClassAttendanceToSuccess();
        if(attendanceTaken==false){
            //Code to update student attendance as absence
            Pages.EditClassAttendance().updateStudentAttendanceAsAbsent();
        }
    }

    @Test(priority = 4, description = "Copy class attendance")
    public void copyAttendance() throws InterruptedException {
        Pages.EditClassAttendance().copyClassAttendance();
        if(attendanceTaken==false){
            //Code to update student attendance as absence
            Pages.EditClassAttendance().copyAttendance();
        }
    }

}
