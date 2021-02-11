package com.ProjectTryCloud.tests.user_story_3;

import com.ProjectTryCloud.tests.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class US3_TC9 extends TestBase {

    @Test
    public void VerifyUsersCanChangeSetting() {
        driver.findElement(By.xpath("//*[@id='appmenu']/li[2]")).click();

        WebElement ClickSetting = driver.findElement(By.xpath("//*[@id=\"app-settings-header\"]/button"));
        ClickSetting.click();

        WebElement ClickButton1 = driver.findElement(By.xpath("//*[@id=\"files-setting-richworkspace\"]/label[1]"));
        ClickButton1.click();

        WebElement ClickButton2 = driver.findElement(By.xpath("//*[@id=\"recommendations-setting-enabled\"]/label[1]"));
        ClickButton2.click();

        WebElement ClickButton3 = driver.findElement(By.xpath("//*[@id=\"files-setting-showhidden\"]/label[1]"));
        ClickButton3.click();

        if (ClickButton1.isSelected()) {
            System.out.println("Click Button 1 selceted Verfication passed");
        } else {
            System.out.println("Verfication failed");
        }

        if (ClickButton2.isSelected()) {
            System.out.println("Verficaton passed");
        } else {
            System.out.println("Verifcarion failled");
        }

        if (ClickButton3.isSelected()) {
            System.out.println("Verfication for Button 3 passed");
        } else {
            System.out.println("Verfication for button 3 failed ");


        }


    }
}



/*

Test case #9 - verify users can change the app Settings.
1. Login as a user
2. Click Settings on the left bottom corner
3. Verify user can click any buttons
 */
