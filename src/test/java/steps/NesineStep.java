package steps;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.ThreadLocalDriver;

public class NesineStep extends BaseStep{
    @Before
    public void setupPages() {
        initPages(ThreadLocalDriver.getDriver());
    }

    @Given("The User Starts Nesine App")
    public void theUserStartNesineApp() {

    }


    @And("The User Skips Learning Screen")
    public void theUserSkipsLearningScreen() {

    }

    @When("The User Clicks {string} Button In Main Page")
    public void theUserClicksButtonInMainPage(String arg0) {

    }

    @Then("The User Should Arrive {string} Page")
    public void theUserShouldArrivePage(String arg0) {
    }

    @And("The User Fills Username As {string}")
    public void theUserFillsUsernameAs(String arg0) {
    }

    @And("The User Fills Password As {string}")
    public void theUserFillsPasswordAs(String arg0) {
    }

    @When("The User Clicks Login Button In Login Page")
    public void theUserClicksLoginButtonInLoginPage() {
    }

    @Then("The User Should See UserId In Main Page")
    public void theUserShouldSeeUserIdInMainPage() {
    }

    @When("The User Clicks {string} Button In Account Page")
    public void theUserClicksButtonInAccountPage(String arg0) {
    }

    @And("The User Fills Random Promotion Code")
    public void theUserFillsRandomPromotionCode() {
    }

    @And("The User Fills Captcha Code")
    public void theUserFillsCaptchaCode() {
    }

    @When("The User Clicks Load Button")
    public void theUserClicksLoadButton() {
    }

    @Then("The User Should See Code Error Message")
    public void theUserShouldSeeCodeErrorMessage() {
    }

    @And("The User Clicks Close Button In Promotions Page")
    public void theUserClicksCloseButtonInPromotionsPage() {
    }

    @And("The User Stores UserId In Main Page")
    public void theUserStoresUserIdInMainPage() {
    }

    @And("The User Confirms Stored UserId")
    public void theUserConfirmsStoredUserId() {
    }
}
