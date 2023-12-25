package disciplinescore;

import org.testng.annotations.Test;
import school.bright.generic.TestBase;
import school.bright.pages.Pages;

public class ReduceDisciplineScoreByStudentID extends TestBase {
    @Test(priority = 0, description = "Navigate to reduce discipline score")
    public void navigateToReduceDisciplineScore() throws InterruptedException {
        Pages.ReduceDisciplineScore().navigateToReduceDisciplineScore();
    }

    @Test(priority = 1, description = "Reduce discipline score by not student ID")
    public void navigateToReduceDisciplineScoreByStudentID() throws InterruptedException {
        Pages.ReduceDisciplineScoreByStudentID().reduceDisciplineScoreWithoutEnteringStudentID();
    }

    @Test(priority = 2, description = "Reduce discipline score by entering wrong student ID")
    public void navigateToReduceDisciplineScoreByWrongStudentID() throws InterruptedException {
        Pages.ReduceDisciplineScoreByStudentID().reduceDisciplineScoreByWrongStudentID();
    }

    @Test(priority = 3, description = "Reduce discipline score by entering valid student ID")
    public void navigateToReduceDisciplineScoreByValidStudentID() throws InterruptedException {
        Pages.ReduceDisciplineScoreByStudentID().reduceDisciplineScoreByValidStudentID();
    }

}

