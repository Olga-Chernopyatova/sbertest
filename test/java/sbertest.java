import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class sbertest extends BaseTest{


    @Test
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
        driver.findElement(By.xpath("//*[contains(text(),'Оформить сейчас')]")).click();
        driver.findElement(By.xpath("//*[contains(text(),'Минимальная')]")).click();
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
        fillField(By.name("issuePlace"), "Sberbank ");


        Assert.assertEquals("Номер телефона вводится в 10-ти значном формате"), driver.findElement(By.xpath("//*[contains(text(),'Номер телефона')]")).getText();

        Assert.assertEquals("Ivanov",
                driver.findElement(By.name("LastName")).getAttribute( "value"));
        Assert.assertEquals( "Ivan",
                driver.findElement(By.name("FirstName")).getAttribute( "value"));
        Assert.assertEquals( "Петров",
                driver.findElement(By.name("Фамилия")).getAttribute( "value"));
        Assert.assertEquals( "Петр",
                driver.findElement(By.name("Имя")).getAttribute( "value"));
        Assert.assertEquals( "Петрович",
                driver.findElement(By.name("Отчество")).getAttribute( "value"));
        Assert.assertEquals("1111 123456",
                driver.findElement(By.name("Серия и номер паспорта")).getAttribute( "value"));
        Assert.assertEquals( "Сбербанк",
                driver.findElement(By.name("Кем выдан")).getAttribute( "value"));

        driver.findElement(By.xpath("//*[contains(text(),'Продолжить')]")).click();

        Assert.assertEquals("Заполнены не все обязательные поля", driver.findElement(By.xpath("/*[contains(text(),'обязательные')]")).getText());
    }

}


