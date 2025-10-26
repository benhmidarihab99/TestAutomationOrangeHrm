package pageObject;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RechercheByUserRolePage {

	// declaration des selecteurs

	public final static String ROLE_FIELD_XPATH = "//*[@id=\"app\"]/div[2]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div";

	public final static String ESS_ROLE_XPATH = "//*[@id=\"app\"]/div[2]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div/div[1]";

	public final static String SEARCH_TABLE_CLASS = "oxd-table-card";

	public final static String ELEMENT_FIRST_XPATH = "//*[@id=\"app\"]/div[2]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div[";

	public final static String ELEMENT_SECOND_XPATH = "]/div/div[3]";

	// declaration des elements

	@FindBy(how = How.XPATH, using = ROLE_FIELD_XPATH)
	public static WebElement userRoleSelect;

	@FindBy(how = How.CLASS_NAME, using = SEARCH_TABLE_CLASS)
	public static List<WebElement> liste;

	public static void selectRole(WebDriver driver, String role) throws InterruptedException {

		userRoleSelect.click();

		String roleXpath = "//div[@role='option' and normalize-space()='" + role + "']";

		new org.openqa.selenium.support.ui.WebDriverWait(driver, java.time.Duration.ofSeconds(10)).until(
				org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated(By.xpath(roleXpath)));

		// Click the desired role
		WebElement roleElement = driver.findElement(By.xpath(roleXpath));
		roleElement.click();
		
		Thread.sleep(10000);

	}

	public static List<String> getListUserRole(WebDriver driver) {

		List<String> roleList = new ArrayList<String>();

		for (int i = 1; i <= liste.size(); i++) {

			String roleXpath = ELEMENT_FIRST_XPATH + i + ELEMENT_SECOND_XPATH;

			WebElement roleElt = driver.findElement(By.xpath(roleXpath));

			roleList.add(roleElt.getText());
		}

		return roleList;
	}

}
