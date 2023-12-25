package school.bright.attendance;

import io.qameta.allure.Step;
import school.bright.generic.Base;
import school.bright.login.AppLoginRepo;

public class CheckinTeacherAttendance extends Base {
    public static CheckinTeacherAttendanceRepo ctar;
    public static AppLoginRepo alr;

    public CheckinTeacherAttendance(){
        ctar=new CheckinTeacherAttendanceRepo(appiumDriver);
        alr=new AppLoginRepo(appiumDriver);
    }
    @Step("Navigate to checkin attendance page")
    public static void navigateToCheckinAttendance() throws InterruptedException {
        // wait till user has logged in
        closeAdvertisementPopUp();
     //   waitForMobileElement(ctar.balanceText);
        try{
            //Click on menu button
            ctar.imageView.get(0).click();
        }catch (Exception e){
            //Click on menu button
            ctar.imageView.get(0).click();
        }

        Thread.sleep(3000);
        ctar.checkInCheckOut.click();
        //Click on check in attendance button
        ctar.checkInAttendanceButton.click();
        try{
            Thread.sleep(5000);
      //      waitForMobileElement(alr.closeButton);
            alr.closeButton.click();
            System.out.println("User doesn't have permission to check Attendance");
        }catch(Exception e){
            System.out.println("User has permission to check Attendance");
        }
    }


    public static void renavigateToCheckinScreen() throws InterruptedException {
        // wait till user has logged in
        Thread.sleep(5000);
        //   waitForMobileElement(ctar.balanceText);
        //Click on menu button
        ctar.imageView.get(0).click();
        Thread.sleep(5000);
        //Click on check in attendance button
        ctar.checkInAttendanceButton.click();
        try{
            Thread.sleep(5000);
            //      waitForMobileElement(alr.closeButton);
            alr.closeButton.click();
            System.out.println("User doesn't have permission to check Attendance");
        }catch(Exception e){
            System.out.println("User has permission to check Attendance");
        }
    }

    public static void closeAdvertisementPopUp(){
        waitFor10sec(alr.closeButton);
        alr.closeButton.click();
    }

    public static void navigateToCheckinScreenFromHomePagePermissionDenied() throws InterruptedException {
        waitForMobileElement(ctar.attendanceButton);
        ctar.attendanceButton.click();
        waitForMobileElement(ctar.checkInAttendanceButton);
        ctar.checkInAttendanceButton.click();
        waitForMobileElement(alr.closeButton);
        alr.closeButton.click();
    }

    public static void navigateToCheckinScreenFromHomePage(){
        waitForMobileElement(ctar.attendanceButton);
        ctar.attendanceButton.click();
        waitForMobileElement(ctar.checkInAttendanceButton);
        ctar.checkInAttendanceButton.click();
    }

    @Step(" Teacher checkin Otime with QR code")
    public static void checkinOntimeWithQRCode() throws InterruptedException {
        //Click on three dots button
        ctar.button.get(1).click();
        Thread.sleep(3000);
        ctar.checkinOntimeWithQRCode.click();
        Thread.sleep(15000);
        ctar.OKButton.click();
        Thread.sleep(1000);
        alr.closeButton.click();
        try{
            Thread.sleep(1000);
            //click on back button
            ctar.backButton.click();
        }catch(Exception e){
            System.out.println("Looks like there is some issue with tapping on back button");
        }

    }

    @Step(" Checkin late with QR code")
    public static void checkinLateWithQRCode() throws InterruptedException {
        try{
            Thread.sleep(1000);
            //Click on three dots button
            ctar.button.get(1).click();
            Thread.sleep(3000);
            ctar.checkinLateWithQRCode.click();
            Thread.sleep(15000);
            ctar.OKButton.click();
            Thread.sleep(1000);
            alr.closeButton.click();
            try{
                Thread.sleep(1000);
                //click on back button
                ctar.backButton.click();
            }catch(Exception e){
                System.out.println("Looks like there is some issue with tapping on back button");
                e.printStackTrace();
            }

        }catch (Exception e1){
            appiumDriver.navigate().back();
            Thread.sleep(1000);
            e1.printStackTrace();
        }
    }

    @Step("Checkin late with student ID")
    public static void checkinLateWithStudentIDScenario() throws InterruptedException {
        Thread.sleep(1000);
        //Click on three dots button
        ctar.button.get(1).click();
        Thread.sleep(3000);
        ctar.checkinLateWithStudentID.click();
        Thread.sleep(1000);
        //Enter student id
        ctar.keypad0.click();
        ctar.keypad0.click();
        ctar.keypad0.click();
        ctar.keypad0.click();
        ctar.keypad1.click();
        Thread.sleep(1000);
        //Deleteing 1 character
        ctar.listOfImageView.get(1).click();
        //Clearing all the characters
        ctar.clearButton.click();
        //Click on Next button
        ctar.nextButton.click();
        //Close the pop up
        Thread.sleep(1000);
        alr.closeButton.click();
        //Come back to attendance screen
        Thread.sleep(1000);
        ctar.listOfImageView.get(0).click();

    }

    @Step("Test case for checkin late with invalid student id")
    public static void checkinLateWithWrongStudentID() throws InterruptedException {
        Thread.sleep(1000);
        //Click on three dots button
        ctar.button.get(1).click();
        Thread.sleep(3000);
        ctar.checkinLateWithStudentID.click();
        Thread.sleep(1000);
        //Enter student id
        ctar.keypad9.click();
        ctar.keypad9.click();
        ctar.keypad5.click();
        ctar.keypad6.click();
        Thread.sleep(1000);
        ctar.nextButton.click();
        //Close the pop up
        Thread.sleep(1000);
        alr.closeButton.click();
        //Come back to attendance screen
        Thread.sleep(1000);
        ctar.listOfImageView.get(0).click();
    }

    @Step("Test case for checkin late with valid student id")
    public static void checkinLateWithValidStudentID() throws InterruptedException {
        Thread.sleep(1000);
        //Click on three dots button
        ctar.button.get(1).click();
        Thread.sleep(3000);
        ctar.checkinLateWithStudentID.click();
        Thread.sleep(1000);
        //Clearing all the characters
        ctar.clearButton.click();
        //Enter student id
        ctar.keypad0.click();
        ctar.keypad0.click();
        ctar.keypad0.click();
        ctar.keypad0.click();
        ctar.keypad1.click();
        Thread.sleep(1000);
        ctar.nextButton.click();
        Thread.sleep(1000);
        ctar.cancelButton.click();
        Thread.sleep(1000);
        ctar.nextButton.click();
        Thread.sleep(1000);
        ctar.OKButton.click();
        Thread.sleep(1000);
        alr.closeButton.click();
        //Navigate back to attendance screen
        Thread.sleep(1000);
        ctar.listOfImageView.get(0).click();
    }

    public static void navigateBackToHomeScreen() throws InterruptedException {
        Thread.sleep(1000);
        ctar.backButton.click();
    }

}
