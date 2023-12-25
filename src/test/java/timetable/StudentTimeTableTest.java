package timetable;

import org.testng.annotations.Test;
import school.bright.generic.StudentTestBase;
import school.bright.generic.TestBase;
import school.bright.pages.Pages;

public class StudentTimeTableTest extends StudentTestBase {

    @Test(priority = 0, description = "Check studet time table")
    public void checkStudentTimeTable() throws InterruptedException {
        Pages.StudentTimeTable().checkStudentTimeTable();
    }
}
