package onlineclassroom;

import org.testng.annotations.Test;
import school.bright.generic.StudentTestBase;
import school.bright.generic.TestBase;
import school.bright.pages.Pages;

public class StudentOnlineClassRoomTest extends StudentTestBase {
    @Test(priority = 0, description = "Navigate to student online class room screen")
    public void navigateToStudentOnlineClassRoomScreen(){
        Pages.StudentOnlineClassRoom().navigateToOnlineClassRoom();
    }

    @Test(priority = 1, description = "Select semester")
    public void selectSemester() throws InterruptedException {
        Pages.StudentOnlineClassRoom().selectSemester();
    }

    @Test(priority = 2, description = "Send homework")
    public void sendHomeWork(){

    }
}
