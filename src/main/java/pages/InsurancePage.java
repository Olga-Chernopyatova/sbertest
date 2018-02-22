package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InsurancePage {

    @FindBy(xpath = "//div[contains(@class,'b-form-active-box')]")
    public WebElement activeButton; //переименовала переменную, было одинаковое название

    @FindBy(xpath = "//span[contains(text(),'Оформить')]")
    public WebElement sendButton;


    @FindBy(xpath = "//*/img[contains(@src, 'banner-zashita-traveler.jpg')]")
    public WebElement bannerBtn; //веб-элмент баннер для открытия формы - Оформить страховку онлайн

    public InsurancePage(WebDriver driver){

        PageFactory.initElements(driver, this);
    }
}
