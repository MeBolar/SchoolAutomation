package school.bright.setting;

import io.qameta.allure.Step;
import school.bright.generic.Base;
import school.bright.login.AppLogin;
import school.bright.login.AppLoginRepo;

public class ChangePassword extends Base {
    static AppLogin appLogin=new AppLogin();
    public static AppLoginRepo alr;
    public static ChangePasswordRepo cpr;
    public static SettingRepo sr;
    public ChangePassword(){
        cpr=new ChangePasswordRepo(appiumDriver);
        sr=new SettingRepo(appiumDriver);
        alr=new AppLoginRepo(appiumDriver);
    }

    @Step("Navigate to secuirty settings screen")
    public static void clickOnSecuritySettingsScreen(){
            waitForMobileElement(sr.securitySettings);
            sr.securitySettings.click();
    }

    @Step("Change password")
    public static void changePassword() throws InterruptedException {
        waitForMobileElement(cpr.changePassword);
        cpr.changePassword.click();
        Thread.sleep(3000);
        cpr.editText.get(0).clear();
        cpr.editText.get(0).sendKeys("1");
        Thread.sleep(2000);
        cpr.editText.get(1).clear();
        cpr.editText.get(1).sendKeys("12");
        Thread.sleep(2000);
        cpr.editText.get(2).clear();
        cpr.editText.get(2).sendKeys("12");
        waitForMobileElement(cpr.confirm);
        cpr.confirm.click();
        waitForMobileElement(cpr.close);
        cpr.close.click();
    }

    @Step("Change password to old one")
    public static void changePasswordtoOld() throws InterruptedException {
        waitForMobileElement(cpr.changePassword);
        cpr.changePassword.click();
        Thread.sleep(3000);
        cpr.editText.get(0).clear();
        cpr.editText.get(0).sendKeys("12");
        Thread.sleep(2000);
        cpr.editText.get(1).clear();
        cpr.editText.get(1).sendKeys("1");
        Thread.sleep(2000);
        cpr.editText.get(1).clear();
        cpr.editText.get(1).sendKeys("1");
        waitForMobileElement(cpr.confirm);
        cpr.confirm.click();
        waitForMobileElement(cpr.close);
        cpr.close.click();
    }



    @Step("Login with new password")
    public void loginWithNewPassword() throws InterruptedException {
        Thread.sleep(5000);
        appLogin.selectSchool("Tangmo School");
        alr.editField.get(1).clear();
        alr.editField.get(1).sendKeys("012345");
        alr.editField.get(2).clear();
        alr.editField.get(2).sendKeys("12");
        alr.textView.get(3).click();
        Thread.sleep(5000);
    }

    @Step("Login with old password")
    public void loginWithOldPassword() throws InterruptedException {
        Thread.sleep(5000);
        appLogin.selectSchool("Tangmo School");

        alr.editField.get(1).clear();
        alr.editField.get(1).sendKeys("012345");
        alr.editField.get(2).clear();
        alr.editField.get(2).sendKeys("1");
        alr.textView.get(3).click();
        Thread.sleep(5000);
    }



}
