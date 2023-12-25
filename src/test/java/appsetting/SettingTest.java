package appsetting;

import org.testng.annotations.Test;
import school.bright.generic.TestBase;
import school.bright.pages.Pages;

public class SettingTest extends TestBase {
    @Test(priority = 0, description = "Navigate to settings screen")
    public void navigateToSettingScreen() throws InterruptedException {
        Pages.Setting().navigateToSettingsPage();
    }

    @Test(priority = 1, description = "Profile setting")
    public void profileSetting() throws InterruptedException {
        Pages.Setting().profileSettings();
    }

    @Test(priority = 2, description = "Language change settings")
    public void changeLanguage() throws InterruptedException {
        Pages.Setting().navigateToSettingsPage();
        Pages.Setting().changeLanguageSetting();
    }

    @Test(priority = 3, description = "User guide settings")
    public void userGuide() throws InterruptedException {
        Pages.Setting().navigateToSettingsPage();
        Pages.Setting().userGuide();
    }

    @Test(priority = 4, description = "About settings")
    public void about() throws InterruptedException {
        Pages.Setting().navigateToSettingsPage();
        Pages.Setting().aboutUs();
    }

    @Test(priority = 5, description = "Manage Account")
    public void manageAccount() throws InterruptedException {
        Pages.Setting().navigateToSettingsPage();
        Pages.Setting().manageAccount();
    }

    @Test(priority = 6, description = "Change password")
    public void changePassword() throws InterruptedException {
        Pages.Setting().navigateToSettingsPage();
        Pages.ChangePassword().clickOnSecuritySettingsScreen();
        Pages.ChangePassword().changePassword();
    }

    @Test(priority = 7, description = "Reset back to previous password")
    public void resetPasswordToOld() throws InterruptedException {
        Pages.ChangePassword().loginWithNewPassword();
        Pages.Setting().navigateToSettingsPage();
        Pages.ChangePassword().clickOnSecuritySettingsScreen();
        Pages.ChangePassword().changePasswordtoOld();
        Pages.ChangePassword().loginWithOldPassword();
    }

    @Test(priority = 8,description = "Change pin")
    public void changePin() throws InterruptedException {
        Pages.Setting().navigateToSettingsPage();
        Pages.ChangePassword().clickOnSecuritySettingsScreen();
        Pages.ChangePin().changePin();
        Pages.ChangePin().changeBackToOldPin();
    }

    @Test(priority = 9, description = "email")
    public void email() throws InterruptedException {
        Pages.ChangePassword().clickOnSecuritySettingsScreen();
        Pages.Setting().email();
        Pages.Setting().navigateToHomeScreen();
    }

}
