package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

import java.util.Random;

public class PromotionPage extends BasePage {
    public PromotionPage(AndroidDriver<MobileElement> driver) {
        super(driver);
    }

    //Mobile Objects
    private final By txtFieldsInPromotion = By.className("android.widget.EditText");
    private final By txtCaptchaCode = By.id("securityCode");
    private final By imgCaptcha = By.xpath("//android.widget.Image");
    private final By btnSave = By.xpath("//android.widget.Button[contains(@text,'Yükle')]");
    private final By btnClose = By.id("com.pordiva.nesine.android:id/back");


    //Page Methods

    public void clickCloseButton() {

        click(btnClose);

    }

    public void clickLoadButton() {
        click(btnSave);
    }

    public String getCaptchaHashCode() {

        return getText(imgCaptcha);

    }

    public void fillCaptchaCode(String captchaCode) {

        MobileElement meCaptchaCode = (MobileElement) waitAndFindElements(txtFieldsInPromotion).get(1);
        sendText(meCaptchaCode, captchaCode);

    }

    public void fillRandomPromotionCode() {

        MobileElement mePromoCode = (MobileElement) waitAndFindElements(txtFieldsInPromotion).get(0);
        sendText(mePromoCode, generateRandomString(10));

    }

    public void confirmPromotionsPage() {

        controlIsElementExist(btnClose);

    }
}
