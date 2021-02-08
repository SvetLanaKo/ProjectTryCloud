package com.ProjectTryCloud.tests.US_3;

import com.ProjectTryCloud.tests.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US3_TC6 extends TestBase {

    @Test

    public void accessFileModule(){


        WebElement filesIcon = driver.findElement(By.xpath("(//a[@aria-label='Files'])[1]"));
        filesIcon.click();

        //2. Click the “+” icon on top
        WebElement plusIcon = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/div[1]/div[2]/a"));
        plusIcon.click();

        //3. Click “New Folder”
        WebElement newFolderIcon = driver.findElement(By.xpath("//a[@data-templatename='New folder']"));
        newFolderIcon.click();

        //4. Write a folder name
        //5. Click submit icon
        WebElement folderInputBox = driver.findElement(By.id("view13-input-folder"));
        folderInputBox.sendKeys("G22-Sprint3TestPlan"+ Keys.ENTER);

        //6. Verify the folder is displayed on the page
        WebElement newFileVerify = driver.findElement(By.linkText("G22-Sprint3TestPlan"));
        Assert.assertTrue(newFileVerify.isDisplayed(), "No G22-Sprint3TestPlan file, FAILED! ");


    }


}


