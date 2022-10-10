import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CompanyHouseTest {
    @Test
    public void companyHouseTest() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.companyhouse.de/register");

        driver.findElement(By.cssSelector("[type='checkbox']")).click();
        driver.findElement(By.cssSelector("[value='Mr']")).click();

        driver.findElement(By.id("register-form-firstname")).sendKeys("John");

        driver.findElement(By.id("register-form-name")).sendKeys("Davis");

        driver.findElement(By.id("register-form-email")).sendKeys("companyhousetest@gmail.com");

        driver.findElement(By.id("register-form-password")).sendKeys("test1234");

        driver.findElement(By.className("password-toggle")).click();

        driver.findElement(By.className("button-basic button-action button-modal button-large-width")).click();










    }
}
