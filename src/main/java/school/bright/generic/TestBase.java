package school.bright.generic;

import io.appium.java_client.AppiumDriver;
import org.testng.IHookCallBack;
import org.testng.IHookable;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

import java.time.Duration;

import static school.bright.generic.InitiateDriver.appiumDriver;

public class TestBase implements IHookable {

    @Override
    public void run(IHookCallBack iHookCallBack, ITestResult iTestResult) {

        iHookCallBack.runTestMethod(iTestResult);
    }


    @AfterMethod(alwaysRun = true)
    public void teardownAndTakeScreenShot(ITestResult result)
    {

        if(result.getStatus()==2){
            //There is a failure
//            appiumDriver.launchApp();
        }
        //driver.quit();
    }
}
