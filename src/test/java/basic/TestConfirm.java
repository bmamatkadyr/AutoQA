package basic;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TestConfirm {

    @Test
    public void testConfirm() {

        WebDriver driver = new ChromeDriver();

        driver.get("http://codetoautomate.com/educative-selenium-demo/");

        driver.findElement(By.id("confirm")).click();

        // Wait for the alert to be displayed and switch to the alert popup
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());

        // click ok
        alert.accept();

        // Click the element to activate the alert again
        driver.findElement(By.id("confirm")).click();

        alert = wait.until(ExpectedConditions.alertIsPresent());

        alert.dismiss();

        driver.close();
    }
}
