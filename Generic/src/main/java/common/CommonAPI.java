package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public class CommonAPI {

    public static WebDriver driver = null;

    @BeforeMethod
    public void setUp() {
        // Setting up the chrome browser
        System.setProperty("webdriver.chrome.driver", "C:/Users/Shafi/IdeaProjects/StandardFramwork/Generic/src/main/java/driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
    }
    @AfterMethod
    public void cleanUp () {
        // close the chrome browser
        this.driver.close();


    }
}