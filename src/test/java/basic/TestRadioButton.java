package basic;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
    "http://codetoautomate.com/educative-selenium-demo/"
 */
public class TestRadioButton {

    @Test
    public void testRadioButton() {

        // Create a webdriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the web page
        driver.get("http://codetoautomate.com/educative-selenium-demo/");

        // find the radio button with value 'Football' and click it
        // <input type="radio" name="sports" value="Football">
        // get the element above by xpath
        String value = "Football";
        driver.findElement(By.xpath("//input[@value='%s']".formatted(value))).click();

        // get element radio button submit and click it
        // <button id="radio-button-submit" onclick="displayRadioValue()">Print selected radio value</button>
        driver.findElement(By.id("radio-button-submit")).click();

        // get element by id 'result'
        WebElement result = driver.findElement(By.id("result"));

        // check the result, result should be the text 'Sports: Football'
        assertEquals("Sports: %s".formatted(value), result.getText().trim());

        // print result text for test
        System.out.println("result = " + result.getText());

        driver.close();
    }
}
