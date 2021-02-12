package com.ProjectTryCloud.tests.user_story5;

import com.ProjectTryCloud.tests.base.TestBase;
import com.ProjectTryCloud.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.Driver;
import java.util.ArrayList;
import java.util.List;

public class UserStory5_All_TC extends TestBase {
    @Test
    public void TC1_contactModule() {
        //Click “Contacts” module
        WebElement contactModule = driver.findElement(By.xpath("(//a[@aria-label='Contacts'])[1]"));
        contactModule.click();
        //Verify the page tile is Contents module’s tile
        String expectedResult = "Contacts";
        String actualResult = driver.getTitle();
        Assert.assertTrue(actualResult.contains(expectedResult));

    }

    @Test
    public void TC2_addContacts() {
        //Click “Contacts” module.
        WebElement contactModule = driver.findElement(By.xpath("(//a[@aria-label='Contacts'])[1]"));
        contactModule.click();
        //Click “New Contact” button.
        WebElement newContact = driver.findElement(By.xpath("//button[@id='new-contact-button']"));
        newContact.click();
        //fill out new contact info.
        driver.findElement(By.xpath("//input[@id='contact-fullname']")).sendKeys("Marie Curie");
        driver.findElement(By.xpath("(//input[@type='text'])[11]")).sendKeys("123 Chicago ave");
        newContact.click();
        //Verify the contact name is added to the contact list
        WebElement allContacts = driver.findElement(By.xpath("//div[@class='vue-recycle-scroller__item-wrapper']"));
        String actualResult = allContacts.getText();
        String expectedResult = "Marie Curie";
        Assert.assertTrue(actualResult.contains(expectedResult));
    }

    @Test(description = "click to contact module")
    public void TC3_accessToContactsModule() {
        //Click contacts module
        WebElement contactModule = driver.findElement(By.xpath("(//a[@aria-label='Contacts'])[1]"));
        contactModule.click();
        WebElement newContact = driver.findElement(By.xpath("//button[@id='new-contact-button']"));
        newContact.click();

        //fill out new contact info
        driver.findElement(By.xpath("//input[@id='contact-fullname']")).click();
        driver.findElement(By.xpath("//input[@id='contact-fullname']")).clear();
        driver.findElement(By.xpath("//input[@id='contact-fullname']")).sendKeys("Venera");
        driver.findElement(By.xpath("(//input[@type='text'])[11]")).sendKeys("123 Chicago ave");
        newContact.click();
        //Verify the contact names are in the list.
        // (Pre-condition: there should be at least 2 contact names are displayed, On the contact list)
        List<WebElement> contacts = driver.findElements(By.xpath("//div[@class='vue-recycle-scroller__item-view']"));
        ArrayList<String> contactList = new ArrayList<>();
        System.out.println("contacts = " + contacts.size());
        for (WebElement each : contacts) {
            contactList.add(each.getText());
        }
        if (contacts.size() < 2) Assert.fail("Add more contacts");
        System.out.print("contactList = " + contactList);


    }

}
