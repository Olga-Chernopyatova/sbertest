package steps;

import org.junit.AfterClass;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.yandex.qatools.allure.annotations.Attachment;

import java.util.concurrent.TimeUnit;

public class BaseSteps {

    private static WebDriver driver;

    public static WebDriver getDriver()  {return driver;}

    @Before
    public void StartScenario() {
        System.setProperty("webdriver.gecko.driver", "drv/geckodriver2.exe");
        driver = new FirefoxDriver();
        driver.get("http://www.sberbank.ru/ru/person");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
    }

    @AfterClass
    public static void afterMethod() {driver.quit(); }

    @Attachment (type = "image/png", value = "Screensjot")
    public static byte[] takeScreenshot() {return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);}
}
