package login;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import school.bright.generic.Base;
import school.bright.generic.InitiateDriver;
import school.bright.generic.TestBase;
import school.bright.pages.Pages;

import java.net.MalformedURLException;

public class AppLoginTest extends TestBase {



    @Test(priority = 0,description = "Setting Up The App Language")
    public void setAppLaguage() throws InterruptedException {
        Pages.SetAppLanguage().setLanguage();
    }

    @Test(priority = 1,description = "Login as teacher to test app flow which doesn't have permission to checkin attendance.")
    public void noPermissioToCheckin() throws InterruptedException {
//        Pages.AppLogin().restrictedLogin();
//        Pages.CheckinTeacherAttendance().closeAdvertisementPopUp();
//        Pages.CheckinTeacherAttendance().navigateToCheckinScreenFromHomePagePermissionDenied();
//        Pages.AppLogin().logout();
    }


    @Test(priority = 2)
    public void login() throws InterruptedException {
    //    Pages.AppLogin().loginToApp();
    }

}
