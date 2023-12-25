package teachersleave;

import org.testng.annotations.Test;
import school.bright.generic.TestBase;
import school.bright.pages.Pages;

public class TeachersLeaveTest extends TestBase {
    @Test(priority = 0,description = "Navigate to full day leave screen")
    public void navigateToFullDayLeave() throws InterruptedException {
        Pages.FullDayLeave().navigateToFullDayLeaveScreen();
    }

    @Test(priority = 1, description = "Apply full day leave")
    public void applyFullDayLeave() throws InterruptedException {
        Pages.FullDayLeave().applyFullDayLeave();
    }

    @Test(priority = 2,description = "navigate to half day leave screen")
    public void navigateToHalfDayLeave() throws InterruptedException {
        Pages.HalfDayLeave().navigateToHalfDayLeaveScreen();
    }

    @Test(priority = 3, description = "Apply half day leave")
    public void applyHalfDayLeave() throws InterruptedException {
        Pages.HalfDayLeave().applyHalfDayLeave();
    }
}
