import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

/**
 * Base class containing common Selenium methods
 */
public class BasePage {
    
    protected WebDriver driver;
    protected WebDriverWait wait;
    private static final int WAIT_TIME = 10; // seconds
    
    /**
     * Constructor - Initialize WebDriver and WebDriverWait
     */
    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME));
    }
    
    /**
     * Navigate to a URL
     */
    public void navigateToURL(String url) {
        driver.navigate().to(url);
        System.out.println("Navigated to: " + url);
    }
    
    /**
     * Find element using locator
     */
    protected WebElement findElement(By locator) {
        return driver.findElement(locator);
    }
    
    /**
     * Wait for element to be visible
     */
    protected WebElement waitForElementToBeVisible(By locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    
    /**
     * Wait for element to be clickable
     */
    protected WebElement waitForElementToBeClickable(By locator) {
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }
    
    /**
     * Click on element
     */
    public void clickElement(By locator) {
        waitForElementToBeClickable(locator).click();
        System.out.println("Clicked on element: " + locator);
    }
    
    /**
     * Enter text into element
     */
    public void enterText(By locator, String text) {
        WebElement element = waitForElementToBeVisible(locator);
        element.clear();
        element.sendKeys(text);
        System.out.println("Entered text: " + text + " in element: " + locator);
    }
    
    /**
     * Get text from element
     */
    public String getText(By locator) {
        return waitForElementToBeVisible(locator).getText();
    }
    
    /**
     * Check if element is displayed
     */
    public boolean isElementDisplayed(By locator) {
        try {
            return waitForElementToBeVisible(locator).isDisplayed();
        } catch (Exception e) {
            System.out.println("Element not displayed: " + locator);
            return false;
        }
    }
    
    /**
     * Check if element is enabled
     */
    public boolean isElementEnabled(By locator) {
        return findElement(locator).isEnabled();
    }
    
    /**
     * Get attribute value
     */
    public String getAttribute(By locator, String attributeName) {
        return findElement(locator).getAttribute(attributeName);
    }
    
    /**
     * Switch to frame by locator
     */
    public void switchToFrame(By locator) {
        WebElement frameElement = findElement(locator);
        driver.switchTo().frame(frameElement);
        System.out.println("Switched to frame: " + locator);
    }
    
    /**
     * Switch to default content
     */
    public void switchToDefaultContent() {
        driver.switchTo().defaultContent();
        System.out.println("Switched to default content");
    }
    
    /**
     * Get page title
     */
    public String getPageTitle() {
        return driver.getTitle();
    }
    
    /**
     * Get current URL
     */
    public String getCurrentURL() {
        return driver.getCurrentUrl();
    }
    
    /**
     * Take screenshot
     */
    public void takeScreenshot(String fileName) {
        // Implementation depends on your screenshot utility
        System.out.println("Screenshot taken: " + fileName);
    }
    
    /**
     * Wait for page to load - Check if element is present
     */
    public void waitForPageLoad(By locator) {
        waitForElementToBeVisible(locator);
        System.out.println("Page loaded successfully");
    }
    
    /**
     * Close the browser
     */
    public void closeBrowser() {
        driver.quit();
        System.out.println("Browser closed");
    }
    
    /**
     * Refresh the page
     */
    public void refreshPage() {
        driver.navigate().refresh();
        System.out.println("Page refreshed");
    }
    
    /**
     * Scroll to element
     */
    public void scrollToElement(By locator) {
        WebElement element = findElement(locator);
        ((org.openqa.selenium.JavascriptExecutor) driver)
            .executeScript("arguments[0].scrollIntoView(true);", element);
        System.out.println("Scrolled to element: " + locator);
    }
    
    /**
     * Execute JavaScript
     */
    public Object executeJavaScript(String script, Object... args) {
        return ((org.openqa.selenium.JavascriptExecutor) driver)
            .executeScript(script, args);
    }
    
    /**
     * Wait for element to disappear
     */
    public boolean waitForElementToDisappear(By locator) {
        try {
            return wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
        } catch (Exception e) {
            System.out.println("Element did not disappear: " + locator);
            return false;
        }
    }
}
