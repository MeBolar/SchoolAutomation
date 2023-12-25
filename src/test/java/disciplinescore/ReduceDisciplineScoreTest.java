package disciplinescore;

import org.testng.annotations.Test;
import school.bright.generic.TestBase;
import school.bright.pages.Pages;

public class ReduceDisciplineScoreTest extends TestBase {
    @Test(priority = 0, description = "navigate to reduce discipline score")
    public void navigateToReduceDisciplineScore() throws InterruptedException {
        Pages.ReduceDisciplineScore().navigateToReduceDisciplineScore();
    }
    @Test(priority = 1, description = "Add class and class level")
    public void addClassAndClassLevel(){
        Pages.ReduceDisciplineScore().addClassLevelAndClass();
    }

    @Test(priority = 2, description = "Search student")
    public void searchStudent() throws InterruptedException {
        Pages.AddDisciplineScore().searchStudent();
    }

    @Test(priority = 3, description = "Reduce discipline score")
    public void reduceDisciplineScore() throws InterruptedException {
        Pages.ReduceDisciplineScore().reduceDisciplineScore();
    }

}

