package Helpers;

/**
 * This class contains the locators of all text fields
 * on the registration form of the site.
 *
 */

public class TextFieldsLocators {
    public static final String FIRST_NAME_FIELD = "forename";
    public static final String LAST_NAME_FIELD = "//input[@name='map(lastName)']";
    public static final String EMAIL_FIELD = "input[name='map(email)']";
    public static final String PHONE_FIELD = "input[name='map(phone)'].required.telephoneNumber";
    public static final String MOBILE_PHONE_FIELD = "input[name='map(mobile)'].required.mobileNumber";
    public static final String ADDRESS_LINE_ONE = "input[name='map(address1)'].full.required";
}
