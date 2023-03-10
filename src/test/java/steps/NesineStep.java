package steps;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.DriverManager;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class NesineStep extends BaseStep{

    InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream("my.properties");
    Properties prop = new Properties();
    public String userId;
    @Before
    public void setupPages() {

        initPages(DriverManager.getDriver());

    }

    @Given("The User Starts Nesine App")
    public void theUserStartNesineApp() {

    }


    @And("The User Skips Learning Screen")
    public void theUserSkipsLearningScreen() {
        mainPage.waitUntilLearningScreenAppear();
        mainPage.clickSkipLearningButton();
    }

    @When("The User Clicks {string} Button In Main Page")
    public void theUserClicksButtonInMainPage(String button) {

        mainPage.clickMainPageButton(button);

    }

    @Then("The User Should Arrive {string} Page")
    public void theUserShouldArrivePage(String pageName) {

        switch (pageName) {
            case "Login":
                loginPage.confirmLoginPage();
                break;
            case "Account":
                accountPage.confirmAccountPage();
                break;
            case "Main":
                mainPage.confirmMainPage();
                break;
            case "Promotions":
                promotionPage.confirmPromotionsPage();
                break;
                case "Personal Info":
                personalPage.confirmPersonalInfoPage();
                break;
        }

    }

    @And("The User Fills Username As {string}")
    public void theUserFillsUsernameAs(String username) {

        loginPage.fillUsernameAs(username);

    }

    @And("The User Fills Password As {string}")
    public void theUserFillsPasswordAs(String password) {

        loginPage.fillPasswordAs(password);

    }


     // app.username can be called
     // app.password can be called
    public String getParameterFromEnv(String param){

        try {
            prop.load(is);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return prop.getProperty(param);
    }

    @And("The User Fills Username From Env")
    public void theUserFillsUsernameFromEnv() {

        loginPage.fillUsernameAs(getParameterFromEnv("app.username"));

    }

    @And("The User Fills Password From Env")
    public void theUserFillsPasswordFromEnv() {

        loginPage.fillPasswordAs(getParameterFromEnv("app.password"));

    }

    @When("The User Clicks Login Button In Login Page")
    public void theUserClicksLoginButtonInLoginPage() {

        loginPage.clickLoginButton();

    }

    @Then("The User Should See UserId In Main Page")
    public void theUserShouldSeeUserIdInMainPage() {

        mainPage.controlIsUserIdExist();

    }

    @When("The User Clicks {string} Button In Account Page")
    public void theUserClicksButtonInAccountPage(String accountPageButton) {

        accountPage.clickAccountPageButton(accountPageButton);

    }

    @And("The User Fills Random Promotion Code")
    public void theUserFillsRandomPromotionCode() {

        promotionPage.fillRandomPromotionCode();

    }

    @And("The User Fills Captcha Code")
    public void theUserFillsCaptchaCode() {

        String captchaCode = promotionPage.getCaptchaHashCode();
        promotionPage.fillCaptchaCode(captchaCode);

    }

    @When("The User Clicks Load Button")
    public void theUserClicksLoadButton() {

        promotionPage.clickLoadButton();

    }

    @Then("The User Should See Code Error Message")
    public void theUserShouldSeeCodeErrorMessage() {


    }

    @And("The User Clicks Close Button In Promotions Page")
    public void theUserClicksCloseButtonInPromotionsPage() {

        promotionPage.clickCloseButton();

    }

    @And("The User Stores UserId In Main Page")
    public void theUserStoresUserIdInMainPage() {

        userId = mainPage.getUserIdFromScreen();

    }

    @And("The User Confirms Stored UserId")
    public void theUserConfirmsStoredUserId() {

        personalPage.controlStoredUserId(userId);

    }

    @When("The User Confirms Logout Message Popup")
    public void theUserConfirmsLogoutMessagePopup() {

        accountPage.confirmLogoutMessagePopup();

    }

    @Then("The User Should See Error Message Popup")
    public void theUserShouldSeeErrorMessagePopup() {

        loginPage.controlLoginErrorMessage();

    }

    @When("The User Confirms Error Message Popup")
    public void theUserConfirmsErrorMessagePopup() {

        loginPage.closeLoginErrorMessage();

    }
}
