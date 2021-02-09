package com.ProjectTryCloud.tests.US_3;

import com.ProjectTryCloud.tests.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US3_TC1 extends TestBase {
    //  Story: As a user, I should be able to access to Files module.
    //  Test case #1 - verify users can access to Files module
    //   Login as a user
    //   Verify the page tile is Files module's tile
    @Test
    public void verify_page_title_is_Files_page_title(){
        WebElement filesModule = driver.findElement(By.xpath("//a[@href='/index.php/apps/files/']"));
        filesModule.click();
        String actualPageTitle = driver.getTitle();
        String expectedPageTitle = "Files - Trycloud QA";
        Assert.assertEquals(actualPageTitle,expectedPageTitle);//Good day!


    }
}
