package com.Alert;

import com.Base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AllAboutAlert extends TestBase {
    public static void main(String[] args) throws InterruptedException {
        firefox_launch();
        openUrl("https://the-internet.herokuapp.com/javascript_alerts");
        normalAlert();
        confirmAlert();
        promptAlert();
        firefox_close();
    }
    public static void normalAlert() throws InterruptedException {
        WebElement alertBtn=driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(1) > button"));
        alertBtn.click();
        Thread.sleep(3000);
        driver.switchTo().alert().accept(); // click on ok
    }
    public static void confirmAlert() throws InterruptedException {
        WebElement alertBtn=driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(2) > button"));
        alertBtn.click();
        Thread.sleep(3000);
      //  driver.switchTo().alert().accept(); // click on ok
        driver.switchTo().alert().dismiss();  //click on Cancel
    }
    public static void promptAlert() throws InterruptedException {
        WebElement alertBtn=driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(3) > button"));
        alertBtn.click();
        Thread.sleep(3000);
        driver.switchTo().alert().sendKeys("Test Automation");
        Thread.sleep(3000);
        driver.switchTo().alert().accept();
    }
}
