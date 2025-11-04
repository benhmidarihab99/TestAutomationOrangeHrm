package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddUserPage {

	public final static String ADD_BTN_XPATH ="//*[@id=\"app\"]/div[2]/div[2]/div[2]/div/div[2]/div[1]/button";
	
	public final static String ROLE_FIELD_XPATH = "//*[@id=\"app\"]/div[2]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div";
	
	public final static String ESS_ROLE_XPATH = "//*[@id=\"app\"]/div[2]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div[2]/div[3]/span";
	
	public final static String EMPLOYENAME_FIELD_XPATH ="//*[@id=\"app\"]/div[2]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/div/div[2]/div/div/input";
	
	public final static String EMPLOYEENAME_CSS = "div[role='option'] span";
	
	public final static String STATUS_FIELD_XPATH = "//*[@id=\"app\"]/div[2]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div/div";
	
	public final static String ENABLED_STATUS_XPATH = "//*[@id=\"app\"]/div[2]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div/div[2]/div[2]/span";
	
	public final static String USERNAME_FIELD_XPATH = "//*[@id=\"app\"]/div[2]/div[2]/div[2]/div/div/form/div[1]/div/div[4]/div/div[2]/input";
	
	public final static String PASSWORD_FIELD_XPATH ="//*[@id=\"app\"]/div[2]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/input";
	
	public final static String CONFIRM_PASSWORD_FIELD_XPATH="//*[@id=\"app\"]/div[2]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/input";
	
	public final static String SAVE_BTN_XPATH = "//*[@id=\"app\"]/div[2]/div[2]/div[2]/div/div/form/div[3]/button[2]";
	
	@FindBy(how= How.XPATH, using=ADD_BTN_XPATH)
	public static WebElement addBtn;
	
	@FindBy(how= How.XPATH, using=ROLE_FIELD_XPATH)
	public static WebElement roleField;
	
	@FindBy(how= How.XPATH, using=ESS_ROLE_XPATH)
	public static WebElement essRole;
	
	@FindBy(how= How.XPATH, using=EMPLOYENAME_FIELD_XPATH)
	public static WebElement employeNameField;
	
	@FindBy(how= How.CSS , using=EMPLOYEENAME_CSS)
	public static WebElement employeName;
	
	@FindBy(how= How.XPATH, using=STATUS_FIELD_XPATH)
	public static WebElement statusField;
	
	@FindBy(how= How.XPATH, using=ENABLED_STATUS_XPATH)
	public static WebElement statusEnabled;
	
	@FindBy(how= How.XPATH, using=USERNAME_FIELD_XPATH)
	public static WebElement usernameField;
	
	@FindBy(how= How.XPATH, using=PASSWORD_FIELD_XPATH)
	public static WebElement passwordField;
	
	@FindBy(how= How.XPATH, using=CONFIRM_PASSWORD_FIELD_XPATH)
	public static WebElement confirmPasswordField;
	
	@FindBy(how= How.XPATH, using=SAVE_BTN_XPATH)
	public static WebElement saveBtn;
	
	
	public static void clickAddBtn () {
		
		addBtn.click();
	}
	
	public static void clickOnRoleField () {
		
		roleField.click();
	}
	
	public static void selectRole() {
		
		essRole.click();

	}
	
	public static void saisirEmployeName(String EmployeName) {

		employeNameField.sendKeys(EmployeName);
	}
	
	public static void selectHint() {

		employeName.click();

	}
	
	public static void clickOnStatusField () {
		
		statusField.click();
	}
	
	public static void selectStatus() {
		
		statusEnabled.click();

	}
	
	public static void saisirUsername(String name) {
		
		usernameField.sendKeys(name);

	}
	
	public static void saisirPass(String pass) {
		
		passwordField.sendKeys(pass);

	}
	
	public static void confirmPass(String pass) {
		
		confirmPasswordField.sendKeys(pass);

	}
	
	public static void clickSaveBtn () throws InterruptedException {
		
		saveBtn.click();
		
		 //Thread.sleep(5000);
	}
}
