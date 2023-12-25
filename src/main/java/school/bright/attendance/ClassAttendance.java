package school.bright.attendance;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import school.bright.generic.Base;
import school.bright.generic.PropertyReader;
import school.bright.login.AppLoginRepo;

import java.util.HashMap;

public class ClassAttendance extends Base {
    private static HashMap<String,String> studentProperties;
    public static ClassAttendanceRepo car;
    public static CheckinTeacherAttendanceRepo ctar;
    public static EditCheckedInAttendanceRepo eciar;
    public static CheckInTeacherAttendanceFromRoomPageRepo cafrp;
    public static AppLoginRepo alr;
    public static boolean attendanceTaken= false, mathAttendanceTaken=false;
    public ClassAttendance(){
        car=new ClassAttendanceRepo(appiumDriver);
        ctar= new CheckinTeacherAttendanceRepo(appiumDriver);
        eciar= new EditCheckedInAttendanceRepo(appiumDriver);
        cafrp=new CheckInTeacherAttendanceFromRoomPageRepo(appiumDriver);
        alr=new AppLoginRepo(appiumDriver);
    }

    @Step("Test case to navigate to class attendance screen from home page")
    public static void navigateToClassAttendaceFromHomePage(){
        waitForMobileElement(ctar.attendanceButton);
        ctar.attendanceButton.click();
        waitForMobileElement(ctar.takeClassAttendance);
        ctar.takeClassAttendance.click();
    }

    @Step("Test case to navigate to detail scrren by entering class level, class and subject")
    public static void navigateToDetailScreenOfClassAttendance() throws InterruptedException {
        waitForMobileElement(eciar.classLevelLabel);
        //scroll down
        scrollDown();
        waitForMobileElement(ctar.nextButton);
        //Click next button
        ctar.nextButton.click();
        waitForMobileElement(alr.closeButton);
        alr.closeButton.click();
        waitForMobileElement(cafrp.selectClassLevel);
        //Select class level
        cafrp.selectClassLevel.click();
        waitForMobileElement(cafrp.classLevelA);
        cafrp.classLevelA.click();

        waitForMobileElement(ctar.nextButton);
        //Click next button
        ctar.nextButton.click();
        waitForMobileElement(alr.closeButton);
        alr.closeButton.click();

        waitForMobileElement(cafrp.selectClass);
        //Select class
        cafrp.selectClass.click();
        waitForMobileElement(cafrp.classA1);
        cafrp.classA1.click();

        waitForMobileElement(ctar.nextButton);
        //Click next button
        ctar.nextButton.click();
        waitForMobileElement(alr.closeButton);
        alr.closeButton.click();

        waitForMobileElement(car.selectSubject);
        car.selectSubject.click();
        waitForMobileElement(car.englishSubject);
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
    @Step("Test case to navigate to detail scrren by entering class level, class and subject")
    public static void navigateToDetailScreen() throws InterruptedException {
        try{
            waitForMobileElement(eciar.classLevelLabel);
            //scroll down
            scrollDown();

            waitForMobileElement(cafrp.classLevelA);

            waitForMobileElement(cafrp.classA1);

            waitForMobileElement(car.englishSubject);
            car.englishSubject.click();
            waitForMobileElement(car.mathSubject);
            car.mathSubject.click();
            waitForMobileElement(ctar.nextButton);
            //Click next button
            ctar.nextButton.click();
            waitFor10sec(car.takeClassAttendanceTitle);
        }catch (Exception e){
            //this course has already been taken attendance
            mathAttendanceTaken=true;
            alr.closeButton.click();
            Thread.sleep(3000);
            //click on back button
            ctar.backButton.click();
        }
    }

    @Step("Test case to copy attendance")
    public static void copyAttendanceForMath() throws InterruptedException {
        //Click on copy button
        car.imageView.get(1).click();
        waitForMobileElement(cafrp.nextButton);
        //Click on Next button
        cafrp.nextButton.click();
        try{
            waitFor10sec(cafrp.summaryOfStudents);
            cafrp.submitButton.click();
            waitForMobileElement(cafrp.completedText);
            alr.closeButton.click();
            //Navigate back to home screen
            appiumDriver.navigate().back();
        }catch (Exception e){
            //this course has already been taken attendance
            attendanceTaken=true;
            alr.closeButton.click();
            Thread.sleep(3000);
            appiumDriver.navigate().back();
        }

    }

    @Step("Test case to successfully take attendance")
    public static void successfullyTakeClassAttendance() throws InterruptedException {
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
        waitForMobileElement(cafrp.onTimeButtton);
        cafrp.onTimeButtton.click();
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
