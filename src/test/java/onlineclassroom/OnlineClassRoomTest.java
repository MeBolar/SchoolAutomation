package onlineclassroom;

import org.testng.annotations.Test;
import school.bright.classroom.OnlineClassRoom;
import school.bright.generic.TestBase;
import school.bright.pages.Pages;

public class OnlineClassRoomTest extends TestBase {
    @Test(priority = 0, description = "Navigate to online classroom screen")
    public void navigateToOnlineClassRoomScreen() throws InterruptedException {
        Pages.OnlineClassRoom().navigateToOnlineClassRoom();
    }

    @Test(priority = 1,description = "Create online classroom")
    public void createOnlineClassroom(){
        Pages.OnlineClassRoom().createClassRoom();
    }

    @Test(priority = 2,description = "Create topic")
    public void createTopic() throws InterruptedException {
        Pages.OnlineClassRoom().createTopic();
    }

    @Test(priority = 3, description = "Create home work")
    public void createHomeWork() throws InterruptedException {
        Pages.OnlineClassRoom().createHomeWork();
    }

    @Test(priority = 4, description = "Edit home work")
    public void editHomeWork() throws InterruptedException {
        Pages.OnlineClassRoom().editHomeWork();
    }

    @Test(priority = 5, description = "Create Materials")
    public void createMaterials() throws InterruptedException {
        Pages.OnlineClassRoom().createMaterials();
    }

    @Test(priority = 6, description = "Edit Materials")
    public void editMaterials() throws InterruptedException {
        Pages.OnlineClassRoom().editMaterials();
    }

    @Test(priority = 7, description = "navigate to home screen")
    public void navigateToHomeScreen() throws InterruptedException {
        Pages.OnlineClassRoom().navigateToHomeScreen();
    }

    @Test(priority = 8, description = "checking homework")
    public void checkingHomeWork() throws InterruptedException {
        Pages.OnlineClassRoom().navigateToOnlineClassRoom();
        Pages.OnlineClassRoom().checkingHomeWork();
        Pages.OnlineClassRoom().navigateToHomeScreen();
    }
}
