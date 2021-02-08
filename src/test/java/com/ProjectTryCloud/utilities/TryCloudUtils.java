package com.ProjectTryCloud.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TryCloudUtils {

    public static void loginPositive(WebDriver driver){
        // Enter valid username

        WebElement userNameInputBox = driver.findElement(By.xpath("//input[@id='user']"));
        userNameInputBox.sendKeys(ConfigurationReader.getProperty("username"));
        //System.out.println(ConfigurationReader.getProperty("username"));
        // Enter valid password
        WebElement passwordInputBox = driver.findElement(By.xpath("//input[@id='password']"));
        passwordInputBox.sendKeys(ConfigurationReader.getProperty("password"));
        //System.out.println(ConfigurationReader.getProperty("password"));
        // Click login button
        WebElement loginButton = driver.findElement(By.xpath("//input[@id='submit-form']"));
        loginButton.click();

    }
    public static void loginNegative(WebDriver driver){
        // Enter valid username
        WebElement userNameInputBox = driver.findElement(By.xpath("//input[@id='user']"));
        userNameInputBox.sendKeys(ConfigurationReader.getProperty("username"));
        //System.out.println(ConfigurationReader.getProperty("username"));
        // Enter valid password
        WebElement passwordInputBox = driver.findElement(By.xpath("//input[@id='password']"));
        passwordInputBox.sendKeys(ConfigurationReader.getProperty("invalidPassword"));
        //System.out.println(ConfigurationReader.getProperty("password"));
        // Click login button
        WebElement loginButton = driver.findElement(By.xpath("//input[@id='submit-form']"));
        loginButton.click();

    }
}
