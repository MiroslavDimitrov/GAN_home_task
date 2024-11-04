package Helpers;

/**
 * This class contains the URL to the login page
 * and the locator of the login button.
 */
public class Locators {
    public static final String URL = "https://moneygaming.qa.gameaccount.com/";
    public static final String REGISTRATION_PAGE = "https://moneygaming.qa.gameaccount.com/sign-up.shtml";
    public static final String REGISTRATION_PAGE_TITLE = "Join now to Play Online Casino Games - Free or Cash | MoneyGaming.com";
    public static final String LOGIN_BTN = "//a[@href='/sign-up.shtml']";
    public static final String TERMS_AND_CONDITIONS_CHECK = "label[for='map(terms)'].error[generated='true']";
    public static final String EXPECTED_MESSAGE = "This field is required";
    public static final String JOIN_NOW_BUTTON = "form";
}
