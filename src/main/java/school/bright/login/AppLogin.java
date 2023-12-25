package school.bright.login;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.interactions.touch.TouchActions;
import school.bright.attendance.CheckinTeacherAttendanceRepo;
import school.bright.generic.Base;
import school.bright.generic.PropertyReader;

import java.util.HashMap;
import java.util.Map;

public class AppLogin extends Base {
    private static HashMap<String,String> setupProperties,teacherProperties;
    public static AppLoginRepo alr;
    public static CheckinTeacherAttendanceRepo ctar;

    public AppLogin(){
        alr=new AppLoginRepo(appiumDriver);
        ctar=new CheckinTeacherAttendanceRepo(appiumDriver);
    }


    @Step("Login to Application")
    public void loginToApp() throws InterruptedException {
        setupProperties= PropertyReader.getPropValues(System.getProperty("user.dir")+"/src/main/resources/Setup/InitialSetup.properties");
        String role= System.getProperty("LOGIN.ROLE") == null ? setupProperties.get("LOGIN.ROLE") : System.getProperty("Login.Role");
        String schoolName=System.getProperty("LOGIN.SCHOOL") == null ? setupProperties.get("LOGIN.SCHOOL") : System.getProperty("Login.School");
        teacherProperties=PropertyReader.getPropValues(System.getProperty("user.dir")+"/src/main/resources/login/TeacherLogin.properties");
        String staffID=System.getProperty("TEACHER.STAFFID") == null ? setupProperties.get("TEACHER.STAFFID") : System.getProperty("Teacher.StaffID");
        String staffPassword=System.getProperty("TEACHER.PASSWORD") == null ? setupProperties.get("TEACHER.PASSWORD") : System.getProperty("Teacher.Password");

        if(role.equalsIgnoreCase("Teacher")){
          //  clickOnLoginButton();
            selectSchool(schoolName);
//            loginWithoutIDAndPassword();
//            loginWithoutPassword();
//            loginAsTeacherWithWrongCredentials();
            loginAsTeacherWithValidCredentials(staffID,staffPassword);
        }else if(role.equalsIgnoreCase("Student")){

        }else{
            System.out.println("Role is not set to Teacher/Student");
        }
    }

    @Step("Selecting School")
    public void selectSchool(String schoolName) throws InterruptedException {
        Thread.sleep(5000);
        //   waitForMobileElement(alr.schoolButton);
        alr.schoolButton.click();
        Thread.sleep(1000);
        alr.searchSchoolTextField.sendKeys(schoolName);
        String searchResult=alr.textView.get(1).getText();
        if(searchResult.equalsIgnoreCase(schoolName)){
            alr.textView.get(1).click();
            Thread.sleep(1000);
        }

    }

    @Step("Login as Teacher with invalid credentials")
    public void loginAsTeacherWithWrongCredentials() throws InterruptedException {
        Thread.sleep(1000);
        alr.editField.get(1).clear();
        alr.editField.get(1).sendKeys("0001");
        alr.editField.get(2).clear();
        alr.editField.get(2).sendKeys("1");
        alr.textView.get(3).click();
        Thread.sleep(5000);
   //     waitForMobileElement(alr.closeButton);
        alr.closeButton.click();

    }

    @Step("Login as Teacher with valid credentials")
    public void loginAsTeacherWithValidCredentials(String id,String password) throws InterruptedException {
        Thread.sleep(1000);
        alr.editField.get(1).clear();
        alr.editField.get(1).sendKeys("012345");
        alr.editField.get(2).clear();
        alr.editField.get(2).sendKeys("1");
        alr.textView.get(3).click();
    }

    @Step("Click on login button without entering school, student/teacher id and password")
    public void clickOnLoginButton() throws InterruptedException {
        Thread.sleep(1000);
        alr.textView.get(3).click();
        Thread.sleep(5000);
     //   waitForMobileElement(alr.closeButton);
        alr.closeButton.click();
    }
    @Step("Trying to login without entering student/teacher id and password")
    public void loginWithoutIDAndPassword() throws InterruptedException {
        Thread.sleep(1000);
        alr.textView.get(3).click();
        Thread.sleep(5000);
   //     waitForMobileElement(alr.closeButton);
        alr.closeButton.click();
    }
    @Step("Trying to login without entering password")
    public void loginWithoutPassword() throws InterruptedException {
        Thread.sleep(1000);
        alr.editField.get(1).clear();
        alr.editField.get(1).sendKeys("012345");
        alr.textView.get(3).click();
        Thread.sleep(5000);
      //  waitForMobileElement(alr.closeButton);
        alr.closeButton.click();
    }

    @Step("No permission to checkIn")
    public void restrictedLogin() throws InterruptedException {
        setupProperties= PropertyReader.getPropValues(System.getProperty("user.dir")+"/src/main/resources/Setup/InitialSetup.properties");
        String schoolName=System.getProperty("LOGIN.SCHOOL") == null ? setupProperties.get("LOGIN.SCHOOL") : System.getProperty("Login.School");
        Thread.sleep(1000);
        selectSchool(schoolName);
        alr.editField.get(1).clear();
        alr.editField.get(1).sendKeys("0881595965");
        alr.editField.get(2).clear();
        alr.editField.get(2).sendKeys("1");
        alr.textView.get(3).click();

    }
    @Step("Logout from the app")
    public void logout() throws InterruptedException {
        Thread.sleep(2000);
        //   waitForMobileElement(ctar.balanceText);
        //Click on menu button
        ctar.imageView.get(0).click();
        Thread.sleep(3000);
        ctar.checkInCheckOut.isDisplayed();
        scrollDown();
        alr.logoutButton.click();
        waitForMobileElement(alr.confirmButton);
        alr.confirmButton.click();
        Thread.sleep(1000);
    }




}
