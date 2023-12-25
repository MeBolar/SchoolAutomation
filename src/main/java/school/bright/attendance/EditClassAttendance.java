package school.bright.attendance;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import school.bright.generic.Base;
import school.bright.generic.PropertyReader;
import school.bright.login.AppLoginRepo;

import java.util.HashMap;

public class EditClassAttendance extends Base {
    private static HashMap<String,String> studentProperties;
    public static EditClassAttendanceRepo ecar;
    public static CheckinTeacherAttendanceRepo ctar;
    public static ClassAttendanceRepo car;
    public static AppLoginRepo alr;
    public static CheckInTeacherAttendanceFromRoomPageRepo cafrp;
    public static boolean attendanceTaken= false, mathAttendanceTaken=false;
    public EditClassAttendance(){
        ecar=new EditClassAttendanceRepo(appiumDriver);
        ctar=new CheckinTeacherAttendanceRepo(appiumDriver);
        cafrp=new CheckInTeacherAttendanceFromRoomPageRepo(appiumDriver);
        car=new ClassAttendanceRepo(appiumDriver);
        alr=new AppLoginRepo(appiumDriver);
    }

    @Step("Navigate to edit class attendance screen")
    public static void navigateToEditClassAttendanceScreen(){
        try{
            Thread.sleep(3000);
            //Click on menu button
            ctar.imageView.get(0).click();
        }catch (Exception e){
            //Click on menu button
            ctar.imageView.get(0).click();
        }
        waitForMobileElement(ctar.classAttendance);
        ctar.classAttendance.click();
        waitForMobileElement(ctar.editClassAttendanceButton);
        ctar.editClassAttendanceButton.click();
        waitForMobileElement(ecar.editClassAttendanceLabel);
    }


    @Step("Edit the taken class attendance as success")
    public static void editClassAttendanceToSuccess() throws InterruptedException {
        try{
            Thread.sleep(3000);
            //Click on menu button
            ctar.imageView.get(0).click();
        }catch (Exception e){
            //Click on menu button
            ctar.imageView.get(0).click();
        }
        waitForMobileElement(ctar.editClassAttendanceButton);
        ctar.editClassAttendanceButton.click();
        waitForMobileElement(ecar.editClassAttendanceLabel);
        cafrp.classLevel.click();
        waitForMobileElement(cafrp.classLevelA);
        cafrp.classLevelA.click();

        waitForMobileElement(cafrp.className);
        cafrp.className.click();
        waitForMobileElement(cafrp.classA1);
        cafrp.classA1.click();
        scrollDown();

        waitForMobileElement(cafrp.subject);
        cafrp.subject.click();
        waitFor10sec(car.englishSubject);
        car.englishSubject.click();

        waitForMobileElement(ctar.nextButton);
        //Click next button
        ctar.nextButton.click();
        try{
            waitFor10sec(cafrp.studentIDSearchBar);
            attendanceTaken=false;
            //   waitFor10sec(car.takeClassAttendanceTitle);
        }catch (Exception e){
            //this course has already been taken attendance
            attendanceTaken=true;
            alr.closeButton.click();
            Thread.sleep(3000);
            appiumDriver.navigate().back();
        }
    }

    @Step("Update student attendance as absent")
    public static void updateStudentAttendanceAsAbsent() throws InterruptedException {
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

        waitForMobileElement(cafrp.absenceButton);
        cafrp.absenceButton.click();
        waitForMobileElement(cafrp.nextButton);
        //Click on Next button
        cafrp.nextButton.click();
        waitForMobileElement(cafrp.summaryOfStudents);
        cafrp.submitButton.click();
        waitForMobileElement(cafrp.completedText);
        alr.closeButton.click();
        //user will be navigated to home page
        appiumDriver.navigate().back();
        Thread.sleep(2000);
        appiumDriver.navigate().back();
        Thread.sleep(2000);
        appiumDriver.navigate().back();
        Thread.sleep(4000);
        appiumDriver.navigate().back();
    }

    @Step("Copy class attendance")
    public static void copyClassAttendance() throws InterruptedException {
        try{
            Thread.sleep(4000);
            //Click on menu button
            ctar.imageView.get(0).click();
        }catch (Exception e){
            Thread.sleep(4000);
            //Click on menu button
            ctar.imageView.get(0).click();
            System.out.println("Some issue with menu button");
        }
        waitForMobileElement(ecar.editClassAttendanceLabel);
        ecar.editClassAttendanceLabel.click();
        waitForMobileElement(cafrp.className);
        cafrp.classLevel.click();
        waitForMobileElement(cafrp.classLevelA);
        cafrp.classLevelA.click();

        waitForMobileElement(cafrp.className);
        cafrp.className.click();
        waitForMobileElement(cafrp.classA1);
        cafrp.classA1.click();
        scrollDown();
        waitForMobileElement(cafrp.subject);
        cafrp.subject.click();
        waitFor10sec(car.mathSubject);
        car.mathSubject.click();
        waitForMobileElement(ctar.nextButton);
        //Click next button
        ctar.nextButton.click();
        try{
            waitFor10sec(ecar.checkInButton);
            attendanceTaken=false;
            //   waitFor10sec(car.takeClassAttendanceTitle);
        }catch (Exception e){
            //this course has already been taken attendance
            attendanceTaken=true;
            alr.closeButton.click();
            Thread.sleep(3000);
            appiumDriver.navigate().back();
        }
    }
    @Step("Copy Attendance")
    public static void copyAttendance() throws InterruptedException {
        Thread.sleep(3000);
        ecar.imageView.get(1).click();
        waitForMobileElement(ctar.nextButton);
        //Click next button
        ctar.nextButton.click();
        waitForMobileElement(cafrp.summaryOfStudents);
        cafrp.submitButton.click();
        waitForMobileElement(cafrp.completedText);
        alr.closeButton.click();
        //user will be navigated to home page
        //user will be navigated to home page
        appiumDriver.navigate().back();
        Thread.sleep(2000);
        appiumDriver.navigate().back();
        Thread.sleep(2000);
        appiumDriver.navigate().back();
        Thread.sleep(4000);
        appiumDriver.navigate().back();
    }


}
