package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.testng.Assert;

public class LoginPage extends BasePage {
    public LoginPage(AndroidDriver<MobileElement> driver) {
        super(driver);
    }

    //Mobile Objects

    private final By btnStayLoggedIn = By.id("com.pordiva.nesine.android:id/keep_login_rb");
    private final By txtUsername = By.id("com.pordiva.nesine.android:id/username_edit");
    private final By txtPassword = By.id("com.pordiva.nesine.android:id/password_edit");
    private final By btnLogin = By.id("com.pordiva.nesine.android:id/login_btn");
    private final By txtLoginErrorMessage = By.id("android:id/message");
    private final By btnLoginErrorOk = By.id("android:id/button2");


    //Page Methods
    public void clickLoginButton() {

        click(btnLogin);

    }

    public void fillPasswordAs(String password) {

        sendText(txtPassword, password);

    }

    public void fillUsernameAs(String username) {

        sendText(txtUsername, username);

    }



    public void confirmLoginPage() {

        controlIsElementExist(btnStayLoggedIn);

    }

    public void controlLoginErrorMessage() {

        String errorMessage = getText(txtLoginErrorMessage);
        Assert.assertTrue(errorMessage.contains("Lütfen bilgilerinizi kontrol ediniz"));

    }

    public void closeLoginErrorMessage() {

        click(btnLoginErrorOk);

    }
}
