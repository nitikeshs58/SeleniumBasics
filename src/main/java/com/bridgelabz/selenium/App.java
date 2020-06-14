package com.bridgelabz.selenium;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest
{
    //Test method to launch website and verify title
    @Test
    public void verifyWebsiteLaunch()
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        //To maximize browser window
        driver.manage().window().maximize();

        //Launching BridgeLabz Website
        driver.get("https://bridgelabz.com/");

        //Expected page Title
        String expectedPageTitle="IT Jobs in mumbai | Software Engineer Jobs in Bangalore | BridgeLabz";

        //Actual Page Title Received from browser
        String actualPageTitle=driver.getTitle().toString();

        System.out.println("Expected Title: "+expectedPageTitle);
        System.out.println("Actual Title: "+actualPageTitle);

        //Verifying Page Title
        assertEquals(expectedPageTitle,actualPageTitle);

        //Closing Browser
        driver.quit();
    }
}
