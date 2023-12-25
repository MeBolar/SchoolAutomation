package school.bright.setting;

import io.qameta.allure.Step;
import school.bright.attendance.CheckinTeacherAttendanceRepo;
import school.bright.generic.Base;
import school.bright.login.AppLogin;
import school.bright.login.AppLoginRepo;

public class Setting extends Base {
    public static SettingRepo sr;
    public static AppLoginRepo alr;
    public static CheckinTeacherAttendanceRepo ctar;
    public Setting(){
        sr=new SettingRepo(appiumDriver);
        ctar=new CheckinTeacherAttendanceRepo(appiumDriver);
        alr=new AppLoginRepo(appiumDriver);
    }

    static AppLogin appLogin=new AppLogin();

    public static void navigateToSettingsPage() throws InterruptedException {
        Thread.sleep(4000);
        try{
            Thread.sleep(3000);
            //Click on menu button
            ctar.imageView.get(0).click();
        }catch (Exception e){
            //Click on menu button
            ctar.imageView.get(0).click();
        }
        Thread.sleep(3000);
        scrollDown();
        waitForMobileElement(sr.settingButton);
        sr.settingButton.click();
    }

    @Step("profile settings")
    public static void profileSettings() throws InterruptedException {
        waitForMobileElement(sr.profileButton);
        sr.profileButton.click();
        Thread.sleep(2000);
        waitForMobileElement(sr.educationalInformation);
        sr.educationalInformation.click();
        Thread.sleep(2000);
        waitForMobileElement(sr.jobPositioninfo);
        sr.jobPositioninfo.click();
        Thread.sleep(2000);
        waitForMobileElement(sr.occupationalLicense);
        sr.occupationalLicense.click();
        Thread.sleep(2000);
        sr.imageView.get(0).click();
        Thread.sleep(2000);
        sr.imageView.get(0).click();
    }

    @Step("Change language")
    public static void changeLanguageSetting() throws InterruptedException {
        waitForMobileElement(sr.language);
        sr.language.click();
        waitForMobileElement(sr.thaiLanguage);
        sr.thaiLanguage.click();
        waitForMobileElement(sr.languageTextInThai);
        sr.languageTextInThai.click();
        waitForMobileElement(sr.englishLanguage);
        sr.englishLanguage.click();
        Thread.sleep(3000);
        sr.imageView.get(0).click();
    }

    @Step("User guide setting")
    public static void userGuide() throws InterruptedException {
        waitForMobileElement(sr.userGuide);
        sr.userGuide.click();
        Thread.sleep(5000);
        appiumDriver.navigate().back();
        Thread.sleep(3000);
        sr.imageView.get(0).click();
    }

    @Step("About us setting")
    public static void aboutUs() throws InterruptedException {
        waitForMobileElement(sr.about);
        sr.about.click();
        waitForMobileElement(sr.privacyPolicy);
        sr.privacyPolicy.click();
        Thread.sleep(3000);
        sr.viewGroup.get(0).click();
        Thread.sleep(3000);
        sr.imageView.get(0).click();
        Thread.sleep(3000);
        sr.imageView.get(0).click();
    }

    @Step("Manage account")
    public static void manageAccount() throws InterruptedException {
        waitForMobileElement(sr.manageAccount);
        sr.manageAccount.click();
        waitForMobileElement(sr.addAccount);
        sr.addAccount.click();
        appLogin.selectSchool("Tangmo School");
        appLogin.loginAsTeacherWithWrongCredentials();
        loginJustWithPassword();
        loginWithJustID();
        Thread.sleep(3000);
        sr.imageView.get(0).click();
        Thread.sleep(2000);
        sr.imageView.get(0).click();
        Thread.sleep(2000);
        sr.imageView.get(0).click();
    }


    public static void loginJustWithPassword() throws InterruptedException {
        Thread.sleep(1000);
        alr.editField.get(1).clear();
        alr.editField.get(2).clear();
        alr.editField.get(2).sendKeys("1");
        alr.textView.get(3).click();
        Thread.sleep(5000);
        //     waitForMobileElement(alr.closeButton);
        alr.closeButton.click();
    }
    public static void loginWithJustID() throws InterruptedException {
        Thread.sleep(1000);
        alr.editField.get(1).clear();
        alr.editField.get(1).sendKeys("00001");
        alr.editField.get(2).clear();
        alr.textView.get(3).click();
        Thread.sleep(5000);
        //     waitForMobileElement(alr.closeButton);
        alr.closeButton.click();
    }

    @Step("Email")
    public static void email() throws InterruptedException {
        waitForMobileElement(sr.email);
        sr.email.click();
        waitForMobileElement(sr.editText);
        sr.editText.sendKeys("test@mailinator.com");
        Thread.sleep(3000);
        sr.imageView.get(0).click();
    }

    @Step("Navigate back to home page")
    public static void navigateToHomeScreen() throws InterruptedException {
        Thread.sleep(3000);
        sr.imageView.get(0).click();
    }



}
