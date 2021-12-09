package HwHtmlcCss;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class MainPage {
    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("https:yuliyakozhulenko.github.io/HTML-CSS-Project");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test
            public void testHtml() {

        WebElement link1 = driver.findElement(By.xpath("//a[contains(text(),'Мануальное тестирование')]"));
        WebElement link2 = driver.findElement(By.xpath("//a[contains(text(),'Теория Баз Данных - SQL')]"));
        WebElement link3 = driver.findElement(By.xpath("//a[contains(text(),'Основы разработки веб-страниц - HTML+CSS')]"));
        WebElement link4 = driver.findElement(By.xpath("//a[contains(text(),'STEP IT Academy')]"));


        link1.click();
        link2.click();
        link3.click();
        link4.click();
    }
    @After
    public void tearDown(){
        driver.quit();
    }
}
