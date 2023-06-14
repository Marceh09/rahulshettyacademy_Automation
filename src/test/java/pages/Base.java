package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.time.Duration;
import java.util.List;

public class Base {
    //Object WebDriver
    protected WebDriver driver;

    //Builder
    //parameter->object WebDriver
    public Base(WebDriver driver) {
        this.driver = driver;
    }

    //Wrapping of Methods selenium
    public WebElement findElement(By locator) {
        return driver.findElement(locator);
    }

    public void click(By locator) {
        driver.findElement(locator).click();
    }

    public void click(WebElement element) {
        element.click();
    }

    public List<WebElement> findElements(By locator) {
        return driver.findElements(locator);
    }

    //Returns the element text passed as a parameter
    public String getText(WebElement element) {
        return element.getText();
    }

    //Returns the text of the element searched for through the locator
    public String getText(By locator) {
        return driver.findElement(locator).getText();
    }

    public void type(String inputText, By locator) {
        driver.findElement(locator).sendKeys(inputText);
    }

    //Method verifies if a certain element is present and displayed
    public Boolean isDisplayed(By locator) {
        try {
            return driver.findElement(locator).isDisplayed();
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }

    public void keys(){

    }

    //Waiting method
    public void wait(int time){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
    }
}
