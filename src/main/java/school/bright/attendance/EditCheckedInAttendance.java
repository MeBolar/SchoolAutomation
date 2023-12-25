package school.bright.attendance;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import school.bright.generic.Base;
import school.bright.generic.PropertyReader;
import school.bright.login.AppLoginRepo;

import java.util.HashMap;

public class EditCheckedInAttendance extends Base {
    private static HashMap<String,String> studentProperties;
    public static EditCheckedInAttendanceRepo eciar;
    public static CheckinTeacherAttendanceRepo ctar;
    public static AppLoginRepo alr;
    public static CheckInTeacherAttendanceFromRoomPageRepo cafrp;
    public EditCheckedInAttendance(){
        eciar=new EditCheckedInAttendanceRepo(appiumDriver);
        ctar=new CheckinTeacherAttendanceRepo(appiumDriver);
        cafrp= new CheckInTeacherAttendanceFromRoomPageRepo(appiumDriver);
        alr= new AppLoginRepo(appiumDriver);
    }
    @Step("Navigate to edit checkin screen from home screen")
    public static void navigateToEditCheckInScreen() throws InterruptedException {
        Thread.sleep(1000);
        //Click on menu button
        ctar.imageView.get(0).click();
        waitForMobileElement(eciar.editCheckinButton);
        eciar.editCheckinButton.click();
        waitForMobileElement(eciar.classLevelLabel);
    }


    @Step("Test case to edit checked in attendance")
    public static void editAttendanceCheckin() throws InterruptedException {
        waitForMobileElement(ctar.nextButton);
        ctar.nextButton.click();
        waitFor10sec(alr.closeButton);
        alr.closeButton.click();
        //Select class level
        cafrp.selectClassLevel.click();
        Thread.sleep(1000);
        cafrp.classLevelA.click();
        Thread.sleep(1000);
        //Click next button
        ctar.nextButton.click();
        Thread.sleep(1000);
        alr.closeButton.click();
        Thread.sleep(1000);
        //Select class
        cafrp.selectClass.click();
        Thread.sleep(1000);
        cafrp.classA2.click();
        Thread.sleep(1000);
        //Click next button
        ctar.nextButton.click();
        waitFor10sec(alr.closeButton);
        alr.closeButton.click();
        waitFor10sec(cafrp.classA2);
        cafrp.classA2.click();
        Thread.sleep(1000);
        cafrp.classA1.click();
        Thread.sleep(1000);
        //Click next button
        ctar.nextButton.click();
    }

    @Step("Test case to select class and class level")
    public static void selectClassAndLevel() throws InterruptedException {
        cafrp.selectClassLevel.click();
        Thread.sleep(1000);
        cafrp.classLevelA.click();
        Thread.sleep(2000);
        //Select class
        cafrp.selectClass.click();
        Thread.sleep(1000);
        cafrp.classA1.click();
        Thread.sleep(1000);
        //Click next button
        ctar.nextButton.click();
    }

    @Step("Test case to checkin student as late")
    public static void checkinAlreadyCheckedInStudentAsLate() throws InterruptedException {
        studentProperties= PropertyReader.getPropValues(System.getProperty("user.dir")+"/src/main/resources/login/Student.properties");
        String studentID= System.getProperty("STUDENT.TOCHECKINONTIME") == null ? studentProperties.get("STUDENT.TOCHECKINONTIME") : System.getProperty("Student.Tocheckinontime");
        waitForMobileElement(cafrp.studentIDSearchBar);
        cafrp.studentIDSearchBar.sendKeys(studentID.toString());
        Thread.sleep(2000);
        try{
            //android.widget.TextView[@text='661583']
            String ele="//android.widget.TextView[@text='"+studentID.toString()+"']";
            System.out.println("Element to click ="+ ele);
            appiumDriver.findElement(By.xpath(ele)).click();
            //Second click to click on element
            appiumDriver.findElement(By.xpath(ele)).click();
        }catch (Exception e){
            try{
                cafrp.imageView.get(3).click();
                Thread.sleep(1000);
                cafrp.imageView.get(3).click();
            }catch (Exception e2){

            }
        }
        Thread.sleep(2000);
        waitForMobileElement(cafrp.lateButton);
        cafrp.lateButton.click();
        waitForMobileElement(cafrp.nextButton);
        //Click on Next button
        cafrp.nextButton.click();
        waitForMobileElement(cafrp.summaryOfStudents);
        cafrp.submitButton.click();
        waitForMobileElement(cafrp.completedText);
        alr.closeButton.click();
        //user will be navigated to home page

    }

}
