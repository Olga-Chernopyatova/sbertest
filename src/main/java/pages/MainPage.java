package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import steps.BaseSteps;

public class MainPage {

    @FindBy (xpath = "//div[contains(@class,'header_more_nav')]")
    WebElement mainMenu;

    @FindBy(xpath = "//div[contains(@class,'bp-area header-container')]")
    WebElement subMenu;

    public MainPage(WebDriver driver){

        PageFactory.initElements(driver, this);
    }

    public void selectMainMenu(String menuItem){
        //был неправильный локатор также не забывай про кавычки, а то к тому же была ошибка в синтаксие при написании xpath
        mainMenu.findElement(By.xpath(".//*[contains(@aria-label,'"+menuItem+"')]")).click();

}
    public void selectSubMenu(String menuItem){
        //Перед тем как кликать на пункт меню, надо дождаться, что он стал видимым
        Wait<WebDriver> wait = new WebDriverWait(BaseSteps.getDriver(), 5, 1000);
        wait.until(ExpectedConditions.visibilityOf(subMenu.findElement(By.xpath(".//a[contains(text(),'"+ menuItem +"')]")))).click();
    }
}
