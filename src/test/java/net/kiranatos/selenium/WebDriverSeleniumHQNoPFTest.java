package net.kiranatos.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WebDriverSeleniumHQNoPFTest {
    Demo01 demo;
    
    @BeforeMethod(alwaysRun = true)
    public void browserSetup() {
        demo = new Demo01();
        demo.initDriver();
    }

    @Test(description = "some description")
    public void searchTest() {
        Assert.assertTrue(demo.searchResult() > 0, "Search results are empty!");
    }

    @AfterMethod(alwaysRun = true)
    public void browserTearDown() {
        demo.quit();
    }
}