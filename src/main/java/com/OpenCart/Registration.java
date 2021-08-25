package com.OpenCart;

import com.Base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Random;

public class Registration extends TestBase {
    public static void main(String[] args) {
        chrome_launch();
        openUrl("https://demo.opencart.com/");
        OpenRegistrationPage();
        TC_Valid_Registration();
        //chrome_close();
    }
    public static void OpenRegistrationPage(){
        WebElement MyAccount=driver.findElement(By.linkText("My Account"));
        MyAccount.click();
        WebElement Login=driver.findElement(By.linkText("Register"));
        Login.click();
    }
    protected static String RandomName(){
        String SALTCHAR="abcdefAbcdef1234";
        StringBuilder salt=new StringBuilder();
        Random rnd=new Random();

        while (salt.length()<5){
            int index=(int)(rnd.nextFloat()*SALTCHAR.length());
            salt.append(SALTCHAR.charAt(index));
        }
        String saltStr=salt.toString();
        return saltStr;
    }

    public static void TC_Valid_Registration(){
        String Email=RandomName().concat("@yahoo.com");
        String FirstName=RandomName();
        String LastName=RandomName();

        WebElement firstname= driver.findElement(By.name("firstname"));
        firstname.sendKeys(FirstName);

        WebElement lastname= driver.findElement(By.name("lastname"));
        lastname.sendKeys(LastName);

        WebElement email= driver.findElement(By.name("email"));
        email.sendKeys(Email);

        WebElement telephone= driver.findElement(By.name("telephone"));
        telephone.sendKeys("01677520375");

        WebElement password= driver.findElement(By.name("password"));
        password.sendKeys("12345");

        WebElement con_password= driver.findElement(By.name("confirm"));
        con_password.sendKeys("12345");

        WebElement agree_btn= driver.findElement(By.name("agree"));
        agree_btn.click();

        WebElement con_btn= driver.findElement(By.cssSelector("#content > form > div > div > input.btn.btn-primary"));
        con_btn.click();
    }
}
