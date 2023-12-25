package school.bright.generic;

import org.testng.IHookCallBack;
import org.testng.IHookable;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import school.bright.login.AppLogin;
import school.bright.login.SetAppLanguage;
import school.bright.login.StudentLogin;

import static school.bright.generic.InitiateDriver.appiumDriver;

public class StudentTestBase implements IHookable {
    SetAppLanguage appLanguage=new SetAppLanguage();
    StudentLogin studentLogin=new StudentLogin();
    static AppLogin al=new AppLogin();

    @Override
    public void run(IHookCallBack iHookCallBack, ITestResult iTestResult) {

        iHookCallBack.runTestMethod(iTestResult);
    }


    @AfterMethod(alwaysRun = true)
    public void teardownAndTakeScreenShot(ITestResult result) throws InterruptedException {

        if(result.getStatus()==2){
            //There is a failure
            appiumDriver.launchApp();
            appLanguage.setLanguage();
            al.selectSchool("Tangmo School");
            studentLogin.loginAsStudentWithValidCredentials();
        }
    }
}
