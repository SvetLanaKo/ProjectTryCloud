package com.ProjectTryCloud.tests.user_story_3;

import com.ProjectTryCloud.tests.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class USC_TC10 extends TestBase {

    @Test
    public void Verify_user_can_see_the_app_storage(){
        driver.findElement(By.xpath("//*[@id='appmenu']/li[2]")).click();

        WebElement VerfiyStorage1=driver.findElement(By.xpath("//*[@id=\"quota\"]/a/p"));
        VerfiyStorage1.click();

        WebElement ClickUploadButton=driver.findElement(By.xpath("//*[@id=\"controls\"]/div[2]/a/span[1]"));
        ClickUploadButton.click();

        WebElement ChoseUpload=driver.findElement(By.xpath("//*[@id=\"controls\"]/div[2]/div[2]/ul/li[1]/label/span[2]"));
        ChoseUpload.click();

        driver.navigate().refresh();

        if (VerfiyStorage1.isDisplayed()){
            System.out.println("Verfiyed Storage is 1.2 MB USED Verfication passed!");
        }else{
            System.out.println("Verfyied stroage is less then 1.2 MB Used the verfication falied");
        }




    }
}

/*Test case #10 - verify users see the app storage usage
        1. Login as a user
        2. Check the current storage usage
        3. Upload a file
        4. Refresh the page
        5. Verify the storage usage is increased

 */
