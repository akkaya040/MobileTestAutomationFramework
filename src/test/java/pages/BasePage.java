package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Random;

public class BasePage {

    protected AndroidDriver<MobileElement> driver;
    protected WebDriverWait wait;

    public BasePage(AndroidDriver<MobileElement> driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 15);
    }

    protected String getText(By by) {

        return wait.until(ExpectedConditions.visibilityOfElementLocated(by)).getText();

    }

    protected void sendText(By by, String text) {

        wait.until(ExpectedConditions.visibilityOfElementLocated(by)).sendKeys(text);

    }
    protected void sendText(MobileElement me, String text) {

        me.sendKeys(text);

    }

    protected void waitAndClick(By by) {

        wait.until(ExpectedConditions.visibilityOfElementLocated(by)).click();

    }

    protected void waitUntilAppear(By by) {

        wait.until(ExpectedConditions.visibilityOfElementLocated(by));

    }

    protected void controlIsElementExist(By by) {

        MobileElement me =  (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        Assert.assertTrue(me.isDisplayed());

    }

    protected void click(By by) {

        driver.findElement(by).click();

    }

    protected void hideKeyboard() {

        driver.navigate().back();

    }

    protected String generateRandomString(int size){

        return RandomStringUtils.randomAlphanumeric(size);

    }

    protected List<WebElement> waitAndFindElements(By by) {

        return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));

    }

    protected WebElement waitAndFindElement(By by) {

        return wait.until(ExpectedConditions.visibilityOfElementLocated(by));

    }

}
