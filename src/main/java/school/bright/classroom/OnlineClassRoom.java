package school.bright.classroom;

import io.qameta.allure.Step;
import school.bright.attendance.CheckinTeacherAttendanceRepo;
import school.bright.generic.Base;
import school.bright.login.AppLoginRepo;

public class OnlineClassRoom extends Base {
    public static OnlineClassRoomRepo ocrp;
    public static AppLoginRepo alr;
    public static CheckinTeacherAttendanceRepo ctar;


    public OnlineClassRoom(){
        ocrp=new OnlineClassRoomRepo(appiumDriver);
        ctar=new CheckinTeacherAttendanceRepo(appiumDriver);
        alr=new AppLoginRepo(appiumDriver);
    }
    @Step("Navigate to online class room screen")
    public static void navigateToOnlineClassRoom() throws InterruptedException {
        Thread.sleep(4000);
        try{
            Thread.sleep(3000);
            //Click on menu button
            ctar.imageView.get(0).click();
        }catch (Exception e){
            //Click on menu button
            ctar.imageView.get(0).click();
        }
        waitForMobileElement(ctar.onlineClassroom);
        ctar.onlineClassroom.click();
    }

    @Step("Create class room")
    public static void createClassRoom(){
        waitForMobileElement(ocrp.classLevel);
        ocrp.classLevel.click();
        waitForMobileElement(ocrp.all);
        ocrp.all.click();
        scrollDown();
        waitForMobileElement(ctar.nextButton);
        ctar.nextButton.click();
    }

    @Step("Create Topic")
    public static void createTopic() throws InterruptedException {
        waitForMobileElement(ocrp.math);
        ocrp.math.click();
        waitForMobileElement(ocrp.createTopic);
        ocrp.createTopic.click();
        waitForMobileElement(ocrp.mainTopic);
        ocrp.mainTopic.sendKeys("Fraction");
        Thread.sleep(2000);
        ocrp.button.get(3).click();
        Thread.sleep(1000);
        ocrp.button.get(3).click();
        Thread.sleep(1000);
        ocrp.button.get(6).click();
        Thread.sleep(1000);
        ocrp.button.get(0).click();
        Thread.sleep(2000);
        ocrp.cancelButton.get(1).click();
        Thread.sleep((2000));
        ocrp.button.get(8).click();
        waitForMobileElement(ocrp.autoTestTeacher);
        ocrp.autoTestTeacher.click();
        waitForMobileElement(ocrp.closeButton);
        ocrp.closeButton.click();
        waitForMobileElement(ocrp.createButton);
        ocrp.createButton.click();
    }

    @Step("Create homework")
    public static void createHomeWork() throws InterruptedException {
        Thread.sleep(5000);
        //Select first topic
        ocrp.button.get(7).click();
        waitForMobileElement(ocrp.homeWorksTab);
        ocrp.imageViewButton.get(1).click();
        Thread.sleep(2000);
        ocrp.homeWorksTab.click();
        waitForMobileElement(ocrp.assignementLabel);
        //Add Assignment
        waitForMobileElement(ctar.nextButton);
        ctar.nextButton.click();
        waitForMobileElement(alr.closeButton);
        alr.closeButton.click();
        Thread.sleep(2000);
        ocrp.textField.get(0).sendKeys("Homework 1");
        waitForMobileElement(ctar.nextButton);
        ctar.nextButton.click();
        waitForMobileElement(alr.closeButton);
        alr.closeButton.click();
        Thread.sleep(2000);
        //Add description
        ocrp.textField.get(1).sendKeys("About Fractions");
        Thread.sleep(2000);
        //Attach link
        ocrp.textField.get(2).sendKeys("https://www.youtube.com/watch?v=4lkq3DgvmJo");
        waitForMobileElement(ctar.nextButton);
        ctar.nextButton.click();
        //Negative use case scenarios
        waitForMobileElement(ctar.nextButton);
        ctar.nextButton.click();
        waitForMobileElement(alr.closeButton);
        alr.closeButton.click();
        //Add full score
        waitForMobileElement(ocrp.fullScoreButton);
        ocrp.fullScoreButton.click();
        Thread.sleep(2000);
        ocrp.inputTextField.sendKeys("10");
        waitForMobileElement(ocrp.okButton);
        ocrp.okButton.click();
        //Add delivery format
        waitForMobileElement(ctar.nextButton);
        ctar.nextButton.click();
        waitForMobileElement(alr.closeButton);
        alr.closeButton.click();
        Thread.sleep(2000);
        ocrp.deliveryFormat.get(0).click();
        waitForMobileElement(ocrp.classLevel);
        ocrp.classLevel.click();
        Thread.sleep(2000);
        ocrp.deadLineDate.get(0).click();
        waitForMobileElement(ocrp.selectButton);
        ocrp.selectButton.click();
        Thread.sleep(2000);
        ocrp.dateButton.get(22).click();
        waitForMobileElement(ocrp.selectButton);
        ocrp.selectButton.click();
        waitForMobileElement(ctar.nextButton);
        ctar.nextButton.click();
        waitForMobileElement(ocrp.submitButton);
        ocrp.submitButton.click();
        waitForMobileElement(ocrp.CLOSE);
        ocrp.CLOSE.click();
    }

    @Step("Edit homework")
    public static void editHomeWork() throws InterruptedException {
        waitForMobileElement(ocrp.homeWorksTab);
        ocrp.appImageButtons.get(2).click();
        waitForMobileElement(ocrp.edit);
        ocrp.edit.click();
        waitForMobileElement(ctar.nextButton);
        ctar.nextButton.click();
        Thread.sleep(2000);
        ocrp.deliveryFormat.get(0).click();
        waitForMobileElement(ocrp.individualButton);
        ocrp.individualButton.click();
        waitForMobileElement(ocrp.listButton);
        ocrp.listButton.click();
        Thread.sleep(2000);
        ocrp.button.get(3).click();
        waitForMobileElement(ocrp.selectButton);
        ocrp.selectButton.click();
        waitForMobileElement(ctar.nextButton);
        ctar.nextButton.click();
        waitForMobileElement(ocrp.submitButton);
        ocrp.submitButton.click();
        waitForMobileElement(ocrp.CLOSE);
        ocrp.CLOSE.click();
    }

    @Step("Create materials")
    public static void createMaterials() throws InterruptedException {
        waitForMobileElement(ocrp.materialsTab);
        ocrp.materialsTab.click();
        Thread.sleep(2000);
        ocrp.imageViewButton.get(1).click();
        Thread.sleep(2000);
        ocrp.materialsTab.click();
        Thread.sleep(2000);
        ocrp.textField.get(0).sendKeys("Material 1");
        Thread.sleep(2000);
        ocrp.textField.get(1).sendKeys("What is math?");
        Thread.sleep(2000);
        ocrp.textField.get(2).sendKeys("https://www.youtube.com/watch?v=4lkq3DgvmJo");
        waitForMobileElement(ctar.nextButton);
        ctar.nextButton.click();

        waitForMobileElement(ctar.nextButton);
        ctar.nextButton.click();
        waitForMobileElement(ocrp.submitButton);
        ocrp.submitButton.click();
        waitForMobileElement(ocrp.CLOSE);
        ocrp.CLOSE.click();
    }

    @Step("Edit materials")
    public static void editMaterials() throws InterruptedException {
        waitForMobileElement(ocrp.materialsTab);
        ocrp.appImageButtons.get(2).click();
        waitForMobileElement(ocrp.edit);
        ocrp.edit.click();
        waitForMobileElement(ctar.nextButton);
        ctar.nextButton.click();
        Thread.sleep(2000);
        ocrp.deliveryFormat.get(0).click();
        waitForMobileElement(ocrp.individualButton);
        ocrp.individualButton.click();
        waitForMobileElement(ocrp.listButton);
        ocrp.listButton.click();
        Thread.sleep(2000);
        ocrp.button.get(3).click();
        waitForMobileElement(ocrp.selectButton);
        ocrp.selectButton.click();
        waitForMobileElement(ctar.nextButton);
        ctar.nextButton.click();
        waitForMobileElement(ocrp.submitButton);
        ocrp.submitButton.click();
        waitForMobileElement(ocrp.CLOSE);
        ocrp.CLOSE.click();
    }

    public static void navigateToHomeScreen() throws InterruptedException {
        Thread.sleep(2000);
        ocrp.appImageButtons.get(0).click();
        Thread.sleep(4000);
        ocrp.appImageButtons.get(0).click();
        Thread.sleep(4000);
        ocrp.appImageButtons.get(0).click();
        Thread.sleep(4000);
        ocrp.appImageButtons.get(0).click();
        appiumDriver.navigate().back();
    }

    @Step("Checking homework")
    public static void checkingHomeWork() throws InterruptedException {
        waitForMobileElement(ocrp.classLevel);
        ocrp.classLevel.click();
        waitForMobileElement(ocrp.classLevelA);
        ocrp.classLevelA.click();
        waitForMobileElement(ctar.nextButton);
        ctar.nextButton.click();
        waitForMobileElement(ocrp.math);
        ocrp.math.click();
        Thread.sleep(3000);
        ocrp.button.get(6).click();
        //select homework
        Thread.sleep(3000);
        ocrp.button.get(11).click();
        waitForMobileElement(ocrp.all);
        ocrp.searchBar.click();
        ocrp.searchBar.sendKeys("111");
        Thread.sleep(2000);
        ocrp.searchBar.clear();
        Thread.sleep(2000);
        ocrp.button.get(12).click();
        waitForMobileElement(ocrp.submitButton);
        ocrp.submitButton.click();
        waitForMobileElement(ocrp.CLOSE);
        ocrp.CLOSE.click();


    }

}
