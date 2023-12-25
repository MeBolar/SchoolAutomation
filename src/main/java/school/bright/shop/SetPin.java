package school.bright.shop;

import io.qameta.allure.Step;
import school.bright.attendance.CheckinTeacherAttendanceRepo;
import school.bright.classroom.OnlineClassRoomRepo;
import school.bright.generic.Base;

public class SetPin extends Base {
    public static CheckinTeacherAttendanceRepo ctar;
    public static OnlineClassRoomRepo ocrp;
    public static SetPinRepo spr;
    public SetPin(){
        spr=new SetPinRepo(appiumDriver);
        ctar=new CheckinTeacherAttendanceRepo(appiumDriver);
        ocrp=new OnlineClassRoomRepo(appiumDriver);
    }

    @Step("Navigate to shop screen")
    public static void navigateToShopScreen() throws InterruptedException {
        waitForMobileElement(spr.shop);
        spr.shop.click();
    }

    @Step("Set new pin")
    public static void setNewPin() throws InterruptedException {
        try{
            Thread.sleep(4000);
            ctar.keypad1.click();
            Thread.sleep(1000);
            //Deleteing 1 character
            ctar.listOfImageView.get(1).click();
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
            Thread.sleep(1000);
            ctar.keypad1.click();
            //Enter new pin
            Thread.sleep(3000);
            ctar.keypad2.click();
            Thread.sleep(1000);
            ctar.keypad2.click();
            Thread.sleep(1000);
            ctar.keypad2.click();
            Thread.sleep(1000);
            ctar.keypad2.click();
            Thread.sleep(1000);
            ctar.keypad2.click();
            Thread.sleep(1000);
            ctar.keypad2.click();
            waitForMobileElement(ocrp.CLOSE);
            ocrp.CLOSE.click();
            //Re-entering same code
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
            Thread.sleep(1000);
            ctar.keypad1.click();
            //user navigates to home screen
        }catch (Exception e){
            appiumDriver.navigate().back();
        }
    }
}
