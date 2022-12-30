package tests;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import utils.DriverManager;
import utils.CapabilityUtil;

import java.io.IOException;
import java.net.URL;

public class BaseTest {
    private final CapabilityUtil capabilityUtil = new CapabilityUtil();

    @BeforeMethod
    @Parameters({ "deviceName","udid", "platformName","platformVersion","appPackage","appActivity","automationName" })
    public void setup(String deviceName,String udid,String platformName, String platformVersion, String appPackage,String appActivity,String automationName) throws IOException {

        DesiredCapabilities caps = capabilityUtil.getDesiredCapabilities(deviceName,udid,platformName, platformVersion,appPackage,appActivity,automationName);
        DriverManager.setDriver(new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), caps));

    }

    @AfterMethod
    public synchronized void teardown() {

        DriverManager.killDriver();

    }
}
