package utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitMethods {

    
     // Configure un délai d'attente implicite pour le WebDriver.
     
    public void implicitWait(WebDriver driver, long millis) {
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(millis));
    }

    
     // Attente explicite jusqu'à la visibilité d'un élément localisé par un sélecteur CSS.
     
    public WebElement explicitWaitUntilVisibilityOfButtonCss(WebDriver driver, String locator, long seconds) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(locator)));
    }

    
     // Attente explicite jusqu'à la visibilité d'un élément localisé par un XPath.
  
    public WebElement explicitWaitUntilVisibilityOfElementXpath(WebDriver driver, String locator, long seconds) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
    }

    
     // Attente explicite jusqu'à ce qu'un élément soit cliquable (par sélecteur CSS).
     
    public WebElement explicitWaitUntilButtonIsClickableCss(WebDriver driver, String locator, long seconds) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
        return wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(locator)));
    }

    
     // Attente explicite jusqu'à ce qu'un élément soit cliquable (par XPath).
     
    public WebElement explicitWaitUntilButtonIsClickableXpath(WebDriver driver, String locator, long seconds) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
        return wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));
    }

  
     // Attente explicite jusqu'à la présence d'un élément localisé par XPath dans le DOM.
    
    public WebElement explicitWaitUntilPresenceOfElementLocatedXpath(WebDriver driver, String locator, long seconds) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
    }

    public WebElement explicitWaitUntilPresenceOfElementLocatedclass(WebDriver driver, String locator, long seconds) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.className(locator)));
    }
 
     // Attente explicite jusqu'à la présence d'un élément localisé par un sélecteur CSS dans le DOM.
   
    public WebElement explicitWaitUntilPresenceOfElementLocatedCss(WebDriver driver, String locator, long seconds) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(locator)));
    }
}
