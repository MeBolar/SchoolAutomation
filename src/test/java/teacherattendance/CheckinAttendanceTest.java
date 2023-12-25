package teacherattendance;

import org.testng.annotations.Test;
import school.bright.generic.TestBase;
import school.bright.pages.Pages;

public class CheckinAttendanceTest extends TestBase {
    public static boolean attendanceTakenByTeacher=false;

    @Test(priority = 0,description = "Checkin Teacher Attendance")
    public void checkinAttendance() throws InterruptedException {
        Pages.CheckinTeacherAttendance().navigateToCheckinAttendance();
    }

    @Test(priority = 1, description = "Checkin with QR Code")
    public void checkInWithQRCode() throws InterruptedException{
        Pages.CheckinTeacherAttendance().checkinOntimeWithQRCode();
    }

    @Test(priority = 2, description = "Checkin Late With QR code")
    public void checkinLateWithQRCode() throws InterruptedException {
        Pages.CheckinTeacherAttendance().checkinLateWithQRCode();
    }

    @Test(priority = 3, description = "Checkin test case sceario with student ID")
    public void checkInLateWithStudentIDUseCase() throws InterruptedException {
        Pages.CheckinTeacherAttendance().checkinLateWithStudentIDScenario();
    }

    @Test(priority = 4,description = "Checkin late with wrong student ID")
    public void checkInLateWithWrongStudentID() throws InterruptedException {
        Pages.CheckinTeacherAttendance().checkinLateWithWrongStudentID();
    }
    @Test(priority = 5, description = "Checkin with valid student ID")
    public void checkinWithValidStudentID() throws InterruptedException {
       Pages.CheckinTeacherAttendance().checkinLateWithValidStudentID();
       Pages.CheckinTeacherAttendance().navigateBackToHomeScreen();
    }

    @Test(priority = 6,description = "Checkin Teacher Attendance From Room Page")
    public void checkinAttendanceViaClassRoom()throws InterruptedException{
        //Navigate to checkin attendance page from home page
        Pages.CheckinTeacherAttendance().renavigateToCheckinScreen();
        attendanceTakenByTeacher= Pages.CheckInTeacherAttendanceFromRoomPage().checkInAttendanceViaClassRoom();
    }

    @Test(priority = 7, description = "Searching the student based on student id")
    public void searchStudentViaRoomPage() throws InterruptedException {
        if(attendanceTakenByTeacher==false){
            Pages.CheckInTeacherAttendanceFromRoomPage().searchInvalidStudent();
            Pages.CheckInTeacherAttendanceFromRoomPage().searchValidStudent();
        }else{
            System.out.println("Attendance is already taken. Ignoring search functionality.");
        }
    }

    @Test(priority = 8, description = "Not to checkin students as ON TIME")
    public void notCheckingInStudentAsOnTIME() throws InterruptedException {
        if(attendanceTakenByTeacher==false){
            Pages.CheckInTeacherAttendanceFromRoomPage().dontCheckInAllStudentsAsOnTime();
        }else{
            System.out.println("Attendance is already taken. Ignoring search functionality.");
        }
    }

    @Test(priority = 9, description = "Not to checkin students as late")
    public void notCheckingInStudentsAsLate() throws InterruptedException {
        if(attendanceTakenByTeacher==false){
            Pages.CheckInTeacherAttendanceFromRoomPage().dontCheckinAllStudentsAsLate();
        }else{
            System.out.println("Attendance is already taken. Ignoring search functionality.");
        }
    }

    @Test(priority = 10, description = "Not to checkin students as Absence")
    public void notCheckingInStudentsAsAbsence() throws InterruptedException {
        if(attendanceTakenByTeacher==false){
            Pages.CheckInTeacherAttendanceFromRoomPage().dontCheckinAllStudentsAsAbsence();
        }else{
            System.out.println("Attendance is already taken. Ignoring search functionality.");
        }
    }

    @Test(priority = 11,description = "Not to checkin students as personal leave")
    public void notCheckingInStudentsAsPersonalLeave() throws InterruptedException {
        if(attendanceTakenByTeacher==false){
            Pages.CheckInTeacherAttendanceFromRoomPage().dontCheckinAllStudentsAsPersonalLeave();
        }else{
            System.out.println("Attendance is already taken. Ignoring search functionality.");
        }
    }

    @Test(priority = 12, description = "Not to checkin students as sick")
    public void notCheckingInStudentsAsSick() throws InterruptedException {
        if(attendanceTakenByTeacher==false){
            Pages.CheckInTeacherAttendanceFromRoomPage().dontCheckinAllStudentsAsSick();
        }else{
            System.out.println("Attendance is already taken. Ignoring search functionality.");
        }
    }

    @Test(priority = 13,description = "Not to checkin students as event")
    public void notCheckingInStudentsAsEvent() throws InterruptedException {
        if(attendanceTakenByTeacher==false){
            Pages.CheckInTeacherAttendanceFromRoomPage().dontCheckinAllStudentsAsEvent();
        }else{
            System.out.println("Attendance is already taken. Ignoring search functionality.");
        }
    }

    @Test(priority = 14, description = "Not to checkin students as undefined")
    public void notCheckingInStudentsAsUndefined() throws InterruptedException {
        if(attendanceTakenByTeacher==false){
            Pages.CheckInTeacherAttendanceFromRoomPage().dontCheckinAllStudentsAsUndefined();
        }else{
            System.out.println("Attendance is already taken. Ignoring search functionality.");
        }
    }

    @Test(priority = 15, description = "Checkin attendance successfully")
    public void checkInSuccess() throws InterruptedException {
        if(attendanceTakenByTeacher==false){
            Pages.CheckinTeacherAttendance().navigateToCheckinScreenFromHomePage();
            Pages.CheckInTeacherAttendanceFromRoomPage().navigateToClassRoom();
            Pages.CheckInTeacherAttendanceFromRoomPage().checkinStudentSuccessfully();
        }else{
            System.out.println("Attendance is already taken. Ignoring search functionality.");
        }
    }

    @Test(priority = 16, description = "Trying to checkin already checked in student")
    public void reCheckInStudent() throws InterruptedException {
        if(attendanceTakenByTeacher==false){
            Pages.CheckinTeacherAttendance().navigateToCheckinScreenFromHomePage();
            Pages.CheckInTeacherAttendanceFromRoomPage().navigateToClassRoom();
            Pages.CheckInTeacherAttendanceFromRoomPage().recheckInSameStudent();
        }else{
            System.out.println("Attendance is already taken. Ignoring search functionality.");
        }
    }


}
