package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LogoutPage {

	public final static String PROFILE_MENU_XPATH = "//*[@id=\"app\"]/div[2]/div[1]/header/div[1]/div[3]/ul/li/span/i";
	
	public final static String LOGOUT_BTN_XPATH ="//*[@id=\"app\"]/div[2]/div[1]/header/div[1]/div[3]/ul/li/ul/li[4]/a";
	
	public final static String LOGIN_TITLE_XPATH = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/h5";
	
	@FindBy(how= How.XPATH, using=PROFILE_MENU_XPATH)
	public static WebElement profileMenu;
	
	@FindBy(how= How.XPATH, using=LOGOUT_BTN_XPATH)
	public static WebElement btnLogout;
	
	@FindBy(how= How.XPATH, using=LOGIN_TITLE_XPATH)
	public static WebElement loginTitle;
	
	
	public static void clickOnProfileMenu () {
		
		profileMenu.click();
	}
	
	public static void selectLogoutBtn () throws InterruptedException {
		
		btnLogout.click();
		
		Thread.sleep(5000);
	}
	
	public static String get_obtenu () {
		
		return loginTitle.getText();
	}
}
