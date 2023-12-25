package school.bright.login;

import io.qameta.allure.Step;
import school.bright.generic.Base;

public class StudentLogin extends Base {
    public static StudentLoginRepo slr;
    public static AppLoginRepo alr;
    static AppLogin al=new AppLogin();
    public StudentLogin(){
        slr=new StudentLoginRepo(appiumDriver);
        alr=new AppLoginRepo(appiumDriver);
    }

    @Step("Login as student")
    public static void loginAsStudent() throws InterruptedException {
        //select school
        al.selectSchool("Tangmo School");
        loginAsStudentWithValidCredentials();
    }

    public static void loginAsStudentWithValidCredentials() throws InterruptedException {
        Thread.sleep(1000);
        alr.editField.get(1).clear();
        alr.editField.get(1).sendKeys("00001");
        alr.editField.get(2).clear();
        alr.editField.get(2).sendKeys("1");
        Thread.sleep(2000);
        alr.textView.get(3).click();
    }
}
