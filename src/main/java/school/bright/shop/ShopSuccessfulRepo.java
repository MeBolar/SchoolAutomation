package school.bright.shop;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import school.bright.generic.ObjectBase;

import java.util.List;

public class ShopSuccessfulRepo extends ObjectBase {
    public ShopSuccessfulRepo(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    @FindBy(className = "android.widget.EditText")
    public static WebElement searchBar;

    @FindBy(className = "android.widget.TextView")
    public static WebElement firstRow;

    @FindBy(className = "android.widget.TextView")
    public static List<WebElement> elementData;

    @FindBy(className = "android.widget.ImageView")
    public static List<WebElement> imageView;


    @FindBy(xpath = "//android.widget.TextView[@text='Add']")
    public static WebElement add;

    @FindBy(xpath = "//android.widget.TextView[@text='Payment']")
    public static List<WebElement> payment;

    @FindBy(xpath = "//android.widget.TextView[@text='Close']")
    public static WebElement buttonClose;

    @FindBy(className = "android.view.ViewGroup")
    public static List<WebElement> viewGroup;
}
