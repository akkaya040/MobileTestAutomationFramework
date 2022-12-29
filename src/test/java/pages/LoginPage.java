package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class LoginPage extends BasePage{
    public LoginPage(AndroidDriver<MobileElement> driver) {
        super(driver);
    }

    //Mobile Objects

    private By btnStayLoggedIn = By.id("com.pordiva.nesine.android:id/keep_login_rb");
    private By txtUsername = By.id("com.pordiva.nesine.android:id/username_edit");
    private By txtPassword = By.id("com.pordiva.nesine.android:id/password_edit");
    private By btnLogin = By.id("com.pordiva.nesine.android:id/login_btn");




    //Page Methods
    public void clickLoginButton() {

        click(btnLogin);

    }

    public void fillPasswordAs(String password) {

        sendText(txtPassword,password);

    }

    public void fillUsernameAs(String username) {

        sendText(txtUsername,username);

    }

    public void confirmPromotionsPage() {


    }

    public void confirmLoginPage() {

        controlIsElementExist(btnStayLoggedIn);

    }
}
