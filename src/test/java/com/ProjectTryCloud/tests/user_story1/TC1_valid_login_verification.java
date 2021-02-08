package com.ProjectTryCloud.tests.user_story1;

import com.ProjectTryCloud.tests.base.TestBase;
import com.ProjectTryCloud.utilities.TryCloudUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC1_valid_login_verification extends TestBase {



        //1. Story: As a user, I should be able to login.
        //Test case #1 - verify user login successfully

        //NOTE: Before and After Methods are initialized in TestBase Class, this current Class is extended to that TestBase Class.

        @Test
        public void login_verification_with_validCredentials() throws InterruptedException {
            //explanation:
            //NOTE: login credentials are stored in TryCloudUtils Java Class
            //login steps with the valid credentials are described under loginPositive(driver) Method
            //In this class, we will perform only URL verification

            //5. Verify the URL is chawed to homepage's url --> chawed means "showed"
            //ATTENTION: URL MUST BE CHANGED DUE TO NEW ENVIRONMENT
            String expectedUrl = "http://qa3.trycloud.net";
            String actualUrl = driver.getCurrentUrl();
            Assert.assertTrue(actualUrl.contains(expectedUrl));
        }


}
