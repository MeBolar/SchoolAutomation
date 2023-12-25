package school.bright.setting;

import io.qameta.allure.Step;
import school.bright.attendance.CheckinTeacherAttendanceRepo;
import school.bright.generic.Base;

public class ChangePin extends Base {
    public static ChangePinRepo changePinRepo;
    public static CheckinTeacherAttendanceRepo ctar;
    public ChangePin(){
        changePinRepo=new ChangePinRepo(appiumDriver);
        ctar=new CheckinTeacherAttendanceRepo(appiumDriver);
    }

    @Step("Change pin")
    public static void changePin() throws InterruptedException {
        waitForMobileElement(changePinRepo.changePin);
        changePinRepo.changePin.click();
        Thread.sleep(3000);
        ctar.keypad1.click();
        Thread.sleep(1000);
        ctar.keypad1.click();
        Thread.sleep(1000);
        ctar.keypad1.click();
        Thread.sleep(1000);
        ctar.keypad1.click();
        Thread.sleep(1000);
        ctar.keypad1.click();
        Thread.sleep(1000);
        ctar.keypad1.click();
        Thread.sleep(3000);
        enterNewPin();
        enterNewPin();
    }

    public static void enterNewPin() throws InterruptedException {
        ctar.keypad1.click();
        Thread.sleep(1000);
        ctar.keypad2.click();
        Thread.sleep(1000);
        ctar.keypad3.click();
        Thread.sleep(1000);
        ctar.keypad4.click();
        Thread.sleep(1000);
        ctar.keypad5.click();
        Thread.sleep(1000);
        ctar.keypad6.click();
        Thread.sleep(3000);
    }

    public static void enterOldPin() throws InterruptedException {
        ctar.keypad1.click();
        Thread.sleep(1000);
        ctar.keypad1.click();
        Thread.sleep(1000);
        ctar.keypad1.click();
        Thread.sleep(1000);
        ctar.keypad1.click();
        Thread.sleep(1000);
        ctar.keypad1.click();
        Thread.sleep(1000);
        ctar.keypad1.click();
        Thread.sleep(3000);
    }

    @Step("Change back to old pin")
    public static void changeBackToOldPin() throws InterruptedException {
        waitForMobileElement(changePinRepo.changePin);
        changePinRepo.changePin.click();
        Thread.sleep(3000);
        enterNewPin();
        enterOldPin();
    }

}
