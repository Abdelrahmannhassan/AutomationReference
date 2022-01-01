package workingWithElements;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WorkingWithCheckBox {
    ChromeDriver driver;

    @BeforeTest
    public void OpenURL() {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Engab\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        //driver.manage().window().fullscreen();
        driver.navigate().to("https://the-internet.herokuapp.com/");

        WebElement Checkboxlink = driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[6]/a"));
        Checkboxlink.click();

    }
    @Test (enabled = false)
    public void testCheckboxs (){
        WebElement check1 = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]"));
        check1.click();
        WebElement check2 = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[2]"));
        if (check2.isSelected()){
            check2.click();
        }
        if (check1.isSelected()){
            System.out.println("selected successfully");
        }
    }

    @Test
    public void testElementPresent(){
        if (isElementPresent(By.xpath("//*[@id=\"checkboxes\"]/input[1]")))
        {
            WebElement check1 = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]"));
            if (!check1.isSelected()){
                check1.click();
            }

        }
        else{
            Assert.fail("Checkbox 1 doesn't exist");
        }

    }

    private boolean isElementPresent(By by){
        try {
            driver.findElement(by);
            return true;
        }
        catch (NoSuchElementException e){
                return false;
        }
    }
}
