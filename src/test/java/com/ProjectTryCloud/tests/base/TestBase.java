package com.ProjectTryCloud.tests.base;

import com.ProjectTryCloud.utilities.ConfigurationReader;
import com.ProjectTryCloud.utilities.TryCloudUtils;
import com.ProjectTryCloud.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase {

    protected WebDriver driver;
    @BeforeMethod
    public void setup() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.get(ConfigurationReader.getProperty("Url"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS); //this method is implemented when the server is down
        TryCloudUtils.loginPositive(driver);
    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(1000);
        driver.close();
    }
}
