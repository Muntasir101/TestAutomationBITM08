package com.Navigation;

import com.Base.TestBase;
import org.openqa.selenium.By;

public class NavigationTest extends TestBase {
    public static void main(String[] args) throws InterruptedException {
        chrome_launch();
        openUrl("https://demo.opencart.com");
        navigationTo();
        navigationBack();
        navigationRefresh();
        navigationForward();
        chrome_close();
    }

    public static void navigationTo(){
        driver.navigate().to("https://google.com");
        System.out.println("Navigation To: "+driver.getTitle());
    }
    public static void navigationBack(){
        driver.navigate().back();
        System.out.println("Navigation Back: "+driver.getTitle());
    }
    public static void navigationRefresh() throws InterruptedException {
        driver.findElement(By.name("search")).sendKeys("Macbook");
        Thread.sleep(5000);
        driver.navigate().refresh();
    }
    public static void navigationForward(){
        driver.navigate().forward();
        System.out.println("Navigation Forward: "+driver.getTitle());
    }
}
