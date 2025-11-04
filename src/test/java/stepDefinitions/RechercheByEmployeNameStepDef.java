package stepDefinitions;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.RechercheByEmployeNamePage;
import utils.Setup;
import utils.WaitMethods;

public class RechercheByEmployeNameStepDef {

	public WebDriver driver;
	public WaitMethods wait = new WaitMethods();

	public RechercheByEmployeNameStepDef() {
		driver = Setup.driver;
		PageFactory.initElements(driver, RechercheByEmployeNamePage.class);
	}
	

	@When("je saisis le l'employe name souaite {string}")
	public void jeSaisisLeLEmployeNameSouaite(String employeName) throws InterruptedException {

		wait.explicitWaitUntilPresenceOfElementLocatedXpath(driver, RechercheByEmployeNamePage.EMPLOYENAME_FIELD_XPATH,10);
		RechercheByEmployeNamePage.saisirEmployeName(employeName);
	
		try {
			
			wait.explicitWaitUntilPresenceOfElementLocatedCss(driver, RechercheByEmployeNamePage.EMPLOYENAME_CSS, 10);
			RechercheByEmployeNamePage.selectHint();
		} catch (Exception e) {
			
			wait.explicitWaitUntilPresenceOfElementLocatedXpath(driver,RechercheByEmployeNamePage.INVALID_EMPLOYENAME_XPATH, 20);
			RechercheByEmployeNamePage.selectInvalidHint();
		}

	}
	

	@Then("je verifie le employe name affiche sur le tableau {string}")
	public void jeVerifieLeEmployeNameAfficheSurLeTableau(String resultatAttendu) {
		
	
		try {
			
			List<String> resultatObtenu = RechercheByEmployeNamePage.getListEmployeName(driver);
			
			for (int i = 0; i < resultatObtenu.size(); i++) {
			
				Assert.assertEquals(resultatObtenu.get(i), resultatAttendu);
		}

		} catch (Exception e){

			wait.explicitWaitUntilVisibilityOfElementXpath(driver, RechercheByEmployeNamePage.ERREUR_ELEMENT_XPATH, 20);
			Assert.assertEquals(RechercheByEmployeNamePage.getErreur(), resultatAttendu);
		
			
		}
	}

}
