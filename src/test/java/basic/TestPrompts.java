package basic;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TestPrompts {

    @Test
    public void testPrompt() {

        WebDriver driver = new ChromeDriver();

        driver.get("http://codetoautomate.com/educative-selenium-demo/");

        driver.findElement(By.id("prompt")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());

        alert.sendKeys("Beksultan");

        alert.accept();

        // get value
        System.out.println("result = " + driver.findElement(By.id("demo")).getText());

        driver.close();
    }
}
