package login;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import school.bright.generic.Base;
import school.bright.generic.InitiateDriver;
import school.bright.generic.TestBase;

import java.net.MalformedURLException;

public class InitiateDriverTest extends TestBase {
    protected AppiumDriver appiumDriver;
    @Test
    public void setup() throws MalformedURLException {
        InitiateDriver initiateDriver= new InitiateDriver();
        appiumDriver= initiateDriver.getAppiumDriver();
        Base.appiumDriver= (AndroidDriver) appiumDriver;
    }
}
