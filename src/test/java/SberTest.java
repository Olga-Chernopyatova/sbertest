import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.yandex.qatools.allure.annotations.Title;
import steps.*;

import java.util.HashMap;

public class SberTest extends BaseSteps{


    @Test
    @Title("Страхование путешественников")
    public void testInsurance () {

        MainPageSteps mainPageSteps = new MainPageSteps();
        ConfirmSteps confirmSteps = new ConfirmSteps();
        InsuranceSteps insuranceSteps = new InsuranceSteps();
        SendAppSteps sendAppSteps= new SendAppSteps();

        HashMap<String, String> testData = new HashMap<>();


            testData.put("insured0_surname", "Ivanov");
            testData.put("insured0_name", "Ivan");
            testData.put("insured0_birthDate", "01.01.1983");
            testData.put("surname", "Петров");
            testData.put("name", "Петр");
            testData.put("middlename", "Петрович");
            testData.put("birthDate", "01.01.1983");
            testData.put("passport_series", "1111");
            testData.put("passport_number", "123456");
            testData.put("issueDate", "01.01.1985");
            testData.put("issuePlace", "Moscow");

            mainPageSteps.selectMenuItem("Застраховать себя");
            mainPageSteps.selectMenuInsurance("Страхование путешественников");

            ConfirmSteps.checkPageTitle("Страхование путешественников");
            ConfirmSteps.stepGoToInsurancePage();

            insuranceSteps.selectMenuCoverage();
            insuranceSteps.stepClickToBanner();
            insuranceSteps.stepSwitchToWindow();

            sendAppSteps.fillFields(testData);

            sendAppSteps.checkFillFields(testData);
            sendAppSteps.stepSubmitForm();
            sendAppSteps.checkErrorMessageField("Заполнены не все обязательные поля");

    }


    @Ignore
    public void testSber () {
        driver.get(baseUrl);
        driver.findElement(By.xpath("//div[contains(@class,'header_more_nav')]//*[contains(@aria-label,'Застраховать себя')]")).click();
        Wait<WebDriver> wait = new WebDriverWait(driver, 5, 1000);
        WebElement sendbtn= driver.findElement(By.xpath("//div//*[contains(text(),'путешественников')]"));
        wait.until(ExpectedConditions.visibilityOf(sendbtn)).click();

        WebElement title = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='sbrf-rich-outer']//h1"))));

        Assert.assertEquals("Страхование путешественников", title.getText());

        driver.findElement(By.xpath("//*/img[contains(@src, 'banner-zashita-traveler.jpg')]")).click();
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
       driver.findElement(By.xpath("//div[contains(@class,'b-form-active-box')]")).click();
        driver.findElement(By.xpath("//span[contains(text(),'Оформить')]")).click();

        fillField(By.name("insured0_surname"), "Ivanov");
        fillField(By.name("insured0_name"), "Ivan");
        driver.findElement(By.name("insured0_birthDate")).click();
        fillField(By.name("insured0_birthDate"), "01.01.1983");

        fillField(By.name("surname"), "Петров");
        fillField(By.name("name"), "Петр");
        fillField(By.name("middlename"), "Петрович");
        driver.findElement(By.name("birthDate")).click();
        fillField(By.name("birthDate"), "01.01.1983");
        driver.findElement(By.name("male")).click();

        fillField(By.name("passport_series"), "1111 ");
        fillField(By.name("passport_number"), "123456");
        driver.findElement(By.name("issueDate")).click();
        fillField(By.name("issueDate"), "01.01.1985");
        fillField(By.name("issuePlace"), "Moscow");


      //  Assert.assertEquals("Номер телефона вводится в 10-ти значном формате"), driver.findElement(By.xpath("//*[contains(text(),'Номер телефона')]")).getText();

        Assert.assertEquals("Ivanov",
                driver.findElement(By.name("insured0_surname")).getAttribute( "value"));
        Assert.assertEquals( "Ivan",
                driver.findElement(By.name("insured0_name")).getAttribute( "value"));
        Assert.assertEquals( "Петров",
                driver.findElement(By.name("surname")).getAttribute( "value"));
        Assert.assertEquals( "Петр",
                driver.findElement(By.name("name")).getAttribute( "value"));

        Assert.assertEquals( "Петрович",
                driver.findElement(By.name("middlename")).getAttribute( "value"));

        Assert.assertEquals("1111",
                driver.findElement(By.name("passport_series")).getAttribute( "value"));

        Assert.assertEquals( "Sberbank",
                driver.findElement(By.name("issuePlace")).getAttribute( "value"));

        driver.findElement(By.xpath("//*[contains(text(),'Продолжить')]")).click();

        Assert.assertEquals("Заполнены не все обязательные поля", driver.findElement(By.xpath("//*[contains(text(),'обязательные')]")).getText());
    }

}


