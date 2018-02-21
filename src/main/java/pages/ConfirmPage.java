package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;

public class ConfirmPage extends BasePageObject{

    @FindBy(xpath = "//*[@id='SBRF_TabContainer_sb_bundle-47610460']/div/div[1]/div/div[1]/div/div/div/div/div/p/a/img")
    public WebElement sendAppBtn;

    public ConfirmPage(){
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }


}
