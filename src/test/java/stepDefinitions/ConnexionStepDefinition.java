package stepDefinitions;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.ConnexionPage;
import utils.CommonMethods;
import utils.Setup;
import utils.WaitMethods;

public class ConnexionStepDefinition {
	
	//declaration des objects
	public ConnexionPage pageObject = new ConnexionPage();
	public CommonMethods com = new CommonMethods();
	public WebDriver driver;
	public WaitMethods wait = new WaitMethods();
	
	
	//constructeur de la classe
	public ConnexionStepDefinition () {
		
		driver=Setup.driver;
		PageFactory.initElements(driver, ConnexionPage.class);
	}
	
	@Given("je me connecte sur l'application")
	public void je_me_connecte_sur_l_application() throws IOException {
	
		com.openURLWithConfigFile("url");
	}
	
	@When("je saisis le username {string}")
	public void je_saisis_le_username(String name) {
	    
		wait.explicitWaitUntilVisibilityOfElementXpath(driver, pageObject.USERNAME_XPATH, 10);
		pageObject.saisisr_username(name);
	}
	
	@When("je saisis le password {string}")
	public void je_saisis_le_password(String password) {
	    
		wait.explicitWaitUntilVisibilityOfElementXpath(driver, pageObject.PASSWORD_XPATH, 20);
		pageObject.saisir_password(password);
	}
	
	@When("je clique sur le bouton login")
	public void je_clique_sur_le_bouton_login() {
		
		wait.explicitWaitUntilVisibilityOfElementXpath(driver, pageObject.BTNLOGIN_XPATH, 10);
		pageObject.cliquer_btnlogin();
	    
	}
	
	@Then("je me redirige vers la page d'acceuil et {string} s'affiche")
	public void je_me_redirige_vers_la_page_d_acceuil_et_s_affiche(String msgAtt) {
		
		wait.explicitWaitUntilVisibilityOfElementXpath(driver, pageObject.ELM_DASH_XPATH, 20);
		Assert.assertEquals(pageObject.get_obtenu(),msgAtt);
	}
	
	@Then("je verifie le message d'erreur affiche {string}")
	public void jeVerifieLeMessageDErreurAffiche(String messageObtenu) {
	   
		switch(messageObtenu) {
		
		case "Invalid credentials":
			wait.explicitWaitUntilVisibilityOfElementXpath(driver, pageObject.MSG_ERREUR_XPATH, 10);
			Assert.assertEquals(pageObject.get_msgErr(), messageObtenu);
			break;
			
		case "Required":
			
			if(com.isElementDisplayed(pageObject.msgRequireUsername))
			{
					wait.explicitWaitUntilVisibilityOfElementXpath(driver, pageObject.MSG_REQUIRED_USERNAME_XPATH, 10);
					Assert.assertEquals(pageObject.get_msgRequireUsername(), messageObtenu);
		
			}
			else 
				if (com.isElementDisplayed(pageObject.msgRequirePass))
				{
					wait.explicitWaitUntilVisibilityOfElementXpath(driver, pageObject.MSG_REQUIRED_PASSWORD_XPATH, 10);
					Assert.assertEquals(pageObject.get_msgRequirePassword(), messageObtenu);
		
				}
				else if(com.isElementDisplayed(pageObject.msgRequireUsername) && com.isElementDisplayed(pageObject.msgRequirePass)) {
					
					wait.explicitWaitUntilVisibilityOfElementXpath(driver, pageObject.MSG_REQUIRED_USERNAME_XPATH, 10);
					Assert.assertEquals(pageObject.get_msgRequireUsername(), messageObtenu);
					
					wait.explicitWaitUntilVisibilityOfElementXpath(driver, pageObject.MSG_REQUIRED_PASSWORD_XPATH, 10);
					Assert.assertEquals(pageObject.get_msgRequirePassword(), messageObtenu);
		
				}
			
			   
		
	   }
	}
	



}
