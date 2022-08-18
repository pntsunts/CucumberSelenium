package StepDefinitions;

import io.cucumber.java.en.And;
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
        webDriver.findElement(By.id("login")).click();
    }

    @And("User clicks login button")
    public void userClicksLoginButton() {

        webDriver.findElement(By.id("country")).sendKeys("South africa");
        webDriver.findElement(By.id("address")).sendKeys("876 kgotsong Street");
        webDriver.findElement(By.id("email")).sendKeys("peter@gmail.com");
        webDriver.findElement(By.id("phone")).sendKeys("078 647 2252");
        webDriver.findElement(By.id("save")).click();
    }


    @Then("User Logs out")
    public void userLogsOut() {
        webDriver.findElement(By.id("logout")).click();

    }
}
