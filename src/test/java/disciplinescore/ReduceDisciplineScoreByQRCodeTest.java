package disciplinescore;

import org.testng.annotations.Test;
import school.bright.generic.TestBase;
import school.bright.pages.Pages;

public class ReduceDisciplineScoreByQRCodeTest extends TestBase {
    @Test(priority = 0, description = "Navigate to reduce discipline score")
    public void navigateToReduceDisciplineScore() throws InterruptedException {
        Pages.ReduceDisciplineScore().navigateToReduceDisciplineScore();
    }

    @Test(priority = 1, description = "Reduce discipline score by QR code")
    public void navigateToReduceDisciplineScoreByQRCode() throws InterruptedException {
        Pages.ReduceDisciplineScoreByQRCode().reduceDisciplineScore();
    }
}
