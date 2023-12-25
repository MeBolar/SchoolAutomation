package school.bright.discscore;

import io.qameta.allure.Step;
import school.bright.attendance.CheckinTeacherAttendanceRepo;
import school.bright.generic.Base;
import school.bright.login.AppLoginRepo;

public class ReduceDisciplineScoreByQRCode extends Base {
    public static DisciplieScoreByQRRepo dsqr;
    public static AppLoginRepo alr;
    public static CheckinTeacherAttendanceRepo ctar;
    public static AddDisciplineScoreRepo adsr;
    public ReduceDisciplineScoreByQRCode(){
        dsqr=new DisciplieScoreByQRRepo(appiumDriver);
        ctar=new CheckinTeacherAttendanceRepo(appiumDriver);
        adsr=new AddDisciplineScoreRepo(appiumDriver);
        alr=new AppLoginRepo(appiumDriver);
    }

    @Step("reduce discipline score by qr code")
    public static void reduceDisciplineScore() throws InterruptedException {
        Thread.sleep(6000);
        dsqr.textView.get(1).click();

        waitForMobileElement(dsqr.qrCodeButton);
        dsqr.qrCodeButton.click();

        waitForMobileElement(ctar.OKButton);
        ctar.OKButton.click();

        waitForMobileElement(adsr.escapeFromSchool);
        adsr.checkBox.get(9).click();
        Thread.sleep(3000);
        scrollDown();
        scrollDown();
        scrollDown();
        scrollDown();
        scrollDown();
        waitForMobileElement(ctar.nextButton);
        ctar.nextButton.click();

        waitForMobileElement(adsr.SUBMITButton);
        adsr.SUBMITButton.click();
        waitForMobileElement(alr.closeButton);
        alr.closeButton.click();
    }
}
