package school.bright.setting;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import school.bright.generic.ObjectBase;

import java.util.List;

public class SettingRepo extends ObjectBase {
    public SettingRepo(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    @FindBy(xpath = "//android.widget.TextView[@text='Setting']")
    public static WebElement settingButton;

    @FindBy(xpath = "//android.widget.TextView[@text='Profile']")
    public static WebElement profileButton;

    @FindBy(xpath = "//android.widget.TextView[@text='Educational Information']")
    public static WebElement educationalInformation;

    @FindBy(xpath = "//android.widget.TextView[@text='Job Position InformationTeaching Information']")
    public static WebElement jobPositioninfo;

    @FindBy(xpath = "//android.widget.TextView[@text='Occupational license']")
    public static WebElement occupationalLicense;

    @FindBy(className = "android.widget.ImageView")
    public static List<WebElement> imageView;

    @FindBy(xpath = "//android.widget.TextView[@text='Language']")
    public static WebElement language;

    @FindBy(xpath = "//android.widget.TextView[@text='ภาษาไทย']")
    public static WebElement thaiLanguage;

    @FindBy(xpath = "//android.widget.TextView[@text='เปลี่ยนภาษา']")
    public static WebElement languageTextInThai;

    @FindBy(xpath = "//android.widget.TextView[@text='English']")
    public static WebElement englishLanguage;

    @FindBy(xpath = "//android.widget.TextView[@text='User Guide']")
    public static WebElement userGuide;

    @FindBy(xpath = "//android.widget.TextView[@text='About']")
    public static WebElement about;

    @FindBy(xpath = "//android.widget.TextView[@text='Privacy Policy']")
    public static WebElement privacyPolicy;

    @FindBy(className = "android.view.ViewGroup")
    public static List<WebElement> viewGroup;

    @FindBy(xpath = "//android.widget.TextView[@text='Manage Account']")
    public static WebElement manageAccount;

    @FindBy(xpath = "//android.widget.TextView[@text='Add Account']")
    public static WebElement addAccount;

    @FindBy(xpath = "//android.widget.TextView[@text='Security Settings']")
    public static WebElement securitySettings;

    @FindBy(xpath = "//android.widget.TextView[@text='Email :']")
    public static WebElement email;

    @FindBy(className = "android.widget.EditText")
    public static WebElement editText;

}
