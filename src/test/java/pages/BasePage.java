package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.CapabilityUtil;

public class BasePage {

    protected AndroidDriver<MobileElement> driver;
    protected WebDriverWait wait;

    public BasePage(AndroidDriver<MobileElement> driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 15);
    }



}
