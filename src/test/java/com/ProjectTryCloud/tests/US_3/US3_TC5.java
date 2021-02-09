package com.ProjectTryCloud.tests.US_3;

import com.ProjectTryCloud.tests.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.awt.*;

public class US3_TC5 extends TestBase {
    //Test case #5 - verify users can upload a file directly to the homepage (File-Uploading)
//1. Login as a user
//2. Click the “+” icon on top
//3. Click “upload file”
//4. Upload a file
//5. Verify the file is displayed on the page
    @Test
    public void verify_users_can_upload_a_file_directly_to_the_homepage() throws InterruptedException, AWTException {

        String FilePath = "C:\\Users\\sergi\\Desktop\\A.txt";

        driver.findElement(By.xpath("//*[@id='appmenu']/li[2]")).click();//1

        WebElement PlusButton = driver.findElement(By.xpath("//*[@id=\"controls\"]/div[2]/a"));

        PlusButton.click();

        WebElement UploadFileButton = driver.findElement(By.xpath("//input[@type='file']"));

        UploadFileButton.sendKeys(FilePath);

        WebElement UploadedFile = driver.findElement(By.xpath("//*[@id=\"fileList\"]/tr[2]/td[2]/a/span[1]"));

        if (UploadedFile.isDisplayed()) {
            System.out.println("File successfully upload");

        } else {
            System.out.println("File is not Uploaded");
        }


    }
}
