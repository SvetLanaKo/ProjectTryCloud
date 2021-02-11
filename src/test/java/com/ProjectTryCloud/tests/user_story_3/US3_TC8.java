package com.ProjectTryCloud.tests.user_story_3;

import com.ProjectTryCloud.tests.base.TestBase;
import com.ProjectTryCloud.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class US3_TC8 extends TestBase {

    @Test

    public void Verify_Delete_Files(){
        driver.findElement(By.xpath("//*[@id='appmenu']/li[2]")).click();

        WebElement checkboxList = driver.findElement(By.xpath("//*[@id=\"fileList\"]/tr[3]/td[1]"));
        checkboxList.click();

        WebElement GoToSelectOptions=driver.findElement(By.xpath("//*[@id=\"fileList\"]/tr[3]/td[2]/a[1]/span[2]/a[2]/span[1]"));
        GoToSelectOptions.click();

        WebElement SelectDelete=driver.findElement(By.xpath("//*[@id=\"fileList\"]/tr[3]/td[2]/div[1]/ul[1]/li[8]/a[1]"));
        SelectDelete.click();

        WebElement CheckDeletedFile=driver.findElement(By.xpath("//*[@id=\"app-navigation\"]/ul[1]/li[7]/a[1]"));
        CheckDeletedFile.click();





        BrowserUtils.sleep(20);



       //WebElement ClickTrash =driver.findElement(By.xpath("//*[@id=\"controls\"]/div[1]/div[2]/a"));
       //ClickTrash.click();


        // WebElement GoToDeleteFiles=driver.findElement(By.xpath("//*[@id=\"app-navigation\"]/ul/li[7]/a"));
       // GoToDeleteFiles.click();




    }
}
/*
Test case #8 - verify users can delete a file/folder.
1. Login as a user
2. Click action-icon from any file on the page
3. Choose “delete files” option
4. Click deleted files on the left bottom corner
5. Verify the deleted file is displayed no the page.
(Pre-condition: there should be at least 1 file is uploaded inside files page)
 */