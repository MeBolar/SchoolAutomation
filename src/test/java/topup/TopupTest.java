package topup;

import org.testng.annotations.Test;
import school.bright.generic.TestBase;
import school.bright.pages.Pages;

public class TopupTest extends TestBase {

    @Test(priority = 0,description = "Navigate to topup screen")
    public void navigateToTopuScreen() throws InterruptedException {
        Pages.Topup().navigateToTopUpScreen();
    }

    @Test(priority = 1, description = "Topup")
    public void topup() throws InterruptedException {
        Pages.Topup().topup();
    }
}
