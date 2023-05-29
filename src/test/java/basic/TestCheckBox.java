package basic;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestCheckBox {

    @Test
    public void testCheckBox() {

        // create webdriver
        WebDriver driver = new ChromeDriver();

        driver.get("http://codetoautomate.com/educative-selenium-demo/");

        JavascriptExecutor jsDriver = (JavascriptExecutor) driver;

        jsDriver.executeScript("document.getElementById('checked').scrollIntoView(true);");

        WebElement checked = driver.findElement(By.id("checked"));

        // assert that if it's already selected
        assertFalse(checked.isSelected());

        checked = driver.findElement(By.id("checked"));
        checked.click();

        checked = driver.findElement(By.id("checked"));

        // assert that if it's already selected
        assertTrue(checked.isSelected());

        driver.close();
    }
}
