//import org.junit.Assert;
//import org.junit.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

//public class InsuranceTest extends BaseTest{

  //  @Test
 //   public void testInsurance () {
 //       driver.get(baseUrl);
 //       driver.findElement(By.xpath("//ol[contains(@class,'rgs-menu')]/li/*[contains(text(),'Страхование')]")).click();
 //       driver.findElement(By.xpath("//div[contains(@class,'rgs-main-menu-category')]//a[contains(text(),'ДМС')]")).click();
 //       Wait<WebDriver> wait = new WebDriverWait(driver, 5, 1000);
 //       WebElement sendbtn = driver.findElement(By.xpath("//*[contains(text(),'Отправить заявку')][contains(@class,'btn')]"));
 //       wait.until(ExpectedConditions.visibilityOf(sendbtn)).click();

  //      WebElement title = driver.findElement(By.xpath("//h4[@class='modal-title']"));
  //      wait.until(ExpectedConditions.visibilityOf(title));

    //    Assert.assertEquals("Заявка на добровольное медицинское страхование", title.getText());

  //      fillField(By.name("LastName"), "Ivanov");
  //      fillField(By.name("FirstName"), "Ivan");
  //      fillField(By.name("MiddleName"), "Ivanovich");

    //    new Select(driver.findElement(By.name("Region"))).selectByVisibleText("Москва");

    //    fillField(By.name("comment"), "Autotest");
   //     fillField(By.name("Email"), "123");

  //      driver.findElement(By.xpath("//input[@class='checkbox']")).click();
  //      driver.findElement(By.id("button-m")).click();

//        Assert.assertEquals("Введите адрес электронной почты");
//            driver.findElement(By.xpath("//*[text()='Эл. почта']/..//span[@class='validation-error-text']")).getText();

  //      Assert.assertEquals("Ivanov",
   //             driver.findElement(By.name("LastName")).getAttribute( "value"));
  //      Assert.assertEquals( "Ivan",
  //              driver.findElement(By.name("FirstName")).getAttribute( "value"));
   //     Assert.assertEquals( "Ivanovich",
   //             driver.findElement(By.name("MiddleName")).getAttribute( "value"));
  //  }

    }

