package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TestSelenium {

    public static WebElement waitForElementLocatedBy(WebDriver driver,By path){
        return new WebDriverWait(driver,Duration.ofSeconds(15)).until(ExpectedConditions.presenceOfElementLocated(path));
    }

    public static void main(String[] args) {
        try {
            // Set up ChromeDriver
//            System.setProperty("webdriver.chrome.driver", "path/to/chromedriver"); // Replace with actual path
            WebDriver chromeDriver = new ChromeDriver();
            chromeDriver.get("https://www.google.com");


//            new WebDriverWait(chromeDriver,Duration.ofSeconds(1)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='APjFqb']")));
//            By SearchBar = By.xpath("//*[@id='APjFqb']");
//            WebElement search_bar = chromeDriver.findElement(SearchBar);

//            WebElement search_bar = new WebDriverWait(chromeDriver,Duration.ofSeconds(1)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='APjFqb']")));

            WebElement search_bar = waitForElementLocatedBy(chromeDriver,By.xpath("//*[@id='APjFqb']"));

            search_bar.sendKeys("Akash Kumar Parida");
//            new WebDriverWait(chromeDriver,Duration.ofSeconds(15)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")));
//            WebElement search_button = chromeDriver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]"));

            WebElement search_button = waitForElementLocatedBy(chromeDriver,By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]"));

            search_button.click();
            Thread.sleep(2000);
//            chromeDriver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(3000));
//            new WebDriverWait(chromeDriver,Duration.ofSeconds(3000));
            chromeDriver.quit();

            // Set up SafariDriver
//            WebDriver safariDriver = new SafariDriver();
//            safariDriver.get("https://www.google.com");
//            Thread.sleep(2000);
//            safariDriver.quit();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}