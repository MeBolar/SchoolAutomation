package report;


import org.testng.annotations.Test;
import school.bright.generic.TestBase;
import school.bright.pages.Pages;

public class ReportTest extends TestBase {
    @Test(priority = 0, description = "Navigate to report screen")
    public void navigateToReportScreen() throws InterruptedException {
        Pages.Report().navigateToReportScreen();
    }

    @Test(priority = 1, description = "Student checkin report")
    public void studentCheckInReport() throws InterruptedException {
        Pages.Report().studentCheckInReport();
    }

    @Test(priority = 2, description = "Student checkin via subject")
    public void studentCheckinSubjectReport() throws InterruptedException {
        Pages.Report().navigateToReportScreen();
        Pages.Report().studentCheckinSubjectReport();
    }

    @Test(priority = 3, description = "Discipline score test")
    public void disciplineScoreReport() throws InterruptedException {
        Pages.Report().navigateToReportScreen();
        Pages.Report().disciplineScoreReport();
    }

    @Test(priority = 4, description = "Student executive report")
    public void studentExecutiveReport() throws InterruptedException {
        Pages.Report().navigateToReportScreen();
        Pages.Report().studentExecutiveReport();
    }

    @Test(priority = 5, description = "Personal executive report")
    public void personalExecutiveReport() throws InterruptedException {
        Pages.Report().navigateToReportScreen();
        Pages.Report().personalExecutiveReport();
    }

    @Test(priority = 6, description = "Uncheck name report")
    public void unchecknameReport() throws InterruptedException {
        Pages.Report().navigateToReportScreen();
        Pages.Report().uncheckNameReport();
    }

    @Test(priority = 7, description = "Broadcast report")
    public void broadcastReport() throws InterruptedException {
        Pages.Report().navigateToReportScreen();
        Pages.Report().broadcastReport();
    }

    @Test(priority = 8, description = "Top up report")
    public void topupReport() throws InterruptedException {
        Pages.Report().navigateToReportScreen();
        Pages.Report().topupReport();
    }

    @Test(priority = 9, description = " Sales report")
    public void salesReport() throws InterruptedException {
        Pages.Report().navigateToReportScreen();
        Pages.Report().salesReport();
    }
    @Test(priority = 10,description = "Tuition report")
    public void tuitionReport() throws InterruptedException {
        Pages.Report().navigateToReportScreen();
        Pages.Report().tuitionReport();
    }
    @Test(priority = 11,description = "Personal attendance report")
    public void personalAttendanceReport() throws InterruptedException {
        Pages.Report().navigateToReportScreen();
        Pages.Report().personalAttendanceReport();
    }

    @Test(priority = 12, description = "Personal leave report")
    public void personalLeaveReport() throws InterruptedException {
        Pages.Report().navigateToReportScreen();
        Pages.Report().personalLeaveReport();
    }
    @Test(priority = 13, description = "Personal topup report")
    public void personalTopupReport() throws InterruptedException {
        Pages.Report().navigateToReportScreen();
        Pages.Report().personalTopupReport();
    }

    @Test(priority = 14, description = "Personal purchase report")
    public void personalPurchaseReport() throws InterruptedException {
        Pages.Report().navigateToReportScreen();
        Pages.Report().personalPurchaseReport();
    }

    @Test(priority = 15,description = "Broadcast report")
    public void personalBroadcastReport() throws InterruptedException {
        Pages.Report().navigateToReportScreen();
        Pages.Report().personalBroadcastReport();

    }

}
