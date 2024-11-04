package steps;

import Helpers.DropDownMenus;
import Helpers.Locators;
import Helpers.TextFieldsLocators;
import Helpers.TextInputs;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

/**
 * This class contains all the fields
 * that are needed to be completed a new user registration
 */

public class RegistrationSteps {

    WebDriver driver;
    WebElement element;
    private String title;

    @Before("@Test")
    public void setUp() {
        driver = new FirefoxDriver();
        driver.manage().window().fullscreen(); //browser goes to full screen
    }

    @When("the suer is on the home page")
    public void theSuerIsOnTheHomePage() {
        driver.get(Locators.URL);
    }

    @When("user clicks on the Join now button")
    public void userClicksOnTheJoinNowButton() {
        element = driver.findElement(By.xpath(Locators.LOGIN_BTN));
        element.click();
    }

    //if this assert fail, the test will fail
    @Then("user verifies that he is on the homepage")
    public void userVerifiesThatHeIsOnTheHomepage() {
        driver.get(Locators.REGISTRATION_PAGE);
        title = driver.getTitle();
        Assert.assertEquals(title, Locators.REGISTRATION_PAGE_TITLE);
    }

    @And("the user fills in details in the About you section")
    public void theUserFillsInDetailsInTheAboutYouSection() {
        //title
        element = driver.findElement(By.id(DropDownMenus.ABOUT_YOU_TITLE));
        element.click();
        element = driver.findElement(By.xpath(DropDownMenus.ABOUT_YOU_TITLE_VALUE));
        element.click();

        //first name
        element = driver.findElement(By.id(TextFieldsLocators.FIRST_NAME_FIELD));
        element.click();
        element.sendKeys(TextInputs.USER_FIRST_NAME_FIELD);

        //last name
        element = driver.findElement(By.xpath(TextFieldsLocators.LAST_NAME_FIELD));
        element.click();
        element.sendKeys(TextInputs.USER_LAST_NAME_FIELD);

        //day of birth
        element = driver.findElement(By.id(DropDownMenus.DATE_DAY_OF_BIRTH));
        element.click();
        element = driver.findElement(By.xpath(DropDownMenus.DATE_DAY));
        element.click();

        //month of birth
        element = driver.findElement(By.id(DropDownMenus.DATE_MONTH_OF_BIRTH));
        element.click();
        element = driver.findElement(By.xpath(DropDownMenus.DATE_MONTH));
        element.click();

        //year of birth
        element = driver.findElement(By.id(DropDownMenus.DATE_YEAR_OF_BIRTH));
        element.click();
        element = driver.findElement(By.xpath(DropDownMenus.DATE_YEAR));
        element.click();

        //email
        element = driver.findElement(By.cssSelector(TextFieldsLocators.EMAIL_FIELD));
        element.click();
        element.sendKeys(TextInputs.USER_MAIL);

        //phone text field
        element = driver.findElement(By.cssSelector(TextFieldsLocators.PHONE_FIELD));
        element.click();
        element.sendKeys(TextInputs.PHONE_INPUT_NUMBER);

        //mobile phone
        element = driver.findElement(By.cssSelector(TextFieldsLocators.MOBILE_PHONE_FIELD));
        element.click();
        element.sendKeys(TextInputs.PHONE_INPUT_NUMBER);
    }

    @And("the user fills in details in the Address details section")
    public void theUserFillsInDetailsInTheAddressDetailsSection() {
        //address line 1
        element = driver.findElement(By.cssSelector(TextFieldsLocators.ADDRESS_LINE_ONE));
        element.click();
        element.sendKeys(TextInputs.USER_ADDRESS);

        //city
        element = driver.findElement(By.cssSelector(TextFieldsLocators.CITY_TEXT_FIELD));
        element.click();
        element.sendKeys(TextInputs.USER_CITY_INPUT);

        //county
        element = driver.findElement(By.cssSelector(TextFieldsLocators.COUNTY_FIELD));
        element.click();
        element.sendKeys(TextInputs.USER_COUNTY_INPUT);

        //postal code
        element = driver.findElement(By.cssSelector(TextFieldsLocators.POSTAL_CODE_FIELD));
        element.click();
        element.sendKeys(TextInputs.USER_POST_CODE_INPUT);

        //country
        element = driver.findElement(By.id(DropDownMenus.COUNTRY_DROP_DOWN));
        element.click();
        element = driver.findElement(By.cssSelector(DropDownMenus.COUNTRY_SELECTION));
        element.click();
    }
}