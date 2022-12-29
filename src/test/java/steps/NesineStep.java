package steps;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.ThreadLocalDriver;

public class NesineStep extends BaseStep{

    String userId;
    @Before
    public void setupPages() {

        initPages(ThreadLocalDriver.getDriver());

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
                loginPage.confirmPromotionsPage();
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

        String userId = mainPage.getUserIdFromScreen();

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

    }

    @When("The User Confirms Error Message Popup")
    public void theUserConfirmsErrorMessagePopup() {
    }
}
