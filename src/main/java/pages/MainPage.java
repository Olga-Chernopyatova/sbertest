package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

    @FindBy (xpath = "//div[contains(@class,'header_more_nav')]")
    WebElement mainMenu;

    @FindBy(xpath = "//div[contains(@class,'alt-menu-collapser__area_cols_3')]")
    WebElement subMenu;

    public MainPage(WebDriver driver){

        PageFactory.initElements(driver, this);
    }

    public void selectMainMenu(String menuItem){
        mainMenu.findElement(By.xpath(".//li[contains(@class,current)]/*[contains(text,'"+menuItem+')]")).click();

}
    public void selectSubMenu(String menuItem){
        subMenu.findElement(By.xpath(".//div[contains(text,'subMenu')]")).click();

    }

}
