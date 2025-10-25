package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RechercheByUsernamePage {

	//declaration des selecteurs
	
	public final static String ADMIN_BUTTON_XPATH = "//aside[@class='oxd-sidepanel']//li[1]";
	
	public final static String USERNAME_FIELD_XPATH ="//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']"; 
	
	public final static String SEARCH_BUTTON_XPATH = "//button[normalize-space()='Search']";
	
	
	
	//declaration des elements
	
	@FindBy(how= How.XPATH, using=ADMIN_BUTTON_XPATH)
	public static WebElement adminButton;
	
	@FindBy(how= How.XPATH, using=USERNAME_FIELD_XPATH)
	public static WebElement usernameField;
	
	@FindBy(how= How.XPATH, using=SEARCH_BUTTON_XPATH)
	public static WebElement searchButton;
	
	//definition des methodes
	
	public static void clickAdminBtn () {
		
		adminButton.click();
	}
	
	public static void saisirsername (String username) {
		
		usernameField.sendKeys(username);
	}
	
	public static void clickSearchBtn () {
		
		searchButton.click();
	}
	

}
