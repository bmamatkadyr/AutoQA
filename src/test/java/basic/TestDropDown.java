package basic;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/*
    In this lesson, we will discuss the ways of handling dropdown and checkboxes using Selenium WebDriver.
    https://www.educative.io/module/page/El5jyzfgmYoNxkAE1/10370001/5699999346458624/6729864656977920
 */

// "http://codetoautomate.com/educative-selenium-demo/"
public class TestDropDown {

    @Test
    public void testDropDown() {

        WebDriver driver = new ChromeDriver();

        driver.get("http://codetoautomate.com/educative-selenium-demo/");

        // create Javascript executor object
        JavascriptExecutor jsDriver = (JavascriptExecutor) driver;

        // scroll down to the element
        jsDriver.executeScript("document.getElementById('my-select').scrollIntoView(true);");

        // select option
        Select select = new Select(driver.findElement(By.id("my-select")));

        // print all options // this is just for testing
        select.getOptions().forEach(option -> System.out.println(option.getText()));

        // select by value
        String value = "Banana";
        select.selectByValue(value);

        // click on the selected option button
        driver.findElement(By.id("select-button")).click();

        // verify the printed option = selected option
        WebElement result = driver.findElement(By.id("demo1"));
        assertEquals(result.getText().trim(), value);

        // select by index
        int index = 2;
        select.selectByIndex(index);

        // select by visible text
        String text = "Apple";
        select.selectByVisibleText(text);

        driver.close();
    }

    @Test
    public void testDropDownDeSelect() {

        WebDriver driver = new ChromeDriver();

        driver.get("http://codetoautomate.com/educative-selenium-demo/");

        // create Javascript executor object
        JavascriptExecutor jsDriver = (JavascriptExecutor) driver;

        // scroll down to the element
        jsDriver.executeScript("document.getElementById('my-select').scrollIntoView(true);");

        // get Select
        Select select = new Select(driver.findElement(By.id("my-select")));

        // select by value
        String value = "Banana";
        select.selectByValue(value);

        // and deselect
        select.deselectByValue(value);

        // click on the selected option button
        driver.findElement(By.id("select-button")).click();

        // verify the printed option = selected option
        WebElement result = driver.findElement(By.id("demo1"));
        assertTrue(result.getText().trim().isEmpty());

        // select and deselect by id and visible text
        select.selectByIndex(2);
        select.deselectByIndex(2);

        select.selectByVisibleText("Apple");
        select.deselectByVisibleText("Apple");

        driver.close();
    }

}
