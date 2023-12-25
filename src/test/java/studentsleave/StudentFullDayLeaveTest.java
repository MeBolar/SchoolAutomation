package studentsleave;

import org.testng.annotations.Test;
import school.bright.generic.StudentTestBase;
import school.bright.pages.Pages;

public class StudentFullDayLeaveTest extends StudentTestBase {

    @Test(priority = 0,description = "Navigate to student full day screen")
    public void navigateToFullDayScreen() throws InterruptedException {
        Pages.StudentFullDayLeave().navigateToFullDayScreen();
    }

    @Test(priority = 1, description = "Apply full day leave")
    public void applyFullDayLeave() throws InterruptedException {
        Pages.StudentFullDayLeave().applyFullDayLeave();
    }

}
