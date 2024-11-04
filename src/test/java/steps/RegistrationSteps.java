package steps;

import Helpers.DropDownMenus;
import Helpers.Locators;
import Helpers.TextFieldsLocators;
import Helpers.TextInputs;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RegistrationSteps {

    WebDriver driver;
    WebElement element;

    @Before("@Test")
    public void setUp() {

        driver = new FirefoxDriver();
        driver.manage().window().fullscreen(); //browser goes to full screen
    }

    @When("the suer is on the home page")
    public void theSuerIsOnTheHomePage() {
        driver.get(Locators.URL);
        element = driver.findElement(By.xpath(Locators.LOGIN_BTN));
        element.click();
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
}
