package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class AccountPage extends BasePage {

    public AccountPage(AndroidDriver<MobileElement> driver) {
        super(driver);
    }

    //Mobile Objects
    private final By imgUserAvatar = By.id("com.pordiva.nesine.android:id/avatar_img");
    private final By btnPersonalInfo = By.id("com.pordiva.nesine.android:id/personal_info_btn");
    private final By btnPromotions = By.id("com.pordiva.nesine.android:id/my_promotions_btn");
    private final By btnLogout = By.id("com.pordiva.nesine.android:id/logout_btn");
    private final By txtLogoutMessage = By.id("android:id/message");
    private final By btnLogoutConfirm = By.id("android:id/button1");

    //Page Methods
    public void confirmLogoutMessagePopup() {

        controlIsElementExist(txtLogoutMessage);
        click(btnLogoutConfirm);

    }

    public void clickAccountPageButton(String accountPageButton) {

        switch (accountPageButton) {
            case "Personal Info":
                waitAndClick(btnPersonalInfo);
                break;
            case "Promotions":
                waitAndClick(btnPromotions);
                break;
            case "Logout":
                waitAndClick(btnLogout);
                break;
        }

    }

    public void confirmAccountPage() {

        controlIsElementExist(imgUserAvatar);

    }

    //Mobile Objects


    //Page Methods


}
