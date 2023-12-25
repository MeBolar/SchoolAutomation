package message;

import org.testng.annotations.Test;
import school.bright.generic.TestBase;
import school.bright.pages.Pages;

public class MessageTest extends TestBase {
    @Test(priority = 0, description = "Naviagte to message screen")
    public void navigateToMessageScreen() throws InterruptedException {
        Pages.Message().navigateToMessageScreen();
    }

    @Test(priority = 1, description = "click on all tabs")
    public void clickAllTabs(){
        Pages.Message().clickAllTabs();
    }

    @Test(priority = 2, description = "Test filters")
    public void filters() throws InterruptedException {
        Pages.Message().navigateToMessageScreen();
        Pages.Message().applyFilters();
    }

    @Test(priority = 3, description = "Message response")
    public void response() throws InterruptedException {
        Pages.Message().navigateToMessageScreen();
        Pages.Message().buttonResponse();
    }

}
