package broadcastflow;

import org.testng.annotations.Test;
import school.bright.generic.TestBase;
import school.bright.pages.Pages;

public class BroadcastTest extends TestBase {
    @Test(priority = 0,description = "navigate to broadcast screen")
    public void navigateToBroadcastScreen() throws InterruptedException {
        Pages.Broadcast().navigateToBroadcastScreen();
    }

    @Test(priority = 1, description = "broad cast messages negative test cases")
    public void broadcastMessageNegativeScrenario(){
        Pages.Broadcast().broadcastAllNegativeTestCases();
    }

    @Test(priority = 2, description = "broadcast all")
    public void broadcastAll(){
        Pages.Broadcast().broadcastAll();
    }

    @Test(priority = 3, description = "broadcast to selected students")
    public void broadcastToSelectedStudents() throws InterruptedException {
        Pages.Broadcast().navigateToBroadcastScreen();
        Pages.Broadcast().broadcastToSelectedStudents();
    }

    @Test(priority = 4, description = "broadcast to individual teacher")
    public void broadcastToIndividualTeacher() throws InterruptedException {
        Pages.Broadcast().navigateToBroadcastScreen();
        Pages.Broadcast().broadcastToSelectedTeachers();
    }

    @Test(priority = 5,description = "broadcast to individual students")
    public void broadcastToIndividualStudents() throws InterruptedException {
        Pages.Broadcast().navigateToBroadcastScreen();
        Pages.Broadcast().broadcastToIndividualStudents();
    }

}
