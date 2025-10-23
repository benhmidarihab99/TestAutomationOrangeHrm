package utils;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.Scenario;

public class Setup {

	public static WebDriver driver;
	static DriverManager driverManager;

	@Before
	
	 // Lance le navigateur à l'aide du design pattern "Factory Navigator"
	 
	public void setup() {
		driverManager = DriverManagerFactory.getManager(DriverType.CHROME);
		driver = driverManager.getDriver();
	}

	@After
	
	 // Prend une capture d'écran et l’attache au rapport si le scénario échoue
	
	public void embedScreenshot(Scenario scenario) {

		System.out.println("Capture d’écran si le scénario échoue");

		// Vérifie si le scénario a échoué
		if ((scenario.isFailed())) {

			// Prend une capture d'écran en tant que tableau de bytes
			final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);

			// Attache la capture d'écran au rapport Cucumber
			scenario.attach(screenshot, "image/png", scenario.getName());
		}

		// Ferme le navigateur après chaque scénario
		driver.quit();
	}
}
