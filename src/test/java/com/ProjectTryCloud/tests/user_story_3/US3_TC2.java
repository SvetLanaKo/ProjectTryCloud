package com.ProjectTryCloud.tests.user_story_3;

import com.ProjectTryCloud.tests.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class US3_TC2 extends TestBase {

//Test case #2 - verify users can select all the uploaded files from the page
//1. Login as a user
//2. Click the top left checkbox of the table
//3. Assert all the files are selected
//(Pre-condition: there should be at least 2 files are uploaded the page)

        @Test

        public void verify_users_can_select_all_the_uploaded_files_from_the_page() {

            driver.findElement(By.xpath("//*[@id='appmenu']/li[2]")).click();

            WebElement checkbox1 = driver.findElement(By.xpath("//*[@id=\"headerSelection\"]/label"));
            checkbox1.click();

            List<WebElement> allcheckboxes = driver.findElements(By.xpath("//*[@class='selectCheckBox checkbox']"));

            for (WebElement each : allcheckboxes) {

                Assert.assertTrue(each.isSelected());

            }

        }

    }

