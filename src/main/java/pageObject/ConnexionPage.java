package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ConnexionPage {
	
	//declaration des selecteurs
	public final static String USERNAME_XPATH ="//input[@name='username']";
	
	public final static String PASSWORD_XPATH ="//input[@name='password']";
	
	public final static String BTNLOGIN_XPATH ="//button[@type='submit']";
	
	public final static String ELM_DASH_XPATH ="//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6";
	
	public final static String MSG_ERREUR_XPATH ="//p[@class='oxd-text oxd-text--p oxd-alert-content-text']";
	
	public final static String MSG_REQUIRED_USERNAME_XPATH ="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/span";
	
	public final static String MSG_REQUIRED_PASSWORD_XPATH ="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/span";
	
	//declaration des elements
	
	@FindBy(how= How.XPATH, using=USERNAME_XPATH)
	public static WebElement username;
	
	@FindBy(how= How.XPATH, using=PASSWORD_XPATH)
	public static WebElement password;
	
	@FindBy(how= How.XPATH, using=BTNLOGIN_XPATH)
	public static WebElement btnLogin;
	
	@FindBy(how= How.XPATH, using=ELM_DASH_XPATH)
	public static WebElement elementDashboard;
	
	@FindBy(how= How.XPATH, using=MSG_ERREUR_XPATH)
	public static WebElement msgErr;
	
	@FindBy(how= How.XPATH, using=MSG_REQUIRED_USERNAME_XPATH)
	public static WebElement msgRequireUsername;
	
	@FindBy(how= How.XPATH, using=MSG_REQUIRED_PASSWORD_XPATH)
	public static WebElement msgRequirePass;
	
	//definition des methodes (action par methode)
	
	public void saisisr_username (String username) {
		//de preference on n'utilise pas this
		this.username.sendKeys(username);
	}
	
	public void saisir_password (String pass) {
		password.sendKeys(pass);
	}
	
	public void cliquer_btnlogin () {
		btnLogin.click();
	}
	
	public String get_obtenu () {
		
		return elementDashboard.getText();
	}
	
	public String get_msgErr () {
		
		return msgErr.getText();
	}
	
	public String get_msgRequireUsername () {
		
		return msgRequireUsername.getText();
	}
	
	public String get_msgRequirePassword () {
		
		return msgRequirePass.getText();
	}
	
}
