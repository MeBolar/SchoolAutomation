package academicstudentresult;

import org.testng.annotations.Test;
import school.bright.generic.StudentTestBase;
import school.bright.generic.TestBase;
import school.bright.pages.Pages;

public class AcademicResultTest extends StudentTestBase {

    @Test(priority = 0, description = "Validate sem1 mid term result")
    public void validateSem1MidTermResult() throws InterruptedException {
        Pages.AcademicResult().navigateToAcademicResultScreen();
        Pages.AcademicResult().sem1MidTermResult();
    }

    @Test(priority = 1, description = "Validate sem 1 result")
    public void validateSem1Result() throws InterruptedException {
        Pages.AcademicResult().navigateToAcademicResultScreen();
        Pages.AcademicResult().sem1FinalResult();
    }

    @Test(priority = 2, description = "Validate sem 2 mid term")
    public void validateSem2MidTerm() throws InterruptedException {
        Pages.AcademicResult().navigateToAcademicResultScreen();
        Pages.AcademicResult().sem2MidTerm();
    }

    @Test(priority = 3, description = "Validate sem 2 final result")
    public void validateSem2Result() throws InterruptedException {
        Pages.AcademicResult().navigateToAcademicResultScreen();
        Pages.AcademicResult().sem2FinalResult();
    }

    @Test(priority = 4, description = "Validate final result")
    public void validateFinalResult() throws InterruptedException {
        Pages.AcademicResult().navigateToAcademicResultScreen();
        Pages.AcademicResult().yearlyResult();
    }

}
