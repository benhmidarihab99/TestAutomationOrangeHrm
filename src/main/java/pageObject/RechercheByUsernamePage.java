package pageObject;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RechercheByUsernamePage {

	// declaration des selecteurs

	public final static String ADMIN_BUTTON_XPATH = "//aside[@class='oxd-sidepanel']//li[1]";

	public final static String USERNAME_FIELD_XPATH = "//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']";

	public final static String SEARCH_BUTTON_XPATH = "//button[normalize-space()='Search']";

	public final static String SEARCH_TABLE_CLASS= "oxd-table-card";

	public final static String ELEMENT_FIRST_XPATH = "//*[@id=\"app\"]/div[2]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div[";

	public final static String ELEMENT_SECOND_XPATH = "]/div/div[2]";
	// declaration des elements

	@FindBy(how = How.XPATH, using = ADMIN_BUTTON_XPATH)
	public static WebElement adminButton;

	@FindBy(how = How.XPATH, using = USERNAME_FIELD_XPATH)
	public static WebElement usernameField;

	@FindBy(how = How.XPATH, using = SEARCH_BUTTON_XPATH)
	public static WebElement searchButton;

	@FindBy(how = How.CLASS_NAME, using = SEARCH_TABLE_CLASS)
	public static List<WebElement> liste;

	// definition des methodes

	public static void clickAdminBtn() {

		adminButton.click();
	}

	public static void saisirsername(String username) {

		usernameField.sendKeys(username);
	}

	public static void clickSearchBtn() throws InterruptedException {

		searchButton.click();
		
		Thread.sleep(5000);
	}

	public static List<String> getListUsername(WebDriver driver) {

		List<String> usernameList = new ArrayList<String>();

		for (int i = 1; i <= liste.size(); i++) {
			
			

			String usernameXpath = ELEMENT_FIRST_XPATH + i + ELEMENT_SECOND_XPATH;

			WebElement usernameElt = driver.findElement(By.xpath(usernameXpath));

			usernameList.add(usernameElt.getText());
		}

		return usernameList;
	}

}
