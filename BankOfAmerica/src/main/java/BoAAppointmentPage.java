import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.SQLOutput;

public class BoAAppointmentPage extends CommonAPI{

    WebDriverWait wait = new WebDriverWait(driver, 10);

    @FindBy (xpath = "//*[@id=\"skip-to-h1\"]")
    private WebElement appointmentHead;

    @FindBy (xpath = "//*[@id=\"A1000\"]/h3")
    private WebElement everydayBanking;

    @FindBy (xpath = "//*[@id=\"A3000\"]/h3/span[1]")
    private WebElement investmentsWithMerrill;

    @FindBy (xpath = "//*[@id=\"A5000\"]/h3")
    private WebElement homeLoans;

    @FindBy (xpath = "//*[@id=\"A2000\"]/h3/span[1]")
    private WebElement businessAdvantage;

    @FindBy (id = "btn-sign-in")
    private WebElement signIn;

    @FindBy (id = "btn-manage-rebook-appointment")
    private WebElement bookAppt;

    @FindBy (xpath = "//*[@id=\"caw-modal-contentSpartaUILayerClose\"]/span[2]")
    private WebElement xSignIn;

    @FindBy(xpath = "//*[@id=\"quesLink\"]")
    private WebElement learnMore;

    @FindBy (xpath = "//*[@id=\"quesBlock\"]/div[1]/div[1]/b")
    private WebElement benefitsSentence;

    public void appointmenTitle(){
        String appointmentTitle = driver.getTitle();
        Assert.assertEquals(appointmentTitle, "Make an Appointment with a Specialist");
    }

    public void verifyAppointmentHead(){
        appointmentHead.isDisplayed();
        Assert.assertTrue(true);
    }

    public void verifyEverydayBanking(){
        wait.until(ExpectedConditions.visibilityOf(everydayBanking));
        String everydayBankingTitle = everydayBanking.getText();
        Assert.assertEquals(everydayBankingTitle, "Everyday Banking");
    }

    public void verifyInvestmentsWithMerrill(){
        wait.until(ExpectedConditions.visibilityOf(investmentsWithMerrill));
        String merrill = investmentsWithMerrill.getText();
        Assert.assertEquals(merrill, "Investments with\n" + "Merrill Edge®");
    }

    public void verifyHomeLoans(){
        wait.until(ExpectedConditions.visibilityOf(homeLoans));
        Assert.assertTrue(true);
    }

    public void verifyBusinessAdvantage(){
        businessAdvantage.isDisplayed();
        Assert.assertTrue(true);
    }

    public void verifySignInBtn(){
        signIn.isDisplayed();
        Assert.assertTrue(true);
    }

    public void verifyBookAppt(){
        wait.until(ExpectedConditions.elementToBeClickable(bookAppt));
        bookAppt.isDisplayed();
        Assert.assertTrue(true);
    }

    public void verifyLearnMore(){
        learnMore.isDisplayed();
        Assert.assertTrue(true);
    }

    public void verifyBenefitsSent(){
        benefitsSentence.isDisplayed();
        Assert.assertTrue(true);
    }
}
