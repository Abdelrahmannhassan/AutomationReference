package workingWithElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WorkingWithDoubleClick {
    ChromeDriver driver;

    @BeforeTest
    public void OpenURL() {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Engab\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("http://cookbook.seleniumacademy.com/DoubleClickDemo.html");


    }
    @Test
    public void DoubleClicktest(){
        WebElement area = driver.findElement(By.id("message"));

        System.out.println("color before is: " + area.getCssValue("background-color"));

        Actions builder = new Actions(driver);
        builder.doubleClick(area).perform();

        System.out.println("color After is: " + area.getCssValue("background-color"));
    }
}
