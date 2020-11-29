package com.kodilla.testing.facebook;

import com.kodilla.testing.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {

    public final static String XPATH_DAYFIELD = "//div[@class=\"_5k_5\"]/span/span/select[1]";
    public final static String XPATH_MONTHFIELD = "//div[@class=\"_5k_5\"]/span/span/select[2]";
    public final static String XPATH_YEARFIELD = "//div[@class=\"_5k_5\"]/span/span/select[3]";

    public static void main(String[] args) {
        WebDriver webDriver = WebDriverConfig.getDriver(WebDriverConfig.FIREFOX);
        webDriver.get("https://www.facebook.com/r.php?next=https%3A%2F%2Fwww.facebook.com%2Fpages%2Fcreate%2F%3Fref_type%3Dregistration_form&locale=pl_PL&display=page");

        while(!webDriver.findElement(By.xpath(XPATH_DAYFIELD)).isDisplayed());

        WebElement selectComboDay = webDriver.findElement(By.xpath(XPATH_DAYFIELD));
        Select selectDay = new Select(selectComboDay);
        selectDay.selectByIndex(12);

        WebElement selectComboMonth = webDriver.findElement(By.xpath(XPATH_MONTHFIELD));
        Select selectMonth = new Select(selectComboMonth);
        selectMonth.selectByIndex(11);

        WebElement selectComboYear = webDriver.findElement(By.xpath(XPATH_YEARFIELD));
        Select selectYear = new Select(selectComboYear);
        selectYear.selectByIndex(29);
    }
}
