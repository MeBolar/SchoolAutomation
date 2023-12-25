package school.bright.pages;

import school.bright.academicresult.AcademicResult;
import school.bright.appmessage.Message;
import school.bright.attendance.*;
import school.bright.broadcast.Broadcast;
import school.bright.calendar.SchoolCalendar;
import school.bright.classroom.OnlineClassRoom;
import school.bright.classroom.StudentOnlineClassRoom;
import school.bright.classtimetable.StudentTimeTable;
import school.bright.classtimetable.TimeTable;
import school.bright.discscore.*;
import school.bright.generic.Base;
import school.bright.homevisitflow.HomeVisit;
import school.bright.leave.FullDayLeave;
import school.bright.leave.HalfDayLeave;
import school.bright.leave.StudentFullDayLeave;
import school.bright.leave.StudentHalfDayLeave;
import school.bright.login.AppLogin;
import school.bright.login.SetAppLanguage;
import school.bright.login.StudentLogin;
import school.bright.overallreport.Report;
import school.bright.setting.ChangePassword;
import school.bright.setting.ChangePin;
import school.bright.setting.Setting;
import school.bright.shop.SetPin;
import school.bright.shop.ShopSuccessful;
import school.bright.topupamount.Topup;

import java.nio.file.Paths;

public class Pages {

    private static <T extends Base> T getPage(Class<T> pageType)  {

        T apiCalled;
        try {
            apiCalled = pageType.newInstance();

        } catch (InstantiationException e) { //make sure you use JDK 1.7
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }

        return  apiCalled;

    }

    public static AppLogin AppLogin(){
        return getPage(AppLogin.class);
    }
    public static SetAppLanguage SetAppLanguage(){
        return getPage(SetAppLanguage.class);
    }
    public static CheckinTeacherAttendance CheckinTeacherAttendance(){
        return getPage(CheckinTeacherAttendance.class);
    }
    public static CheckInTeacherAttendanceFromRoomPage CheckInTeacherAttendanceFromRoomPage(){
        return getPage(CheckInTeacherAttendanceFromRoomPage.class);
    }
    public static EditCheckedInAttendance EditCheckedInAttendance(){
        return getPage(EditCheckedInAttendance.class);
    }
    public static CheckOutAttendance CheckOutAttendance(){
        return getPage(CheckOutAttendance.class);
    }
    public static ClassAttendance ClassAttendance(){
        return getPage(ClassAttendance.class);
    }

    public static EditClassAttendance EditClassAttendance(){
        return getPage(EditClassAttendance.class);
    }

    public static AddDisciplineScore AddDisciplineScore(){
        return getPage(AddDisciplineScore.class);
    }
    public static DisciplineScoreByQR DisciplineScoreByQR(){
        return getPage(DisciplineScoreByQR.class);
    }
    public static ReduceDisciplineScore ReduceDisciplineScore(){
        return getPage(ReduceDisciplineScore.class);
    }
    public static ReduceDisciplineScoreByStudentID ReduceDisciplineScoreByStudentID(){
        return getPage(ReduceDisciplineScoreByStudentID.class);
    }
    public static ReduceDisciplineScoreByQRCode ReduceDisciplineScoreByQRCode(){
        return getPage(ReduceDisciplineScoreByQRCode.class);
    }
    public static OnlineClassRoom OnlineClassRoom(){
        return getPage(OnlineClassRoom.class);
    }
    public static Broadcast Broadcast(){
        return getPage(Broadcast.class);
    }
    public static FullDayLeave FullDayLeave(){
        return getPage(FullDayLeave.class);
    }
    public static HalfDayLeave HalfDayLeave(){
        return getPage(HalfDayLeave.class);
    }
    public static Topup Topup(){
        return getPage(Topup.class);
    }
    public static SetPin SetPin(){
        return getPage(SetPin.class);
    }
    public static ShopSuccessful ShopSuccessful(){
        return getPage(ShopSuccessful.class);
    }
    public static TimeTable TimeTable(){
        return getPage(TimeTable.class);
    }

    public static HomeVisit HomeVisit(){
        return getPage(HomeVisit.class);
    }
    public static SchoolCalendar SchoolCalendar(){
        return getPage(SchoolCalendar.class);
    }

    public static Report Report(){
        return getPage(Report.class);
    }
    public static Setting Setting(){
        return getPage(Setting.class);
    }
    public static ChangePassword ChangePassword(){
        return getPage(ChangePassword.class);
    }
    public static ChangePin ChangePin(){
        return getPage(ChangePin.class);
    }
    public static Message Message(){
        return getPage(Message.class);}
    public static StudentLogin  StudentLogin(){
        return getPage(StudentLogin.class);
    }
    public static StudentTimeTable StudentTimeTable(){
        return getPage(StudentTimeTable.class);
    }
    public static StudentOnlineClassRoom StudentOnlineClassRoom(){
        return getPage(StudentOnlineClassRoom.class);
    }
    public static AcademicResult AcademicResult(){
        return getPage(AcademicResult.class);
    }
    public static StudentFullDayLeave StudentFullDayLeave(){
        return getPage(StudentFullDayLeave.class);
    }
    public static StudentHalfDayLeave StudentHalfDayLeave(){
        return getPage(StudentHalfDayLeave.class);
    }

}
