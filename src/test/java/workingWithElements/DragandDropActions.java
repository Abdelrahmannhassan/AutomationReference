package workingWithElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class DragandDropActions {
    ChromeDriver driver;

    @BeforeTest
    public void OpenURL() {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Engab\\Desktop\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("http://cookbook.seleniumacademy.com/DragDropDemo.html");


    }
    @Test
    public void testDragAndDrop(){
        //source is for the thing that i will use to drag it
        WebElement source = driver.findElement(By.id("draggable"));

        //target is for the thing that will drop there what i drag
        WebElement target = driver.findElement(By.id("droppable"));

        //actions that provided by selenium allow me to do actions like drag and drop
        Actions builder = new Actions(driver);

        //here i have made a drag and drop
        builder.dragAndDrop(source,target).perform();

        //here i need to make sure that drag and drop made successfully
        Assert.assertEquals("Dropped!",target.getText());
    }
}
