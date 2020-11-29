package com.kodilla.testing.google;

import com.kodilla.testing.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleTestingApp {

    public static  final  String SEARCHFIELD = "gLFyf gsfi";

    public static void main(String[] args) {

        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.FIREFOX);
        driver.get("https://www.google.com");

        WebElement searchField = driver.findElement(By.className("gLFyf gsfi"));
        searchField.sendKeys("Kodilla");
        searchField.submit();
    }
}
