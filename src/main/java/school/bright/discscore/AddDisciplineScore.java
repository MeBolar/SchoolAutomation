package school.bright.discscore;

import io.qameta.allure.Step;
import school.bright.attendance.CheckInTeacherAttendanceFromRoomPageRepo;
import school.bright.attendance.CheckinTeacherAttendanceRepo;
import school.bright.generic.Base;
import school.bright.login.AppLoginRepo;

public class AddDisciplineScore extends Base {
    public static AddDisciplineScoreRepo adsr;
    public static AppLoginRepo alr;
    public static CheckInTeacherAttendanceFromRoomPageRepo cafrp;
    public static CheckinTeacherAttendanceRepo ctar;
    public AddDisciplineScore(){
        adsr=new AddDisciplineScoreRepo(appiumDriver);
        ctar=new CheckinTeacherAttendanceRepo(appiumDriver);
        cafrp=new CheckInTeacherAttendanceFromRoomPageRepo(appiumDriver);
        alr=new AppLoginRepo(appiumDriver);
    }
    @Step("Navigate to Add Discipline Score screen")
    public static void navigateToAddDiscScoreScreen() throws InterruptedException {
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
        waitForMobileElement(ctar.addDisciplineScoreButton);
        ctar.addDisciplineScoreButton.click();
    }

    public static void navigate(){
        waitForMobileElement(ctar.disciplineScoreButton);
        ctar.disciplineScoreButton.click();
        waitForMobileElement(ctar.addDisciplineScoreButton);
        ctar.addDisciplineScoreButton.click();
    }

    @Step("Validate all the flows in Add Discipline Score")
    public static void validateAllFields(){
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
        ctar.nextButton.click();
        waitForMobileElement(alr.closeButton);
        alr.closeButton.click();

        waitForMobileElement(cafrp.className);
        cafrp.className.click();
        waitForMobileElement(cafrp.classA1);
        cafrp.classA1.click();
        waitForMobileElement(ctar.nextButton);
        ctar.nextButton.click();
        waitForMobileElement(cafrp.studentIDSearchBar);
    }

    @Step("Search students")
    public static void searchStudent() throws InterruptedException {
        waitForMobileElement(cafrp.studentIDSearchBar);
        cafrp.studentIDSearchBar.click();
        cafrp.studentIDSearchBar.sendKeys("111");
        Thread.sleep(4000);
        adsr.searchBar.clear();
        Thread.sleep(3000);
        adsr.searchBar.sendKeys("6616");
        Thread.sleep(4000);
        adsr.searchBar.clear();

    }

    @Step("Add discipline score")
    public static void addDisciplineScore() throws InterruptedException {
        Thread.sleep(4000);
        adsr.checkBox.get(5).click();
        try{
            adsr.checkBox.get(5).click();
        }catch (Exception e){

        }

        waitForMobileElement(ctar.nextButton);
        ctar.nextButton.click();
        waitForMobileElement(adsr.pickUpTrashText);
        adsr.pickUpTrashText.click();
        Thread.sleep(4000);
        waitForMobileElement(alr.closeButton);
        alr.closeButton.click();
        Thread.sleep(3000);
        adsr.checkBox.get(2).click();
        Thread.sleep(3000);
        //click on note button
        adsr.noteButton.get(0).click();
        //Enter remark
        waitForMobileElement(adsr.pleaseEnterRemarrk);
        adsr.pleaseEnterRemarrk.sendKeys("on the road");
//        Thread.sleep(3000);
//        adsr.imageView.get(1).click();
//        waitForMobileElement(adsr.textView);
//        adsr.textView.clear();
//        adsr.textView.sendKeys("on the road");

        //Click on checkbox of help friend
        Thread.sleep(3000);
        adsr.checkBox.get(12).click();
//        try{
//            adsr.checkBox.get(8).click();
//        }catch (Exception e1){
//
//        }
        Thread.sleep(3000);
        //click on note button
        adsr.noteButton.get(1).click();
        //Enter remark
        waitForMobileElement(adsr.pleaseEnterRemarrk);
        adsr.pleaseEnterRemarrk.sendKeys("Clean the classroom");
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
