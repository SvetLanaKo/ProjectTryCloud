package com.ProjectTryCloud.tests.user_story_3;

import com.ProjectTryCloud.tests.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class US3_TC4 extends TestBase {
    //Test case #4 - verify users can remove a file from favorites.
//1. Login as a user
//2. Click action-icon from any file on the page
//3. Click “Remove from Favorites” option
//4. Verify that the file is removed from Favorites sub-module’s table.
//(Pre-condition: there should be at least 1 file is added to favorites table)

    @Test
    public void verify_users_can_remove_a_file_from_favorites() throws InterruptedException {


        driver.findElement(By.xpath("//*[@id='appmenu']/li[2]")).click();//1

        WebElement FavoriteFileBeforeRemove = driver.findElement(By.xpath("//*[@id=\"fileList\"]/tr/td[2]/a/span[1]"));

        String NameFavoriteFileBeforeRemove = FavoriteFileBeforeRemove.getText();

        WebElement TreePointButton = driver.findElement(By.xpath("//*[@id=\"fileList\"]/tr/td[2]/a/span[3]/a[2]"));//2

        TreePointButton.click();

        Thread.sleep(3000);

        WebElement addButton = driver.findElement(By.xpath("//*[@id=\"fileList\"]/tr[1]/td[2]/div/ul/li[3]/a"));//3

        addButton.click();

        WebElement FavoriteButton = driver.findElement(By.xpath("//*[@id=\"app-navigation\"]/ul/li[3]/a"));//4

        FavoriteButton.click();


        List<WebElement> FavoriteTable = driver.findElements(By.xpath("//*[@id=\"app-navigation\"]/ul/li[3]/a"));

        for (WebElement each : FavoriteTable) {
            if (!each.getText().contains(NameFavoriteFileBeforeRemove)) {
                System.out.println("Test passed");
            } else {
                System.out.println("Test not passed");
            }
        }

    }
}
