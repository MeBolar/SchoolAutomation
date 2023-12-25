package school.bright.discscore;

import io.qameta.allure.Step;
import school.bright.attendance.CheckInTeacherAttendanceFromRoomPageRepo;
import school.bright.attendance.CheckinTeacherAttendanceRepo;
import school.bright.generic.Base;
import school.bright.login.AppLoginRepo;

public class ReduceDisciplineScore extends Base {
    public static CheckinTeacherAttendanceRepo ctar;
    public static AddDisciplineScoreRepo adsr;
    public static AppLoginRepo alr;
    public static CheckInTeacherAttendanceFromRoomPageRepo cafrp;
    public ReduceDisciplineScore(){
        ctar=new CheckinTeacherAttendanceRepo(appiumDriver);
        cafrp=new CheckInTeacherAttendanceFromRoomPageRepo(appiumDriver);
        alr=new AppLoginRepo(appiumDriver);
        adsr=new AddDisciplineScoreRepo(appiumDriver);
    }
    @Step("Navigate to reduce discipline score screen")
    public static void navigateToReduceDisciplineScore() throws InterruptedException {
        Thread.sleep(4000);
        try{
            Thread.sleep(3000);
            //Click on menu button
            ctar.imageView.get(0).click();
        }catch (Exception e){
            //Click on menu button
            ctar.imageView.get(0).click();
        }
        waitForMobileElement(ctar.disciplineScoreButton);
        ctar.disciplineScoreButton.click();
        waitForMobileElement(ctar.reduceDisciplineScoreButton);
        ctar.reduceDisciplineScoreButton.click();
    }

    @Step("Test cases for negative scenrios in reduce discipline score screen ")
    public static void addClassLevelAndClass(){
        waitForMobileElement(cafrp.classLevel);
        //Click next button
        ctar.nextButton.click();
        waitForMobileElement(alr.closeButton);
        alr.closeButton.click();
        waitForMobileElement(cafrp.classLevel);
        cafrp.classLevel.click();
        waitForMobileElement(cafrp.classLevelA);
        cafrp.classLevelA.click();
        waitForMobileElement(ctar.nextButton);
        //Click next button
        ctar.nextButton.click();
        waitForMobileElement(alr.closeButton);
        alr.closeButton.click();
        waitForMobileElement(cafrp.className);
        cafrp.className.click();
        waitForMobileElement(cafrp.classA1);
        cafrp.classA1.click();
        waitForMobileElement(ctar.nextButton);
        //Click next button
        ctar.nextButton.click();
    }

    @Step("Reduce student score")
    public static void reduceDisciplineScore() throws InterruptedException {
        Thread.sleep(4000);
        adsr.checkBox.get(5).click();
        try{
            adsr.checkBox.get(5).click();
        }catch (Exception e){
        }
        waitForMobileElement(ctar.nextButton);
        ctar.nextButton.click();
        waitForMobileElement(adsr.escapeFromSchool);
        adsr.escapeFromSchool.click();
        Thread.sleep(4000);
        waitForMobileElement(alr.closeButton);
        alr.closeButton.click();
        Thread.sleep(4000);
        adsr.checkBox.get(9).click();
        Thread.sleep(4000);
        adsr.checkBox.get(12).click();
        //Enter remark
        waitForMobileElement(adsr.pleaseEnterRemarrk);
        adsr.pleaseEnterRemarrk.sendKeys("in the morning");
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
