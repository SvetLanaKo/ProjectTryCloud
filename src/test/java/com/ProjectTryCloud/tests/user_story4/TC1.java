package com.ProjectTryCloud.tests.user_story4;

import com.ProjectTryCloud.tests.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;



// 4. Story: As a user, I should be able to access to Talks module.
// Test case #1 - verify users can access to Talks module
public class TC1 extends TestBase {

    // 1. Login as a user
    @Test
    public void verify_users_can_access_to_Talks_module(){
        // 2.Click Talks module
        WebElement talksModule = driver.findElement(By.xpath("//*[@id='appmenu']/li[5]/a"));
        talksModule.click();
        // 3.Verify the page title is Talks module’s title
        Assert.assertTrue(driver.getTitle().contains("Talk"),"The page title is not Talk module; Verification failed");

    }



}
