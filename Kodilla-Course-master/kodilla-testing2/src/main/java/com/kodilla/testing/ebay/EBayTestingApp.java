package com.kodilla.testing.ebay;

import com.kodilla.testing.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EBayTestingApp {

    public static void main(String[] args) {

        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.ebay.com");

        WebElement searchField = driver.findElement(By.className("gh-tb ui-autocomplete-input"));
        searchField.sendKeys("Laptop");
        searchField.submit();
    }
}
