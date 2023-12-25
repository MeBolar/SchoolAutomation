package school.bright.attendance;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import school.bright.generic.Base;
import school.bright.generic.PropertyReader;
import school.bright.login.AppLoginRepo;

import java.util.HashMap;

public class CheckInTeacherAttendanceFromRoomPage extends Base {
    private static HashMap<String,String> studentProperties;
    public static CheckInTeacherAttendanceFromRoomPageRepo cafrp;
    public static CheckinTeacherAttendanceRepo ctar;
    public static AppLoginRepo alr;
    public static boolean attendanceTaken = false;

    public CheckInTeacherAttendanceFromRoomPage() {
        cafrp = new CheckInTeacherAttendanceFromRoomPageRepo(appiumDriver);
        ctar = new CheckinTeacherAttendanceRepo(appiumDriver);
        alr = new AppLoginRepo(appiumDriver);
    }

    @Step("Test case to checkin attendance from room page")
    public static boolean checkInAttendanceViaClassRoom() throws InterruptedException {
        Thread.sleep(2000);
        ctar.nextButton.click();
        Thread.sleep(1000);
        alr.closeButton.click();
        //Select class level
        cafrp.selectClassLevel.click();
        Thread.sleep(2000);
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
        cafrp.classA1.click();
        Thread.sleep(1000);
        //Click next button
        ctar.nextButton.click();
        //Try catch to evaluate whether attendance already taken or not
        try {
            Thread.sleep(1000);
            alr.closeButton.click();
            System.out.println("Room attendance already taken");
            Thread.sleep(1000);
            attendanceTaken = true;
            ctar.backButton.click();
            return true;

        } catch (Exception e) {
            System.out.println("User navigated to checkin attendance by class room ");
            return false;
        }
    }

    @Step("Navigate to class room from attendace screen")
    public static void navigateToClassRoom() throws InterruptedException {
        try{
            Thread.sleep(1000);
            //Select class level
            cafrp.selectClassLevel.click();
            waitForMobileElement(cafrp.classLevelA);
            cafrp.classLevelA.click();
            waitForMobileElement(cafrp.selectClass);
            //Select class
            cafrp.selectClass.click();
            waitForMobileElement(cafrp.classA1);
            cafrp.classA1.click();
            waitForMobileElement(ctar.nextButton);
            //Click next button
            ctar.nextButton.click();

        }catch (Exception e){
            //Click next button
            ctar.nextButton.click();
        }

    }

    @Step("Test case to search a student with invalid student ID")
    public static void searchInvalidStudent() throws InterruptedException {
        //Consider user in attendance from room page screen
        waitForMobileElement(cafrp.studentIDSearchBar);
        cafrp.studentIDSearchBar.click();
        cafrp.studentIDSearchBar.sendKeys("XXXYYYZZZ");
        Thread.sleep(3000);
        try {
            cafrp.noListText.isDisplayed();
            System.out.println("No results to display");
            cafrp.searchBar.click();
            cafrp.searchBar.clear();
        } catch (Exception e) {
            System.out.println("Found some students who are matching the list");
            cafrp.searchBar.click();
            cafrp.searchBar.clear();
        }
    }

    @Step("Test case to search a student with valid student ID")
    public static void searchValidStudent() throws InterruptedException {
        //Consider user in attendance from room page screen
        waitForMobileElement(cafrp.studentIDSearchBar);
        cafrp.studentIDSearchBar.click();
        cafrp.studentIDSearchBar.sendKeys("6616");
        Thread.sleep(3000);
        try {
            cafrp.noListText.isDisplayed();
            System.out.println("No results to display");
            cafrp.searchBar.click();
            cafrp.searchBar.clear();
        } catch (Exception e) {
            System.out.println("Found some students who are matching the list");
            cafrp.searchBar.click();
            cafrp.searchBar.clear();
        }
    }

    @Step("Test case to not checkin all students on time")
    public static void dontCheckInAllStudentsAsOnTime() throws InterruptedException {
        Thread.sleep(3000);
        //Click on Select button
        cafrp.imageView.get(2).click();
        waitForMobileElement(cafrp.onTimeButtton);
        //Click on ON TIME button
        cafrp.onTimeButtton.click();
        //Click on Next button
        waitForMobileElement(cafrp.nextButton);
        cafrp.nextButton.click();
        waitForMobileElement(cafrp.summaryOfStudents);
        String totalCount = cafrp.textView.get(3).getText();
        System.out.println("Count to be checked In = " + totalCount);
        appiumDriver.navigate().back();
    }

    @Step("Test case not to checkin all students late")
    public static void dontCheckinAllStudentsAsLate() throws InterruptedException {
        //Click on Select button
        cafrp.imageView.get(2).click();
        Thread.sleep(1000);
        cafrp.lateButton.click();
        //Click on Next button
        waitForMobileElement(cafrp.nextButton);
        cafrp.nextButton.click();
        waitForMobileElement(cafrp.summaryOfStudents);
        String totalCount = cafrp.textView.get(5).getText();
        System.out.println("Count to be checked In = " + totalCount);
        appiumDriver.navigate().back();
    }

    @Step("Test case not to checkin all students as Absence")
    public static void dontCheckinAllStudentsAsAbsence() throws InterruptedException {
        //Click on Select button
        cafrp.imageView.get(2).click();
        Thread.sleep(1000);
        cafrp.absenceButton.click();
        //Click on Next button
        waitForMobileElement(cafrp.nextButton);
        cafrp.nextButton.click();
        waitForMobileElement(cafrp.summaryOfStudents);
        String totalCount = cafrp.textView.get(7).getText();
        System.out.println("Count to be checked In = " + totalCount);
        appiumDriver.navigate().back();
    }

    @Step("Test case not to checkin all students as personal leave")
    public static void dontCheckinAllStudentsAsPersonalLeave() throws InterruptedException {
        //Click on Select button
        cafrp.imageView.get(2).click();
        Thread.sleep(1000);
        cafrp.personalLeaveButton.click();
        //Click on Next button
        waitForMobileElement(cafrp.nextButton);
        cafrp.nextButton.click();
        waitForMobileElement(cafrp.summaryOfStudents);
        String totalCount = cafrp.textView.get(9).getText();
        System.out.println("Count to be checked In = " + totalCount);
        appiumDriver.navigate().back();
    }

    @Step("Test case not to checkin all students as sick leave")
    public static void dontCheckinAllStudentsAsSick() throws InterruptedException {
        //Click on Select button
        cafrp.imageView.get(2).click();
        Thread.sleep(1000);
        cafrp.sickLeaveButton.click();
        //Click on Next button
        waitForMobileElement(cafrp.nextButton);
        cafrp.nextButton.click();
        waitForMobileElement(cafrp.summaryOfStudents);
        String totalCount = cafrp.textView.get(11).getText();
        System.out.println("Count to be checked In = " + totalCount);
        appiumDriver.navigate().back();
    }

    @Step("Test case not to checkin all students as event")
    public static void dontCheckinAllStudentsAsEvent() throws InterruptedException {
        //Click on Select button
        cafrp.imageView.get(2).click();
        Thread.sleep(1000);
        cafrp.eventButton.click();
        //Click on Next button
        waitForMobileElement(cafrp.nextButton);
        cafrp.nextButton.click();
        waitForMobileElement(cafrp.summaryOfStudents);
        String totalCount = cafrp.textView.get(13).getText();
        System.out.println("Count to be checked In = " + totalCount);
        appiumDriver.navigate().back();
    }

    @Step("Test case not to checkin all students as undefined")
    public static void dontCheckinAllStudentsAsUndefined() throws InterruptedException {
        //Click on Select button
        cafrp.imageView.get(2).click();
        Thread.sleep(1000);
        cafrp.undefinedButton.click();
        waitForMobileElement(cafrp.nextButton);
        //Click on Next button
        cafrp.nextButton.click();
        Thread.sleep(1000);
        alr.closeButton.click();
        Thread.sleep(1000);
        appiumDriver.navigate().back();
        waitForMobileElement(cafrp.topBackButton);
        try{
            cafrp.topBackButton.click();
        }catch (Exception e){
            cafrp.topBackButton.click();
        }

    }

    @Step("Test case to checkin a student on time successfully")
    public static void checkinStudentSuccessfully() throws InterruptedException {
        studentProperties= PropertyReader.getPropValues(System.getProperty("user.dir")+"/src/main/resources/login/Student.properties");
        String studentID= System.getProperty("STUDENT.TOCHECKINONTIME") == null ? studentProperties.get("STUDENT.TOCHECKINONTIME") : System.getProperty("Student.Tocheckinontime");
        //Validating whether attendance is already checked in or not
        try{
            Thread.sleep(2000);
            alr.closeButton.click();
            Thread.sleep(2000);
            cafrp.topBackButton.click();

        }catch(Exception e3){
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
            waitForMobileElement(cafrp.onTimeButtton);
            cafrp.onTimeButtton.click();
            waitForMobileElement(cafrp.nextButton);
            //Click on Next button
            cafrp.nextButton.click();
            waitForMobileElement(cafrp.summaryOfStudents);
            cafrp.submitButton.click();
            waitForMobileElement(cafrp.completedText);
            alr.closeButton.click();
        }



    }

    @Step("Test case to re-checkin same student")
    public static void recheckInSameStudent(){
        waitFor10sec(cafrp.attendanceAlreadyTakenText);
        alr.closeButton.click();
        //Navigate back to home screen
        waitFor10sec(cafrp.topBackButton);
        cafrp.topBackButton.click();
    }

}
