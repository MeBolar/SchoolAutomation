package school.bright.login;

import io.qameta.allure.Step;
import school.bright.generic.Base;
import school.bright.generic.PropertyReader;

import java.util.HashMap;

public class SetAppLanguage extends Base {
    private static HashMap<String,String> setupProperties;
    public static SetAppLanguageRepo salr;
    public static AppLoginRepo alr;

    public SetAppLanguage(){
        salr=new SetAppLanguageRepo(appiumDriver);
        alr=new AppLoginRepo(appiumDriver);
    }

    @Step("Setting up the app language post launching the app")
    public static void setLanguage() throws InterruptedException {
        Thread.sleep(2000);
        demoScreen();
        System.out.println(System.getProperty("user.dir"));
        setupProperties= PropertyReader.getPropValues(System.getProperty("user.dir")+"/src/main/resources/Setup/InitialSetup.properties");
        String userLanguage= System.getProperty("PRODUCT.LANGUAGE") == null ? setupProperties.get("PRODUCT.LANGUAGE") : System.getProperty("Product.Language");
        if(userLanguage.equalsIgnoreCase("En")){
            System.out.println(" Prefered language is english");
            chooseLangEnglish();
            Thread.sleep(2000);
        }else{
            System.out.println(" Prefered language is Thai");
            chooseLangThai();
            Thread.sleep(2000);
        }
    }
    @Step("Selecting language as English")
    public static void chooseLangEnglish(){
        String currentLanguage=alr.textView.get(0).getText();
        System.out.println("Current Language= "+currentLanguage);
        if(currentLanguage.equalsIgnoreCase("TH")){
            //Select language as english
            alr.textView.get(0).click();
        }
    }

    @Step("Selecting language as Thai")
    public static void chooseLangThai(){
        String currentLanguage=alr.textView.get(0).getText();
        System.out.println("Current Language= "+currentLanguage);
        if(currentLanguage.equalsIgnoreCase("EN")){
            //Select language as english
            alr.textView.get(0).click();
        }
    }
    @Step("Accepting initial demo screens of the application")
    public static void demoScreen() throws InterruptedException {
        System.out.println("App Launched");
        alr.button.get(1).click();
        Thread.sleep(3000);
    }
}
