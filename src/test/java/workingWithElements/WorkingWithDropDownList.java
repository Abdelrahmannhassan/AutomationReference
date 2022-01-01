package workingWithElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WorkingWithDropDownList {
    ChromeDriver driver;

    @BeforeTest
    public void OpenURL() {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Engab\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        //driver.manage().window().fullscreen();
        driver.navigate().to("https://the-internet.herokuapp.com/dropdown");
        System.out.println(driver.getCurrentUrl());

    }
    @Test
    public void testDropDownList(){
        //hena ba3ml find lel element 3ady using ID
        WebElement optionsList = driver.findElement(By.id("dropdown"));
        //hena option select mn selenium 3shan a2dar ashtghal 3la el dropdownlist
        Select selectoptions = new Select (optionsList);
        //bat2aked en mfehash duplicates
        Assert.assertFalse(selectoptions.isMultiple());
        //bat2aked en l drop down list feha 3 options bs
        Assert.assertEquals(3,selectoptions.getOptions().size());
        //3shan akhtar haga mn l dropdownlist
        selectoptions.selectByVisibleText("Option 1");
        //ha3ml assert 3shan ashof awl option mazbot wla la
        Assert.assertEquals("Option 1", selectoptions.getFirstSelectedOption().getText());
    }
}
