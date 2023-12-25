package school.bright.appmessage;

import io.qameta.allure.Step;
import school.bright.attendance.CheckinTeacherAttendanceRepo;
import school.bright.generic.Base;

public class Message extends Base {
    public static MessageRepo mr;
    public static CheckinTeacherAttendanceRepo ctar;
    public Message(){
        mr=new MessageRepo(appiumDriver);
        ctar=new CheckinTeacherAttendanceRepo(appiumDriver);
    }

    @Step("Navigate to message screen")
    public static void navigateToMessageScreen() throws InterruptedException {
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
        waitForMobileElement(mr.message);
        mr.message.click();
    }

    @Step("Click all the tabs")
    public static void clickAllTabs(){
        waitForMobileElement(mr.response);
        mr.response.click();
        waitForMobileElement(mr.system);
        mr.system.click();
        waitForMobileElement(mr.general);
        mr.general.click();
    }

    @Step("Apply filters")
    public static void applyFilters() throws InterruptedException {
        Thread.sleep(2000);
        mr.textView.get(1).click();
        waitForMobileElement(mr.allFilter);
        mr.allFilter.click();
        Thread.sleep(2000);
        clickAllTabs();
        Thread.sleep(2000);
        mr.textView.get(1).click();
        waitForMobileElement(mr.unreadFilter);
        mr.unreadFilter.click();
        Thread.sleep(2000);
        clickAllTabs();
        Thread.sleep(2000);
        mr.textView.get(1).click();
        waitForMobileElement(mr.readFilter);
        mr.readFilter.click();
        clickAllTabs();
        Thread.sleep(2000);
        mr.textView.get(1).click();
        waitForMobileElement(mr.readAllFilter);
        mr.readAllFilter.click();
        clickAllTabs();
        Thread.sleep(2000);
        mr.imageView.get(0).click();
    }

    @Step("Button response")
    public static void buttonResponse() throws InterruptedException {
        waitForMobileElement(mr.response);
        mr.response.click();
        Thread.sleep(3000);
        mr.viewGroup.get(13).click();
        Thread.sleep(2000);
        mr.viewGroup.get(0).click();

        Thread.sleep(3000);
        mr.viewGroup.get(19).click();
        Thread.sleep(2000);
        mr.viewGroup.get(0).click();
        Thread.sleep(2000);

        Thread.sleep(3000);
        mr.viewGroup.get(23).click();
        Thread.sleep(2000);
        mr.viewGroup.get(0).click();
        Thread.sleep(2000);

        Thread.sleep(3000);
        mr.viewGroup.get(29).click();
        Thread.sleep(2000);
        mr.viewGroup.get(0).click();
        Thread.sleep(2000);
        mr.imageView.get(0).click();

    }

}
