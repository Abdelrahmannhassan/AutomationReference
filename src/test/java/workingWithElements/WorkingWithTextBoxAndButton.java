package workingWithElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WorkingWithTextBoxAndButton {
    ChromeDriver driver;

    @BeforeTest
    public void OpenURL() {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Engab\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("https://the-internet.herokuapp.com/login");
    }

    @Test
    public void LoginScreen(){
        WebElement txtusername = driver.findElement(By.id("username"));
        WebElement txtpassword = driver.findElement(By.id("password"));
        WebElement btnlogin = driver.findElement(By.className("radius"));

        txtusername.clear();
        txtusername.sendKeys("tomsmith");

        txtpassword.clear();
        txtpassword.sendKeys("SuperSecretPassword!");

        btnlogin.click();

        WebElement SuccessNotification = driver.findElement(By.id("flash"));
        //System.out.println(SuccessNotification.getText());

        Assert.assertTrue(SuccessNotification.getText().contains("s"));
    }
}
