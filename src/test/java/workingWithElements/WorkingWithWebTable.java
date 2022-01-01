package workingWithElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.List;

public class WorkingWithWebTable {
    ChromeDriver driver;

    @BeforeTest
    public void OpenURL() {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Engab\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        //driver.manage().window().fullscreen();
        driver.navigate().to("https://the-internet.herokuapp.com/");

        WebElement webTable = driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[41]/a"));
        webTable.click();

    }
    @Test
    public void testWebTable(){
        WebElement table = driver.findElement(By.id("table1"));

        //get all rows
        List<WebElement> rows = table.findElements(By.tagName("tr"));
        Assert.assertEquals(5,rows.size());

        //get all cells
        for (WebElement row : rows) {
            List<WebElement> cols = row.findElements(By.tagName("td"));
            for (WebElement col: cols) {
                System.out.println(col.getText());
            }
            System.out.println();
        }
    }
}
