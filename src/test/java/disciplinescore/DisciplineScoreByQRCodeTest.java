package disciplinescore;

import org.testng.annotations.Test;
import school.bright.generic.TestBase;
import school.bright.pages.Pages;

public class DisciplineScoreByQRCodeTest extends TestBase {

    @Test(priority = 0,description = "Navigate to discipline score screen")
    public void addDisciplineScoreScreen() throws InterruptedException {
        Pages.AddDisciplineScore().navigateToAddDiscScoreScreen();
    }

    @Test(priority =1, description = "Add discipline score via qr code")
    public void addDisciplineScoreViaQRCode() throws InterruptedException {
        Pages.DisciplineScoreByQR().addDisciplineScoreByQRCode();
    }
}
