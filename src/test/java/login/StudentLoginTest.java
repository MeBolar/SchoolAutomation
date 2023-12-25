package login;

import org.testng.annotations.Test;
import school.bright.generic.StudentTestBase;
import school.bright.generic.TestBase;
import school.bright.pages.Pages;

public class StudentLoginTest extends StudentTestBase {

    @Test(priority = 0, description = "Login as student")
    public void studentLogin() throws InterruptedException {
        Pages.StudentLogin().loginAsStudent();
    }
}
