package test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.FlightsComp;

import java.util.List;

public class FlightsTest extends BaseTest {

    static FlightsComp flights;

    @BeforeClass
    public void initPage(){
        flights = new FlightsComp(driver);
    }

    @Test
    public void selectFlight(){

        //Select Departure city
        flights.clickFromOption();
        List<WebElement> fromList = flights.getListFromOption();
        for (WebElement fromListOption : fromList) {
            if (fromListOption.getText().contains("Bangkok ")) {
                fromListOption.click();
                break;
            }
            Assert.assertTrue(flights.isCityFromSelected(), "Bangkok ");
        }

        //Select Arrival city
        List<WebElement> toList = flights.getListToOption();
        for (WebElement toListOption : toList) {
            if (toListOption.getText().contains("Chennai ")){
                toListOption.click();
                break;
            }
            Assert.assertTrue(flights.isCityToSelected(), "Chennai ");
        }

        //select Depart date
        List<WebElement> departDayList = flights.getDepartSelectDay();
        for (WebElement departSelectDayList : departDayList) {
            if (departSelectDayList.getText().equals("7")) {
                departSelectDayList.click();
                break;
            }
            Assert.assertTrue(flights.isDepartSelectDay(), "7");
        }

        //Select Return date
        flights.clickReturnDate();
        List<WebElement> returnDayList = flights.getReturnSelectDay();
        for (WebElement returnSelectDayList : returnDayList) {
            if (returnSelectDayList.getText().equals("22")) {
                returnSelectDayList.click();
                break;
            }
            Assert.assertTrue(flights.isReturnSelectDay(), "22");
        }

        //Method Select Passengers
        flights.addPassengersSelect();
        Assert.assertTrue(flights.isPassengerSelect(), "2");

        //Method Select Currency
        flights.selectCurrencyOption();
        Assert.assertTrue(flights.isCurrentSelect(), "USD");

        flights.clickSearchBtn();
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }
}
