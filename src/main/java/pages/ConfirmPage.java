package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;

public class ConfirmPage extends BasePageObject{

    @FindBy(xpath = "//*[@id='SBRF_TabContainer_sb_bundle-47610460']/div/div[1]/div/div[1]/div/div/div/div/div/p/a/img")
    public WebElement sendAppBtn;

    @FindBy(xpath = "//div[@class='sbrf-rich-outer']//h1")
    public WebElement title;    //добавила веб-элмент для заголовка

    public ConfirmPage(){
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }


}
