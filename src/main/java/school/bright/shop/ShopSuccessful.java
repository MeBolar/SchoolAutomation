package school.bright.shop;

import io.qameta.allure.Step;
import school.bright.attendance.CheckinTeacherAttendanceRepo;
import school.bright.classroom.OnlineClassRoomRepo;
import school.bright.generic.Base;

public class ShopSuccessful extends Base {
    public static ShopSuccessfulRepo ssr;
    public static OnlineClassRoomRepo ocrp;
    public static CheckinTeacherAttendanceRepo ctar;
    public ShopSuccessful(){
        ssr=new ShopSuccessfulRepo(appiumDriver);
        ctar=new CheckinTeacherAttendanceRepo(appiumDriver);
        ocrp=new OnlineClassRoomRepo(appiumDriver);
    }

    @Step("Successfully shop")
    public static void shopSuccessfully() throws InterruptedException {
        waitForMobileElement(ssr.searchBar);
        ssr.searchBar.sendKeys("ร้านน้ำผลไม้ปั่น");
        Thread.sleep(3000);
        ssr.elementData.get(1).click();
        try{
            ssr.elementData.get(1).click();
        }catch (Exception e){

        }
        Thread.sleep(5000);
        //Click on Next button
        ctar.nextButton.click();
        waitForMobileElement(ocrp.CLOSE);
        ocrp.CLOSE.click();
        waitForMobileElement(ssr.searchBar);
        ssr.searchBar.sendKeys("แตงโม");
        Thread.sleep(3000);
        ssr.elementData.get(3).click();
        Thread.sleep(3000);
        ssr.imageView.get(3).click();
        Thread.sleep(3000);
        ssr.add.click();
        Thread.sleep(2000);
        ssr.imageView.get(2).click();
//        Thread.sleep(1000);
//        ssr.add.click();
        Thread.sleep(2000);
        ssr.imageView.get(3).click();
        Thread.sleep(2000);
        ssr.imageView.get(3).click();
        Thread.sleep(1000);
        ssr.add.click();
        waitForMobileElement(ctar.nextButton);
        ctar.nextButton.click();
        Thread.sleep(3000);
        ssr.payment.get(1).click();
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
        waitForMobileElement(ocrp.CLOSE);
        ocrp.CLOSE.click();
        waitForMobileElement(ssr.buttonClose);
        ssr.buttonClose.click();
        Thread.sleep(2000);
        ssr.imageView.get(0).click();
    }

    @Step("Insufficient balance")
    public static void insufficientBalance() throws InterruptedException {
        waitForMobileElement(ssr.searchBar);
        ssr.searchBar.sendKeys("สหกรณ์");
        Thread.sleep(2000);
        ssr.elementData.get(1).click();
        waitForMobileElement(ssr.searchBar);
        ssr.viewGroup.get(7).click();
        Thread.sleep(3000);
        ssr.imageView.get(3).click();
        Thread.sleep(1000);
        ssr.add.click();
        waitForMobileElement(ctar.nextButton);
        ctar.nextButton.click();
        Thread.sleep(3000);
        ssr.payment.get(1).click();
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
        waitForMobileElement(ocrp.CLOSE);
        ocrp.CLOSE.click();
        try{
            Thread.sleep(2000);
            ssr.imageView.get(0).click();
            Thread.sleep(2000);
            ssr.imageView.get(0).click();
            Thread.sleep(2000);
            ssr.imageView.get(0).click();
            Thread.sleep(2000);
            ssr.imageView.get(0).click();
        }catch (Exception e){

        }
    }

    @Step("Product Sold out")
    public void productSoldOut() throws InterruptedException {
        waitForMobileElement(ssr.searchBar);
        ssr.searchBar.sendKeys("สหกรณ์");
        Thread.sleep(2000);
        ssr.elementData.get(1).click();
        waitForMobileElement(ssr.searchBar);
        ssr.viewGroup.get(7).click();
        Thread.sleep(2000);
        ssr.imageView.get(3).click();
        Thread.sleep(2000);
        ssr.imageView.get(3).click();
        Thread.sleep(2000);
        ssr.imageView.get(3).click();
        Thread.sleep(1000);
        ssr.add.click();
        waitForMobileElement(ctar.nextButton);
        ctar.nextButton.click();
        Thread.sleep(3000);
        ssr.payment.get(1).click();
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
        waitForMobileElement(ocrp.CLOSE);
        ocrp.CLOSE.click();
        try{
            Thread.sleep(2000);
            ssr.imageView.get(0).click();
            Thread.sleep(2000);
            ssr.imageView.get(0).click();
            Thread.sleep(2000);
            ssr.imageView.get(0).click();
            Thread.sleep(2000);
            ssr.imageView.get(0).click();
        }catch (Exception e){

        }
    }
}
