package workingWithElements;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestMultipleWindows {
    ChromeDriver driver;

    @BeforeTest
    public void OpenURL() {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Engab\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("http://cookbook.seleniumacademy.com/Config.html");

    }
    @Test
    public void testWindowUsingName(){
        // Store windowHandle of parant window
        String parentWindowID = driver.getWindowHandle();

        driver.findElement(By.id("helpbutton")).click();

        driver.switchTo().window("HelpWindow");

        Assert.assertEquals("Help",driver.getTitle());

        System.out.println(driver.getTitle());

        driver.close();

        driver.switchTo().window(parentWindowID);
    }
}
