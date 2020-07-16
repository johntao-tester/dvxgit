package steps;

import cucumber.api.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicValidationSteps {
    WebDriver driver;
    @Given("^the user is on the MeetUp Homepage$")
    public void the_user_is_on_the_MeetUp_amepage()  {
        // Write code here that turns the phrase above into concrete actions
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.meetup.com/");
    }

    @Then("^the title should be \"([^\"]*)\"$")
    public void the_title_should_be(String expectedTitle)  {
        // Write code here that turns the phrase above into concrete actions
        String actualTitle = driver.getTitle();

        Assert.assertEquals(expectedTitle, actualTitle);
        driver.close();
    }
}
