package school.bright.broadcast;

import io.qameta.allure.Step;
import school.bright.attendance.CheckinTeacherAttendanceRepo;
import school.bright.classroom.OnlineClassRoomRepo;
import school.bright.generic.Base;

public class Broadcast extends Base {
    public static BroadcastRepo br;
    public static OnlineClassRoomRepo ocrp;
    public static CheckinTeacherAttendanceRepo ctar;

    public Broadcast(){
        br=new BroadcastRepo(appiumDriver);
        ctar=new CheckinTeacherAttendanceRepo(appiumDriver);
        ocrp=new OnlineClassRoomRepo(appiumDriver);
    }

    @Step("Navigate to online class room screen")
    public static void navigateToBroadcastScreen() throws InterruptedException {
        Thread.sleep(4000);
        try{
            Thread.sleep(3000);
            //Click on menu button
            ctar.imageView.get(0).click();
        }catch (Exception e){
            //Click on menu button
            ctar.imageView.get(0).click();
        }
        waitForMobileElement(br.broadcastButton);
        br.broadcastButton.click();
    }

    @Step("Negative test cases of broadcast all")
    public static void broadcastAllNegativeTestCases(){
        waitForMobileElement(ctar.nextButton);
        ctar.nextButton.click();
        waitForMobileElement(ocrp.CLOSE);
        ocrp.CLOSE.click();
        waitForMobileElement(br.deliveryFormat);
        br.deliveryFormat.click();
        waitForMobileElement(br.group);
        br.group.click();
        waitForMobileElement(ctar.nextButton);
        ctar.nextButton.click();
        waitForMobileElement(ocrp.CLOSE);
        ocrp.CLOSE.click();
        waitForMobileElement(br.recipient);
        br.recipient.click();
        waitForMobileElement(br.allStudents);
        br.allStudents.click();
        waitForMobileElement(br.deliveryFormat);
        br.deliveryFormat.click();
        waitForMobileElement(br.individual);
        br.individual.click();
        waitForMobileElement(br.recipient);
        br.recipient.click();
        waitForMobileElement(br.students);
        br.students.click();

    }

    @Step("Broadcast all")
    public static void broadcastAll(){
        waitForMobileElement(br.deliveryFormat);
        br.deliveryFormat.click();
        waitForMobileElement(br.group);
        br.group.click();
        waitForMobileElement(br.recipient);
        br.recipient.click();
        waitForMobileElement(br.allEveryoneInTheSchool);
        br.allEveryoneInTheSchool.click();
        waitForMobileElement(ctar.nextButton);
        ctar.nextButton.click();
        waitForMobileElement(br.mainTopic);
        br.mainTopic.sendKeys("Broadcast1");
        waitForMobileElement(ctar.nextButton);
        ctar.nextButton.click();
        waitForMobileElement(ocrp.CLOSE);
        ocrp.CLOSE.click();
        waitForMobileElement(br.reply);
        br.reply.click();
        waitForMobileElement(br.noResponse);
        br.noResponse.click();
        waitForMobileElement(br.sendNow);
        br.sendNow.click();
        waitForMobileElement(br.description);
        br.description.sendKeys("Broadcast details1");
        waitForMobileElement(ctar.nextButton);
        ctar.nextButton.click();
        waitForMobileElement(ocrp.submitButton);
        ocrp.submitButton.click();
        waitForMobileElement(ocrp.CLOSE);
        ocrp.CLOSE.click();
        //app will be navigated to home page
    }
    @Step("Broadcast to selected students")
    public static void broadcastToSelectedStudents() throws InterruptedException {

        waitForMobileElement(br.deliveryFormat);
        br.deliveryFormat.click();
        waitForMobileElement(br.group);
        br.group.click();
        waitForMobileElement(br.recipient);
        br.recipient.click();
        waitForMobileElement(br.onlySelectedStudents);
        br.onlySelectedStudents.click();
        waitForMobileElement(ctar.nextButton);
        ctar.nextButton.click();
        waitForMobileElement(br.classA);
        br.classA.click();
        Thread.sleep(2000);
        br.button.get(21).click();
        waitForMobileElement(ctar.nextButton);
        ctar.nextButton.click();
        waitForMobileElement(br.mainTopic);
        br.mainTopic.sendKeys("Broadcast2");
        waitForMobileElement(br.reply);
        br.reply.click();
        waitForMobileElement(br.acknowledge);
        br.acknowledge.click();
        waitForMobileElement(br.setTime);
        br.setTime.click();
        waitForMobileElement(br.date);
        br.date.click();
        Thread.sleep(2000);
        ocrp.dateButton.get(22).click();
        waitForMobileElement(ocrp.selectButton);
        ocrp.selectButton.click();
        waitForMobileElement(br.time);
        br.time.click();
        waitForMobileElement(ocrp.selectButton);
        ocrp.selectButton.click();
        waitForMobileElement(br.description);
        br.description.sendKeys("Broadcast details2");
        waitForMobileElement(ctar.nextButton);
        ctar.nextButton.click();
        waitForMobileElement(ocrp.submitButton);
        ocrp.submitButton.click();
        waitForMobileElement(ocrp.CLOSE);
        ocrp.CLOSE.click();
        //app will be navigated to home page
    }
    @Step("Broadcast to selected teachers")
    public static void broadcastToSelectedTeachers() throws InterruptedException {
        waitForMobileElement(br.deliveryFormat);
        br.deliveryFormat.click();
        waitForMobileElement(br.individual);
        br.individual.click();
        waitForMobileElement(br.recipient);
        br.recipient.click();
        waitForMobileElement(br.teacherOrStaff);
        br.teacherOrStaff.click();
        waitForMobileElement(ctar.nextButton);
        ctar.nextButton.click();
        Thread.sleep(2000);
        br.button.get(6).click();
        waitForMobileElement(ctar.nextButton);
        ctar.nextButton.click();
        waitForMobileElement(br.mainTopic);
        br.mainTopic.sendKeys("Broadcast3");
        waitForMobileElement(br.reply);
        br.reply.click();
        waitForMobileElement(br.confirm);
        br.confirm.click();
        waitForMobileElement(br.sendNow);
        br.sendNow.click();
        waitForMobileElement(br.description);
        br.description.sendKeys("Broadcast details3");
        waitForMobileElement(ctar.nextButton);
        ctar.nextButton.click();
        waitForMobileElement(ocrp.submitButton);
        ocrp.submitButton.click();
        waitForMobileElement(ocrp.CLOSE);
        ocrp.CLOSE.click();
    }

    @Step("Broadcast to individual students")
    public static void broadcastToIndividualStudents() throws InterruptedException {
        waitForMobileElement(br.deliveryFormat);
        br.deliveryFormat.click();
        waitForMobileElement(br.individual);
        br.individual.click();
        waitForMobileElement(br.recipient);
        br.recipient.click();
        waitForMobileElement(br.students);
        br.students.click();
        waitForMobileElement(ctar.nextButton);
        ctar.nextButton.click();
        waitForMobileElement(br.classLevel);
        br.classLevel.click();
        waitForMobileElement(br.classA);
        br.classA.click();
        waitForMobileElement(br.className);
        br.className.click();
        waitForMobileElement(br.classA1);
        br.classA1.click();
        waitForMobileElement(ctar.nextButton);
        ctar.nextButton.click();
        Thread.sleep(4000);
        br.button.get(6).click();
        waitForMobileElement(ctar.nextButton);
        ctar.nextButton.click();
        waitForMobileElement(br.mainTopic);
        br.mainTopic.sendKeys("Broadcast4");
        waitForMobileElement(br.reply);
        br.reply.click();
        waitForMobileElement(br.agreeOrDisagree);
        br.agreeOrDisagree.click();
        waitForMobileElement(br.sendNow);
        br.sendNow.click();
        waitForMobileElement(br.description);
        br.description.sendKeys("Broadcast details4");
        waitForMobileElement(ctar.nextButton);
        ctar.nextButton.click();
        waitForMobileElement(ocrp.submitButton);
        ocrp.submitButton.click();
        waitForMobileElement(ocrp.CLOSE);
        ocrp.CLOSE.click();
    }
}
