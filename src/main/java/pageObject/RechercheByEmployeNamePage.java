package pageObject;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RechercheByEmployeNamePage {

	// declaration des selecteurs

	public final static String EMPLOYENAME_FIELD_XPATH = "//*[@id=\"app\"]/div[2]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div/input";

	public final static String EMPLOYENAME_CSS = "div[role='option'] span";

	public final static String SEARCH_TABLE_CLASS = "oxd-table-card";

	public final static String ELEMENT_FIRST_XPATH = "//*[@id=\"app\"]/div[2]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div[";

	public final static String ELEMENT_SECOND_XPATH = "/div/div[4]";

	public final static String INVALID_EMPLOYENAME_XPATH = "//*[@id=\"app\"]/div[2]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div[2]/div";

	public final static String ERREUR_ELEMENT_XPATH = "//span[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message']";

	@FindBy(how = How.XPATH, using = EMPLOYENAME_FIELD_XPATH)
	public static WebElement employeNameField;

	@FindBy(how = How.CSS, using = EMPLOYENAME_CSS)
	public static WebElement employeNameHint;

	@FindBy(how = How.XPATH, using = INVALID_EMPLOYENAME_XPATH)
	public static WebElement invalidEmployeName;

	@FindBy(how = How.CLASS_NAME, using = SEARCH_TABLE_CLASS)
	public static List<WebElement> liste;

	@FindBy(how = How.XPATH, using = ERREUR_ELEMENT_XPATH)
	public static WebElement erreur;

	
	
	public static void saisirEmployeName(String EmployeName) {

		employeNameField.sendKeys(EmployeName);
	}

	public static void selectHint() {

		employeNameHint.click();

	}

	public static List<String> getListEmployeName(WebDriver driver) {

		List<String> employeNameList = new ArrayList<String>();

		for (int i = 1; i <= liste.size(); i++) {

			String employeNameXpath = ELEMENT_FIRST_XPATH + i + ELEMENT_SECOND_XPATH;

			WebElement employeNameElt = driver.findElement(By.xpath(employeNameXpath));

			employeNameList.add(employeNameElt.getText());
		}

		return employeNameList;
	}

	public static void selectInvalidHint() throws InterruptedException {

		Thread.sleep(2000);

		invalidEmployeName.click();

	}

	public static String getErreur() {

		return erreur.getText();
	}

}
