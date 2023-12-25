package disciplinescore;

import org.testng.annotations.Test;
import school.bright.generic.TestBase;
import school.bright.pages.Pages;

public class DisciplineScoreByStudentIDTest extends TestBase {
    @Test(priority = 0, description = "Trying to add discipline score by not entering student id")
    public void addDisciplineScoreByNotEnteringStudentID() throws InterruptedException {
        Pages.AddDisciplineScore().navigateToAddDiscScoreScreen();
        Pages.DisciplineScoreByQR().addDisciplineScoreWithoutEnteringStudentID();
    }
    @Test(priority = 1, description = "Trying to add discipline score by entering wrong student ID")
    public void addDisciplineScoreByWrongStudentID() throws InterruptedException {
        Pages.DisciplineScoreByQR().addDisciplineScoreByWrongStudentID();
    }

    @Test(priority = 2,description = "Trying to add discipline score by entering valid student ID")
    public void addDisciplineScoreByValidStudentID() throws InterruptedException {
        Pages.DisciplineScoreByQR().addDisciplineScoreByValidStudentID();
    }
}
