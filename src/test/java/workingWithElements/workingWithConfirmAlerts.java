package workingWithElements;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class workingWithConfirmAlerts {
    ChromeDriver driver;

    @BeforeTest
    public void OpenURL() {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Engab\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("http://cookbook.seleniumacademy.com/Alerts.html");

    }
    @Test
    public void testConfirmAlertConfirm(){
        WebElement Confrimbtn = driver.findElement(By.id("confirm"));
        Confrimbtn.click();

        Alert alert = driver.switchTo().alert();
        alert.accept();

        WebElement message = driver.findElement(By.id("demo"));
        Assert.assertEquals("You Accepted Alert!",message.getText());
    }
}
