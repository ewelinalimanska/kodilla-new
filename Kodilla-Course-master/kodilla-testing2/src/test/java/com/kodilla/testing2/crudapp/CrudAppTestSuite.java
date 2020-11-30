package com.kodilla.testing2.crudapp;

import com.kodilla.testing.config.WebDriverConfig;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;

public class CrudAppTestSuite {

    private static final String BASE_URL = "https://ewelinalimanska.github.io/";
    private WebDriver driver;
    private Random generator;

    @Before
    public void initTest(){
        driver = WebDriverConfig.getDriver(WebDriverConfig.FIREFOX);
        driver.get(BASE_URL);
        generator = new Random();
    }

    @After
    public void cleanUpAfterTest(){
        driver.close();
    }

    private String createCrudAppTestTask() throws InterruptedException {

        final String XPATH_TASK_NAME = "/html/body/main/section[1]/form/fieldset[1]/input";
        final String XPATH_TASK_CONTENT = "/html/body/main/section[1]/form/fieldset[2]/textarea";
        final String XPATH_ADD_BUTTON = "/html/body/main/section[1]/form/fieldset[3]/button";

        String taskName = "Task name " + generator.nextInt(100000);
        String taskContent = taskName + " content";

        WebElement name = driver.findElement(By.xpath(XPATH_TASK_NAME));
        name.sendKeys(taskName);

        WebElement content = driver.findElement(By.xpath(XPATH_TASK_CONTENT));
        content.sendKeys(taskContent);

        WebElement addButton = driver.findElement(By.xpath(XPATH_ADD_BUTTON));
        addButton.click();
        Thread.sleep(2000);

        return taskName;
    }

    private void sendTaskTestToTrello(String taskName) throws InterruptedException {

        driver.navigate().refresh();

        while (!driver.findElement(By.xpath("//select[1]")).isDisplayed());

        driver.findElements(By.xpath("//form[@class=\"datatable_row\"]")).stream()
                .filter(anyForm ->
                        anyForm.findElement(By.xpath(".//p[@class=\"datatable_field-value\"]"))
                .getText().equals(taskName))
                .forEach(theForm ->
                {WebElement selectElement = theForm.findElement(By.xpath(".//select[1]"));
                    Select select = new Select(selectElement);
                    select.selectByIndex(1);

                    WebElement buttonCreateCard =
                            theForm.findElement(By.xpath(".//button[contains(@class, \"card-creation\")]"));
                    buttonCreateCard.click();
                });
        Thread.sleep(5000);
    }

    private void deleteTaskTest(String taskName) throws InterruptedException {

        driver.navigate().refresh();
        while (!driver.findElement(By.xpath("//select[1]")).isDisplayed());

        driver.findElements(By.xpath("//form[@class=\"datatable__row\"]")).stream()
                .filter(anyForm ->
                        anyForm.findElement(By.xpath(".//p[@class=\"datatable__field-value\"]"))
                                .getText().equals(taskName))
                .forEach(theForm -> {
                    WebElement deleteButton = theForm.findElement(By.xpath(".//div/fieldset/button[4]"));
                    deleteButton.click();
                });

        Thread.sleep(2000);
    }

    @Test
    public void shouldCreateTrelloCard() throws InterruptedException {

        String taskName = createCrudAppTestTask();
       // sendTaskTestToTrello(taskName);
        deleteTaskTest(taskName);
    }
}
