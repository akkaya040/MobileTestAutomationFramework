package steps;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import pages.*;

public class BaseStep {
    //Initialise Pages
    protected AccountPage accountPage;
    protected MainPage mainPage;
    protected PersonalPage personalPage;
    protected PromotionPage promotionPage;

    public void initPages(AndroidDriver<MobileElement> driver) {
        accountPage = new AccountPage(driver);
        mainPage = new MainPage(driver);
        personalPage = new PersonalPage(driver);
        promotionPage = new PromotionPage(driver);
    }



}
