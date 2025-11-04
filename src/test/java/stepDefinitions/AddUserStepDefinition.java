package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.When;
import pageObject.AddUserPage;
import utils.Setup;
import utils.WaitMethods;

public class AddUserStepDefinition {
	
	public WebDriver driver;
	public WaitMethods wait = new WaitMethods();

	public AddUserStepDefinition() {
		driver = Setup.driver;
		PageFactory.initElements(driver, AddUserPage.class);
	}


	@When("je click sur le bouton add")
	public void jeClickSurLeBoutonAdd() {
		wait.explicitWaitUntilButtonIsClickableXpath(driver, AddUserPage.ADD_BTN_XPATH, 10);
		AddUserPage.clickAddBtn();
	}
	
	@When("je selectionne un role")
	public void jeSelectionneUnRole() {
		wait.explicitWaitUntilVisibilityOfElementXpath(driver, AddUserPage.ROLE_FIELD_XPATH, 10);
		AddUserPage.clickOnRoleField();
		
		wait.explicitWaitUntilVisibilityOfElementXpath(driver, AddUserPage.ESS_ROLE_XPATH, 10);
		AddUserPage.selectRole();
		
	}
	
	@When("je saisis l'employe name existant {string}")
	public void jeSaisisLEmployeNameExistant(String employeName) {
		wait.explicitWaitUntilVisibilityOfElementXpath(driver, AddUserPage.EMPLOYENAME_FIELD_XPATH, 10);
		AddUserPage.saisirEmployeName(employeName);
		
		wait.explicitWaitUntilButtonIsClickableCss(driver, AddUserPage.EMPLOYEENAME_CSS, 10);
		AddUserPage.selectHint();
	}
	
	@When("je selectionne un status")
	public void jeSelectionneUnStatus() {
		wait.explicitWaitUntilVisibilityOfElementXpath(driver, AddUserPage.STATUS_FIELD_XPATH, 10);
		AddUserPage.clickOnStatusField();
		
		wait.explicitWaitUntilVisibilityOfElementXpath(driver, AddUserPage.ENABLED_STATUS_XPATH, 10);
		AddUserPage.selectStatus();
	}
	
	@When("je saisis le nouveau username {string}")
	public void jeSaisisLeNouveauUsername(String name) {
		wait.explicitWaitUntilVisibilityOfElementXpath(driver, AddUserPage.USERNAME_FIELD_XPATH, 10);
		AddUserPage.saisirUsername(name);
	}
	
	
	@When("je saisis le nouveau password {string}")
	public void jeSaisisLeNouveauPassword(String pass) {
		wait.explicitWaitUntilVisibilityOfElementXpath(driver, AddUserPage.PASSWORD_FIELD_XPATH, 10);
		AddUserPage.saisirPass(pass);
	}
	
	@When("je confirme le password {string}")
	public void jeConfirmeLePassword(String pass) {
		wait.explicitWaitUntilVisibilityOfElementXpath(driver, AddUserPage.CONFIRM_PASSWORD_FIELD_XPATH, 10);
		AddUserPage.confirmPass(pass);
	}
	
	@When("je click sur le bouton save")
	public void jeClickSurLeBoutonSave() throws InterruptedException  {
		wait.explicitWaitUntilButtonIsClickableXpath(driver, AddUserPage.SAVE_BTN_XPATH, 10);
		AddUserPage.clickSaveBtn();
	}
	
	

}
