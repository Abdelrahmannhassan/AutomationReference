package workingWithElements;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WorkingWithPromtAlert {
    ChromeDriver driver;

    @BeforeTest
    public void OpenURL() {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Engab\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("http://cookbook.seleniumacademy.com/Alerts.html");
    }
    @Test
    public void testPromtAlert (){
        WebElement btnpromt = driver.findElement(By.id("prompt"));
        btnpromt.click();
        //lazem ytgab m3 ay alert becouse he managed anything related to Alerts!
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("Injection");
        alert.accept();
        WebElement message = driver.findElement(By.id("prompt_demo"));
        Assert.assertEquals("Hello Injection! How are you today?", message.getText());
    }

}
