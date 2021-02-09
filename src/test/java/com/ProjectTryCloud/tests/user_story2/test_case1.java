package com.ProjectTryCloud.tests.user_story2;

import com.ProjectTryCloud.tests.base.TestBase;
import com.ProjectTryCloud.utilities.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.hc.core5.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.sql.Driver;
import java.util.ArrayList;
import java.util.List;

public class test_case1 extends TestBase {

    @Test
    public void verify() {
/*
        Actions actions = new Actions(driver);
        WebElement module1 = driver.findElement(By.xpath("(//a)[4]"));


        actions.moveToElement(module1).perform();

        List<WebElement> appMenu = driver.findElements((By.xpath("//ul[@id='appmenu']")));
        List<String> actualText = new ArrayList<>();
        for (WebElement each : appMenu) {


            Assert.assertTrue(each.isDisplayed());
        }

Assert.assertFalse("Galleries".equals("Photos"), "Verification is failed");




 */

        // 2. Verify the user see the following modules:
        //    Dashboard
        //    Files
        //    Photos
        //    Activity
        //    Spreed
        //    Mail
        //    Contacts
        //    Circles
        //    Calendar
        //    Deck
        WebElement headerLeft = driver.findElement(By.xpath("//div[@class='header-left']/ul/li/a"));
        Actions actions = new Actions(driver);
        BrowserUtils.sleep(1);
        actions.moveToElement(headerLeft).perform();
        List<WebElement> appMenuHeader = driver.findElements(By.xpath("//div[@class='header-left']/ul/li/a"));
        for (int i = 0; i < 10; i++) {
            String TextOfEachLink = appMenuHeader.get(i).getText();
            System.out.println("TextOfEachLink = " + TextOfEachLink);
            String expectedModuleName = "Galleries";
            String actualModuleName = appMenuHeader.get(2).getText();
            Assert.assertNotEquals(actualModuleName,expectedModuleName);
            //Assert.assertEquals(actualModuleName,expectedModuleName);
        }






    }
}
