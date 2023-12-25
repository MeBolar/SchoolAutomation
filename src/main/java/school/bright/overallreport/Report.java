package school.bright.overallreport;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import school.bright.attendance.CheckinTeacherAttendanceRepo;
import school.bright.classroom.OnlineClassRoomRepo;
import school.bright.generic.Base;
import school.bright.topupamount.Topuprepo;

public class Report extends Base {
    public static ReportRepo rr;
    public static CheckinTeacherAttendanceRepo ctar;
    public static OnlineClassRoomRepo ocrp;
    public static Topuprepo tr;
    public Report(){
        rr=new ReportRepo(appiumDriver);
        ctar=new CheckinTeacherAttendanceRepo(appiumDriver);
        ocrp=new OnlineClassRoomRepo(appiumDriver);
        tr=new Topuprepo(appiumDriver);
    }

    @Step("Navigate to report screen")
    public static void navigateToReportScreen() throws InterruptedException {
        Thread.sleep(4000);
        try{
            Thread.sleep(3000);
            //Click on menu button
            ctar.imageView.get(0).click();
        }catch (Exception e){
            //Click on menu button
            ctar.imageView.get(0).click();
        }
        Thread.sleep(3000);
        scrollDown();
        waitForMobileElement(rr.report);
        rr.report.click();
    }

    @Step("Student checkin report")
    public static void studentCheckInReport() throws InterruptedException {
        waitForMobileElement(rr.attendanceButton);
        rr.attendanceButton.click();
        waitForMobileElement(rr.academicYear);
        scrollDown();
        waitForMobileElement(ctar.nextButton);
        ctar.nextButton.click();
        waitForMobileElement(ocrp.CLOSE);
        ocrp.CLOSE.click();
        waitForMobileElement(rr.classLevel);
        rr.classLevel.click();
        waitForMobileElement(ocrp.classLevelA);
        ocrp.classLevelA.click();

        waitForMobileElement(ctar.nextButton);
        ctar.nextButton.click();
        waitForMobileElement(ocrp.CLOSE);
        ocrp.CLOSE.click();

        waitForMobileElement(rr.classLabel);
        rr.classLabel.click();

        waitForMobileElement(rr.a1Class);
        rr.a1Class.click();
        waitForMobileElement(ctar.nextButton);
        ctar.nextButton.click();
        //navigate back and forward month
        Thread.sleep(3000);
        rr.imageView.get(1).click();
        Thread.sleep(3000);
        rr.imageView.get(2).click();
        Thread.sleep(2000);
        rr.onTimeLabel.click();
        //Click on ontime button of check in report screen
        Thread.sleep(3000);
        rr.onTimeLabel.click();
        waitForMobileElement(rr.lateLabel);
        rr.lateLabel.click();
        waitForMobileElement(rr.absenceLabel);
        rr.absenceLabel.click();

        waitForMobileElement(rr.eventLabel);
        rr.eventLabel.click();

        //Scroll horizontal
        Actions move= new Actions(appiumDriver);
        move.moveToElement(appiumDriver.findElement(By.xpath("//android.widget.TextView[@text='Event']"))).clickAndHold();
        move.moveByOffset(-400,0);
        move.release();
        move.perform();

        waitForMobileElement(rr.sickLeave);
        rr.sickLeave.click();

        waitForMobileElement(rr.personalLeave);
        rr.personalLeave.click();

        waitForMobileElement(rr.undefined);
        rr.undefined.click();
        Thread.sleep(3000);
        tr.imageView.get(0).click();
        Thread.sleep(3000);
        tr.imageView.get(0).click();
        Thread.sleep(3000);
        tr.imageView.get(0).click();
        Thread.sleep(3000);
        tr.imageView.get(0).click();
    }

    @Step("Student checkin subject report")
    public static void studentCheckinSubjectReport() throws InterruptedException {
        waitForMobileElement(rr.attendanceButton);
        rr.attendanceButton.click();

        waitForMobileElement(rr.subjectTab);
        rr.subjectTab.click();
        waitForMobileElement(rr.classLevel);
        rr.classLevel.click();
        waitForMobileElement(ocrp.classLevelA);
        ocrp.classLevelA.click();
        scrollDown();
        scrollDown();
        waitForMobileElement(ctar.nextButton);
        ctar.nextButton.click();
        waitForMobileElement(ocrp.CLOSE);
        ocrp.CLOSE.click();

        waitForMobileElement(rr.classLabel);
        rr.classLabel.click();

        waitForMobileElement(rr.a1Class);
        rr.a1Class.click();

        Thread.sleep(2000);
        rr.subject.get(1).click();

        try{
            Thread.sleep(2000);
            ocrp.CLOSE.click();
            System.out.println("Time table is not arranged");
            Thread.sleep(3000);
            tr.imageView.get(0).click();
            Thread.sleep(3000);
            tr.imageView.get(0).click();
        }catch (Exception e){
            rr.math.click();
            waitForMobileElement(ctar.nextButton);
            ctar.nextButton.click();
            Thread.sleep(3000);
            rr.imageView.get(1).click();
            Thread.sleep(2000);
            rr.imageView.get(2).click();
            waitForMobileElement(rr.onTimeLabel);
            rr.onTimeLabel.click();
            Thread.sleep(4000);
            rr.onTimeLabel.click();
            waitForMobileElement(rr.lateLabel);
            rr.lateLabel.click();
            waitForMobileElement(rr.absenceLabel);
            rr.absenceLabel.click();

            waitForMobileElement(rr.eventLabel);
            rr.eventLabel.click();

            //Scroll horizontal
            Actions move= new Actions(appiumDriver);
            move.moveToElement(appiumDriver.findElement(By.xpath("//android.widget.TextView[@text='Event']"))).clickAndHold();
            move.moveByOffset(-400,0);
            move.release();
            move.perform();

            waitForMobileElement(rr.sickLeave);
            rr.sickLeave.click();

            waitForMobileElement(rr.personalLeave);
            rr.personalLeave.click();

            waitForMobileElement(rr.undefined);
            rr.undefined.click();
            Thread.sleep(3000);
            tr.imageView.get(0).click();
            Thread.sleep(3000);
            tr.imageView.get(0).click();
            Thread.sleep(3000);
            tr.imageView.get(0).click();
            Thread.sleep(3000);
            tr.imageView.get(0).click();
        }
    }

    @Step("Discipline score")
    public static void disciplineScoreReport() throws InterruptedException {
        waitForMobileElement(rr.disciplineScore);
        rr.disciplineScore.click();
        waitForMobileElement(rr.academicYear);
        waitForMobileElement(rr.levelClass);
        rr.levelClass.click();
        waitForMobileElement(ocrp.classLevelA);
        ocrp.classLevelA.click();
        scrollDown();
        waitForMobileElement(ctar.nextButton);
        ctar.nextButton.click();
        waitForMobileElement(ocrp.CLOSE);
        ocrp.CLOSE.click();
        waitForMobileElement(rr.classLabel);
        rr.classLabel.click();

        waitForMobileElement(rr.a1Class);
        rr.a1Class.click();
        waitForMobileElement(ctar.nextButton);
        ctar.nextButton.click();
        waitForMobileElement(rr.searchBar);
        rr.searchBar.click();
        rr.searchBar.sendKeys("1111");
        Thread.sleep(3000);
        rr.searchBar.clear();
        Thread.sleep(3000);
        rr.viewGroup.get(6).click();
        Thread.sleep(3000);
        tr.imageView.get(0).click();
        Thread.sleep(3000);
        tr.imageView.get(0).click();
        Thread.sleep(3000);
        tr.imageView.get(0).click();
        Thread.sleep(3000);
        tr.imageView.get(0).click();
    }

    @Step("Executive report")
    public static void studentExecutiveReport() throws InterruptedException {
        waitForMobileElement(rr.executiveReport);
        rr.executiveReport.click();
        waitForMobileElement(rr.attendanceButton);
        rr.attendanceButton.click();
        Thread.sleep(3000);
        //Click on pie chart
        rr.imageView.get(3).click();
        Thread.sleep(2000);
        //Click on bar graph
        rr.imageView.get(2).click();
        Thread.sleep(2000);
        scrollDown();
        scrollDown();
        waitForMobileElement(rr.moreDetail);
        rr.moreDetail.click();
        Thread.sleep(3000);
        //Scroll down and click on class a
        scrollDown();
        scrollDown();
        scrollDown();
        waitForMobileElement(rr.classA);
        rr.classA.click();
        Thread.sleep(3000);
        scrollDown();
        scrollDown();
        waitForMobileElement(rr.moreDetail);
        rr.moreDetail.click();
        Thread.sleep(4000);
        rr.onTimeLabel.click();
        waitForMobileElement(rr.lateLabel);
        rr.lateLabel.click();
        waitForMobileElement(rr.absenceLabel);
        rr.absenceLabel.click();

        //Scroll horizontal
        Actions move= new Actions(appiumDriver);
        move.moveToElement(appiumDriver.findElement(By.xpath("//android.widget.TextView[@text='Absence']"))).clickAndHold();
        move.moveByOffset(-400,0);
        move.release();
        move.perform();

        waitForMobileElement(rr.sickLeave);
        rr.sickLeave.click();

        waitForMobileElement(rr.personalLeave);
        rr.personalLeave.click();

        waitForMobileElement(rr.undefined);
        rr.undefined.click();
        Thread.sleep(3000);
        tr.imageView.get(0).click();
        Thread.sleep(3000);
        tr.imageView.get(0).click();
        Thread.sleep(3000);
        tr.imageView.get(0).click();
        Thread.sleep(3000);
        tr.imageView.get(0).click();

    }

    @Step("Personal executive report")
    public static void personalExecutiveReport() throws InterruptedException {
        waitForMobileElement(rr.executiveReport);
        rr.executiveReport.click();
        waitForMobileElement(rr.attendanceButton);
        rr.attendanceButton.click();
        waitForMobileElement(rr.personalTab);
        rr.personalTab.click();
        //Click on pie chart
        rr.imageView.get(3).click();
        Thread.sleep(2000);
        //Click on bar graph
        rr.imageView.get(2).click();
        Thread.sleep(2000);
        scrollDown();
        scrollDown();
        waitForMobileElement(rr.moreDetail);
        rr.moreDetail.click();
        Thread.sleep(3000);
        rr.viewGroup.get(4).click();
        Thread.sleep(3000);
        scrollDown();
        scrollDown();
        waitForMobileElement(rr.moreDetail);
        rr.moreDetail.click();
        Thread.sleep(3000);
        rr.onTimeLabel.click();
        waitForMobileElement(rr.lateLabel);
        rr.lateLabel.click();
        waitForMobileElement(rr.absenceLabel);
        rr.absenceLabel.click();


        //Scroll horizontal
        Actions move= new Actions(appiumDriver);
        move.moveToElement(appiumDriver.findElement(By.xpath("//android.widget.TextView[@text='Absence']"))).clickAndHold();
        move.moveByOffset(-400,0);
        move.release();
        move.perform();

        waitForMobileElement(rr.personalLeave);
        rr.personalLeave.click();
        waitForMobileElement(rr.sickLeave);
        rr.sickLeave.click();

        Thread.sleep(3000);
        tr.imageView.get(0).click();
        Thread.sleep(3000);
        tr.imageView.get(0).click();
        Thread.sleep(3000);
        tr.imageView.get(0).click();
        Thread.sleep(3000);
        try{
            tr.imageView.get(0).click();
        }catch (Exception e){

        }
    }

    @Step("Uncheck name report")
    public static void uncheckNameReport() throws InterruptedException {
        waitForMobileElement(rr.executiveReport);
        rr.executiveReport.click();
        waitForMobileElement(rr.uncheckName);
        rr.uncheckName.click();
        Thread.sleep(2000);
        rr.imageView.get(1).click();
        Thread.sleep(2000);
        rr.imageView.get(2).click();
        //Navigate back to home screen
        Thread.sleep(2000);
        rr.imageView.get(0).click();
        Thread.sleep(2000);
        rr.imageView.get(0).click();
    }

    @Step("Broadcast report")
    public static void broadcastReport() throws InterruptedException {
        waitForMobileElement(rr.executiveReport);
        rr.executiveReport.click();
        waitForMobileElement(rr.broadcast);
        rr.broadcast.click();
        Thread.sleep(3000);
        rr.viewGroup.get(5).click();
        waitForMobileElement(rr.recipient);
        rr.recipient.click();
        //Navigate back to home screen
        Thread.sleep(2000);
        rr.imageView.get(0).click();
        Thread.sleep(2000);
        rr.imageView.get(0).click();
        Thread.sleep(2000);
        rr.imageView.get(0).click();
    }

    @Step("Top up report")
    public static void topupReport() throws InterruptedException {
        waitForMobileElement(rr.executiveReport);
        rr.executiveReport.click();
        waitForMobileElement(rr.topUp);
        rr.topUp.click();
        Thread.sleep(3000);
        rr.textView.get(1).click();
        Thread.sleep(3000);
        rr.textView.get(3).click();
        Thread.sleep(3000);
        rr.textView.get(1).click();
        Thread.sleep(3000);
        rr.textView.get(4).click();
        Thread.sleep(3000);
        rr.textView.get(1).click();
        Thread.sleep(3000);
        rr.textView.get(5).click();
        //navigate back to home screen
        Thread.sleep(2000);
        rr.imageView.get(0).click();
        Thread.sleep(2000);
        rr.imageView.get(0).click();
    }

    @Step("Sales report")
    public static void salesReport() throws InterruptedException {
        waitForMobileElement(rr.executiveReport);
        rr.executiveReport.click();
        waitForMobileElement(rr.sales);
        rr.sales.click();
        Thread.sleep(3000);
        rr.textView.get(1).click();
        Thread.sleep(3000);
        rr.textView.get(3).click();
        Thread.sleep(3000);
        rr.textView.get(1).click();
        Thread.sleep(3000);
        rr.textView.get(4).click();
        Thread.sleep(3000);
        rr.textView.get(1).click();
        Thread.sleep(3000);
        rr.textView.get(5).click();
        //navigate back to home screen
        Thread.sleep(2000);
        rr.imageView.get(0).click();
        Thread.sleep(2000);
        rr.imageView.get(0).click();
    }

    @Step("Tution report")
    public static void tuitionReport() throws InterruptedException {
        waitForMobileElement(rr.executiveReport);
        rr.executiveReport.click();
        scrollDown();
        waitForMobileElement(rr.tuition);
        rr.tuition.click();
        waitForMobileElement(rr.nextButton);
        rr.nextButton.click();
        Thread.sleep(3000);
        //navigate back to home screen
        rr.imageView.get(0).click();
        Thread.sleep(2000);
        rr.imageView.get(0).click();
        Thread.sleep(2000);
        rr.imageView.get(0).click();
    }

    @Step(" Personal report")
    public static void personalAttendanceReport() throws InterruptedException {
        waitForMobileElement(rr.personalReport);
        rr.personalReport.click();
        waitForMobileElement(rr.attendanceButton);
        rr.attendanceButton.click();
        Thread.sleep(2000);
        rr.imageView.get(1).click();
        Thread.sleep(2000);
        rr.imageView.get(2).click();
        Thread.sleep(2000);
        rr.listButton.click();
        //Click on start date
        Thread.sleep(2000);
        rr.viewGroup.get(5).click();
        Thread.sleep(2000);
        appiumDriver.navigate().back();
        //Click on end date
        Thread.sleep(2000);
        rr.viewGroup.get(7).click();
        Thread.sleep(2000);
        appiumDriver.navigate().back();
        Thread.sleep(3000);
        //navigate back to home screen
        rr.imageView.get(0).click();
        Thread.sleep(2000);
        rr.imageView.get(0).click();
    }

    @Step("Personal leave report")
    public static void personalLeaveReport() throws InterruptedException {
        waitForMobileElement(rr.personalReport);
        rr.personalReport.click();
        waitForMobileElement(rr.leave);
        rr.leave.click();
        Thread.sleep(2000);
        rr.viewGroup.get(2).click();
        Thread.sleep(2000);
        rr.imageView.get(0).click();
        Thread.sleep(2000);
        rr.imageView.get(1).click();
        Thread.sleep(2000);
        appiumDriver.navigate().back();
        //click on end date
        Thread.sleep(2000);
        rr.viewGroup.get(4).click();
        Thread.sleep(2000);
        rr.imageView.get(0).click();
        Thread.sleep(2000);
        rr.imageView.get(1).click();
        Thread.sleep(2000);
        appiumDriver.navigate().back();

        Thread.sleep(3000);
        //navigate back to home screen
        rr.imageView.get(0).click();
        Thread.sleep(2000);
        rr.imageView.get(0).click();

    }

    @Step("Personal topup report")
    public static void personalTopupReport() throws InterruptedException {
        waitForMobileElement(rr.personalReport);
        rr.personalReport.click();
        waitForMobileElement(rr.topUp);
        rr.topUp.click();
        Thread.sleep(2000);
        rr.listButton.click();
        //Click on start date
        Thread.sleep(2000);
        rr.viewGroup.get(5).click();
        Thread.sleep(2000);
        appiumDriver.navigate().back();
        //Click on end date
        Thread.sleep(2000);
        rr.viewGroup.get(7).click();
        Thread.sleep(2000);
        appiumDriver.navigate().back();
        Thread.sleep(3000);
        //navigate back to home screen
        rr.imageView.get(0).click();
        Thread.sleep(2000);
        rr.imageView.get(0).click();
    }

    @Step("Personal purhase report")
    public static void personalPurchaseReport() throws InterruptedException {
        waitForMobileElement(rr.personalReport);
        rr.personalReport.click();
        waitForMobileElement(rr.purchase);
        rr.purchase.click();
        Thread.sleep(2000);
        rr.listButton.click();
        //Click on start date
        Thread.sleep(2000);
        rr.viewGroup.get(5).click();
        Thread.sleep(2000);
        appiumDriver.navigate().back();
        //Click on end date
        Thread.sleep(2000);
        rr.viewGroup.get(7).click();
        Thread.sleep(2000);
        appiumDriver.navigate().back();
        Thread.sleep(3000);
        //navigate back to home screen
        rr.imageView.get(0).click();
        Thread.sleep(2000);
        rr.imageView.get(0).click();
    }

    @Step("Personal broadcast report")
    public static void personalBroadcastReport() throws InterruptedException {
        waitForMobileElement(rr.personalReport);
        rr.personalReport.click();
        waitForMobileElement(rr.broadcastButton);
        rr.broadcastButton.click();
        Thread.sleep(5000);
        appiumDriver.navigate().back();
        Thread.sleep(2000);
        appiumDriver.navigate().back();
    }
}



