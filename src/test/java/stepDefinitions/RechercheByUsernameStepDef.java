package stepDefinitions;

import org.junit.Assert;

import java.util.List;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.Scenario;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.RechercheByUsernamePage;
import utils.Setup;
import utils.WaitMethods;

public class RechercheByUsernameStepDef {
	
	//declaration des objects
	public WebDriver driver;
	public WaitMethods wait = new WaitMethods();
	
	
	public RechercheByUsernameStepDef () {
		
		driver=Setup.driver;
		PageFactory.initElements(driver , RechercheByUsernamePage.class );
	}

	@When("je click sur le bouton admin")
	public void jeClickSurLeBoutonAdmin() {
	    wait.explicitWaitUntilButtonIsClickableXpath(driver, RechercheByUsernamePage.ADMIN_BUTTON_XPATH, 15);
	    RechercheByUsernamePage.clickAdminBtn();
	}
	@When("je saisis le username souaite {string}")
	public void jeSaisisLeUsernameSouaite(String name) {
	    wait.explicitWaitUntilPresenceOfElementLocatedXpath(driver, RechercheByUsernamePage.USERNAME_FIELD_XPATH, 10);
	    RechercheByUsernamePage.saisirsername(name);
	}
	
	
	@When("je click sur le bouton recherche")
	public void jeClickSurLeBoutonRecherche() throws InterruptedException {
		wait.explicitWaitUntilButtonIsClickableXpath(driver, RechercheByUsernamePage.SEARCH_BUTTON_XPATH, 10);
		RechercheByUsernamePage.clickSearchBtn();
		
	    
	}
	
	
	@Then("je verifie les usernames affiches sur le tableau {string}")
	public void jeVerifieLesUsernamesAffichesSurLeTableau(String resultatAttendu) {
		
		//wait.explicitWaitUntilPresenceOfElementLocatedXpath(driver, RechercheByUsernamePage.SEARCH_TABLE_CLASS, 10);
		List<String> resultatObtenu= RechercheByUsernamePage.getListUsername(driver);
		
		for (int i=0; i<resultatObtenu.size();i++) {
			
			
			Assert.assertEquals(resultatObtenu.get(i),resultatAttendu);
			
		}
		
			
		}
		
	    
	
}
