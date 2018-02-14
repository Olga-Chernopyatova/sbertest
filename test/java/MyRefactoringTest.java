package pages;

public class MyRefactoringTest extends BaseTest{

    @Test
    public void newsbertest(){
        MainPage mainPage = new MainPage(driver);
        mainPage.selectMainMenu("Застраховать себя");

        Wait<WebDriver> wait = new WebDriverWait(driver, 5, 1000);
        WebElement sendbtn= driver.findElement(By.xpath("//div//*[contains(text(),'путешественников')]"));
        wait.until(ExpectedConditions.visibilityOf(sendbtn)).click();

        mainPage.selectSubMenu("Страхование путешественников");

        new InsurancePage (driver).sendBtn.click();

    }
}
