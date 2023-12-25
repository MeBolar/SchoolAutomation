package school.bright.generic;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Set;

public class InitiateDriver {
    private HashMap<String,String> getProperties, frameworkInitialSetupPath,getInitialSetupProperties,guiFilePaths;
    private String productConfigPath;
    public static AppiumDriver<MobileElement> appiumDriver;
//    private AndroidDriver appiumDriver,appiumDriver2;

    private MutableCapabilities capabilities=null;
    private EventFiringWebDriver eventFiringWebDriver;

    public InitiateDriver() throws MalformedURLException {

        System.out.println(System.getProperty("user.dir"));
   //     getProperties = PropertyReader.getPropValues("/Users/sukeshbolar/ReyaRCAutomation/src/main/resources/productSetUpProperties/productConfig.properties");

 //       String runOn = System.getProperty("runOn") == null ? getProperties.get("RUN_ON") : System.getProperty("runOn");
 //       String platform = System.getProperty("PRODUCT.AUTOMATION.PLATFORM") == null ? getProperties.get("PRODUCT.AUTOMATION.PLATFORM") : System.getProperty("Product.Automation.Platform");

        String platform="NATIVE";
        String runOn="ANDROID";
        if(platform.equalsIgnoreCase("NATIVE"))
        {
            if (runOn.equalsIgnoreCase("IOS"))
            {
                //code to setup iOS driver
            }
            else if(runOn.equalsIgnoreCase("ANDROID")){
                appiumDriver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), getBrowserCapabilities(runOn));
              //  switchContext("FLUTTER");
            }
        }

    }

    public AppiumDriver switchContext(String context) {
        appiumDriver.getContext();
        Set<String> con = appiumDriver.getContextHandles();
        for (String c : con) {
            if (c.contains(context)) {
                appiumDriver.context(c);
                break;
            }
        }
        return appiumDriver;
    }


    public AppiumDriver getAppiumDriver()
    {
        if(appiumDriver==null)
            throw new RuntimeException("Driver has not been instantiated");

        return appiumDriver;
    }
    public EventFiringWebDriver getEventFiringWebDriver(){
        if(eventFiringWebDriver==null)
            throw new RuntimeException("Driver has not been instantiated");
        return eventFiringWebDriver;
    }

    private MutableCapabilities getBrowserCapabilities(String runOn)
    {
//        String appName = System.getProperty("PRODUCT.AUTOMATION.APP.NAME") == null ? getProperties.get("PRODUCT.AUTOMATION.APP.NAME") : System.getProperty("Product.Automation.App.Name");
//        String appPath =System.getProperty("PRODUCT.AUTOMATION.APP.PATH") == null ? getProperties.get("PRODUCT.AUTOMATION.APP.PATH") : System.getProperty("Product.Automation.App.Path");

//        String patientAppName=System.getProperty("PRODUCT.AUTOMATION.PATIENTAPP.NAME")==null ? getProperties.get("PRODUCT.AUTOMATION.PATIENTAPP.NAME"): System.getProperty("Product.Automation.Patientapp.Name");
//        String patientAppPath=System.getProperty("PRODUCT.AUTOMATION.PATIENTAPP.PATH")==null? getProperties.get("Product.Automation.Patientapp.Path"): System.getProperty("PRODUCT.AUTOMATION.PATIENTAPP.PATH");

        try
        {
            if (runOn.equalsIgnoreCase("FLUTTER_IOS")) {
                String dirPath = System.getProperty("user.dir");
                System.out.println(dirPath);
//                String filePath = dirPath + appPath;
//                File appDir = new File(filePath);
//                File app = new File(appDir, appName);
                capabilities = new DesiredCapabilities();
                capabilities.setCapability("autoAcceptAlerts", true);
                capabilities.setCapability("no-reset", true);
                capabilities.setCapability("full-reset", false);
                capabilities.setCapability("platformVersion", "13.3");
                capabilities.setCapability("automationName", "Flutter");
                capabilities.setCapability("xcodeOrgId", "75D8F36R68");
                capabilities.setCapability("xcodeSigningId", "iPhone Developer");
                //   capabilities.setCapability("platformName", "iOS");
            }
            else if (runOn.equalsIgnoreCase("ANDROID"))
            {
//                String dirPath= System.getProperty("user.dir");
//                String apkPath=dirPath+ appPath;
//                File app= new File(apkPath);
                capabilities=new MutableCapabilities();
                capabilities.setCapability("appium:deviceName", "Redmi Note 10S");
                capabilities.setCapability("appium:platformName", "Android");
                capabilities.setCapability("appium:automationName", "UiAutomator2");
                capabilities.setCapability("appium:newCommandTimeout","120");
                //       capabilities.setCapability("appium:newCommandTimeout","3000");
                capabilities.setCapability("appium:autoGrantPermissions","true");
            //    capabilities.setCapability("appium:app", app.getAbsolutePath());
                capabilities.setCapability("appium:appPackage", "school.jabjai.jabjaiapp");
                capabilities.setCapability("appium:appActivity", "MainActivity");
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return capabilities;
    }
}
