package teacherattendance;

import org.testng.annotations.Test;
import school.bright.generic.TestBase;
import school.bright.pages.Pages;

public class CheckOutAttendanceTest extends TestBase {
    @Test(priority = 0, description = "Navigate to checkout attendance screen")
    public void navigateToCheckOutAttendanceScreen(){
        Pages.CheckOutAttendance().navigateToCheckOutScreenFromHomePage();
    }

    @Test(priority = 1, description = "Checking out attendance via QR code")
    public void attendanceCheckOutViaQRCode(){
        Pages.CheckOutAttendance().checkOutAttendanceViaQRCode();
    }

    @Test(priority = 2, description = "Checking out attendance via student id")
    public void attendanceCheckOutViaStudentID() throws InterruptedException {
        Pages.CheckOutAttendance().checkOutAttendanceWithoutStudentID();
        Pages.CheckOutAttendance().checkOutAttendanceWithWrongStudentID();
        Pages.CheckOutAttendance().checkOutAttendanceWithValidStudentID();
    }


}
