import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class LogIn extends SetUp {
@Test (priority = 0, description = "get login page")
    public void logIn(){
        driver.get("https://softexpo.com.bd/visitor/login");
    }
    @Test(priority = 1, description = "login into the webpage")
    public void userLogin()
    {
        List<WebElement> enterEmail = driver.findElements(By.className("form-control"));
        enterEmail.get(0).sendKeys("etumahmuda@gmail.com");
        List<WebElement> enterPass = driver.findElements(By.className("form-control"));
        enterPass.get(1).sendKeys("123456");
        List<WebElement> submitBtn = driver.findElements(By.className("default-btn"));
        submitBtn.get(7).sendKeys(Keys.ENTER);
    }
    @Test (priority = 2, description = "get Event Page")
    public void getEventPage(){
        List<WebElement> clickOnHomePage =  driver.findElements(By.className("nav-link"));
        clickOnHomePage.get(8).sendKeys(Keys.ENTER);

    }
}
