package workingWithElements;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WorkingWithJsAlert {
    ChromeDriver driver;

    @BeforeTest
    public void OpenURL() {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Engab\\Desktop\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("http://cookbook.seleniumacademy.com/Alerts.html");

    }
    @Test
    public void testAlert(){
        WebElement btnalert = driver.findElement(By.id("simple"));
        btnalert.click();

        //hena ana selenium bikhalene at7kem fel alert el bitla3
        Alert alert = driver.switchTo().alert();

        //w bakhod el text el bttla3 bahotha fe string 3shan hakaren beha b3den
        String AlertName = alert.getText();

        //bakaren bel text el sheltha fe sting hena b2a
        Assert.assertEquals("Hello! I am an alert box!",AlertName);

        /*b3d ma hawelt el alert el tel3le le alert a2dar astkhdmo be selenium a2dar astkhdm functions zy accept enha
        tdos Ok lel alert y3ne*/
        alert.accept();

    }
}
