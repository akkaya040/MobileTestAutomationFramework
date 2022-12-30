package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.testng.Assert;

public class PersonalPage extends BasePage{
    public PersonalPage(AndroidDriver<MobileElement> driver) {
        super(driver);
    }

    //Mobile Objects
    private final By txtUserId = By.xpath("//android.widget.TextView[@resource-id='lblMemberId']");

    //Page Methods

    public void controlStoredUserId(String userId) {

        String userIdInPage = getText(txtUserId);
        Assert.assertEquals(userId,userIdInPage);

    }

    public void confirmPersonalInfoPage() {

        controlIsElementExist(txtUserId);

    }
}
