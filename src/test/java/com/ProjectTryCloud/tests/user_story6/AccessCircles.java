package com.ProjectTryCloud.tests.user_story6;

import com.ProjectTryCloud.tests.base.TestBase;
import com.ProjectTryCloud.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AccessCircles extends TestBase {

      /*
    Test case #1 - verify users can access to Circles module
      1. Login as a user
     */

    @Test
    public void AccessingCirclesModule(){

        //2. Locate and Click “Circles” module
        WebElement circlesModule = driver.findElement(By.xpath("//a[@href='/index.php/apps/circles/']"));
        circlesModule.click();

        // 3. Verify the page tile/URL is Circles module’s tile

        String expectedTile = "Circles - Trycloud QA";
        String actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle,expectedTile);
    }

    @Test
    public void CreatingCircle(){

        //2. Locate and Click “Circles” module
        WebElement circlesModule = driver.findElement(By.xpath("//a[@href='/index.php/apps/circles/']"));
        circlesModule.click();
        BrowserUtils.sleep(1);

        // Locate and create a new circle
        WebElement createNewCircleInputBox = driver.findElement(By.xpath("//input[@id='circles_new_name']"));
        createNewCircleInputBox.sendKeys("Group22");
        BrowserUtils.sleep(1);

        // Select a circle type
        Select selectCircleType = new Select(driver.findElement(By.xpath("//select[@id='circles_new_type']")));
        selectCircleType.selectByVisibleText("Create a closed circle");
        BrowserUtils.sleep(1);

        // Locate and click on Creation button
        WebElement creationButton = driver.findElement(By.xpath("//input[@id='circles_new_submit']"));
        creationButton.click();
        BrowserUtils.sleep(3);

        // Locate and verify that Group22 is created
        WebElement notification = driver.findElement(By.xpath("//div[@class='notyf']"));
        System.out.println(notification.getText());

        String actualTest = notification.getText();
        String expectedTest = "Closed circle 'Group22' created";

        Assert.assertEquals(actualTest,expectedTest);

        Assert.assertTrue(notification.isDisplayed());




    }
}


