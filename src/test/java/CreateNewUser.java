import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CreateNewUser {
    WebDriver driver;
    WebElement element;

    @Before("@Test")
    public void setUp() {

        driver = new FirefoxDriver();
        driver.manage().window().fullscreen(); //browser goes to full screen
    }
}
