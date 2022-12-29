package tests;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import utils.ThreadLocalDriver;
import utils.CapabilityUtil;

import java.io.IOException;
import java.net.URL;

public class BaseTest {
    private final CapabilityUtil desiredCapabilitiesUtil = new CapabilityUtil();

    @BeforeMethod
    @Parameters({ "deviceName","udid", "platformName","platformVersion","appPackage","appActivity","automationName" })
    public void setup(String deviceName,String udid,String platformName, String platformVersion, String appPackage,String appActivity,String automationName) throws IOException {

        DesiredCapabilities caps = desiredCapabilitiesUtil.getDesiredCapabilities(deviceName,udid,platformName, platformVersion,appPackage,appActivity,automationName);
        ThreadLocalDriver.setDriver(new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), caps));

    }

    @AfterMethod
    public synchronized void teardown() {
//        try {
//            String screenshotName = scenario.getName().replaceAll("", "_");
//            if (scenario.isFailed()) {
//                TakesScreenshot ts = (TakesScreenshot) ThreadLocalDriver.getDriver();
//                byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
//                scenario.attach(screenshot, "img/png", screenshotName);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        ThreadLocalDriver.killDriver();

    }
}
