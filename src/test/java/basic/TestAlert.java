package basic;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TestAlert {

    @Test
    public void testAlert() {

        WebDriver driver = new ChromeDriver();

        driver.get("http://codetoautomate.com/educative-selenium-demo/");

        // click alert button
        driver.findElement(By.id("alert-button")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Wait for the alert to be displayed and switch to the alert popup
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());

        alert.dismiss();

        driver.close();
    }
}
