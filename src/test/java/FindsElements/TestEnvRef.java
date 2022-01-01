package FindsElements;

import org.openqa.selenium.chrome.ChromeDriver;

public class TestEnvRef {



    public static void main(String[] args) {

           ChromeDriver driver;

            System.setProperty("webdriver.chrome.driver",
                    "C:\\Users\\Engab\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.navigate().to("http://www.google.com");

    }

}
