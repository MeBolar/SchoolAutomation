package timetable;

import org.testng.annotations.Test;
import school.bright.generic.TestBase;
import school.bright.pages.Pages;

public class TimeTableTest extends TestBase {
    @Test(priority = 0, description = "Navigate to timetable screen")
    public void navigateToTimeTableScreen() throws InterruptedException {
        Pages.TimeTable().checkTimeTable();
    }
}
