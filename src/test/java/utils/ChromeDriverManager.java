package utils;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;



public class ChromeDriverManager extends DriverManager {
	private ChromeDriverService chService;

	@Override
	public void startService() {
		
	}

	@Override
	public void stopService() {
		if (null != chService && chService.isRunning())
			chService.stop();
	}
	@Override
	public void createDriver() {
		WebDriverManager.chromedriver().setup();		
		ChromeOptions optionsChrome = new ChromeOptions();
		optionsChrome.addArguments("--disable-search-engine-choice-screen");
         optionsChrome.addArguments("--start-maximized");
         optionsChrome.addArguments("--remote-allow-origins=*");
         optionsChrome.addArguments("--disable-infobars");
         optionsChrome.addArguments("--disable-popup-blocking");
         optionsChrome.setAcceptInsecureCerts(true);
         driver = new ChromeDriver(optionsChrome);
       
	}
}
