import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class LogIn extends SetUp {
@Test (priority = 0, description = "get login page")
    public void logIn() throws InterruptedException{
        driver.get("https://softexpo.com.bd/visitor/login");
        Thread.sleep(2000);
    }
    @Test(priority = 1, description = "login into the webpage")
    public void userLogin() throws InterruptedException
    {
        List<WebElement> enterEmail = driver.findElements(By.className("form-control"));
        enterEmail.get(0).sendKeys("etumahmuda@gmail.com");
        Thread.sleep(1000);
        List<WebElement> enterPass = driver.findElements(By.className("form-control"));
        enterPass.get(1).sendKeys("123456");
        Thread.sleep(1000);
        List<WebElement> submitBtn = driver.findElements(By.className("default-btn"));
        submitBtn.get(7).sendKeys(Keys.ENTER);
        Thread.sleep(2000);
    }
    @Test (priority = 2, description = "get Event Page")
    public void getEventPage() throws InterruptedException{
        List<WebElement> clickOnEvent =  driver.findElements(By.className("nav-link"));
        clickOnEvent.get(8).sendKeys(Keys.ENTER);
        Thread.sleep(2000);
    }

    @Test (priority = 3, description = "select an event and register")
    public void selectAnEvent() throws InterruptedException{
        List<WebElement> selectEvent =  driver.findElements(By.className("events-card-bg"));
        selectEvent.get(3).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//button[@id='register_now_btn_confirm']")).sendKeys(Keys.ENTER);
//        List<WebElement> registerBtn = driver.findElements(By.className("regis-btn"));
//        registerBtn.get(0).sendKeys(Keys.ENTER);
        Thread.sleep(3000);

        Alert alert = driver.switchTo().alert();
        String message = alert.getText();
        System.out.println("Confirmation message: " + message);
        alert.accept();
        Thread.sleep(5000);
    }

}
