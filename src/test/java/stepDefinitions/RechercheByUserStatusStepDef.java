package stepDefinitions;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pageObject.RechercheByUserStatusPage;
import utils.Setup;
import utils.WaitMethods;

public class RechercheByUserStatusStepDef {

	
	public WebDriver driver;
	public WaitMethods wait = new WaitMethods();
	
	public RechercheByUserStatusStepDef() {
		
		driver=Setup.driver;
		PageFactory.initElements(driver,RechercheByUserStatusPage.class);
	}
	
	@When("je saisis le status souhaite {string}")
	public void jeSaisisLeStatusSouhaite(String status) throws InterruptedException {
	   
		wait.explicitWaitUntilPresenceOfElementLocatedXpath(driver, RechercheByUserStatusPage.STATUS_FIELD_XPATH, 10);
		
		RechercheByUserStatusPage.selectStatusField();
		
		wait.explicitWaitUntilButtonIsClickableXpath(driver, RechercheByUserStatusPage.STATUS_VALUE_XPATH, 10);
		
		RechercheByUserStatusPage.selectStatus(driver, status);
		
		
	}

	@Then("je verifie le status affiche sur le tableau {string}")
	public void jeVerifieLeStatusAfficheSurLeTableau(String resultatAttendu) {
		
		List<String> resultatObtenu= RechercheByUserStatusPage.getListUserStatus(driver);
		
		for (int i=0; i<resultatObtenu.size();i++) {
			
			Assert.assertEquals(resultatObtenu.get(i),resultatAttendu);
		}
	 
	}
}
