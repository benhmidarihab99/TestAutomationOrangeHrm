package pageObject;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RechercheByUserStatusPage {

	
	public final static String STATUS_FIELD_XPATH = "//*[@id=\"app\"]/div[2]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[4]/div/div[2]/div/div";
	
	public final static String STATUS_VALUE_XPATH= "//*[@id=\"app\"]/div[2]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[4]/div/div[2]/div/div[2]/div[2]/span";
	
	public final static String SEARCH_TABLE_CLASS = "oxd-table-card";

	public final static String ELEMENT_FIRST_XPATH = "//*[@id=\"app\"]/div[2]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div[";

	public final static String ELEMENT_SECOND_XPATH = "]/div/div[5]";
	
	@FindBy(how = How.XPATH, using = STATUS_FIELD_XPATH)
	public static WebElement userStatusSelect;
	
	@FindBy(how = How.CLASS_NAME, using = SEARCH_TABLE_CLASS)
	public static List<WebElement> liste;

	public static void selectStatusField () {
		
		userStatusSelect.click();
		
	}
	public static void selectStatus (WebDriver driver, String status) throws InterruptedException {
		
		String statusXpath = "//div[@role='option' and span[normalize-space(text())='" + status + "']]";
		
		WebElement statusElement = driver.findElement(By.xpath(statusXpath));
		statusElement.click();
		
		Thread.sleep(5000);
		
		
	}
	
	public static List<String> getListUserStatus(WebDriver driver) {

		List<String> statusList = new ArrayList<String>();

		for (int i = 1; i <= liste.size(); i++) {

			String statusXpath = ELEMENT_FIRST_XPATH + i + ELEMENT_SECOND_XPATH;

			WebElement statusElt = driver.findElement(By.xpath(statusXpath));

			statusList.add(statusElt.getText());
		}

		return statusList;
	}
	
	
}
