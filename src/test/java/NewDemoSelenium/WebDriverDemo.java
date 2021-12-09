package NewDemoSelenium;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.fail;

public class WebDriverDemo {
    private WebDriver driver;
    private String baseUrl;
    private StringBuffer verificationError = new StringBuffer();

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        driver = new ChromeDriver();
        baseUrl = "https://www.google.com";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    @Test
    public void testGoogle() throws Exception {
        driver.get(baseUrl + "/");

        driver.findElement(By.xpath("//div[@class='jyfHyd' and contains(text(), 'I agree')]")).click();

        driver.findElement(By.name("q")).sendKeys("StepIt");
        driver.findElement(By.name("btnK")).click();
        TimeUnit.SECONDS.sleep(5);

        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String path = "/Users/yuliyakozhulenko/IdeaProjects/seleniumDemo/src/Screenshots/screenshot.png";
        FileUtils.copyFile(file, new File(path));
        System.out.println("Test completed");

    }
//    @After
//    public void tearDown() {
//        driver.quit();
//        String verificationErrorString = verificationError.toString();
//        if (!"".equals(verificationErrorString)) {
//            fail(verificationErrorString);
//        }
//    }
}
