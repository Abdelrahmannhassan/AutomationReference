package workingWithElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WorkingWithSubmitMethod {
    ChromeDriver driver;

    @BeforeTest
    public void OpenURL() {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Engab\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        //driver.manage().window().fullscreen();
        driver.navigate().to("https://www.google.com/");
        System.out.println(driver.getCurrentUrl());

    }

    //class name = gLFyf gsfi
    @Test
    public void testsubmit() {
        WebElement txtSearch = driver.findElement
                (By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
        txtSearch.clear();
        txtSearch.sendKeys("Refaat Taha");
        txtSearch.submit();
    }
}
