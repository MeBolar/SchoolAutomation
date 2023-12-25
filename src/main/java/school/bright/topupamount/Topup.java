package school.bright.topupamount;

import io.qameta.allure.Step;
import school.bright.attendance.CheckinTeacherAttendanceRepo;
import school.bright.classroom.OnlineClassRoomRepo;
import school.bright.generic.Base;

public class Topup extends Base {
    public static CheckinTeacherAttendanceRepo ctar;
    public static Topuprepo tr;
    public static OnlineClassRoomRepo ocrp;
    public Topup(){
        tr=new Topuprepo(appiumDriver);
        ctar=new CheckinTeacherAttendanceRepo(appiumDriver);
        ocrp=new OnlineClassRoomRepo(appiumDriver);
    }

    @Step("Navigate to topup button")
    public static void navigateToTopUpScreen() throws InterruptedException {
        Thread.sleep(4000);
        try{
            Thread.sleep(3000);
            //Click on menu button
            ctar.imageView.get(0).click();
        }catch (Exception e){
            //Click on menu button
            ctar.imageView.get(0).click();
        }
        waitForMobileElement(tr.topUpButton);
        tr.topUpButton.click();
    }


    @Step("Top up")
    public static void topup() throws InterruptedException {
        try{
            Thread.sleep(4000);
            tr.checkBox.click();
            Thread.sleep(2000);
            ocrp.CLOSE.click();
        }catch (Exception e){

        }
        waitForMobileElement(tr.topUpButton);
        tr.imageView.get(1).click();
        waitForMobileElement(ocrp.CLOSE);
        tr.checkBox.click();
        Thread.sleep(2000);
        ocrp.CLOSE.click();
        waitForMobileElement(tr.topUp50);
        tr.topUp50.click();
        waitForMobileElement(tr.confirmButton);
        tr.confirmButton.click();
        Thread.sleep(5000);
        tr.viewGroup.get(0).click();
        waitForMobileElement(tr.other);
        tr.other.click();
        waitForMobileElement(tr.okButton);
        tr.textField.sendKeys("5000");
        tr.okButton.click();
        waitForMobileElement(tr.confirmButton);
        tr.confirmButton.click();
        Thread.sleep(5000);
        tr.viewGroup.get(0).click();
        Thread.sleep(3000);
        tr.imageView.get(0).click();
        //user navigated to home screen

    }


}
