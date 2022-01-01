package FindsElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FindElementByXPath {
    ChromeDriver driver;

    @BeforeTest
    public void OpenURL() {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Engab\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("https://the-internet.herokuapp.com/login");
    }

    @Test
    public void FindElementxPath(){
        WebElement usernametxt = driver.findElement(By.xpath("//*[@id=\"username\"]"));
        WebElement passwordtxt = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        WebElement Loginbtn = driver.findElement(By.xpath("//*[@id=\"login\"]/button"));

        usernametxt.sendKeys("tomsmith");
        passwordtxt.sendKeys("SuperSecretPassword!");
        Loginbtn.click();
    }

   /*@AfterTest
    public void closeDriver(){
        driver.quit();
    }*/


}
