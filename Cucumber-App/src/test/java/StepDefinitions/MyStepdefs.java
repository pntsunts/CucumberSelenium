package StepDefinitions;

import Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyStepdefs {

    public static WebDriver webDriver;

    public LoginPage Logs;
    @Given("User launch Chrome driver")
    public void userLaunchChromeDriver() {
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
    }

    @When("User open URL {string}")
    public void userOpenURL(String URL) {
        webDriver.navigate().to(URL);
        Logs = new LoginPage(webDriver);
    }

    @And("User Enters Email as {string} and Password as {string}")
    public void userEntersEmailAsAndPasswordAs(String Email, String Password) {
        Logs.SetEmail(Email);
        Logs.SetPassword(Password);
    }

    @And("User clicks Login")
    public void userClicksLogin() {
        Logs.Log();
    }

    @Then("Page Title should be {string}")
    public void pageTitleShouldBe(String Title) {
        if (webDriver.getPageSource().contains("Login was unsuccessful")){
            webDriver.close();
            Assert.assertTrue(false);
        }
        else {
            Assert.assertEquals(Title, webDriver.getTitle());
        }
    }

    @When("User clicks logs out")
    public void userClicksLogsOut() {
        Logs.Logout();
    }

    @And("Close Browser")
    public void closeBrowser() {
    }
}
