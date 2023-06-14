package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class BaseTest {
    public static WebDriver driver;

    @BeforeClass
    public void SetUp(){
        WebDriverManager.edgedriver().setup();
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
        driver = new EdgeDriver(edgeOptions);
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterTest
    void tearDown(){
        driver.quit();
    }
}
