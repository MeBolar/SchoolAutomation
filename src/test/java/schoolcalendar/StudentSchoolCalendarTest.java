package schoolcalendar;

import org.testng.annotations.Test;
import school.bright.generic.StudentTestBase;
import school.bright.pages.Pages;

public class StudentSchoolCalendarTest extends StudentTestBase {
    @Test(priority = 0,description = "Navigate to school calendar screen")
    public void navigateToSchoolCalendar() throws InterruptedException {
        Pages.SchoolCalendar().navigateToSchoolCalendarScreen();
    }

    @Test(priority = 1, description = "Validate school calendar test cases")
    public void validateCalendarTestCases() throws InterruptedException {
        Pages.SchoolCalendar().validateCalendarUseCases();
    }
}
