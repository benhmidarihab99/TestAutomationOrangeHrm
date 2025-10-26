package stepDefinitions;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.RechercheByUserRolePage;
import utils.Setup;
import utils.WaitMethods;

public class RechercheByUserRoleStepDef {

	// declaration des objects
	public WebDriver driver;
	public WaitMethods wait = new WaitMethods();

	public RechercheByUserRoleStepDef () {
		driver=Setup.driver;
		PageFactory.initElements(driver, RechercheByUserRolePage.class);
	}
	

	@When("je saisis le role souaite {string}")
	public void jeSaisisLeRoleSouaite(String role) throws InterruptedException {
		
		wait.explicitWaitUntilPresenceOfElementLocatedXpath(driver, RechercheByUserRolePage.ROLE_FIELD_XPATH, 10);
		wait.explicitWaitUntilPresenceOfElementLocatedXpath(driver, RechercheByUserRolePage.ESS_ROLE_XPATH, 10);
		RechercheByUserRolePage.selectRole(driver, role);

	}
	

	@Then("je verifie les role affiches sur le tableau {string}")
	public void jeVerifieLesRoleAffichesSurLeTableau(String resultatAttendu) {

		//wait.explicitWaitUntilPresenceOfElementLocatedXpath(driver, RechercheByUsernamePage.SEARCH_TABLE_CLASS, 10);
				List<String> resultatObtenu= RechercheByUserRolePage.getListUserRole(driver);
				
				for (int i=0; i<resultatObtenu.size();i++) {
					
					Assert.assertEquals(resultatObtenu.get(i),resultatAttendu);
				}
	}
}
