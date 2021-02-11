package com.ProjectTryCloud.tests.user_story3;

import com.ProjectTryCloud.tests.base.TestBase;
import com.ProjectTryCloud.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class US3_TC7 extends TestBase {
    /*
    Test case #7 - verify users can upload a file inside a folder
    1. Login as a user
    2. Choose a folder from the page
    3. Click the "+" icon on top
    4. Click "upload file"
    5. Upload a file
    6. Verify the file is displayed on the page
    (Pre-condition: there should be at least 1 folder is created on the filers page)
    */

    @Test
    public void verify_user_can_upload_file_inside_folder(){
        WebElement filesModule = driver.findElement(By.xpath("//a[@href='/index.php/apps/files/']"));

        filesModule.click();

        WebElement talkFolder = driver.findElement(By.xpath("//*[@id=\"fileList\"]/tr[1]"));

        talkFolder.click();

        WebElement plusIcon = driver.findElement(By.xpath("//a[@class='button new']"));

        plusIcon.click();

        BrowserUtils.sleep(1);

        String path = "C:\\Users\\sergi\\Desktop\\A.txt";

        WebElement uploadFile = driver.findElement(By.xpath("//input[@type='file']"));

        uploadFile.sendKeys(path);

        BrowserUtils.sleep(1);
    }
}
