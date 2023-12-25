package disciplinescore;

import org.testng.annotations.Test;
import school.bright.generic.TestBase;
import school.bright.pages.Pages;

public class DisciplineScoreTest extends TestBase {
    @Test(priority = 0, description = "Navigate to add discipline score screen anf validate fields")
    public void navigateToAddDisciplineScreenAndValidate() throws InterruptedException {
        Pages.AddDisciplineScore().navigateToAddDiscScoreScreen();
        Pages.AddDisciplineScore().validateAllFields();
        Pages.AddDisciplineScore().searchStudent();
        Pages.AddDisciplineScore().addDisciplineScore();
    }

}
