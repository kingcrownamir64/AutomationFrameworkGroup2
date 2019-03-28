import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends CommonAPI {

    @FindBy (id = "register_email1")
    private WebElement emailBar;

    @FindBy (css = ".primary")
    private WebElement clickCreateAccount;

    @FindBy (id = "logonPassword")
    private WebElement passwordBar;

    @FindBy (id = "logonPasswordVerify")
    private WebElement confirmPassword;

    @FindBy (css = "#register_userField2")
    private WebElement membershipNumberBar;

    @FindBy (css = "#buy-membership-button")
    private WebElement buyMembershipID;

    public void enterEmail(String text) throws Exception{
        this.emailBar.sendKeys(text);
        Thread.sleep(2000);
    }

    public void clickOnCreateAccount() throws Exception{
        this.clickCreateAccount.click();
        Thread.sleep(2000);
    }

    public void enterPassword(String text) throws Exception{
        this.passwordBar.sendKeys(text);
        Thread.sleep(2000);
    }

    public void enterConfirmPassword(String text) throws Exception{
        this.confirmPassword.sendKeys(text);
        Thread.sleep(2000);
    }

    public void enterMembershipNumber(String text)throws Exception{
        this.membershipNumberBar.sendKeys(text);
        Thread.sleep(2000);
    }

    public void clickBuyMembership() throws Exception{
        this.buyMembershipID.click();
        Thread.sleep(2000);
    }

}
