package StepDefinitions;

import Utilities.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import Utilities.Driver;

import java.util.concurrent.TimeUnit;

public class LoginSteps {
    WebDriver driver;



    @Given("^Navigate to aoutomationpractice$")
    public void navigate_to_aoutomationpractice()  {

        driver = Driver.getDriver();
        driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
        driver.get("http://automationpractice.com/index.php ");
        driver.manage().window().maximize();

    }

    @When("^Click on sing button and enter the username and password\"([^\"]*)\"$")
    public void click_on_sing_button_and_enter_the_username_and_password(String arg1) throws Throwable {

        WebElement signIn = driver.findElement(By.cssSelector(".login"));
        signIn.click();

        WebElement email = driver.findElement(By.cssSelector("#email"));
        email.sendKeys("doganaykurt@gmail.com");

        WebElement password = driver.findElement(By.id("passwd"));
        password.sendKeys(arg1);

    }

    @Then("^User should login successfully$")
    public void user_should_login_successfully()  {

        WebElement singInButton = driver.findElement(By.id("SubmitLogin"));
        singInButton.click();

    }


}
