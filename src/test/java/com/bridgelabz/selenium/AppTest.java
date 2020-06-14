package com.bridgelabz.selenium;
import static org.junit.Assert.assertEquals;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppTest {

    //Test method to launch website and verify title
    @Test
    public void verifyWebsiteLaunch() {

        //Initializing web driver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //To maximize browser window
        driver.manage().window().maximize();

        //Launching BridgeLabz Website
        driver.get("https://bridgelabz.com/");

        //Expected Page Title
        String expectedPageTitle="IT Jobs in Mumbai | Software Engineer Jobs in Bangalore | BridgeLabz";

        //Actual Page Title Received from browser
        String actualPageTitle = driver.getTitle().toString();
        System.out.println("Expected Title: " + expectedPageTitle);
        System.out.println("Actual Title: " + actualPageTitle);

        //Verifying Page Title
        assertEquals(expectedPageTitle, actualPageTitle);

        //closing browser
        driver.quit();
    }
}