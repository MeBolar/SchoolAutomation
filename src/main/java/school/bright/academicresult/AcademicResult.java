package school.bright.academicresult;

import io.qameta.allure.Step;
import school.bright.attendance.CheckinTeacherAttendanceRepo;
import school.bright.classroom.StudentOnlineClassRoomRepo;
import school.bright.generic.Base;

public class AcademicResult extends Base {
    public static AcademicResultRepo arr;
    public static StudentOnlineClassRoomRepo socr;
    public static CheckinTeacherAttendanceRepo ctar;
    public AcademicResult(){
        arr=new AcademicResultRepo(appiumDriver);
        ctar=new CheckinTeacherAttendanceRepo(appiumDriver);
        socr=new StudentOnlineClassRoomRepo(appiumDriver);
    }


    @Step("Navigate to academic result scree")
    public static void navigateToAcademicResultScreen() throws InterruptedException {
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
        waitForMobileElement(arr.academicResult);
        arr.academicResult.click();
    }

    @Step("Check academic result of sem1 mid term")
    public static void sem1MidTermResult() throws InterruptedException {
        waitForMobileElement(socr.academicYear);
        socr.academicYear.click();
        Thread.sleep(2000);
        waitForMobileElement(socr.year2023);
        socr.year2023.click();
        Thread.sleep(2000);
        waitForMobileElement(socr.nextButton);
        socr.nextButton.click();
        Thread.sleep(2000);
        waitForMobileElement(socr.closeButton);
        socr.closeButton.click();
        Thread.sleep(3000);
        arr.type.get(0).click();
        Thread.sleep(2000);
        waitForMobileElement(arr.sem1MidTerm);
        arr.sem1MidTerm.click();
        Thread.sleep(2000);
        waitForMobileElement(socr.nextButton);
        socr.nextButton.click();
        Thread.sleep(2000);
        navigateBackToHome();
    }

    public static void navigateBackToHome() throws InterruptedException {
        arr.imageView.get(0).click();
        Thread.sleep(2000);
        arr.imageView.get(0).click();
        Thread.sleep(2000);
    }

    @Step("Check academic result of semester 1 final")
    public static void sem1FinalResult() throws InterruptedException {
        waitForMobileElement(socr.academicYear);
        socr.academicYear.click();
        Thread.sleep(2000);
        waitForMobileElement(socr.year2023);
        socr.year2023.click();
        Thread.sleep(2000);
        arr.type.get(0).click();
        Thread.sleep(2000);
        waitForMobileElement(arr.sem1Final);
        arr.sem1Final.click();
        Thread.sleep(2000);
        waitForMobileElement(socr.nextButton);
        socr.nextButton.click();
        Thread.sleep(2000);
        navigateBackToHome();
    }

    @Step("Check semester 2 mid term result")
    public static void sem2MidTerm() throws InterruptedException {
        waitForMobileElement(socr.academicYear);
        socr.academicYear.click();
        Thread.sleep(2000);
        waitForMobileElement(socr.year2023);
        socr.year2023.click();
        Thread.sleep(2000);
        arr.type.get(0).click();
        Thread.sleep(2000);
        waitForMobileElement(arr.sem2MidTerm);
        arr.sem2MidTerm.click();
        Thread.sleep(2000);
        waitForMobileElement(socr.nextButton);
        socr.nextButton.click();
        Thread.sleep(2000);
        navigateBackToHome();
    }

    @Step("Check semester 2 final result")
    public static void sem2FinalResult() throws InterruptedException {
        waitForMobileElement(socr.academicYear);
        socr.academicYear.click();
        Thread.sleep(2000);
        waitForMobileElement(socr.year2023);
        socr.year2023.click();
        Thread.sleep(2000);
        arr.type.get(0).click();
        Thread.sleep(2000);
        waitForMobileElement(arr.sem2Final);
        arr.sem2Final.click();
        Thread.sleep(2000);
        waitForMobileElement(socr.nextButton);
        socr.nextButton.click();
        Thread.sleep(2000);
        navigateBackToHome();
    }

    @Step("Check yearly academic result")
    public static void yearlyResult() throws InterruptedException {
        waitForMobileElement(socr.academicYear);
        socr.academicYear.click();
        Thread.sleep(2000);
        waitForMobileElement(socr.year2023);
        socr.year2023.click();
        Thread.sleep(2000);
        arr.type.get(0).click();
        Thread.sleep(2000);
        waitForMobileElement(arr.yearly);
        arr.yearly.click();
        Thread.sleep(2000);
        waitForMobileElement(socr.nextButton);
        socr.nextButton.click();
        Thread.sleep(2000);
        navigateBackToHome();
    }

}
