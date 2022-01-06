package net.kiranatos.selenium;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo01 {
    private String systemProperty = "webdriver.chrome.driver";
    private String pathBrowserDriver = "D:\\Java\\IDE\\WebDrivers\\chromedriver.exe";
    private WebDriver driver = new ChromeDriver();
    
    public WebDriver initDriver(){
        System.setProperty(systemProperty, pathBrowserDriver);
        return driver;
    }
    
    public void quit(){
        driver.quit();
    }
    
    public int searchResult(){
        driver.get("https://duckduckgo.com/");
        driver.manage().window().maximize();
        WebElement searchInput = driver.findElement(By.id("search_form_input_homepage"));
        searchInput.sendKeys("Dorohedoro");

        WebElement searchButton = driver.findElement(By.id("search_button_homepage"));
        searchButton.click();
        
        List<WebElement> list = driver.findElements(By.xpath("//*[@class=\"result results_links_deep highlight_d result--url-above-snippet\"]"));
        
        return list.size();    
    }
}
