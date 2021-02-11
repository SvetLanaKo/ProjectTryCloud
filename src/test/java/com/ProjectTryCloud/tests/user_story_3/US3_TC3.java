package com.ProjectTryCloud.tests.user_story_3;

import com.ProjectTryCloud.tests.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


public class US3_TC3 extends TestBase {
//Test case #3 - verify users can add a file to favorites.
//1. Login as a user
//2. Click action-icon from any file on the page
//3. Choose “Add to Favorites” option
//4. Click “Favorites” sub-module on the left side
//5. Verify the chosen file is listed on the table
//(Pre-condition: there should be at least 1 file is uploaded)
//NOTE:

        @Test

        public void verify_users_can_add_a_file_to_favorites() throws InterruptedException {

            driver.findElement(By.xpath("//*[@id='appmenu']/li[2]")).click();//1

            WebElement FavoriteFileBeforeAdd = driver.findElement(By.xpath("//*[@id=\"fileList\"]/tr[1]/td[2]/a/span[1]"));
            String NameFavoriteFileBeforeAdding = FavoriteFileBeforeAdd.getText();

            WebElement addFavoriteButton1 = driver.findElement(By.xpath("//*[@id=\"fileList\"]/tr[1]/td[2]/a/span[3]/a[2]"));//2

            addFavoriteButton1.click();
            Thread.sleep(3000);

            WebElement addButton = driver.findElement(By.xpath("//*[@id=\"fileList\"]/tr[1]/td[2]/div/ul/li[3]/a/span[2]"));//3

            if (addButton.getText().contains("Add")) {


                addButton.click();


                Thread.sleep(3000);

                WebElement FavoriteButton = driver.findElement(By.xpath("//*[@id=\"app-navigation\"]/ul/li[3]/a"));//4
                FavoriteButton.click();

                Thread.sleep(3000);

                WebElement FavoriteFile = driver.findElement(By.xpath("//*[@id=\"fileList\"]/tr/td[1]/a/span[1]"));

                String NameFavoriteFileAfterAdding = FavoriteFile.getText();

                System.out.println(NameFavoriteFileAfterAdding + NameFavoriteFileBeforeAdding);

                Assert.assertEquals(NameFavoriteFileAfterAdding, NameFavoriteFileBeforeAdding);
            } else {
                WebElement FavoriteButton = driver.findElement(By.xpath("//*[@id=\"app-navigation\"]/ul/li[3]/a"));//4
                FavoriteButton.click();

                Thread.sleep(3000);

                WebElement FavoriteFile = driver.findElement(By.xpath("//*[@id=\"fileList\"]/tr/td[1]/a/span[1]"));

                String NameFavoriteFileAfterAdding = FavoriteFile.getText();

                System.out.println(NameFavoriteFileAfterAdding + NameFavoriteFileBeforeAdding);

                Assert.assertEquals(NameFavoriteFileAfterAdding, NameFavoriteFileBeforeAdding);
            }
        }
    }
