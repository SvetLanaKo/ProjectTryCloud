package com.ProjectTryCloud.tests.US_7;

import com.ProjectTryCloud.tests.base.TestBase;
import com.ProjectTryCloud.tests.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TC1_SearchFunction extends TestBase {


//1. Login as a user from the TestBase

    @Test(description = "Test case #1 - Verify users can search any files/folder/users from the search box.")
    public void searchFunction() {

// 2. Click magnifier icon on the right top
        WebElement magnifyIcon = driver.findElement(By.xpath("//span[@class='material-design-icon magnify-icon unified-search__trigger']"));
        magnifyIcon.click();

// 3. Search any existing file/folder/user name
        WebElement searchInbox = driver.findElement(By.xpath("//input[@class='unified-search__form-input']"));
        searchInbox.sendKeys("Talk");

        WebElement searchResult = driver.findElement(By.xpath("//a[@class='unified-search__result']"));
        searchResult.click();

//4. Verify the app displays the expected result option
        WebElement talkFileSearchResult = driver.findElement(By.xpath("//a[@href='/index.php/apps/files?dir=//Talk']"));

        Assert.assertTrue(talkFileSearchResult.isDisplayed(), "Not a \"Talk\" file, Search Verify FAILED!");
    }

    @Test
    public void searchFunctionCase2() throws InterruptedException {
        WebElement magnifyIcon = driver.findElement(By.xpath("//span[@class='material-design-icon magnify-icon unified-search__trigger']"));
        magnifyIcon.click();
        Thread.sleep(3000);

        WebElement searchInbox = driver.findElement(By.xpath("//input[@class='unified-search__form-input']"));
        searchInbox.sendKeys("Notes");
        Thread.sleep(3000);


        WebElement notesFileSearchResult = driver.findElement(By.xpath("(//a[@class='recommendation'])[1]"));
        notesFileSearchResult.click();

        Assert.assertTrue(notesFileSearchResult.isDisplayed(), "Not a \"Notes\" file, Search Verify FAILED!");

    }

}






