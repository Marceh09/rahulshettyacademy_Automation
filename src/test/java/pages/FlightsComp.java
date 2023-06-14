package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FlightsComp extends Base{

    // Locators menu page
    By flightsBtn = By.cssSelector("li[rel='book']");
    By flightText = By.cssSelector("a[title='Flights'] span[class='text-label']");

    By HotelsBtn = By.cssSelector("li[rel='mySpiceTrip']");
    By HotelText = By.cssSelector("a[title='Hotels'] span[class='text-label']");

    By flightStatusBtn = By.cssSelector("li[class='flight_status'] a[disabled='disabled']");

    By CheckInBtn = By.xpath("//span[contains(text(), 'Check-In')]");

    By manageBookingBtn = By.xpath("//span[contains(text(), 'Manage Booking')]");

    //Radios button group locators
    By radioBtnOneWay = By.id("ctl00_mainContent_rbtnl_Trip_0");
    By radioBtnNameOneWay = By.cssSelector("label[for='ctl00_mainContent_rbtnl_Trip_0']");

    By radioBtnRoundTrip = By.id("ctl00_mainContent_rbtnl_Trip_1");
    By radioBtnNameRoundTrip = By.cssSelector("label[for='ctl00_mainContent_rbtnl_Trip_1']");

    By radioBtnMultiCity = By.id("ctl00_mainContent_rbtnl_Trip_2");
    By radioBtnNameMultiCity = By.cssSelector("label[for='ctl00_mainContent_rbtnl_Trip_1']");

    //LOCATORS FLIGHTS
    //From locators
    By fromOption = By.id("ctl00_mainContent_ddl_originStation1_CTXT");
    By listFromOption = By.cssSelector("div[class='dropdownDiv']>ul >li");
    By isFromCitySelected = By.name("ctl00_mainContent_ddl_originStation1_CTXT");

    //To locators
    By toOption = By.id("ctl00_mainContent_ddl_destinationStation1_CTXTaction");
    By listToOption = By.cssSelector("div[class='dropdownDiv']>ul >li");
    By isCityToSelected = By.name("ctl00_mainContent_ddl_destinationStation1_CTXT");

    //departure locators
    By departDateOption = By.id("ctl00_mainContent_view_date1");
    By departSelectDay = By.cssSelector("td[data-handler='selectDay'] >a");
    By isDepartSelectDay = By.name("ctl00$mainContent$view_date1");

    //return locators
    By returnDate = By.id("ctl00_mainContent_view_date2");
    By returnSelectDay = By.cssSelector("table[class='ui-datepicker-calendar'] >tbody >tr >td");
    By isReturnSelectDay = By.name("ctl00$mainContent$view_date2");

    //passengers locators
    By passengersOption = By.id("divpaxinfo");
    By addPassengersSelect = By.id("hrefIncAdt");
    By removePassengerSelect = By.id("hrefDecAdt");
    By doneBtn = By.id("btnclosepaxoption");
    By isPassengerSelect = By.id("divpaxinfo");

    //currency locators
    By currencyOption = By.id("ctl00_mainContent_DropDownListCurrency");
    By currencySelect = By.xpath("//option[contains(text(), 'USD')]");
    By isCurrentSelect = By.name("ctl00$mainContent$DropDownListCurrency");
    
    // search button locator
    By searchBtn = By.id("ctl00_mainContent_btn_FindFlights");

    //Builder
    public FlightsComp(WebDriver driver) {
        super(driver);
    }

    //Locators access Methods
    public void clickFlightsBtn() {
        click(flightsBtn);
    }

    public By getFlightText() {
        return flightText;
    }

    public By getHotelsBtn() {
        return HotelsBtn;
    }

    public By getHotelText() {
        return HotelText;
    }

    public By getFlightStatusBtn() {
        return flightStatusBtn;
    }

    public By getCheckInBtn() {
        return CheckInBtn;
    }

    public By getManageBookingBtn() {
        return manageBookingBtn;
    }

    public By getRadioBtnOneWay() {
        return radioBtnOneWay;
    }

    public By getRadioBtnNameOneWay() {
        return radioBtnNameOneWay;
    }

    public By getRadioBtnRoundTrip() {
        return radioBtnRoundTrip;
    }

    public By getRadioBtnNameRoundTrip() {
        return radioBtnNameRoundTrip;
    }

    public By getRadioBtnMultiCity() {
        return radioBtnMultiCity;
    }

    public By getRadioBtnNameMultiCity() {
        return radioBtnNameMultiCity;
    }

    public void clickFromOption() {
        click(fromOption);
    }

    public List<WebElement> getListFromOption() {
        return findElements(listFromOption);
    }

    public boolean isCityFromSelected(){
        return isDisplayed(isFromCitySelected);
    }

    public By getToOption() {
        return toOption;
    }

    public List<WebElement> getListToOption() {
        return findElements(listToOption);
    }

    public boolean isCityToSelected(){
        return isDisplayed(isCityToSelected);
    }
    public By getDepartDateOption() {
        return departDateOption;
    }

    public List<WebElement> getDepartSelectDay() {
        return findElements(departSelectDay);
    }

    public boolean isDepartSelectDay(){
        return isDisplayed(isDepartSelectDay);
    }

    public void clickReturnDate() {
        click(returnDate);
    }

    public List<WebElement> getReturnSelectDay() {
        return findElements(returnSelectDay);
    }

    public boolean isReturnSelectDay(){
        return isDisplayed(isReturnSelectDay);
    }

    public By getPassengersOption() {
        return passengersOption;
    }

    public By getAddPassengersSelect() {
        return addPassengersSelect;
    }

    //Method for add passengers
    public void addPassengersSelect() {
        click(passengersOption);
        wait(2);
        click(addPassengersSelect);
        wait(2);
        clickDoneBtn();
    }

    //Method for remove passengers
    public void removePassengerSelect() {
        click(passengersOption);
        wait(2);
        click(removePassengerSelect);
        wait(2);
        clickDoneBtn();
    }

    public boolean isPassengerSelect() {
        return isDisplayed(isPassengerSelect);
    }

    public void clickDoneBtn() {
        click(doneBtn);
    }

    //Method for select currency
    public void selectCurrencyOption() {
        click(currencyOption);
        wait(2);
        click(currencySelect);
        wait(2);
    }

    public boolean isCurrentSelect() {
        return isDisplayed(isCurrentSelect);
    }

    public By getCurrencySelect() {
        return currencySelect;
    }

    public void clickSearchBtn() {
        click(searchBtn);
    }

}
