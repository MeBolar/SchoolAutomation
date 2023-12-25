package school.bright.generic;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.support.PageFactory;

public class ObjectBase {
    public ObjectBase(AppiumDriver appiumDriver){
        PageFactory.initElements(appiumDriver,this);
    }
}
