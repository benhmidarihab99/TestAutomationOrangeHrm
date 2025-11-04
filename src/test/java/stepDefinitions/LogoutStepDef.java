package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.AddUserPage;
import pageObject.LogoutPage;
import utils.Setup;
import utils.WaitMethods;

public class LogoutStepDef {

	public WebDriver driver;
	public WaitMethods wait = new WaitMethods();

	public LogoutStepDef() {
		driver = Setup.driver;
		PageFactory.initElements(driver, LogoutPage.class);
	}
	@When("je clique sur le menu deroulant du profil")
	public void jeCliqueSurLeMenuDeroulantDuProfil() {
		wait.explicitWaitUntilButtonIsClickableXpath(driver, LogoutPage.PROFILE_MENU_XPATH, 20);
		LogoutPage.clickOnProfileMenu();
	}

	@When("je click sur le bouton logout")
	public void jeClickSurLeBoutonLogout() throws InterruptedException {
		wait.explicitWaitUntilButtonIsClickableXpath(driver, LogoutPage.LOGOUT_BTN_XPATH, 20);
		LogoutPage.selectLogoutBtn();
	}
	
	@Then("je dois être redirigé vers la page de connexion et {string} doit s'afficher")
	public void jeDoisÊtreRedirigéVersLaPageDeConnexionEtDoitSAfficher(String messageObtenu) {
		
		wait.explicitWaitUntilVisibilityOfElementXpath(driver, LogoutPage.LOGIN_TITLE_XPATH, 10);
		Assert.assertEquals(LogoutPage.get_obtenu(), messageObtenu);
	}


}
