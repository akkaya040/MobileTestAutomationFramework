package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class MainPage extends BasePage {
    public MainPage(AndroidDriver<MobileElement> driver) {
        super(driver);
    }
    //Mobile Objects
    private final By btnSkipTutorial = By.id("com.pordiva.nesine.android:id/tv_skip_tutorial");
    private final By imgTutorialScreen = By.id("com.pordiva.nesine.android:id/iv_minute_bet_tutorial");
    private final By btnLoginMain = By.id("com.pordiva.nesine.android:id/btn_login");
    private final By txtUserId = By.id("com.pordiva.nesine.android:id/memberidValue");
    private final By btnAccount = By.id("com.pordiva.nesine.android:id/member_image");
    private final By imgNesine = By.id("com.pordiva.nesine.android:id/img_logo");



    //Page Methods
    public String getUserIdFromScreen() {

        return getText(txtUserId);
    }

    public void controlIsUserIdExist() {

        controlIsElementExist(txtUserId);

    }

    public void confirmMainPage() {

        controlIsElementExist(imgNesine);

    }

    public void clickMainPageButton(String button) {

        switch (button) {
            case "Login":
                waitAndClick(btnLoginMain);
                break;
            case "Account":
                waitAndClick(btnAccount);
                break;
        }


    }

    public void clickSkipLearningButton() {

        waitAndClick(btnSkipTutorial);

    }

    public void waitUntilLearningScreenAppear() {

        waitUntilAppear(imgTutorialScreen);
    }
}
