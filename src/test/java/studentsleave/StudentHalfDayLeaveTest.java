package studentsleave;

import org.testng.annotations.Test;
import school.bright.generic.StudentTestBase;
import school.bright.pages.Pages;

public class StudentHalfDayLeaveTest extends StudentTestBase {
    @Test(priority = 0,description = "Navigate to half day leave screen")
    public void navigateToHalfDayLeaveScreen() throws InterruptedException {
        Pages.StudentHalfDayLeave().navigateToHalfDayScreen();
    }

    @Test(priority = 1, description = "Apply half day leave")
    public void applyHalfDayLeave() throws InterruptedException {
        Pages.StudentHalfDayLeave().applyHalfDayLeave();
    }
}
