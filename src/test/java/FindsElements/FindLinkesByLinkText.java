package FindsElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FindLinkesByLinkText {

    ChromeDriver driver;

    @BeforeTest
    public void OpenURL() {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Engab\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("https://the-internet.herokuapp.com/login");
    }
    @Test
    public void testlinktext(){
        WebElement link = driver.findElement(By.linkText("Elemental Selenium"));
        System.out.println(link.getAttribute("href"));
        link.click();
    }

   /* @AfterTest
    public void closeDriver(){
        driver.quit();
    }*/
}
