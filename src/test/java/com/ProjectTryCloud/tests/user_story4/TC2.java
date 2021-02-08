package com.ProjectTryCloud.tests.user_story4;


import com.ProjectTryCloud.tests.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TC2 extends TestBase {
    //   Test case #2 - verify users can send message
    //1. Login as a user
    @Test
    public void verify_users_can_send_message(){

        //2. Click Talks module
        WebElement talksModule = driver.findElement(By.xpath("//*[@id='appmenu']/li[5]/a"));
        talksModule.click();

        //3. Search a user from search box on the left
        WebElement searchUser = driver.findElement(By.xpath("//*[@class='app-navigation-search__input']"));
        searchUser.sendKeys("User");
        // (Ex: Let's select third user for demo)
        WebElement user = driver.findElement(By.xpath("//*[@id='app-navigation-vue']/ul/li[4]/ul/li[3]/a/div[2]/div[1]/span[1]"));
        user.click();

        //4. Write a message
        WebElement inputMessage =driver.findElement(By.xpath("//*[@class='new-message-form__advancedinput']"));
        inputMessage.sendKeys("Hi,how are you?");

        //5. Click submit button
        WebElement submitButton = driver.findElement(By.xpath("//*[@class='new-message-form__button submit icon-confirm-fade']"));
        submitButton.click();

        //6. Verify the message is displayed on the conversation log
        WebElement message = driver.findElement(By.xpath("//*[@class='message']"));
        Assert.assertTrue(message.isDisplayed(),"message is not displayed");

    }

}
