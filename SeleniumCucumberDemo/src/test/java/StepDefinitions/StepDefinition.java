package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepDefinition {

    public static WebDriver webDriver;
    @Given("User is on the Login page")
    public void userIsOnTheLoginPage() {
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.navigate().to("https://example.testproject.io/web/");
    }

    @When("^User enters (.*) and (.*)$")
    public void userEntersUsernameAndPassword(String name, String password) {
        System.out.println("Inside enter username and password");
        webDriver.findElement(By.id("name")).sendKeys(name);
        webDriver.findElement(By.id("password")).sendKeys(password);
    }

    @Then("User clicks login button")
    public void userClicksLoginButton() {
        System.out.println("Inside click log in button");
        webDriver.findElement(By.id("login")).click();
    }


}
