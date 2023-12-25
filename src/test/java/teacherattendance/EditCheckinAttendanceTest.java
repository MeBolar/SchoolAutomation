package teacherattendance;

import org.testng.annotations.Test;
import school.bright.generic.TestBase;
import school.bright.pages.Pages;

public class EditCheckinAttendanceTest extends TestBase {
    @Test(priority = 0)
    public void editCheckedInAttendance() throws InterruptedException {
        Pages.EditCheckedInAttendance().navigateToEditCheckInScreen();
        Pages.EditCheckedInAttendance().editAttendanceCheckin();
    }

    @Test(priority = 1, description = "Test case to make sure edit flow of on time works")
    public void validateEditCheckinFlowOfOnTIME() throws InterruptedException {
        Pages.CheckInTeacherAttendanceFromRoomPage().dontCheckInAllStudentsAsOnTime();
    }

    @Test(priority = 2, description = "Test case to make sure edit flow of late works")
    public void validateEditCheckinFlowOFLate() throws InterruptedException {
        Pages.CheckInTeacherAttendanceFromRoomPage().dontCheckinAllStudentsAsLate();
    }

    @Test(priority = 3, description = "Test case to make sure edit flow of absence works")
    public void validateEditCheckinFlowOfAbsence() throws InterruptedException {
        Pages.CheckInTeacherAttendanceFromRoomPage().dontCheckinAllStudentsAsAbsence();
    }

    @Test(priority = 4, description = "Test case to make sure edit flow of personal leave works")
    public void validateEditCheckinFlowOfPersonalLeave() throws InterruptedException {
        Pages.CheckInTeacherAttendanceFromRoomPage().dontCheckinAllStudentsAsPersonalLeave();
    }

    @Test(priority = 5, description = "Test case to make sure edit flow of sick leave works")
    public void validateEditCheckinFlowOfSickLeave() throws InterruptedException {
        Pages.CheckInTeacherAttendanceFromRoomPage().dontCheckinAllStudentsAsSick();
    }

    @Test(priority = 6, description = "Test case to make sure edit flow of event works")
    public void validateEditCheckinFlowOfEvent() throws InterruptedException {
        Pages.CheckInTeacherAttendanceFromRoomPage().dontCheckinAllStudentsAsEvent();
    }

    @Test(priority = 7, description = "Test case to make sure edit flow of undefined works")
    public void validateEditCheckinFlowOfUndefined() throws InterruptedException {
        Pages.CheckInTeacherAttendanceFromRoomPage().dontCheckinAllStudentsAsUndefined();
    }

    @Test(priority = 8, description = "Test case to checkin student as late")
    public void checkInStudentAsLate() throws InterruptedException {
        Pages.EditCheckedInAttendance().navigateToEditCheckInScreen();
        Pages.EditCheckedInAttendance().selectClassAndLevel();

    }
}
