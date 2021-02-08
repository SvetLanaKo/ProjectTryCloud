package com.ProjectTryCloud.tests.user_story1;

import com.ProjectTryCloud.tests.base.TestBase;
import com.ProjectTryCloud.utilities.ConfigurationReader;
import com.ProjectTryCloud.utilities.TryCloudUtils;
import com.ProjectTryCloud.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TC2_invalid_login_verification {

    protected WebDriver driver;
    //Negative Test Scenario should be run "manually"
     //Added line 21
    //1. Story: As a user, I should be able to login.
    //Test case #2 - verify user cannot login with invalid credentials

    @BeforeMethod
    public void setup() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.get(ConfigurationReader.getProperty("Url"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

        @Test
        public void login_verification_with_validCredentials () {
            //NOTE: login credentials are stored in TryCloudUtils Java Class
            //login steps with the invalid credentials are described under loginPositive(driver) Method

            TryCloudUtils.loginNegative(driver);

            //In this class, we will perform th last two steps verification

            //5. Message “Wrong username or password.” should be displayed
            WebElement message = driver.findElement(By.xpath("//p[@class ='warning wrongPasswordMsg']"));
            Assert.assertTrue(message.isDisplayed(),"The message verification is FAILED expected");


            //6. Page title and url should be same.
            String actualTitle = driver.getTitle();
            String currentTitle = "Trycloud QA";
            Assert.assertEquals(actualTitle, currentTitle, "The title verification is FAILED");

            //Accroding to the User Story the valid username is used in this step. User22 was used.
            String actualURL = driver.getCurrentUrl();
            String currentURL = "http://qa3.trycloud.net/index.php/login?user=User22";
            Assert.assertEquals(actualURL, currentURL, "The URL verification is FAILED");
        }

        @AfterMethod
        public void tearDown () throws InterruptedException {
            Thread.sleep(1000);
            driver.close();
        }
    }

