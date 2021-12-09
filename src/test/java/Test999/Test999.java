package Test999;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Test999 {
        private WebDriver driver;

        @Before
        public void setUp() {
            System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
            driver = new ChromeDriver();
            driver.get("https://999.md");
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        }
    @Test
    public void logIn() {
        WebElement logIn = driver.findElement(By.xpath("//a[@rel='nofollow' and contains (text(),'вход')]"));
        logIn.click();

        WebElement loginField = driver.findElement(By.xpath("//input[@name='login']"));
        loginField.click();
        loginField.sendKeys("jul.len.ko336@gmail.com");

        WebElement passwordField = driver.findElement(By.xpath("//input[@name='password']"));
        passwordField.click();
        passwordField.sendKeys("lovestory152");

        WebElement loginButton = driver.findElement(By.xpath("//button[@class='login__form__footer__submit']"));
        loginButton.click();

    }

    @Test
    public void searching999() {
        WebElement search = driver.findElement(By.id("js-search-input"));
        search.click();
        search.sendKeys("Apartament pe ore", Keys.ENTER);

        WebElement apartament = driver.findElement(By.partialLinkText("apartament"));
        apartament.click();


    }
    @Test
    public void chooseCategory() {
            WebElement category = driver.findElement(By.linkText("Недвижимость"));
            category.click();
            WebElement apartment = driver.findElement(By.linkText("1-комн. квартиры"));
            apartment.click();
    }
        @After
        public void tearDown(){
            driver.quit();
        }
}
