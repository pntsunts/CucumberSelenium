package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }
    By Email = By.id("Email");
    By PassWord = By.id("Password");
    By LoginButton = By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button");

    By LogoutButton = By.xpath("//*[@id=\"navbarText\"]/ul/li[3]/a");

    public void SetEmail(String mail){

        driver.findElement(Email).clear();
        driver.findElement(Email).sendKeys(mail);
    }
    public void SetPassword(String Pass){
        driver.findElement(PassWord).clear();
        driver.findElement(PassWord).sendKeys(Pass);
    }
    public void Log(){
        driver.findElement(LoginButton).click();
    }

    public void Logout(){
        driver.findElement(LogoutButton).click();
    }
}
