package com.BrowserSetup;

import com.Base.TestBase;

public class OpenWebsite extends TestBase {

    public static void main(String[] args) {
        firefox_launch();
        openUrl("file:///F:/Training/PeopleNTech/BITM Online 8/WebSite/Your Store.html");
       // firefox_close();

    }
//    public static void openUrl(){
//        driver.get("https://google.com");
//    }
}
